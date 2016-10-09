package com.dream.service;

import com.dream.api.UserService;
import com.dream.entity.user.User;
import com.dream.exception.BusinessException;
import com.dream.repository.UserRepository;
import com.dream.representation.user.EnumUserError;
import com.dream.representation.user.UserObject;
import com.dream.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserObject findById(Long id) {
        User user = userRepository.findOne(id);
        if (user == null) throw new BusinessException(EnumUserError.不存在此用户.toString());
        UserObject userObject = BeanMapper.map(user, UserObject.class);
        return userObject;
    }
}
