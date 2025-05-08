package com.lutfudolay.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lutfudolay.controller.IRestAddressController;
import com.lutfudolay.controller.RestBaseController;
import com.lutfudolay.controller.RootEntity;
import com.lutfudolay.dto.DtoAddress;
import com.lutfudolay.dto.DtoAddressIU;
import com.lutfudolay.service.IAddressService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("rest/api/address")
public class RestAddressControllerImpl extends RestBaseController implements IRestAddressController{

	@Autowired
	private IAddressService addressService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoAddress> savedAddress(@Valid @RequestBody DtoAddressIU dtpAddressIU) {
		
		return ok(addressService.savedAddress(dtpAddressIU));
	}

}
