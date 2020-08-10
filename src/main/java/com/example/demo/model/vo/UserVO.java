package com.example.demo.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.model.po.UserPO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel("用户实体类")
@TableName("user")
public class UserVO extends UserPO {

    @ApiModelProperty("用户名")
    @TableField("uname")
    private String uname;

    @ApiModelProperty("用户性别")
    @TableField("sex")
    private String sex;

    @ApiModelProperty("用户角色")
    private String rname;
}