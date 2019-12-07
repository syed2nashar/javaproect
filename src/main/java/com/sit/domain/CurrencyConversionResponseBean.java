package com.sit.domain;

import lombok.Data;

@Data
public class CurrencyConversionResponseBean {

	private String FromCurrency;
	private String ToCurrency;
	private Double Totalcost;
}
