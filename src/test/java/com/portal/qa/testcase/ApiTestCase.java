package com.portal.qa.testcase;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.portalApi.qa.base.TestBase;
import com.portalApi.qa.page.RestClient;

public class ApiTestCase extends TestBase {
	RestClient restclient;
	TestBase testbase;
	
	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException, JSONException {
		testbase = new TestBase();
	}
	@Test
	public void getApiResponse() throws ClientProtocolException, IOException, JSONException {
		restclient = new RestClient();
		String url = prop.getProperty("URL");
		restclient.get(url);
	}

}
