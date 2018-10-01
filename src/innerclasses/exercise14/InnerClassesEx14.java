package innerclasses.exercise14;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class HorrorShow {
	static void u(Monster b) { b.menace(); }
	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
	static void w(Lethal l) { l.kill(); }
	public static void main(String[] args) {
		DangerousMonster barney = new DangerousMonster() {
			@Override
			public void menace() {}
			@Override
			public void destroy() {}
		};
		u(barney);
		v(barney); 
		Vampire vlad = new Vampire() {
			@Override
			public void kill() {}
			@Override
			public void menace() {}
			@Override
			public void destroy() {}
			@Override
			public void drinkBlood() {}
		};
		u(vlad);
		v(vlad); 
		w(vlad); 
	}
} 

public class InnerClassesEx14 {
	public static void main(String[] args) {
		HorrorShow.main(args);
	}
}

