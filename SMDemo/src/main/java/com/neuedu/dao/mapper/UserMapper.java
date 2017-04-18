package com.neuedu.dao.mapper;

import com.neuedu.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017-04-18.
 */
@Repository
public interface UserMapper {

    List<User> FindAllUser();
}
