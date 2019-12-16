
public class IceCreamRunner {

	public static void main(String[] args) 
	{
		IceCream [] collection = new IceCream [6];
		 collection[0] = new Traditional();
		 collection[1] = new Modern();
		 
		 for(IceCream i : collection)
		 {
			 i.numberOfScoops();
			 i.description();
			 i.eatingVessel();
		 }
	}

}
