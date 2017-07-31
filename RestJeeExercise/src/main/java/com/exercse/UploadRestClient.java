/*package com.exercse;

import java.io.File;

import sun.net.www.http.HttpClient;

public class UploadRestClient {
	public static void main(String args[]) throws Exception {
		File f = new File("/home/jboss/myfile.txt");
		sendFile(f);
	}s

	public static void sendFile(File file) throws Exception {
String BASE_URL="http://localhost:8080/RESTDemo/rest/upload";
HttpClient client = new DefaultHttpClient() 
HttpPost postRequest = new HttpPost (BASE_URL) ;
try{
//Set various attributes 
MultipartEntity multiPartEntity = new MultipartEntity () ;

// multiPartEntity.addPart("fileName", new StringBody(file.getName() != null ? file.getName() : file.getName())) ;

FileBody fileBody = new FileBody(file, "application/octect-stream") ;
	//Prepare payload
multiPartEntity.addPart("attachment", fileBody) ;
//Set to request bod
postRequest.setEntity(multiPartEntity) ;
//Send request
HttpResponse response = client.execute(postRequest) ;
//Verify response if any
if (response != null) {
	System.out.println(response.getStatusLine().getStatusCode());
}
		        }
		        catch (Exception ex)
	{
		ex.printStackTrace() ;
		        }
		    }
	
	
}
*/