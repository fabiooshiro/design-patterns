package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Plano para chegar ao X
 * @author fabiooshiro
 *
 */
public class Plan {
	
	private List<Command> commands = new ArrayList<Command>();
	
	public Plan(JackSparrow jackSparrow) {
		addCommand(new GoRigth(jackSparrow, 3));
	}
	
	public void play() {
		Thread t = new Thread(){
			public void run() {
				for(Command command: commands){
					command.execute();
				}
			};
		};
		t.start();
	}

	private void addCommand(Command action) {
		commands.add(action);
	}
}
