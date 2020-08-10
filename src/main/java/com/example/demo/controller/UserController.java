package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.model.vo.UserVO;
import com.example.demo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-08-07
 */
@RestController
@RequestMapping("/user")
@Api(tags = "测试")
public class UserController {
    @Autowired
    private IUserService userService;

    @ApiOperation(value = "模糊查询")
    @GetMapping("selectDim")
    public List<UserVO> selectDim(@RequestParam(value = "name",required = false) String name){
        return  userService.selectDim(name);
    }

    /**
     * 查询一个用户有什么角色
     * @param name
     * @return
     */
    @ApiOperation(value = "多表查询")
    @GetMapping("select")
    public List<UserVO> select(@RequestParam("name") String name){
        return userService.select(name);
    }
}