package Test_Classes;
import org.testng.Assert;

import Common_API_Method.Put_API_Method;
import Request_Repository.Put_Req_Repository;
import io.restassured.path.json.JsonPath;
public class Put_TC1 {
public static void extractor() {
		
		int statusCode = Put_API_Method.ResponseStatuscode(Put_Req_Repository.BaseURI(), Put_Req_Repository.Put_Resource(), 
				Put_Req_Repository.Put_Req_TC1());
	   System.out.println(statusCode);
	   
	   String ResponseBody = Put_API_Method.ResponseBody(Put_Req_Repository.BaseURI(), Put_Req_Repository.Put_Resource(), 
			   Put_Req_Repository.Put_Req_TC1());
	    System.out.println(ResponseBody);
	    
	    JsonPath JspResponse = new JsonPath(ResponseBody);
		String Res_name = JspResponse.getString("name");
		String Res_job = JspResponse.getString("job");
		String Res_createdAt = JspResponse.getString("createdAt");
		Res_createdAt = Res_createdAt.substring(0,11);
		//Validate the ResponseBody parameters
		Assert.assertEquals(Res_name, "morpheus");
		Assert.assertEquals(Res_job, "zion resident");
		Assert.assertEquals(Res_createdAt, "2023-07-02T");
		
		
	    
	}

}
