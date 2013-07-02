/**  
 * Utopia Inc.
 * @Copyright (c) 2013-2013  All rights reserved.
 */
package org.utopia.model;

import java.io.Serializable;

/**
 * The Class User.
 * 
 * @Description 领域模型-用户
 * @author peng.zhao
 * @Date Apr 22, 2013 4:28:40 PM
 * @version Id:User.java v1.0
 */
public class User implements Serializable {

	/**
	 * UUID
	 */
	private static final long	serialVersionUID	= 1307670107502881836L;

	/** 用户编号. */
	private String				id;

	/** 用户姓名. */
	private String				name;

	/** 年龄 */
	private Integer			age;

	public User() {
		super();
	}

	public User(String id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/**
	 * 取值- 用户编号.
	 * 
	 * @return the 用户编号
	 */
	public String getId() {
		return id;
	}

	/**
	 * 赋值- 用户编号.
	 * 
	 * @param id
	 *             the new 用户编号
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 取值- 用户姓名.
	 * 
	 * @return the 用户姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 赋值- 用户姓名.
	 * 
	 * @param name
	 *             the new 用户姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
