package com.acrip.distribuidos.api_rest_auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.acrip.distribuidos.api_rest_auth.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.acrip.distribuidos.api_rest_auth.services.IUserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @Autowired
    private IUserService userService;

	@PostMapping("/users")
	public UserEntity create(@RequestBody UserEntity prmUser) {	
		UserEntity objUser = null;
		objUser =  userService.create(prmUser);
		return objUser;
	}

    @GetMapping("/users/{prmId}")
	public UserEntity show(@PathVariable Integer prmId) {
		UserEntity objUser = null;		
		objUser = userService.findById(prmId);		
		return objUser;
	}

}
