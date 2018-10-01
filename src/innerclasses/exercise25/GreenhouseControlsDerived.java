package innerclasses.exercise25;
import innerclasses.controller.*;

public class GreenhouseControlsDerived extends GreenhouseControls {
	@SuppressWarnings("unused")
	private boolean waterMistGenerator = false;
	public class WaterMistGeneratorOn extends Event {
		public WaterMistGeneratorOn(long delayTime) { 
			super(delayTime); 
			}
		public void action() {
			waterMistGenerator = true;
		}
		public String toString() { 
			return "Water mist generator is on"; 
			}
	}
	public class WaterMistGeneratorOff extends Event {
		public WaterMistGeneratorOff(long delayTime) { 
			super(delayTime); 
			}
		public void action() {
			waterMistGenerator = false;
		}
		public String toString() { 
			return "Water mist generator is off"; 
			}
	}
}
