
public class HelpCommand implements Commandable{

	private String sHelpCommands = "Command Help: 'Quit', 'Help'";
	
	public HelpCommand()
	{
		
	}

	@Override
	public void doCommand(GameController G) {
		// TODO Auto-generated method stub
		G.UserOutput(sHelpCommands); 
	}

	@Override
	public boolean matchCommand(String s) {
		// TODO Auto-generated method stub
		
		//if(s.toUpperCase().equals("HELP"))
		//{
		//	return true;
		//}
		//else
		//{
		//	return false;
		//}
		
		//if(s.toUpperCase().equals("HELP"))
		//{
		//	return false;
		//}
		
		return s.toUpperCase().equals("HELP"); //returns true for match and false for no match.
		
		
	}
	
}
