package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoGalleristCar;
import com.lutfudolay.dto.DtoGalleristCarIU;

public interface IRestGalleristCarController {

	RootEntity<DtoGalleristCar> savedGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
