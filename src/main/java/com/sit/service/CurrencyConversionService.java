package com.sit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.sit.domain.CurrencyConversionResponseBean;

@Service
public class CurrencyConversionService {

private static final String EXCHANGE_URL="https://msproj2-currencyconverterapi.cfapps.io//convertCurrency/from/{from}/to/{to}/quantity/{quantity}";	
	
	public CurrencyConversionResponseBean getCurrencyCost(String form,String to,Double qnty) {
		Builder builder = WebClient.builder();
		WebClient webclient = builder.build();
		
		CurrencyConversionResponseBean resBean = webclient.get()
		         .uri(EXCHANGE_URL,form,to,qnty)
		         .retrieve()
		         .bodyToMono(CurrencyConversionResponseBean.class)
		         .block();
		
		System.out.println(resBean);
		return resBean;
	}
	
	
}
