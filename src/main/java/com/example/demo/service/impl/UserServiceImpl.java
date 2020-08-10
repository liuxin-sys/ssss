package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.model.po.UserPO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.vo.UserVO;
import com.example.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob的
 * @since 2020-08-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserVO> implements IUserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 模糊查询
     */
    public List<UserVO> selectDim(String name){
        LambdaQueryWrapper<UserVO> wrapper = new LambdaQueryWrapper<>();
        if (name != null){
            wrapper.like(UserVO::getRname,name);
        }
        return this.userMapper.selectList(wrapper);
    }

    /**
     * 查询一个用户有什么角色
     * @param name
     * @return
     */
    @Override
    public List<UserVO> select(String name){
        return userMapper.select(name);
    }
}