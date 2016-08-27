/*package com.book.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.book.model.Cart;
import com.book.model.Orders;
import com.book.model.OrdersDetail;
import com.book.services.OrdersDetailService;
import com.book.services.OrdersService;
import com.book.services.ProductService;
import com.book.services.RegisterService;

@Controller
@RequestMapping("/cart")
public class CartController {
	@Autowired
	private OrdersService ordersService;

	@Autowired
	private OrdersDetailService ordersDetailService;

	@Autowired
	private ProductService productService;

	@Autowired
	private RegisterService registerService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("title", "Cart");
		modelMap.put("action", "cart");
		return "Cart";
	}

	@RequestMapping(value = "add/{productid}", method = RequestMethod.GET)
	public String buy(@PathVariable("id") int id, HttpSession session, ModelMap modelMap) {
		modelMap.put("title", "Cart");
		if (session.getAttribute("cart") == null) {
			List<Cart> cart = new ArrayList<Cart>();
			cart.add(new Cart(productService.find(id), 1));
			session.setAttribute("cart", cart);
		} else {
			List<Cart> cart = (List<Cart>) session.getAttribute("cart");
			int index = isExists(id, session);
			if (index == 1)
				cart.add(new Cart(productService.find(id), 1));
			else {
				int quantity = cart.get(index).getQuantity() + 1;
				cart.get(index).setQuantity(quantity);
				session.setAttribute("cart", cart);
			}
			session.setAttribute("cart", cart);

		}
		return "Cart";
	}

	@RequestMapping(value = "delete/{productid}", method = RequestMethod.GET)
	public String buy1(@PathVariable("index") int index, HttpSession session, ModelMap modelMap) {
		List<Cart> cart = (List<Cart>) session.getAttribute("cart");
		cart.remove(index);
		session.setAttribute("cart", cart);
		return "redirect:/cart";
	}

	@RequestMapping(value = "checkout", method = RequestMethod.GET)
	public String checkout(HttpSession session, ModelMap modelMap) {
		modelMap.put("title", "Cart");
		if (session.getAttribute("username") == null) {
			return "login";
		} else {
			// save order
			Orders orders = new Orders();
			orders.setRegister(registerService.find(session.getAttribute("username").toString()));
			orders.setDatecreation(new Date());
			orders.setStatus(false);
			Orders newOrder = ordersService.create(orders);

			// save order detail
			List<Cart> cart = (List<Cart>) session.getAttribute("cart");
			for (Cart cart1 : cart) {
				OrdersDetail ordersDetail = new OrdersDetail();
				ordersDetail.setId(new OrdersDetailId(cart.getProduct().getId(), newOrder.getId()));
				ordersDetail.setPrice(cart.getProduct.getPrice());
				ordersDetail.setQuantity(cart.getQuantity);
				ordersDetailService.create(ordersDetail);
			}

			// Clear cart
			session.removeAttribute("cart");
		}
		return "Cart";
	}

	private int isExists(int id, HttpSession session) {
		List<Cart> cart = (List<Cart>) session.getAttribute("cart");
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getProduct().getProductid() == id)
				;
			return i;
		}
		return -1;
	}
}
*/