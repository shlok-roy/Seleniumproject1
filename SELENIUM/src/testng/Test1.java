package testng;

public class Test1 
{
	@Test (priority=-1, invocationcount=5)
	public void settings()
	{
		Reporter.Log("settings",true);
	}
	
	@Test (priority=-1)
	public void chats()
	{
		Reporter.Log("chats",true);
	}
	@Test
	public void calls()
	{
		Reporter.Log("calls",true);
	}
}
