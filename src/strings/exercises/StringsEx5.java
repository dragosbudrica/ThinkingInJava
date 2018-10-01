package strings.exercises;
import java.util.*;

public class StringsEx5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Formatter f = new Formatter(System.out);
		f.format("Integral(as decimal): %-5d %-5c %-5b %-5s %-5x %-5h %-5%\n", 100, 100, 100, 100, 100, 100, 100);
		f.format("Unicode character: %-5s %-5c %-5b %-5h %-5%\n", 'A', 'A', 'A', 'A', 'A', 'A');
		f.format("Boolean value: %-5b %-5s %-5h %-5%\n", true, true, true, true);
		f.format("String: %-10.5s %-5b %-5h %-5%\n", "Dragos", "Dragos", "Dragos", "Dragos");
		f.format("Floating point(as decimal): %-5b %-10.5s %-10.5f %-5e %-5h %-5%\n", 100.001, 100.001, 100.001, 100.001, 100.001, 100.001);
		f.format("Floating point(in scientific notation): %-5b %-10.5s %-10.5f %-10.5e %-5h %-5%\n", 1.000010e+02, 1.000010e+02, 1.000010e+02, 1.000010e+02, 1.000010e+02, 1.000010e+02);
		f.format("Integral(as hex): %-5b %-5x %-10.5s %-5h %-5%\n", 64, 64, 64, 64, 64);
		f.format("Hash code(as hex): %-5b %-5x %-5h %-5%\n", 100, 100, 100, 100);
		f.format("Literal \"%%\": %-10.5s %-10%\n", 100); 
	}
}
