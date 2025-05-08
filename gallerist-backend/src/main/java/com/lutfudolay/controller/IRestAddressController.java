package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoAddress;
import com.lutfudolay.dto.DtoAddressIU;

public interface IRestAddressController {

	public RootEntity<DtoAddress> savedAddress(DtoAddressIU dtoAddressIU);
}
