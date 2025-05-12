package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoCar;
import com.lutfudolay.dto.DtoCarIU;

public interface IRestCarController {

	RootEntity<DtoCar> savedCar(DtoCarIU dtoCarIU);
}
