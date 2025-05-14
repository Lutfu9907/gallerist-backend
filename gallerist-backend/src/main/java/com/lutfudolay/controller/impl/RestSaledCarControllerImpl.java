package com.lutfudolay.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lutfudolay.controller.IRestSaledCarController;
import com.lutfudolay.controller.RestBaseController;
import com.lutfudolay.controller.RootEntity;
import com.lutfudolay.dto.DtoSaledCar;
import com.lutfudolay.dto.DtoSaledCarIU;
import com.lutfudolay.service.ISaledCarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("rest/api/saled-car")
public class RestSaledCarControllerImpl extends RestBaseController implements IRestSaledCarController{

	@Autowired
	private ISaledCarService saledCarService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoSaledCar> buyCar(@Valid @RequestBody DtoSaledCarIU dtoSaledCarIU) {

		return ok(saledCarService.buyCar(dtoSaledCarIU));
	}

}
