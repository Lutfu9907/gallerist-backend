package com.lutfudolay.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lutfudolay.dto.DtoAccount;
import com.lutfudolay.dto.DtoAddress;
import com.lutfudolay.dto.DtoCustomer;
import com.lutfudolay.dto.DtoCustomerIU;
import com.lutfudolay.exception.BaseException;
import com.lutfudolay.exception.ErrorMessage;
import com.lutfudolay.exception.MessageType;
import com.lutfudolay.model.Account;
import com.lutfudolay.model.Address;
import com.lutfudolay.model.Customer;
import com.lutfudolay.repository.AccountRepository;
import com.lutfudolay.repository.AddressRepository;
import com.lutfudolay.repository.CustomerRepository;
import com.lutfudolay.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	private Customer createCustomer(DtoCustomerIU dtoCustomerIU) {
		
		Optional<Address> optAddress = addressRepository.findById(dtoCustomerIU.getAddressId());
		if (optAddress.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXİST,dtoCustomerIU.getAddressId().toString()));
		}
		
		Optional<Account> optAccount = accountRepository.findById(dtoCustomerIU.getAccountId());
		if (optAccount.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXİST,dtoCustomerIU.getAccountId().toString()));
		}
		
		Customer customer = new Customer();
		customer.setCreatetime(new Date());
		
		BeanUtils.copyProperties(dtoCustomerIU, customer);
		
		customer.setAddress(optAddress.get());
		customer.setAccount(optAccount.get());
		
		return customer;
	}
	
	@Override
	public DtoCustomer savedCustomer(DtoCustomerIU dtoCustomerIU) {

		DtoCustomer dtoCustomer = new DtoCustomer();
		DtoAddress dtoAddress = new DtoAddress();
		DtoAccount dtoAccount = new DtoAccount();
		
		Customer savedCustomer = customerRepository.save(createCustomer(dtoCustomerIU));
		
		BeanUtils.copyProperties(savedCustomer,dtoCustomer);
		BeanUtils.copyProperties(savedCustomer.getAddress(),dtoAddress);
		BeanUtils.copyProperties(savedCustomer.getAccount(),dtoAccount);
		
		dtoCustomer.setAddress(dtoAddress);
		dtoCustomer.setAccount(dtoAccount);
		
		return dtoCustomer;
	}
}
