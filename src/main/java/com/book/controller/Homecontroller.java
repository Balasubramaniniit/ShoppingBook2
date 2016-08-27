package com.book.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.book.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.model.Product;

import com.book.services.ProductService;

//it is used to make the java as controller
@Controller
public class Homecontroller {
	// it is to make mapped b/w jsp and java

	@RequestMapping(value = { "/", "/home","/index" })
	public String home() {
		return "index";
	}
	// it is to make mapped b/w jsp and java

	@RequestMapping(value = "/context")
	public String context() {
		return "Feedback";
	}
	@RequestMapping(value = "/productsDetail")
	public String context1() {
		return "Cooking";
	}
	@RequestMapping(value = "/cart")
	public String context2() {
		return "cart";
	}
	@RequestMapping(value = "/header1")
	public String context3() {
		return "cart";
	}
	// it is to make mapped b/w jsp and java

	@RequestMapping(value = "/upload")
	public String view() {
		
		return "uploadFile";
	}
	// it is to make mapped b/w jsp and java


	@RequestMapping(value = "/register")
	public String view2() {
		return "register";
	}
	// it is to make mapped b/w jsp and java

	@RequestMapping(value = "/login1", method = RequestMethod.GET)
	public ModelAndView userloginpage() {
		ModelAndView modelAndView = new ModelAndView("login1");
		return modelAndView;
	}
	// it is to make mapped b/w jsp and java

	@RequestMapping(value = "/chklogin", method = RequestMethod.POST)
	public ModelAndView userloginck(HttpServletRequest req) {
		String u = req.getParameter("username");
		String p = req.getParameter("password");
		if ((u.equals("admin")) && (p.equals("password"))) {

			ModelAndView modelAndView = new ModelAndView("admin");
			return modelAndView;
		} else {

			ModelAndView modelAndView = new ModelAndView("login1");
			return modelAndView;

		}

	}
	// it is to make mapped b/w jsp and java

	/*@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView userlogin(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession httpSession) {
		boolean isvaliduser = false;
		User userDetails = new User();
		userDetails.setName(username);
		userDetails.setPassword(password);
		ModelAndView modelAndView = new ModelAndView("home");
		if (isvaliduser == true) {

			modelAndView.addObject("message", "hello welcome");
			modelAndView.addObject("name", userDetails.getName());

		}

		return modelAndView;
	}*/

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

		ModelAndView model = new ModelAndView();
		
		//check if user is login
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			System.out.println(userDetail);
		
			model.addObject("username", userDetail.getUsername());
			
		}
		
		model.setViewName("403");
		return model;

}
}