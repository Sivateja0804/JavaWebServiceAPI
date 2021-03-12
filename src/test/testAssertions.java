package test;

import org.junit.Test;

import jdk.nashorn.internal.parser.JSONParser;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import org.json.JSONException;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 

public class testAssertions {

   @Test
   public void testAssertions() throws JSONException {
      //test data
	   NetClientPost np=new NetClientPost();
	   JSONObject br=np.get_response_http("http://localhost:8080/JavaAPI/rest/ctofservice");
       // getting firstName and lastName 
       String farheniet = String.valueOf(br.get("farheniet")); 
       System.out.println(farheniet);
      //Check that two objects are 
      assertEquals(farheniet, String.valueOf(98.24));

   }
   
   @Test
   public void testAssertions3() throws JSONException {
      //test data
	   NetClientPost np=new NetClientPost();
	   JSONObject br=np.get_response_http("http://localhost:8080/JavaAPI/rest/ctofservice");
       // getting firstName and lastName 
       String farheniet = String.valueOf(br.get("farheniet")); 
       System.out.println(farheniet);
      //Check that two objects are 
      assertEquals(farheniet, String.valueOf(98.24));

   }
   
   @Test
   public void testAssertions1() throws JSONException {
      //test data
	   NetClientPost np=new NetClientPost();
	   JSONObject br=np.get_response_http("http://localhost:8080/JavaAPI/rest/ctofservice");
       // getting firstName and lastName 
       String farheniet = String.valueOf(br.get("farheniet")); 
       System.out.println(farheniet);
      //Check that two objects are 
      assertEquals(farheniet, String.valueOf(98.24));

   }
   
   @Test
   public void testAssertions2() throws JSONException {
      //test data
	   NetClientPost np=new NetClientPost();
	   JSONObject br=np.get_response_http("http://localhost:8080/JavaAPI/rest/ctofservice/30");
       // getting firstName and lastName 
       String farheniet = String.valueOf(br.get("farheniet")); 
       System.out.println(farheniet);
      //Check that two objects are 
      assertEquals(farheniet, String.valueOf(98.24));

   }
}