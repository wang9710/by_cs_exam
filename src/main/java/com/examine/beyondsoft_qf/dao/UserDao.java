package com.examine.beyondsoft_qf.dao;

import com.examine.beyondsoft_qf.model.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2019/01/21.
 */
public interface UserDao {

    @ResultMap("BaseResultMap")
    @Select("select id, name, age from t_user")
    List<User> getUserList(User user);

}
