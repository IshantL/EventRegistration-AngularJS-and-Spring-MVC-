package com.event.controller;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.event.dto.Registration;
import com.event.service.RegistrationService;
import com.google.gson.Gson;


@Controller
public class RegistrationController {
	@Autowired
	RegistrationService registrationService;
	
	 RegistrationController() {
		// TODO Auto-generated constructor stub
			System.out.println("Inside controller constructor");
	}
	 
	 
			@RequestMapping(value="/event/addRegistration",method = RequestMethod.POST,produces = "application/json")
			public @ResponseBody List<Registration>addRegistration(@RequestBody Registration pc) 
			{
				System.out.println("Inside Controller add method");

				return registrationService.addRegistration(pc);
			}

}
