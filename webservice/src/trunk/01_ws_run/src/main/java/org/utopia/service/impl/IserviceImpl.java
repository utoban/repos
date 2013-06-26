package org.utopia.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.utopia.model.User;
import org.utopia.service.Iservice;

@WebService(endpointInterface="org.utopia.service.Iservice")
public class IserviceImpl implements Iservice{



	@Override
	public String add(int a, int b) {
		return a+"+"+b+"="+(a+b);
	}


	@Override
	@WebResult(name = "sayHelloMessage")
	public String sayHello(@WebParam(name = "user") User user) {
		String msg =  "大家好 ,我叫 "+user.getName()+",学号是"+user.getId()+",年龄:"+user.getAge()+"岁!";
		return msg;
	}


	@Override
	public User queryUserInfo(Integer id) {
		return new User("101","张三",17);
	}


	@Override
	public List<User> queryUserList(User userParam) {
		System.out.println("根据用户信息查询条件筛选数据,"+userParam);
		List<User> userLists = new ArrayList<User>();
		userLists.add(new User("101","张三",18));
		userLists.add(new User("102","李四",19));
		userLists.add(new User("103","王五",20));
		userLists.add(new User("104","六毛",21));
		for (User user : userLists) {
			String msg =  "大家好 ,我叫 "+user.getName()+",学号是"+user.getId()+",年龄:"+user.getAge()+"岁!";
			System.out.println(msg);
		}
		return userLists;
	}

}
