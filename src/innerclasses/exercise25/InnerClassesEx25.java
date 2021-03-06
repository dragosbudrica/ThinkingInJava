package innerclasses.exercise25;
import innerclasses.controller.*;

class GreenhouseController {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		GreenhouseControlsDerived gc = new GreenhouseControlsDerived();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new WaterMistGeneratorOn(800),
				gc.new WaterMistGeneratorOff(1000),
				gc.new WaterOff(1200),
				gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length == 1)
			gc.addEvent(
					new GreenhouseControlsDerived.Terminate(
							new Integer(args[0])));
		gc.run();
	}
} 

public class InnerClassesEx25 {
	public static void main(String[] args) {
		GreenhouseController.main(args);
	}
}
