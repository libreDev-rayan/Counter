package com.rayan.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/your_server")
public class HomeController {
	 @RequestMapping("/")
	 public String index( HttpSession session) {
		 	        
	        if (session.getAttribute("count") == null) {
	            session.setAttribute("count", 0);
	        }
	        Integer count = (Integer) session.getAttribute("count");
	        count += 1;
	        session.setAttribute("count", count);
	     return "index.jsp";
	 }
	 @RequestMapping("/counter")
	 public String counter(Model model) {
	     
	     return "counter.jsp";
	 }

}
