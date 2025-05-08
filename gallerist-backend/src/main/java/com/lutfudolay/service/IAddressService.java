package com.lutfudolay.service;

import com.lutfudolay.dto.DtoAddress;
import com.lutfudolay.dto.DtoAddressIU;

public interface IAddressService{

	public DtoAddress savedAddress(DtoAddressIU dtoAddressIU);
}
