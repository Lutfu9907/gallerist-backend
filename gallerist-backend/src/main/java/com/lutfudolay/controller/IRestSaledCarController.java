package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoSaledCar;
import com.lutfudolay.dto.DtoSaledCarIU;

public interface IRestSaledCarController {

	public RootEntity<DtoSaledCar> buyCar(DtoSaledCarIU dtoSaledCarIU);
}
