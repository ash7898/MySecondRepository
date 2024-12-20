package listeners;

import org.testng.annotations.Test;

public class ListenersExample1 
{
	@Test
	public void Compose()
	{
		System.out.println("Message Composed");
	}
	@Test(dependsOnMethods = "Compose")
	public void SentItems()
	{
		System.out.println("Message Sent");
	}
	@Test(dependsOnMethods = "SentItems")
	public void trash()
	{
		System.out.println("Messsage Deleted");
	}
}
