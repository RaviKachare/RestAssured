package Test_Classes;
//import Request_Repository.Patch_Req_Repository.
import org.testng.Assert;

import Common_API_Method.Patch_API_Method;
import Request_Repository.Patch_Req_Repository;
import io.restassured.path.json.JsonPath;

public class Patch_TC1 {
	
public static void extractor() {
		
		int statusCode = Patch_API_Method.ResponseStatuscode(Patch_Req_Repository.BaseURI(), Patch_Req_Repository.Patch_Resource(), 
				Patch_Req_Repository.Patch_Req_TC1());
	   System.out.println(statusCode);
	   
	   String ResponseBody = Patch_API_Method.ResponseBody(Patch_Req_Repository.BaseURI(), Patch_Req_Repository.Patch_Resource(), 
			   Patch_Req_Repository.Patch_Req_TC1());
	    System.out.println(ResponseBody);
	    
	    JsonPath JspResponse = new JsonPath(ResponseBody);
		String Res_name = JspResponse.getString("name");
		String Res_job = JspResponse.getString("job");
		//String Res_createdAt = JspResponse.getString("createdAt");
		//Res_createdAt = Res_createdAt.substring(0,11);
		//Validate the ResponseBody parameters
		Assert.assertEquals(Res_name, "morpheus");
		Assert.assertEquals(Res_job, "zion resident");
		//Assert.assertEquals(Res_createdAt, "null");
		
		
	    
	}

}
