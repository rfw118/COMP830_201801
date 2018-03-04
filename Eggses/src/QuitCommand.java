
public class QuitCommand 
	implements Commandable{
	
	public QuitCommand() {
		
		
		
	}

	@Override
	public void doCommand(GameController G) {
		// TODO Auto-generated method stub
		G.bolQuit = true;
		G.UserOutput(CommandMessage());
	}

	@Override
	public boolean matchCommand(String s) {
		// TODO Auto-generated method stub
		
		return s.toUpperCase().equals("QUIT");
		
		
	}
	
	private boolean CommandExecuted()
	{
		return true;
	
	}
	
	private String CommandMessage()
	{
		
		return "I ran!";
	}
}
