# JavaWebServiceAPI
Sample Java Web Service API using REST, Tomcat and Postman

## Steps to Run the Application:
* Downlaod the Folder from the "https://github.com/Sivateja0804/JavaWebServiceAPI.git"
* Import the porject using Java EE eclipse IDE
* Right click the JavaWebServiceAPI folder and select run on server
* In case if you are facing issue with the libraries. One quick fix would be go to ur build path and all the libraries in "JavaWebServiceAPI\WebContent\WEB-INF\lib" to your build path
* The application will run 4 sample Junit Testcases and will give the results.

### Test URLS
First you can directly paste the below link in any browser or you can use Postman to calidate the Get Request

* http://localhost:8080/JavaAPI/rest/ctofservice/30

result:

 {
    "farheniet": 86.0
}

* http://localhost:8080/JavaAPI/rest/ctofservice 

Above url is default url which will take default celcius as 36.8
result:

{
    "farheniet": 98.24
}
