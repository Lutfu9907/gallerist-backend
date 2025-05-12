package com.lutfudolay.dto;

import java.math.BigDecimal;

import com.lutfudolay.enums.CarStatusType;
import com.lutfudolay.enums.CurrencyType;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoCarIU {

	@NotNull
	private String plaka;
	
	@NotNull
	private String brand;
	
	@NotNull
	private String model;
	
	@NotNull
	private Integer productionYear;
	
	@NotNull
	private BigDecimal price;
	
	@NotNull
	private BigDecimal damagePrice;
	
	@NotNull
	private CurrencyType currencyType;
	
	@NotNull
	private CarStatusType carStatusType;
}
