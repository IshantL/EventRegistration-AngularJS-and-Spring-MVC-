package com.event.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.event.dto.Registration;

@Repository
public class RegistrationDAOImpl implements RegistrationDAO {
	
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	
	
	RegistrationDAOImpl() {
		System.out.println("Inside PromoCodeDAOImpl controller");

	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;	
	}

	

	@Override
	public int addRegistration(Registration user) {
 		return jdbcTemplate.update("INSERT INTO \"EventRegistration\".Registration(regID, name, email, imgBlob,registrationType, phone, noOfTickets) VALUES ( ?, ?, ?, ?, ?, ?, ?)" , new Object[]{user.getRegId(),user.getName(),user.getEmail(),user.getImgBlob(),user.getRegistrationType(),user.getPhone()});
	
	}


}
