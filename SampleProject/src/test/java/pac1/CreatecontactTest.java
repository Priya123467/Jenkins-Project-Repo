package pac1;

import org.testng.annotations.Test;

 class CreatecontactTest 
 {
	@Test
	public void createContactTest(){
		String URL = System.getProperty("url");//provide all these values in commandprompt
		String BROWSER = System.getProperty("browser");
		String USERNAME= System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("execute createContactTest ");
		
	}
	
	@Test
	public void modifyContactTest()
	{
		System.out.println("execute modifyContactTest");
	}
	@Test
	public void deleteContactTest(){
		System.out.println("execute deleteContactTest");
		
	}


}
