package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.model.po.UserPO;
import com.example.demo.model.vo.UserVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 * @author jobob
 * @since 2020-08-07
 */
public interface IUserService extends IService<UserVO> {

    /**
     * 模糊查询
     */
    public List<UserVO> selectDim(String name);

    /**
     * 查询一个用户有什么角色
     * @param name
     * @return
     */
    public List<UserVO> select(String name);
}