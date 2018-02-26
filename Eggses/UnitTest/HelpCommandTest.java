import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelpCommandTest extends HelpCommand {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		GameController G = new GameController();
		
		if(this.matchCommand("help"))
		{
			this.doCommand(G);
		}
		
		
		
		
		
	}

}
