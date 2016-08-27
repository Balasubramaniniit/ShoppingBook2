package com.book.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.model.Product;

import com.book.services.ProductService;
//it is used to make the java as controller
@Controller
public class CategoryController {
	//it is used to create a object as like new()
	@Autowired(required=true)
	private ProductService productService;
	//it is to make mapped b/w jsp and java
	@RequestMapping(value="/comics")
	public String cat1(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("product",productmodelResult);
	    map.put("productList", productService.getAllCOMICS());
	  System.out.println(productmodelResult);
		return "Category";
	}

	//it is to make mapped b/w jsp and java
	@RequestMapping(value="/art")
	public String cat2(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("product",productmodelResult);
	    map.put("productList", productService.getAllART());
	  System.out.println(productmodelResult);
		return "Category";
	}

	//it is to make mapped b/w jsp and java
	@RequestMapping(value="/engineering")
	public String cat3(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("product",productmodelResult);
	    map.put("productList", productService.getAllENGINEERING());
	  System.out.println(productmodelResult);
		return "Category";
	}

	//it is to make mapped b/w jsp and java
	@RequestMapping(value="/historical")
	public String cat4(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("product",productmodelResult);
	    map.put("productList", productService.getAllHISTORICAL());
	  System.out.println(productmodelResult);
		return "Category";
	}

	//it is to make mapped b/w jsp and java
	@RequestMapping(value="/cooking")
	public String cat5(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("product",productmodelResult);
	    map.put("productList", productService.getAllCOOKING());
	  System.out.println(productmodelResult);
		return "Category";
	}
	@RequestMapping(value="/biography")
	public String cat6(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("product",productmodelResult);
	    map.put("productList", productService.getAllHISTORICAL());
	  System.out.println(productmodelResult);
		return "Category";
	}
}
