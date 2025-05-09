package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoCustomer;
import com.lutfudolay.dto.DtoCustomerIU;

public interface IRestCustomerController {

	public RootEntity<DtoCustomer> savedCustomer(DtoCustomerIU dtoCustomerIU);
}
