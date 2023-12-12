package annotations;

import org.testng.annotations.Test;

public class Order {

	@Test(priority=1)
	public void login(){
		//selenium code login
		System.out.println("Login");
	}
	@Test(priority=2)
	public void composemail(){
		//selenium code composemail
		System.out.println("composemail");
	}
	@Test(priority=3)
	public void Deletemail(){
		//selenium code Deletemail
		System.out.println("Deletemail");
	}


}
