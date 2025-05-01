package com.lutfudolay.service.impl;

import org.springframework.stereotype.Service;

import com.lutfudolay.exception.BaseException;
import com.lutfudolay.exception.ErrorMessage;
import com.lutfudolay.service.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService{

	public void test() {
		throw new BaseException(new ErrorMessage(null,null));
	}
}
