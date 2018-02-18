
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
		
		System.out.println("Debug: HelpCommand:UserInput:s.toupper " + s.toUpperCase().toString());
		if(s.toUpperCase().toString() == "HELP")
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
}
