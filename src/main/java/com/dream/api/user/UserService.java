package com.dream.api.user;

import com.dream.representation.user.UserObject;

import java.util.List;

public interface UserService {

    UserObject findById(Long id);

    List<UserObject> findAll();

}
