package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoGallerist;
import com.lutfudolay.dto.DtoGalleristIU;

public interface IRestGalleristController {

	public RootEntity<DtoGallerist> savedGallerist(DtoGalleristIU dtoGalleristIU);
}
