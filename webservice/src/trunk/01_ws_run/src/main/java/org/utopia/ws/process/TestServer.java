package org.utopia.ws.process;

import javax.xml.ws.Endpoint;

import org.utopia.service.impl.IserviceImpl;

public class TestServer {

	
	public static void main(String[] args)  {
		Endpoint endpoint = Endpoint.publish("http://localhost:8888/ns",new IserviceImpl());
	}
	
}
