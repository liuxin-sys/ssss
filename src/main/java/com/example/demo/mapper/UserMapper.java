package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.model.po.UserPO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-08-07
 */
@Mapper
public interface UserMapper extends BaseMapper<UserVO> {

    /**
     * 查询一个用户有什么角色
     * @param name
     * @return
     */
    @Select("select u.uname,u.sex,r.rname from user u,role r where u.id = r.uid and u.uname = #{name}")
    public List<UserVO> select(String name);

    /**
     * 分页
     * @param page
     * @param state
     * @return
     */
    public IPage<UserVO> selectUserPage(Page<UserVO> page, Integer state);
}