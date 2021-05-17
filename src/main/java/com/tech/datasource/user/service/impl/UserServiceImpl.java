package com.tech.datasource.user.service.impl;

import com.tech.datasource.user.entity.User;
import com.tech.datasource.user.mapper.UserMapper;
import com.tech.datasource.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lw
 * @since 2021-05-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
