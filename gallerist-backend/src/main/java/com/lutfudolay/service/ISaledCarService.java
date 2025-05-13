package com.lutfudolay.service;

import com.lutfudolay.dto.DtoSaledCar;
import com.lutfudolay.dto.DtoSaledCarIU;

public interface ISaledCarService {

	public DtoSaledCar buyCar(DtoSaledCarIU dtoSaledCarIU);
}
