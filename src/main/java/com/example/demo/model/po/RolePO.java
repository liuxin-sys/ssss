package com.example.demo.model.po;

import java.io.Serializable;
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
public class RolePO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名
     */
    private String rname;

    /**
     * 用户id
     */
    private String uid;


}
