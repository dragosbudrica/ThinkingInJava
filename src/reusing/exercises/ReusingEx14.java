package reusing.exercises;

class Engine2 {
	public void start() {}
	public void rev() {}
	public void stop() {}
	public void service() {}
}

class Wheel2 {
	public void inflate(int psi) {}
}

class Window2 {
	public void rollup() {}
	public void rolldown() {}
}

class Door2 {
	public Window2 window = new Window2();
	public void open() {}
	public void close() {}
}

class Car2 {
	public Engine2 engine = new Engine2();
	public Wheel2[] wheel = new Wheel2[4];
	public Door2
		left = new Door2(),
		right = new Door2(); 
	public Car2() {
		for(int i = 0; i < 4; i++)
			wheel[i] = new Wheel2();
	}
	
}

public class ReusingEx14 {
	public static void main(String[] args) {
		Car2 car = new Car2();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engine.service();
	}
}

