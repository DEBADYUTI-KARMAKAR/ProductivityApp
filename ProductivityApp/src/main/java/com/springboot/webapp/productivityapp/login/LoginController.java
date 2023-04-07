package com.springboot.webapp.productivityapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	private AuthenticationService authenticationService;
	
	// constructor injection for authentication service
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String Login() {
		// model.put("name", name);
		return "logedin";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String Welcome(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (authenticationService.authenticate(name, password)) {

			model.put("name", name);
			
			return "welcome";
		}
		
		// error		
		model.put("errorMessage", "Invalid Credentials! Please try again");
		
		return "logedin";
	}

}
