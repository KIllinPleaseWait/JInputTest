package us.loadingpleasewait.JInputTest;

import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;

public class JInputTest {

	public static void main(String[] args) {
		Controller[] controllers = ControllerEnvironment.getDefaultEnvironment().getControllers();
		
		// just print the names of the controllers
		for(Controller controller : controllers){
			System.out.println(controller.getName());
		}
	}

}
