package week3.day1;
//Create a Java class named APIClient and create two methods with the same name passing different input arguments.
//Requirements:
//- Inside the APIClient class, define the sendRequest method with multiple overloaded versions.
//- One version should accept one input argument: a String for the endpoint.
//- Another version of the sendRequest method should accept three input arguments: a String for the endpoint, a
//String for the requestBody, and a boolean parameter requestStatus to verify whether the request is successful.
//- Create a main method to demonstrate the usage of the overloaded sendRequest method.
//- Inside the main method, create an object of the APIClient class.
//- Call both versions of the sendRequest method on the APIClient object with different sets of input arguments to
//showcase method overloading
public class APIClient 
{
public void sendRequest(String endPoint) 
{
	System.out.println("The endpoint is :"+endPoint);
}
public void sendRequest(String endPoint,String requestBody,boolean requestStatus) 
{
	System.out.println(endPoint+" " +requestBody+" "  +requestStatus);
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		APIClient obj=new APIClient();
		obj.sendRequest("Endpoint");
		obj.sendRequest("Endpoint", "requestBody",true);

	}

}
