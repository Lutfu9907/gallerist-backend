package com.lutfudolay.service;

import com.lutfudolay.dto.DtoCustomer;
import com.lutfudolay.dto.DtoCustomerIU;

public interface ICustomerService {

	public DtoCustomer savedCustomer(DtoCustomerIU dtoCustomerIU);
}
