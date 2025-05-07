package com.lutfudolay.controller;

import com.lutfudolay.dto.AuthRequest;
import com.lutfudolay.dto.AuthResponse;
import com.lutfudolay.dto.DtoUser;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest input);
}
