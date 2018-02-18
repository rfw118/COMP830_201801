import java.util.Scanner;

public class GameController {

	private Player[] plrPlayers = new Player[1];
	private String sUserInput = "";
	//private String sHelpCommands = "Command Help: 'Quit', 'Help'";
	protected HelpCommand HelpMe = new HelpCommand();
	protected QuitCommand QuitMe = new QuitCommand();
	
	
	public Boolean bolQuit = false;
	
	
	
	public GameController()
	{
		
		plrPlayers[0] = new Player();
	}
	
	public void GameStart()
	{
		Scanner inputScanner = new Scanner(System.in);
				
		UserOutput("Welcome!  You are now playing Eggses!");
		initializePlayers(plrPlayers, inputScanner);
		
		while( bolQuit == false)
		{
			sUserInput = inputScanner.next();
			ProcessUserInput(sUserInput);
			//I think if I call the Commandable and pass it the sUserinput I think it will check all classes with the Commandable implementation.
			
		
		}
		UserOutput("The End!");
		inputScanner.close();
	}
	
	public static void UserOutput(String Output)
	{
		System.out.println(Output);
		System.out.println(">");
	}
	
	public static void initializePlayers(Player[] plrPlayers, Scanner inputScanner)
	{
		
		
		for(Player p : plrPlayers)
		{
			p = new Player();
			UserOutput("Please enter your name: ");
			p.setName(inputScanner.nextLine().toString());
			UserOutput("Welcome " + p.getName() + "!");
			
			UserOutput(p.getName() + " please enter your Gender.  Apparently the english language is based on these and I need to know so I don't insult you. Male M  Female F  Neuter N:");
			p.setGender(inputScanner.next().toString());

		}
		
	}
	
	private void ProcessUserInput(String UserInput)
	{
		if(HelpMe.matchCommand(UserInput))
			{
				HelpMe.doCommand(this);
			}
		else if(QuitMe.matchCommand(UserInput))
		{
			QuitMe.doCommand(this);
		}
		else
		{
			UserOutput( "Command not recognized");
		}
	}
	

	
}



