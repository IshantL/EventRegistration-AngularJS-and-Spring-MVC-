
package com.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.event.dao.RegistrationDAO;
import com.event.dto.Registration;


@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	RegistrationDAO registrationDAO;


	RegistrationServiceImpl() {
		System.out.println("Inside PromoCodeServiceImpl controller");

	}

	
	@Override
	public List<Registration> addRegistration(Registration user) {
		int insertCount=0;
		insertCount = registrationDAO.addRegistration(user);
		return null;
	}




}
