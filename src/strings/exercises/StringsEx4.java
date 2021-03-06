package strings.exercises;
import java.util.*;

class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	
	private static final int WIDTH1 = 15;
	private static final int WIDTH2 = 5;
	private static final int WIDTH3 = 10;
	
	public void printTitle() {
		f.format("%-" + WIDTH1 + "s %" + WIDTH2 + "s %" + WIDTH3 + "s\n", "Item", "Qty", "Price");
		f.format("%-" + WIDTH1 + "s %" + WIDTH2 + "s %" + WIDTH3 + "s\n", "----", "---", "-----");
	}
	public void print(String name, int qty, double price) {
		f.format("%-" + WIDTH1 + ".15s %" + WIDTH2 + "d %" + WIDTH3 + ".2f\n", name, qty, price);
		total += price;
	}
	public void printTotal() {
		f.format("%-" + WIDTH1 + "s %" + WIDTH2 + "s %" + WIDTH3 + ".2f\n", "Tax", "", total*0.06);
		f.format("%-" + WIDTH1 + "s %" + WIDTH2 + "s %" + WIDTH3 + "s\n", "", "", "-----");
		f.format("%-" + WIDTH1 + "s %" + WIDTH2 + "s %" + WIDTH3 + ".2f\n", "Total", "",
				total * 1.06);
	}
	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
}

public class StringsEx4 {
	public static void main(String[] args) {
		Receipt.main(args);
	}
}
