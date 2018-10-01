package polymorphism.exercise16;

class AlertStatus {
	public void displayStatus() {}
}

class SuccessfulAlertStatus extends AlertStatus {
	public void displayStatus() { System.out.println("Successful Message"); }
}

class WarningAlertStatus extends AlertStatus {
	public void displayStatus() { System.out.println("Warning Message"); }
}

class CriticalAlertStatus extends AlertStatus {
	public void displayStatus() { System.out.println("Critical Message"); }
}

class Starship {
	AlertStatus as = new SuccessfulAlertStatus();
	public void changeToWarning() { as = new WarningAlertStatus(); }
	public void changeToCritical() { as = new CriticalAlertStatus(); }
	public void changeToSuccessful() { as = new SuccessfulAlertStatus(); }
	public void displayMessage() { as.displayStatus(); }
}

class Transmogrify {
	public static void main(String[] args) {
		Starship starship = new Starship();
		starship.displayMessage();
		starship.changeToWarning();
		starship.displayMessage();
		starship.changeToCritical();
		starship.displayMessage();
		starship.changeToSuccessful();
		starship.displayMessage();
	}
}

public class PolymorphismEx16 {
	public static void main(String[] args) {
		Transmogrify.main(args);
	}
}
