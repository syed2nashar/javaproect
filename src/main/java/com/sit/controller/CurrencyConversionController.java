package com.sit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sit.domain.CurrencyConversionFormBean;
import com.sit.domain.CurrencyConversionResponseBean;
import com.sit.service.CurrencyConversionService;

@Controller
public class CurrencyConversionController {

	@Autowired
	private CurrencyConversionService service;
	
	@RequestMapping(value = "/")
	public String displayForn(Model model) {
		CurrencyConversionFormBean formBean = new CurrencyConversionFormBean();
		model.addAttribute("conversionFormBean", formBean);
		return "CurrencyConversion";
	}
	
	@RequestMapping(value = "conversionform",method=RequestMethod.POST)
	public String convertCurrency(@ModelAttribute("conversionFormBean")CurrencyConversionFormBean formBean,Model model) {
		CurrencyConversionResponseBean resBean;
		resBean = service.getCurrencyCost(formBean.getFrom(), formBean.getTo(),formBean.getQnty());
		model.addAttribute("responseBean",resBean);
		
		return "CurrencyConversion";
	}
}
