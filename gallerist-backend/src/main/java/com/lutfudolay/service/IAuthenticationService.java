package com.lutfudolay.service;

import com.lutfudolay.dto.AuthRequest;
import com.lutfudolay.dto.DtoUser;

public interface IAuthenticationService {

	public DtoUser register(AuthRequest input);
}
