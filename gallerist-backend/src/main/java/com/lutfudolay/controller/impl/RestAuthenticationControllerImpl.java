package com.lutfudolay.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lutfudolay.controller.IRestAuthenticationController;
import com.lutfudolay.controller.RestBaseController;
import com.lutfudolay.controller.RootEntity;
import com.lutfudolay.dto.AuthRequest;
import com.lutfudolay.dto.AuthResponse;
import com.lutfudolay.dto.DtoUser;
import com.lutfudolay.dto.RefreshTokenRequest;
import com.lutfudolay.service.IAuthenticationService;

import jakarta.validation.Valid;

@RestController
public class RestAuthenticationControllerImpl extends RestBaseController implements IRestAuthenticationController{

	@Autowired
	private IAuthenticationService authenticationService;
	
	@PostMapping("/register")
	@Override
	public RootEntity<DtoUser> register(@Valid @RequestBody AuthRequest input) {
		
		return ok(authenticationService.register(input));
	}

	@PostMapping("/authenticate")
	@Override
	public RootEntity<AuthResponse> authenticate(@Valid @RequestBody AuthRequest input) {
		
		return ok(authenticationService.authenticate(input));
	}

	@PostMapping("/refreshToken")
	@Override
	public RootEntity<AuthResponse> refreshToken(@Valid @RequestBody RefreshTokenRequest input) {
		
		return ok(authenticationService.refreshToken(input));
	}
}
