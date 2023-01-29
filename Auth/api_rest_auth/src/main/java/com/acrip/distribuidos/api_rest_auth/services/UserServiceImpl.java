package com.acrip.distribuidos.api_rest_auth.services;

import org.springframework.stereotype.Service;
import com.acrip.distribuidos.api_rest_auth.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.acrip.distribuidos.api_rest_auth.repositories.UserRepository;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserRepository DBAccessService;

    @Override
    public UserEntity create(UserEntity prmUser) {
        return this.DBAccessService.create(prmUser);
    }

    @Override
    public UserEntity findById(Integer prmId) {
        return this.DBAccessService.findById(prmId);
    }
    
}
