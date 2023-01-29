package com.acrip.distribuidos.api_rest_auth.services;

import com.acrip.distribuidos.api_rest_auth.models.UserEntity;

public interface IUserService {
    public UserEntity create(UserEntity prmUser);
    public UserEntity findById(Integer prmId);
}
