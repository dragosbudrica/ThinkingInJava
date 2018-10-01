package holding.exercise13;
import java.util.*;

public class Controller {
	private List<Event> eventList = new LinkedList<Event>();

	public void addEvent(Event c) {
		eventList.add(c);
	}

	public void run() {
		while (eventList.size() > 0) {
			List<Event> eventListCopy = new LinkedList<Event>(eventList);
			Iterator<Event> it = eventListCopy.iterator();
			while (it.hasNext()) {
				Event e = it.next();
				if (e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
}
