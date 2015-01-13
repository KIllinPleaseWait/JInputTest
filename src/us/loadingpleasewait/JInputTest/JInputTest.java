package us.loadingpleasewait.JInputTest;

import net.java.games.input.Component;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;

public class JInputTest {

	public static void main(String[] args) {
		Controller[] controllers = ControllerEnvironment.getDefaultEnvironment().getControllers();
		
		// just print the names of the controllers
		for(Controller controller : controllers){
			System.out.println(controller.getName());
		}
		
		// print value of controllers components every half second
		while(true){
			for(Controller controller : controllers){
				controller.poll();
				System.out.println(controller);
				for(Component component : controllers[0].getComponents()){
					System.out.println(component.getName() + " " + component.getPollData());
				}
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
