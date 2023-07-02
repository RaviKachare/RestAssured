package Test_Classes;
import Common_API_Method.Get_API_Method;
import Request_Repository.Get_Req_Repository;
//import org.testng.Assert;
//import Request_Repository.Post_Req_Repository;
//import io.restassured.path.json.JsonPath;
public class Get_TC1 {
	
	public static void extractor() {
		
		int statusCode = Get_API_Method.ResponseStatuscode(Get_Req_Repository.BaseURI(),
		Get_Req_Repository.Get_Resource());
	   System.out.println(statusCode);
	   
	   String ResponseBody = Get_API_Method.ResponseBody(Get_Req_Repository.BaseURI(),
				Get_Req_Repository.Get_Resource());
	    System.out.println(ResponseBody);
	    

	    
//	    JsonPath JspResponse = new JsonPath(ResponseBody);
//		String Res_name = JspResponse.getString("name");
//		String Res_job = JspResponse.getString("job");
//		String Res_createdAt = JspResponse.getString("createdAt");
//		Res_createdAt = Res_createdAt.substring(0,11);
//		//Validate the ResponseBody parameters
//		Assert.assertEquals(Res_name, "morpheus");
//		Assert.assertEquals(Res_job, "leader");
//		Assert.assertEquals(Res_createdAt, "2023-06-08T");
//		
		
	    
	}

}
