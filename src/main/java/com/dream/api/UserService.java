package com.dream.api;

import com.dream.representation.user.UserObject;

public interface UserService {

    UserObject findById(Long id);
}
