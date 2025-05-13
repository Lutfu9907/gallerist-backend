package com.lutfudolay.service;

import com.lutfudolay.dto.CurrencyRatesResponse;

public interface ICurrencyRatesService{

	public CurrencyRatesResponse getCurrencyRates(String startDate , String endDate);
}
