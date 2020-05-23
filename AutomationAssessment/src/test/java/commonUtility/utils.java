package commonUtility;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class utils {

	//This utility class contain utility methods like GET, POST requests
	String baseUrl="https://api.ratesapi.io/api/latest?symbols"; 
	
	//https://api.ratesapi.io/api/latest?symbols=USD,GBP HTTP/2 
	public static void ratesAPIGETRequest() throws Exception{
		URL url= new URL("https://api.ratesapi.io/api/latest HTTP/2");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("HTTP error code" + conn.getResponseCode());
			}
	}
	
	public static void calculateExchangeRate(String currency, int amount) throws Exception{
		NumberFormat nF = NumberFormat.getInstance(Locale.GERMANY); 

    // Initially currency 
    System.out.println("Initially Currency: " + nF.getCurrency()); 

    // Currency set to US 
    nF.setCurrency(Currency .getInstance(Locale.US)); 

    // Print the currency 
    System.out.println("Currency set as: "+ nF.getCurrency()); 
    
    
    
           } 
 
		
	}
	
