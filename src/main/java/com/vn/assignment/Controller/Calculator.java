package com.vn.assignment.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	@GetMapping("/calculatorapi/v1/addition")
	public String addition(@RequestParam int no1 ,int no2)
	{
		
		int sum =no1+no2;
		String reponse="answer : "+sum  +",detail : "+no1+"+"+no2 +"="+sum;
		
		return  reponse;
	}
	@GetMapping("/calculatorapi/v1/subtraction")
	public String subtraction(@RequestParam int no1 ,int no2)
	{
		int subtraction =no1-no2;
		String reponse="answer : "+subtraction  +",detail : "+no1+"-"+no2 +"="+subtraction;
		
		return reponse;
	}
	
	@GetMapping("/calculatorapi/v1/multiplication")
	public String multiplication(@RequestParam int no1 ,int no2)
	{
		int multiplication =no1*no2;
		String reponse="answer : "+multiplication  +",detail : "+no1+"*"+no2 +"="+multiplication;
		
		return reponse;
	}
	
	@GetMapping("/calculatorapi/v1/division")
	public String division(@RequestParam int no1 ,int no2)
	{
		int division =no1/no2;
		String reponse="answer : "+division  +",detail : "+no1+"/"+no2 +"="+division;
		
		return reponse;
	}
	
	@GetMapping("/calculatorapi/v1/square")
	public String square(@RequestParam int no1)
	{
		int square =no1*no1;
		String reponse="answer : "+square  +",detail : square of "+no1 +" =" +square ;
		
		return reponse;
	}
	@GetMapping("/calculatorapi/v1/squareroot")
	public String squareroot(@RequestParam int no1)
	{
		double squareroot =Math.sqrt(no1); 
		String reponse="answer : "+squareroot  +",detail : squareroot of "+no1 +" =" +squareroot ;
		
		return reponse;
	}
	@GetMapping("/calculatorapi/v1/factorial")
	public String factorial(@RequestParam int no1)
	{
		int i, fact = 1;
		for (i = 1; i <= no1; i++) {
			fact = fact * i;
		}
		String reponse = "answer : " + fact + ", detail : squareroot of " + no1 + " =" + fact;

		return reponse;
	}
	
	@GetMapping("/calculatorapi/v1/min_max")
	public String min_max()
	{
		final List<Integer> numbers = new ArrayList();
		
		numbers.add(10);
		numbers.add(180);
		numbers.add(104);
		numbers.add(7);
		numbers.add(108);
		numbers.add(652);
	    	Integer min =Collections.min(numbers);
	    	Integer max =Collections.max(numbers);
	 
		String reponse = "answer min: " + min + " max "+ max +", detail : min & max " + min + " & " + max;

		return reponse;
	}
}
