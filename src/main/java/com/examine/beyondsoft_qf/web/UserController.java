package com.examine.beyondsoft_qf.web;

import com.examine.beyondsoft_qf.model.User;
import com.examine.beyondsoft_qf.service.UserService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/01/21.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser")
    @ResponseBody
    public List<User> getIndex() {
        List<User> userList = userService.getUserList(null);
        return userList;
    }

}
