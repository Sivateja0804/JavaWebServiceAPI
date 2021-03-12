package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import sun.security.util.IOUtils;

public class NetClientPost {

    // http://localhost:8080/RESTfulExample/json/product/post
	public static JSONObject get_response_http(String link){

	      try {
	    	  JSONObject data_obj = null;
//	        URL url = new URL(link);
//	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//	        conn.setRequestMethod("GET");
//	        conn.setRequestProperty("Content-Type", "application/json");
//
//	        if (conn.getResponseCode() !=200) {
//	            throw new RuntimeException("Failed : HTTP error code : "
//	                + conn.getResponseCode());
//	        }
//
//	        BufferedReader br = new BufferedReader(new InputStreamReader(
//	                (conn.getInputStream())));
//	        
//	       
//	        String output;
//	        String result = "";
//	        System.out.println("Output from Server .... \n");
//	        while ((output = br.readLine()) != null) {
//	            result=result+output;
//	        }
//	        conn.disconnect();
//	        return result;
	    	  
	    	  URL url = new URL(link);

	    	  HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    	  conn.setRequestMethod("GET");
	    	  conn.connect();

	    	  //Getting the response code
	    	  int responsecode = conn.getResponseCode();
	    	  if (responsecode != 200) {
	    		    throw new RuntimeException("HttpResponseCode: " + responsecode);
	    		} else {
	    		  
	    		    String inline = "";
	    		    Scanner scanner = new Scanner(url.openStream());
	    		  
	    		   //Write all the JSON data into a string using a scanner
	    		    while (scanner.hasNext()) {
	    		       inline += scanner.nextLine();
	    		    }
	    		    
	    		    //Close the scanner
	    		    scanner.close();

	    		    //Using the JSON simple library parse the string into a json object
	    		    JSONParser parse = new JSONParser();
	    		    
					try {
						data_obj = (JSONObject) parse.parse(inline);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

	    		    //Get the required object from the above created object
	    		    //JSONObject obj = (JSONObject) data_obj.get("farheniet");

	    		    //Get the required data using its key
	    		}
	    	  return data_obj;

	      } catch (MalformedURLException e) {

	        e.printStackTrace();
	        return null;

	      } catch (IOException e) {

	        e.printStackTrace();
	        return null;

	     }

	    }
}