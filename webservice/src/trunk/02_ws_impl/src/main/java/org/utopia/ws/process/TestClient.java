package org.utopia.ws.process;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;
import org.utopia.service.User;
import org.utopia.service.impl.Iservice;

public class TestClient {

	
	@Test
	/**
	 * 发布webservice
	 */
	public void publishWebService(){
		
	}
	
	
	public static void main(String[] args)  {
		try {
			//创建url
			URL url  = new URL("http://localhost:7777/ns");
			//创建Qname
			QName sname = new QName("http://impl.service.utopia.org/","IserviceImplService");
			//创建 服务
			Service services  = Service.create(url,sname);
			Iservice ms  = services.getPort(Iservice.class);
			User user = new User();
			user.setId("101");
			user.setAge(17);
			user.setName("张三");
			ms.add(1, 2);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
