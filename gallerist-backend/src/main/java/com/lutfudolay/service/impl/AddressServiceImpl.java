package com.lutfudolay.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lutfudolay.dto.DtoAddress;
import com.lutfudolay.dto.DtoAddressIU;
import com.lutfudolay.model.Address;
import com.lutfudolay.repository.AddressRepository;
import com.lutfudolay.service.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService{
	
	@Autowired
	private AddressRepository addressRepository;
	
	private Address createAdress(DtoAddressIU dtoAddressIU) {
		Address address = new Address();
		address.setCreatetime(new Date());
		
		BeanUtils.copyProperties(dtoAddressIU, address);
		return address;
	}
	
	@Override
	public DtoAddress savedAddress(DtoAddressIU dtoAddressIU) {
		DtoAddress dtoAddress = new DtoAddress();
		
		Address savedAddress = addressRepository.save(createAdress(dtoAddressIU));
		BeanUtils.copyProperties(savedAddress, dtoAddress);
		return dtoAddress;
	}

	
}