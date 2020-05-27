package com.RestMethods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.HttpURLConnection;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class RestClient {
	
	//Rest API Get method
	public static void get(String url) throws ClientProtocolException, IOException{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		//Http Get Request
		HttpGet httpget = new HttpGet(url);
	
		//Hit the Get URL
		CloseableHttpResponse response =  httpClient.execute(httpget);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println(statusCode);
		if (statusCode != 200) {
			throw new RuntimeException("HTTP error code" + statusCode);
			}
		
		// Get the Response Body
		String responseBody = EntityUtils.toString(response.getEntity(), "UTF-8");
		System.out.println(responseBody);
	}

	/*	URL Strurl= new URL("https://api.ratesapi.io/api/latest?base=USD&symbols=GBP");
		HttpURLConnection conn = (HttpURLConnection)Strurl.openConnection();
		conn.setRequestMethod("GET");
		
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("HTTP error code" + conn.getResponseCode());
			}
	}*/


public static void exchangeCurrency(String currency, int amount){
	//www.oanda.com //need to write code to take latest currency rate 
	double  euro = 0.71;
	if(currency.equalsIgnoreCase("USD")){
		double exchangeCurrency = amount * euro;
		System.out.println("Currency Exchanged against " + amount +" "+ currency +" is Euro " + exchangeCurrency);
	}
	
}
}
