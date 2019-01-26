package com.portalApi.qa.page;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.JsonObject;
import com.portalApi.qa.base.TestBase;

public class RestClient {
	
	public void get(String URL) throws ClientProtocolException, IOException, JSONException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost(URL);
		CloseableHttpResponse closeablehttpresponse = httpclient.execute( httppost);
		int statuscode = closeablehttpresponse.getStatusLine().getStatusCode();
		System.out.println("Status Code : " + statuscode);
		
		String responseString = EntityUtils.toString(closeablehttpresponse.getEntity(),"UTF-8");
		JSONObject jsonResponse = new JSONObject(responseString);
		System.out.println("Response Json from API : " + jsonResponse );
		
		
	    Header[] headerArray = closeablehttpresponse.getAllHeaders();
	    Map<String,String> allHeaders = new HashMap<String,String>();
	    for(Header header : headerArray ) {
	    	allHeaders.put(header.getName(), header.getValue());
	    	
	    }
		System.out.println("Headers Array : " + allHeaders );
		
	}
}