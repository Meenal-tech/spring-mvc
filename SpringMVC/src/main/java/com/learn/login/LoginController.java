package com.learn.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

//	@RequestMapping(value = "/login")
//	@ResponseBody 
	
	// if we dont put this annotation, then browser will think that 
	// this is redirecting you yo a new url or a new view - "Hello World".
	//but since we want to print the string, hence we are usig this as response body.
	
//	public String sayHello() {
//		return "login";
		
//		the flow is handled through view handler.
//		we have a bean configured in todo-servlets.xml,
//		which will append prefix and suffix the path
//		of the file - "login.jsp".
//		hence this way, we are handling the view here.
		
//	}
	
//	@RequestMapping(value = "/loginForm") 
//	public String loadLoginForm() {
//		return "loginForm";
//	}
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET) 
	public String handleGetRequest() {
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handlePostRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if(!service.validateUser(name, password)) {
			model.put("wrong_pass", "Invalid Password!");
			return "loginForm";
		}
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}

//	here we are using ModelMap, to get the parameters for spring mvc, 
//	and set it to the view i.e in the jsp view page.
//	unlike there before, we were using normal servlets.
	
	
	
}
	
	

