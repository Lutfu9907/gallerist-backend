package com.lutfudolay.service.impl;

import com.lutfudolay.dto.DtoCar;
import com.lutfudolay.dto.DtoCarIU;

public interface ICarService {

	public DtoCar savedCar(DtoCarIU dtoCarIU);
}
