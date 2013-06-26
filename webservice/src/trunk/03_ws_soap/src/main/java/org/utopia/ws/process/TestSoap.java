/**  
 * Utopia Inc.
 * @Copyright (c) 2013-2013  All rights reserved.
 */
package org.utopia.ws.process;

import java.io.IOException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

import org.junit.Test;
import org.w3c.dom.Document;

/**
 * The Class TestSoap.
 * 
 * @Description 测试 soap 消息
 * @author peng.zhao
 * @Date Apr 25, 2013 3:18:31 PM
 * @version Id:TestSoap.java v1.0
 */
public class TestSoap {
	
	/**webservice 地址*/
	public static final String wsUrl = "http://localhost:7777/ns?wsdl";
	
	/**命名空间*/
	public static final String ns  = "http://impl.service.utopia.org/";
	

	/**
	 * 封装soap 消息
	 */
	@Test
	public void testSoap() {
		try {
			// 1.创建消息工厂
			MessageFactory mf = MessageFactory.newInstance();
			// 2.创建消息对象
			SOAPMessage message = mf.createMessage();
			// 3.创建soap Part
			SOAPPart sp = message.getSOAPPart();
			// 4.获取 soap 信封
			SOAPEnvelope se = sp.getEnvelope();
			// 5.通过SOAPEnvelope 获取soap 消息的header、body
			SOAPBody body = se.getBody();
			QName name = new QName("http://service.utopia.org/", "add", "ns");
			SOAPBodyElement ele = body.addBodyElement(name);
			ele.addChildElement("a").setValue("1");
			ele.addChildElement("b").setValue("2");
			message.writeTo(System.out);
		} catch (SOAPException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSoapSend() {
		try {
			// 1.创建服务
			URL url = new URL(wsUrl);
			QName sname = new QName(ns,"IserviceImplService");
			Service service = Service.create(url,sname);
			// 2.创建dispatch
			Dispatch<SOAPMessage> dispatch =  service.createDispatch(new QName(ns,"IserviceImplPort"),SOAPMessage.class,Service.Mode.MESSAGE);
			// 3.创建消息工厂
			MessageFactory mf = MessageFactory.newInstance();
			// 4.创建消息对象
			SOAPMessage message = mf.createMessage();
			// 5.创建soap Part
			SOAPPart sp = message.getSOAPPart();
			// 6.获取 soap 信封
			SOAPEnvelope se = sp.getEnvelope();
			// 7.通过SOAPEnvelope 获取soap 消息的header、body
			SOAPBody body = se.getBody();
			// 8.具体webservice 方法
			QName name = new QName("http://service.utopia.org/", "add", "ns");
			// 9.为soapBody 增加元素 
			SOAPBodyElement ele = body.addBodyElement(name);
			// 10.为参数a赋值
			ele.addChildElement("a").setValue("1");
			// 11.为参数a赋值
			ele.addChildElement("b").setValue("2");
			// 12.发送soap 消息到服务器端口
			SOAPMessage response  = dispatch.invoke(message);
			// 13.获取响应消息body
			Document doc = response.getSOAPPart().getEnvelope().getBody().extractContentAsDocument();
			// 14.获取body 内元素内容
			String text = doc.getElementsByTagName("addResult").item(0).getTextContent();
			System.out.println("\n"+text);
		} catch (SOAPException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
