package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoAccount;
import com.lutfudolay.dto.DtoAccountIU;

public interface IRestAccountController {

	public RootEntity<DtoAccount> savedAccount(DtoAccountIU dtoAccountIU);
}
