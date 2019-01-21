package com.examine.beyondsoft_qf.service.impl;

import com.examine.beyondsoft_qf.dao.UserDao;
import com.examine.beyondsoft_qf.model.User;
import com.examine.beyondsoft_qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2019/01/21.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList(User user) {
        return userDao.getUserList(null);
    }
}
