package com.lutfudolay.exception;

import lombok.Getter;

@Getter
public enum MessageType {

	NO_RECORD_EXİST("1004", "KAYIT BULUNAMADI"),
	TOKEN_IS_EXPIRED("1005", "TOKEN'IN SÜRESİ BİTMİŞTİR"),
	USERNAME_NOT_FOUND("1006", "USERNAME BULUNAMADI"),
	USERNAME_OR_PASSWORD_INVALID("1007" , "KULLANICI ADI VEYA ŞİFRE HATALI"),
	REFRESH_TOKEN_NOT_FOUND("1008", "REFRESH TOKEN BULUNAMADI"),
	REFRESH_TOKEN_IS_EXPIRED("1009", "REFRESH TOKEN'IN SÜRESİ BİTMİŞTİR"),
	CURRENCY_RATES_IS_OCCURED("1010", "DÖVİZ KURU ALINAMADI"),
	GENERAL_EXCEPTİON("9999","GENEL BİR HATA OLUŞTU");
	
	private String code;
	
	private String message;
	
	MessageType(String code , String message){
		this.code=code;
		this.message=message;
	}
}
