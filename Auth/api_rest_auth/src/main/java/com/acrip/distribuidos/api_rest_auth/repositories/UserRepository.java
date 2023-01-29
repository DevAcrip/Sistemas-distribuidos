package com.acrip.distribuidos.api_rest_auth.repositories;

import java.util.Date;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.acrip.distribuidos.api_rest_auth.models.UserEntity;

@Service
public class UserRepository {
    private ArrayList<UserEntity> usersList;

    public UserRepository() {
        this.usersList = new ArrayList<UserEntity>();
        loadUsers();
    }

    private void loadUsers() {
        UserEntity objUser1 = new UserEntity(1, "Juan", "Meneses", "jm@acrip.co", 31284728, "juanm", "juan123", new Date());
        UserEntity objUser2 = new UserEntity(2, "Maria", "Paz", "mp@acrip.co", 31384728, "mariap", "maria123", new Date());
        UserEntity objUser3 = new UserEntity(3, "Diego", "Rincon", "dr@acrip.co", 31484728, "diegor", "diego123", new Date());
        UserEntity objUser4 = new UserEntity(4, "Sara", "Tupaz", "st@acrip.co", 31584728, "sarat", "sara123", new Date());
        this.usersList.add(objUser1);
        this.usersList.add(objUser2);
        this.usersList.add(objUser3);
        this.usersList.add(objUser4);
    }

    public UserEntity create(UserEntity prmUser){
        return this.usersList.add(prmUser) ? prmUser : null;
    }

    public UserEntity findById(Integer prmId) {
        return usersList.stream().filter(user -> user.getId() == prmId).findFirst().orElse(null);
    }

}
