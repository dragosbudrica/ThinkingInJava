package initialization.exercise22;

enum Currency {
	ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

public class InitializationEx22 {
	Currency currency;
	
	public InitializationEx22(Currency currency) {
		this.currency = currency;
	}
	
	 public void showCurrency() {
		 System.out.print("The paper currency is the ");
		 switch(currency) {
		 case ONE:
			 System.out.println("ONE dollar one.");
			 break;
		 case FIVE:
			 System.out.println("FIVE dollars one.");
			 break;
		 case TEN:
			 System.out.println("TEN dollars one.");
			 break;
		 case TWENTY:
			 System.out.println("TWENTY dollars one.");
			 break;
		 case FIFTY:
			 System.out.println("FIFTY dollars one.");
			 break;
		 default:
			 System.out.println("one HUNDRED dollars one.");
		 }
	 }

	public static void main(String[] args) {
		for (Currency curr : Currency.values()) {
			System.out.println(curr + ", ordinal " + curr.ordinal());
		}
		
		System.out.println("----------------------------------------");
		InitializationEx22 curr1 = new InitializationEx22(Currency.FIVE);
		InitializationEx22 curr2 = new InitializationEx22(Currency.FIFTY);
		InitializationEx22 curr3 = new InitializationEx22(Currency.HUNDRED);
		
		curr1.showCurrency();
		curr2.showCurrency();
		curr3.showCurrency();
	}
}