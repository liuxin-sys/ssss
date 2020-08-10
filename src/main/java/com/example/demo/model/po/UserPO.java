package com.example.demo.model.po;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserPO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *用户名
     */
    private String uname;

    /**
     * 用户性别
     */
    private String sex;
}