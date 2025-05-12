package com.lutfudolay.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lutfudolay.controller.IRestGalleristController;
import com.lutfudolay.controller.RestBaseController;
import com.lutfudolay.controller.RootEntity;
import com.lutfudolay.dto.DtoGallerist;
import com.lutfudolay.dto.DtoGalleristIU;
import com.lutfudolay.service.IGalleristService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("rest/api/gallerist")
public class RestGalleristControllerImpl extends RestBaseController implements IRestGalleristController{

	@Autowired
	private IGalleristService galleristService;
	
	@RequestMapping("/save")
	@Override
	public RootEntity<DtoGallerist> savedGallerist(@Valid @RequestBody DtoGalleristIU dtoGalleristIU) {
		
		return ok(galleristService.saveGallerist(dtoGalleristIU));
	}
	
}
