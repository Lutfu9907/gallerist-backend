package com.lutfudolay.service;

import com.lutfudolay.dto.DtoAccount;
import com.lutfudolay.dto.DtoAccountIU;

public interface IAccountService {

	public DtoAccount savedAccount(DtoAccountIU dtoAccountIU);
}
