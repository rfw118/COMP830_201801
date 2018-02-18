
public class Player {
	
	private String sGender = "";
	private String sName = "";
	
	public Player()
	{
		initializeComponents();
	}
	
	public void setGender(String Gender)
	{
		sGender = Gender;
		
		GameController.UserOutput("So you are a " + Gender + ".  I don't know what that is, afterall I am only a computer program!");
		
	}
	
	private void initializeComponents()
	{
				
	}
	
	public String getName()
	{
		return sName;
	}
	
	public void setName(String Name)
	{
		sName = Name;
	}
} 
