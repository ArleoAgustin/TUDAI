import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		CompositeExpense ce =  new CompositeExpense();
		CompositeExpense ce0 =  new CompositeExpense();
		CompositeExpense ce1 =  new CompositeExpense();
		CompositeExpense ce2 =  new CompositeExpense();
		CompositeExpense ce3 =  new CompositeExpense();
		CompositeExpense ce4 =  new CompositeExpense();
		
		SimpleExpense se0 =  new SimpleExpense(80);
		SimpleExpense se1 =  new SimpleExpense(90);
		SimpleExpense se2 =  new SimpleExpense(70);
		SimpleExpense se3 =  new SimpleExpense(100);
		SimpleExpense se4 =  new SimpleExpense(500);
		SimpleExpense se5 =  new SimpleExpense(117);
		SimpleExpense se6 =  new SimpleExpense(1200);
		SimpleExpense se7 =  new SimpleExpense(44);
		SimpleExpense se8 =  new SimpleExpense(55);
		SimpleExpense se9 =  new SimpleExpense(110);

		ce0.addExpenses(se0);
		ce0.addExpenses(se1);
		ce1.addExpenses(se2);
		ce1.addExpenses(se3);
		ce2.addExpenses(se4);
		ce2.addExpenses(se5);
		ce3.addExpenses(se6);
		ce3.addExpenses(se7);
		ce4.addExpenses(se8);
		ce4.addExpenses(se9);

		ce.addExpenses(ce0);
		ce0.addExpenses(ce1);
		ce0.addExpenses(ce2);
		ce2.addExpenses(ce3);
		ce3.addExpenses(ce4);

		ce.addCharacteristic("calidad", "middle");
		ce0.addCharacteristic("calidad", "middle");
		ce1.addCharacteristic("calidad", "middle");
		ce2.addCharacteristic("calidad", "middle");
		ce3.addCharacteristic("calidad", "middle");
		ce4.addCharacteristic("calidad", "higth");
		ce1.addCharacteristic("Altura", 200);
		ce4.addCharacteristic("Date", LocalDate.parse("2020-10-23"));
		ce4.addCharacteristic("Altura", 200);
		
		se9.addCharacteristic("calidad", "higth");
		se9.addCharacteristic("Altura", 200);
		
		Filter f0 = new FilterByValueGreater(99);
		Filter f1 = new FilterByDate("2020-10-28");
		Filter f2 = new FilterByCharacteristic("calidad", "higth");
		Filter f3 = new FilterByCharacteristic("Altura", 200);
		Filter f4 = new FilterByCharacteristic("Date", LocalDate.parse("2020-10-23"));
		
		System.out.println("\n\nObtener el total de todos los gastos: "+ce.getExpenses(f0));
		System.out.println("\n\nObtener el total de todos los gastos filtrados por fecha anterior: "+ce.getExpenses(f1));
		System.out.println("\n\nObtener la lista de gastos que contenga un característica calidad alta"+ce.getExpensesList(f2));
		System.out.println("\n\nObtener la lista de gastos que contenga un característica Altura igual a 200"+ce.getExpensesList(f3));
		System.out.println("\n\nObtener la lista de gastos que contenga un característica Altura igual a 200"+ce.hasCharacteristic("Altura", 200));
		System.out.println("\n\nObtener la lista de gastos que contenga un característica date ahora"+ce.getExpensesList(f4));
	}

}
