import core.controller.*;
import core.model.*;
import core.view.*;

public class Playbook {
	 
public static void main(String [] args) {
	model model = new model();
	 ConsoleInterface view= new ConsoleInterface();
	
		Control control= new Control(model, view);
		control.init();
}
}
