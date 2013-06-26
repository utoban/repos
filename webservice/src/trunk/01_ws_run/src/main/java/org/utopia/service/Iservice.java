package org.utopia.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.utopia.model.User;


@WebService()
public interface Iservice {	
	
	
	
	/**
	 * 打招呼
	 * @param user
	 * @return
	 */
	@WebResult(name="sayHelloResult")
	public String sayHello(@WebParam(name="user") User user);
	
	
	/**
	 * 根据主键查询用户信息
	 * @param id
	 * @return
	 */
	public User	queryUserInfo(Integer id);	
	
	
	/**
	 * 查询用户集合
	 * @param id
	 * @return
	 */
	public List<User>	queryUserList(User user);	
	
	/**
	 * 加法运算
	 * @param a
	 * @param b
	 * @return
	 */
	@WebResult(name="addResult")
	public String add(@WebParam(name="a") int a,@WebParam(name="b") int b);
	

}
