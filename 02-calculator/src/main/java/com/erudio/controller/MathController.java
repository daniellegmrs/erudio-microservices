package com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erudio.converter.NumberConverter;
import com.erudio.exception.MathOperationException;
import com.erudio.math.MathOperation;

@RestController
public class MathController {
	
	
	private MathOperation math = new MathOperation();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) 
		throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new MathOperationException("Please set a numeric value!");
			
		}
			
			return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) 
		throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new MathOperationException("Please set a numeric number!");
		
		}
			return math.sub(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) 
		throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new MathOperationException("Please set a numeric value!");		
		
		}	
			return math.div(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		}
	
	@RequestMapping(value = "/mut/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mut(@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) 
		throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new MathOperationException("Please set a numeric value!");		
			
		}
			return math.mut(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		}
	
	@RequestMapping(value = "/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double med(@PathVariable("numberOne")String numberOne, @PathVariable("numberTwo")String numberTwo) 
		throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new MathOperationException("Please set a numeric value!");		
			
		}	
			return math.med(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		}
	
	@RequestMapping(value = "/root/{number}", method = RequestMethod.GET)
	public Double root(@PathVariable("number")String number) 
		throws Exception {
		if (!NumberConverter.isNumeric(number)) {
			throw new MathOperationException("Please set a numeric value!");		
		
		}
			return math.root(NumberConverter.convertToDouble(number));
		}
	}

