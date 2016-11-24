package com.dream.service.user;

import com.dream.api.UserService;
import com.dream.entity.user.User;
import com.dream.exception.BusinessException;
import com.dream.repository.UserRepository;
import com.dream.representation.user.EnumUserError;
import com.dream.representation.user.UserObject;
import com.dream.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userServiceImpl")
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

    @Override
    public List<UserObject> findAll() {
        List<User> userList = userRepository.findAll();
        List<UserObject> userObjectList = BeanMapper.mapList(userList, UserObject.class);
        return userObjectList;
    }
}
