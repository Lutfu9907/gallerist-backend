package com.lutfudolay.exception;

import lombok.Getter;

@Getter
public enum MessageType {

	NO_RECORD_EXİST("1004", "KAYIT BULUNAMADI"),
	TOKEN_IS_EXPIRED("1005", "TOKEN'IN SÜRESİ BİTMİŞTİR"),
	USERNAME_NOT_FOUND("1006", "USERNAME BULUNAMADI"),
	GENERAL_EXCEPTİON("9999","GENEL BİR HATA OLUŞTU");
	
	private String code;
	
	private String message;
	
	MessageType(String code , String message){
		this.code=code;
		this.message=message;
	}
}
