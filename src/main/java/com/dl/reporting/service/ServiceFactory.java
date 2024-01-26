package com.dl.reporting.service;

import javax.xml.ws.BindingProvider;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;

import com.dl.model.ConfigModel;
import com.dl.model.ServerConfig;
import com.dl.reporting.execution2005.ReportExecutionServiceSoap;
import com.dl.reporting.service2010.ReportingService2010Soap;

public class ServiceFactory 
{
	public ReportingService2010Soap getReportingService(ServerConfig serverConfig) {

		String username = serverConfig.getUsername();
		String password = serverConfig.getPassword();
		String domain = serverConfig.getDomain();
		String ssrsUrl = serverConfig.getSSRSUrl();

		// Create a CXF client proxy factory
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ReportingService2010Soap.class);
		factory.setAddress(ssrsUrl);

		// Create the client proxy
		ReportingService2010Soap client = (ReportingService2010Soap) factory.create();

		BindingProvider prov = ((BindingProvider) client);
		// Most important for it to work
		prov.getRequestContext().put("use.async.http.conduit", Boolean.TRUE);
		prov.getRequestContext().put("org.apache.cxf.transports.http2.enabled", Boolean.TRUE);
		Credentials creds = new NTCredentials(username, password, null, domain);
		prov.getRequestContext().put(Credentials.class.getName(), creds);

		// Obtain the CXF client object
		Client cxfClient = ClientProxy.getClient(client);
		cxfClient.getInInterceptors().add(new LoggingInInterceptor());
		cxfClient.getOutInterceptors().add(new LoggingOutInterceptor());
		// Configure HTTP conduit for NTLM authentication
		AsyncHTTPConduit conduit = (AsyncHTTPConduit) cxfClient.getConduit();
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		httpClientPolicy.setConnectionTimeout(36000); // Adjust as needed
		httpClientPolicy.setReceiveTimeout(0);
		// Most important for it to work
		httpClientPolicy.setAllowChunking(false);
		httpClientPolicy.setAutoRedirect(true);
		conduit.setClient(httpClientPolicy);
		return client;
	}
	
	public ReportExecutionServiceSoap getReportExecutionService(ConfigModel config) 
	{
		
		String username = config.getServerConfig().getUsername();
		String password = config.getServerConfig().getPassword();
		String domain = config.getServerConfig().getDomain();
		String ssrsExecutionUrl = config.getServerConfig().getSSRSExecutionUrl();


		// Create a CXF client proxy factory
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ReportExecutionServiceSoap.class);
		factory.setAddress(ssrsExecutionUrl);

		// Create the client proxy
		ReportExecutionServiceSoap client = (ReportExecutionServiceSoap) factory.create();

		BindingProvider prov = ((BindingProvider) client);
		// Most important for it to work
		prov.getRequestContext().put("use.async.http.conduit", Boolean.TRUE);
		prov.getRequestContext().put("org.apache.cxf.transports.http2.enabled", Boolean.TRUE);
		Credentials creds = new NTCredentials(username, password, null, domain);
		prov.getRequestContext().put(Credentials.class.getName(), creds);

		// Obtain the CXF client object
		Client cxfClient = ClientProxy.getClient(client);
		cxfClient.getInInterceptors().add(new LoggingInInterceptor());
		cxfClient.getOutInterceptors().add(new LoggingOutInterceptor());
		// Configure HTTP conduit for NTLM authentication
		AsyncHTTPConduit conduit = (AsyncHTTPConduit) cxfClient.getConduit();
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		httpClientPolicy.setConnectionTimeout(36000); // Adjust as needed
		httpClientPolicy.setReceiveTimeout(0);
		// Most important for it to work
		httpClientPolicy.setAllowChunking(false);
		httpClientPolicy.setAutoRedirect(true);
		conduit.setClient(httpClientPolicy);
		return client;
	}


}
