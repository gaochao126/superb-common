package com.superb.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.superb.mapper.UserMapper;
import com.superb.model.UserEntity;
import com.superb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chao.gao
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public UserEntity getUserById(Long id) {

        UserEntity userEntity = userMapper.selectById(id);

        return userEntity;
    }

    @Override
    public List<UserEntity> getUserBySex(int sex) {
        List<UserEntity> entityList = userMapper.selectUserBySex(sex);
        return entityList;
    }

    @Override
    public void save(UserEntity user) {
        userMapper.insert(user);
    }

    @Override
    public IPage<UserEntity> selectByPage(UserEntity user) {
        IPage<UserEntity> page = userMapper.selectByPage(new Page<>(1,10), user);
        return page;
    }
}
