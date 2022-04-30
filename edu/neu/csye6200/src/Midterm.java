package neu.csye6200.src;
import neu.csye6200.src.Costco;
import neu.csye6200.src.Durable;
import neu.csye6200.src.ItemAPI;
import neu.csye6200.src.StoreAPI;

/**
 * TOTAL POINTS: 100
 * 
 * Student TODO:
 *  
 *  2 POINTS	Create a class ConvertUtility with methods for conversion of String representation of numerical values WITH EXCEPTION HANDLING into their correct numerical data types
 *  8 POINTS	Create a class ItemAPI
 *  
 *  2 POINTS	Derive a class Durable from ItemAPI (attributes of weight, weight units)
 *  8 POINTS	Create a class DurableFactory (lazy singleton GoF Factory method pattern)
 *  
 *  2 POINTS	Derive a class Service from ItemAPI (attributes of start time, end time, time units)
 *  8 POINTS	Create a class ServiceFactory (eager singleton GoF Factory method pattern)
 *  
 *  2 POINTS	Derive a class Costco derived from Abstract class StoreAPI
 *  8 POINTS    Create a Costco static demo method to 1) add the following items (CSV) USING FACTORIES AND IN FOLLOWING ORDER:
 * 
				"2,3.49,OJ,Tropicana Oriage Juice", 
				"1,2.49,Cheese,Provolone cheese",
				"3,1.49,Milk,Almond Milk", 
				"4,0.89,Snack,Mounds chocolate bar" 
				"6,384.49,Treadmill,Voyager Pro Treadmill,98.3,kg", 
				"5,12.49,Chair,folding chair,2.89,Lbs",
				"7,101.49,Mattress,Air Mattress,27.6,kg", 
				"8,6.89,Slippers,bath slippers,2.5,oz" 
 * 
 *  4 POINTS	SORT all items BY ID ASCENDING AND DESCENDING (in Costco static demo method) 
 *  4 POINTS	SORT all items BY PRICE ASCENDING AND DESCENDING (in Costco static demo method) 
 *  
 *  4 POINTS	SORT all items BY NAME ASCENDING AND DESCENDING (in Costco static demo method) 
 *  3 POINTS	SORT all items BY DESCRIPTION ASCENDING AND DESCENDING (in Costco static demo method) 
 * 
 * 
 * Using this Midterm class, complete the code to meet all the requirements (Student TODO) ...
 * 
 * 
 * 5 POINTS:	demonstrate use of static data
 * 5 POINTS:	demonstrate use of immutable data
 * 
 * 10 POINTS:	demonstrate Object Oriented Principle of Abstraction
 *  5 POINTS:	demonstrate Object Oriented Principle of Encapsulation
 * 10 POINTS:	demonstrate Object Oriented Principle of Inheritance
 * 10 POINTS:	demonstrate Object Oriented Principle of Polymorphism
 * 
 * 
 * @author dgpeters
 *
 */
public class Midterm {

	static int count=10;

	/**
	 * Student TODO:
	 * complete the implementation of the required methods in demo()
	 * called here by Driver main() method
	 * 
//	 * @param args
	 */
	public static void demo() {
		System.out.println(Midterm.class.getName() + ".main()...");
		
		Midterm obj = new Midterm();
		obj.demoAbstraction();		// Student TODO implementation
		obj.demoEncapsulation();	// Student TODO implementation
		obj.demoInheritance();		// Student TODO implementation
		obj.demoPolymorphism();		// Student TODO implementation
		obj.demoStaticData();		// Student TODO implementation
		obj.demoImmutableData();	// Student TODO implementation
		
		Costco.demo();	// demonstrate Costo app
		
		System.out.println(Midterm.class.getName() + ".main()... done!");
	}
	/**
	 * Student TODO:
	 * using this class, demonstrate the Object Oriented Principle of Abstraction
	 * BOTH
	 * a. data hiding
	 * b. functionality hiding
	 */
	public void demoAbstraction() {
		System.out.println("\n\t demoAbstraction...");
		/**
		 * Student TODO: complete implementation
		 */

		StoreAPI storeAPI=new Costco();
		System.out.println("Printing toString() value to demonstrate Abstraction using Parent Class by hiding implementation of child class");
		System.out.println(storeAPI.toString());
	}	
	/**
	 * Student TODO:
	 * using this class, demonstrate the Object Oriented Principle of Encapsulation
	 */
	public void demoEncapsulation() {
		System.out.println("\n\t demoEncapsulation...");
		/**
		 * Student TODO: complete implementation
		 */

		ItemAPI item1=new ItemAPI(1,2.3,"snacks","Chips");
		System.out.println("Printing itemName to demonstrate encapsulation");
		System.out.println("itemName: "+item1.getItemName());
	}
	/**
	 * Student TODO:
	 * using this class, demonstrate the Object Oriented Principle of Inheritance
	 */
	public void demoInheritance() {
		System.out.println("\n\t demoInheritance...");
		/**
		 * Student TODO: complete implementation
		 */

		Service service=new Service(100,5.67,"Dairy","Butter","3/12/22","5/23/22","dates");
		System.out.println("Child Class object(service) accessing member of Parent Class(ItemAPI) demonstrate inheritance");
		System.out.println("ItemName: "+ service.getItemName());



	}
	/**
	 * Student TODO:
	 * using this class, demonstrate the Object Oriented Principle of Polymorphism
	 */
	public void demoPolymorphism() {
		System.out.println("\n\t demoPolymorphism...");
		/**
		 * Student TODO: complete implementation
		 */

		Durable d1=new Durable(7,101.49,"Mattress","Air Mattress",27.6,"kg");
		System.out.println("Overriding toString() method to demonstrate polymorphism");
		System.out.println(d1.toString());
	}

	public void incrementCount() {
		count++;
	}
	/**
	 * Student TODO:
	 * using this class, demonstrate the use of static data
	 */
	public void demoStaticData() {
		System.out.println("\n\t demoStaticData...");
		/**
		 * Student TODO: complete implementation
		 */
		System.out.println("Printing the value of static data  member count which i created expliclity to demonstrate static data");
		for(int i=0;i<10;i++){
			new Midterm().incrementCount();
			System.out.println(count);
		}
	}
	/**
	 * Student TODO:
	 * using this class, demonstrate the use of immutable data
	 */
	public void demoImmutableData() {
		System.out.println("\n\t demoImmutableData...");
		/**
		 * Student TODO: complete implementation
		 */
		String a="Costco";
		String b="Costco";

		if(a==b){
			System.out.println("Since hashcode of both objects are same it indicates Both Objects are same and have not changed ");
			System.out.println("a="+a.hashCode()+"  ,b="+b.hashCode());
		}
		else
			System.out.println("Different Objects Created");
	}
}
