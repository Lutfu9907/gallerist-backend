package com.lutfudolay.service;

import com.lutfudolay.dto.DtoGalleristCar;
import com.lutfudolay.dto.DtoGalleristCarIU;

public interface IGalleristCarService {

	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
