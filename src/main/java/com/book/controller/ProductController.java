package com.book.controller;
import java.io.File;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.book.model.Product;
import com.book.services.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@RequestMapping("/products")
	public String setupForm(Map<String, Object> map){
		Product product = new Product();
		map.put("product", product);
		map.put("productList", productService.getAllProduct());
		return "products";
	}
	
	
	@RequestMapping("delete/{productid}")
	public String del(@PathVariable("productid")int id,ModelMap model)
	{
		productService.delete(id);
		return"redirect:/viewall2";
	}
	
	@RequestMapping("edit/{productid}")
	public String edititem(@PathVariable("productid")int id,@ModelAttribute Product product, BindingResult result,Map<String, Object> map)
	{	
		product=productService.getProduct(id);
		map.put("product", product);
		map.put("productList", productService.getAllProduct());
		return "products";
		
	}
	
	@RequestMapping("/viewall2")
	public String getvieform(Map<String,Object>map)
	{
		Product product=new Product();
		map.put("product",product);
		map.put("productList", productService.getAllProduct());
		return"viewall2";
	}
	
	@RequestMapping(value={"/products","edit/products"}, method=RequestMethod.POST)
	public String doActions(@ModelAttribute("product") @Valid Product  product, BindingResult result, @RequestParam String action,Map<String, Object> map){
		Product productResult = new Product();
		switch(action.toLowerCase()){	
		case "add":
			MultipartFile file=product.getImage();
			productService.add(product);
			if (!file.isEmpty()) 
			{
				try {
						String rootPath = "E:/NIIT notes/update project/shoppingbook/src/main/webapp/resources";
						File dir = new File(rootPath + File.separator + "upload");
						if (!dir.exists())
							dir.mkdirs();
						// Create the file on server
						File serverFile = new File(dir + File.separator + product.getImagename() + ".jpg");
						System.out.println(serverFile);
						file.transferTo(serverFile);		
						return "redirect:/products";
					}
					catch (Exception e) 
					{
						return "redirect:/home";
					}
				}
			productResult = product;
			break;
		case "edit":
			productService.edit(product);
			productResult = product;
			break;
		case "delete":
			productService.delete(product.getproductid());
			productResult = new Product();
			break;
		case "search":
			Product searchedProduct = productService.getProduct(product.getproductid());
			productResult = searchedProduct!=null ? searchedProduct : new Product();
			break;
		}
		map.put("product", productResult);
		map.put("productList", productService.getAllProduct());
		return "viewall2";
	}

	
}
