package com.superb.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.superb.model.UserEntity;
import org.apache.catalina.User;

import java.util.List;

/**
 * @author chao.gao
 */
public interface UserService {

    /**
     * 获取用户
     * @param id
     * @return
     */
    UserEntity getUserById(Long id);

    /**
     * 
     * @param sex
     * @return
     */
    List<UserEntity> getUserBySex(int sex);

    /**
     * 添加用户
     * @param user
     */
    void save(UserEntity user);

    /**
     * 分页查询
     * @return
     */
    IPage<UserEntity> selectByPage (UserEntity user);
}
