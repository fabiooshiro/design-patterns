package command;

public class GoRigth extends AbstractCommand{

	private JackSparrow jackSparrow;
	
	private int passos = 0;
	
	public GoRigth(JackSparrow jack, int passos) {
		jackSparrow = jack;
		this.passos = passos;
	}
	
	@Override
	public void execute() {
		for (int i = 0; i < passos; i++) {
			delay();
			jackSparrow.x += STEPSIZE;
			jackSparrow.repaint();
			jackSparrow.invalidate();
		}	
	}

}
