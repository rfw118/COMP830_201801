import java.util.Scanner;
import java.util.*;


public class GameController {

	private Player[] plrPlayers = new Player[1];
	private String sUserInput = "";
	public List<Commandable> UserCommands = new ArrayList<Commandable>();
	
	//private String sHelpCommands = "Command Help: 'Quit', 'Help'";
	public HelpCommand HelpMe = new HelpCommand();
	public QuitCommand QuitMe = new QuitCommand();
	
	
	public Boolean bolQuit = false;
	
	
	
	public GameController()
	{
		
		plrPlayers[0] = new Player();
		
			
		Subscribe(HelpMe);
		Subscribe(QuitMe);
		
	}
	
	public void GameStart()
	{
		Scanner inputScanner = new Scanner(System.in);
				
		UserOutput("Welcome!  You are now playing Eggses!");
		initializePlayers(plrPlayers, inputScanner);
		
		while( bolQuit == false)
		{
			sUserInput = inputScanner.next();
			//ProcessUserInput(sUserInput);
			ProcessUserInputCommands(sUserInput);
			
		
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
	
	public void Subscribe(Commandable c)
	{
		UserCommands.add(c);
		
	}
	
	private void ProcessUserInputCommands(String UserInput)
	{
		boolean bolCommandExecuted = false;
		
		for(Commandable c:UserCommands)
		{
			bolCommandExecuted = c.matchCommand(UserInput);
			if(bolCommandExecuted)
			{
				c.doCommand(this);
				break;
			}
		}
		
		if(bolCommandExecuted == false)
			{
				this.UserOutput("Command not recognized");
			}
		
	}
	
}



