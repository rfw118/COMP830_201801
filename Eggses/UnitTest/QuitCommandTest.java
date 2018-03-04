import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


class QuitCommandTest extends QuitCommand{

	@Test
	void test() {
		
		
		GameController G = new GameController();
		
		if(this.matchCommand("help"))
		{
			this.doCommand(G);
		}
		else
		{
			fail("Failed to recoginze command.");
		}
	}

}
