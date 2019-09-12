package com.inphase.plat.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户表
 * 
 * @email
 * @date 2018-08-31 15:01:21
 */
@TableName("user")
@Data
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private String id;
	/**
	 * ??？ID
	 */
	private String deptId;
	/**
	 * 登录帐号
	 */
	private String loginName;
	/**
	 * 登录密码
	 */
	private String passwd;
	/**
	 * 用户名称
	 */
	private String userName;

}
