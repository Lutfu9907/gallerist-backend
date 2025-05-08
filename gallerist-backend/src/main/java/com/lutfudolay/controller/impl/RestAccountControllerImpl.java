package com.lutfudolay.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lutfudolay.controller.IRestAccountController;
import com.lutfudolay.controller.RestBaseController;
import com.lutfudolay.controller.RootEntity;
import com.lutfudolay.dto.DtoAccount;
import com.lutfudolay.dto.DtoAccountIU;
import com.lutfudolay.service.IAccountService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("rest/api/account")
public class RestAccountControllerImpl extends RestBaseController implements IRestAccountController{

	@Autowired
	private IAccountService accountService;

	@PostMapping("/save")
	@Override
	public RootEntity<DtoAccount> savedAccount(@Valid @RequestBody DtoAccountIU dtoAccountIU) {
		
		return ok(accountService.savedAccount(dtoAccountIU));
	}
	
}
