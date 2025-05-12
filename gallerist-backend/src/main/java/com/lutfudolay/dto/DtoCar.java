package com.lutfudolay.dto;

import java.math.BigDecimal;

import com.lutfudolay.enums.CarStatusType;
import com.lutfudolay.enums.CurrencyType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoCar extends DtoBase{
	
	private String plaka;
	
	private String brand;
	
	private String model;
	
	private Integer productionYear;
	
	private BigDecimal price;
	
	private BigDecimal damagePrice;
	
	private CurrencyType currencyType;
	
	private CarStatusType carStatusType;
}
