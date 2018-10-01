package object.exercises;

public class ObjectEx9 {
	boolean b = false;
	char ch = 'c';
	byte by = 126;
	short s = 325;
	int i = 92;
	long l = 95100L;
	float f = 327.5F;
	double d = 591.3D;
	void v() {}
	
	Void vo() {return null;}
	Boolean boo = true;
	Character cha = 'd';
	Byte byt = 50;
	Short sh = 340;
	Integer in = 42323;
	Long lo = 199L;
	Float fl = 273.25F;
	Double dou = 593.275D;
 
	public static void main(String[] args) {
		ObjectEx9 autoboxing = new ObjectEx9();
		Boolean b = autoboxing.b;
		System.out.println(b);
		
		Character ch = autoboxing.ch;
		System.out.println(ch);
		
		Byte by = autoboxing.by;
		System.out.println(by);
		
		Short s = autoboxing.s;
		System.out.println(s);
		
		Integer i = autoboxing.i;
		System.out.println(i);
		
		Long l = autoboxing.l;
		System.out.println(l);
		
		Float f = autoboxing.f;
		System.out.println(f);
		
		Double d = autoboxing.d;
		System.out.println(d);
		
		boolean boo = autoboxing.boo;
		System.out.println(boo);
		
		char cha = autoboxing.cha;
		System.out.println(cha);
		
		byte byt = autoboxing.byt;
		System.out.println(byt);
		
		short sh = autoboxing.sh;
		System.out.println(sh);
		
		int in = autoboxing.in;
		System.out.println(in);
		
		long lo = autoboxing.lo;
		System.out.println(lo);
		
		float fl = autoboxing.fl;
		System.out.println(fl);
		
		double dou = autoboxing.dou;
		System.out.println(dou);
	}
}
