package com.lutfudolay.service;

import com.lutfudolay.dto.AuthRequest;
import com.lutfudolay.dto.AuthResponse;
import com.lutfudolay.dto.DtoUser;
import com.lutfudolay.dto.RefreshTokenRequest;

public interface IAuthenticationService {

	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest request);
	
	public AuthResponse refreshToken(RefreshTokenRequest input);
}
