package com.lutfudolay.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lutfudolay.controller.IRestGalleristCarController;
import com.lutfudolay.controller.RestBaseController;
import com.lutfudolay.controller.RootEntity;
import com.lutfudolay.dto.DtoGalleristCar;
import com.lutfudolay.dto.DtoGalleristCarIU;
import com.lutfudolay.service.IGalleristCarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/gallerist-car")
public class RestGalleristCarControllerImpl extends RestBaseController implements IRestGalleristCarController{

	@Autowired
	private IGalleristCarService galleristCarService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoGalleristCar> savedGalleristCar(@Valid @RequestBody DtoGalleristCarIU dtoGalleristCarIU) {
		
		return ok(galleristCarService.saveGalleristCar(dtoGalleristCarIU));
	}


}
