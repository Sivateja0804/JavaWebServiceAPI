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

	public static JSONObject get_response_http(String link){
	      try {
	    	  JSONObject data_obj = null;
	    	  URL url = new URL(link);
	    	  HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    	  conn.setRequestMethod("GET");
	    	  conn.connect();
	    	  int responsecode = conn.getResponseCode();
	    	  if (responsecode != 200) {
	    		    throw new RuntimeException("HttpResponseCode: " + responsecode);
	    		} else {
	    		  
	    		    String inline = "";
	    		    Scanner scanner = new Scanner(url.openStream());
	    		    while (scanner.hasNext()) {
	    		       inline += scanner.nextLine();
	    		    }
	    		    scanner.close();
	    		    JSONParser parse = new JSONParser();
	    		    
					try {
						data_obj = (JSONObject) parse.parse(inline);
					} catch (ParseException e) {
						e.printStackTrace();
					}
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