
public class QuitCommand 
	implements Commandable{
	
	public QuitCommand() {
		
		
		
	}

	@Override
	public void doCommand(GameController G) {
		// TODO Auto-generated method stub
		G.bolQuit = true;
	}

	@Override
	public boolean matchCommand(String s) {
		// TODO Auto-generated method stub
		return false;
	}
}
