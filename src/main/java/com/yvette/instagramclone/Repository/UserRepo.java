package com.yvette.instagramclone.Repository;

import com.yvette.instagramclone.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//communicate with sql database
@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {
    Users save(Users user);
    Users findUsersByUserId(String userId);
}
