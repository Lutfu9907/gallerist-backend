package com.lutfudolay.service;

import com.lutfudolay.dto.DtoGallerist;
import com.lutfudolay.dto.DtoGalleristIU;

public interface IGalleristService {

	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU);
}
