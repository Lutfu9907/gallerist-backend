package com.lutfudolay.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lutfudolay.controller.IRestCarController;
import com.lutfudolay.controller.RestBaseController;
import com.lutfudolay.controller.RootEntity;
import com.lutfudolay.dto.DtoCar;
import com.lutfudolay.dto.DtoCarIU;
import com.lutfudolay.service.impl.ICarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/car")
public class RestCarControllerImpl extends RestBaseController implements IRestCarController{

	@Autowired
	private ICarService carService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoCar> savedCar(@Valid @RequestBody DtoCarIU dtoCarIU) {

		return ok(carService.savedCar(dtoCarIU));
	}

}
