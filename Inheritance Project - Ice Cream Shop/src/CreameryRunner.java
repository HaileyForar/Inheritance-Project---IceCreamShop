
public class CreameryRunner {

	public static void main(String[] args) 
	{
		Creamery [] collection = new Creamery [6];
		 collection[0] = new Traditional();
		 collection[1] = new Modern();
		 collection[2] = new Italian();
		 collection[3] = new American();
		 
		 for(Creamery i : collection)
		 {
			 i.numberOfScoops();
			 i.description();
			 i.eatingVessel();
			 
			 
			 System.out.println();
		 }
		 
		 //Two Traditional Objects
		 
		 Traditional sweetCream = new Traditional();
		 	sweetCream.numberOfScoops();
		 	sweetCream.description();
		 	sweetCream.eatingVessel();
		 	
		 Traditional butterPecan = new Traditional();
		 	butterPecan.numberOfScoops();
		 	butterPecan.description();
		 	butterPecan.eatingVessel();
		 
		 //Two Modern Objects
		 Modern	birthdayCake = new Modern();
		 	birthdayCake.numberOfScoops();
		 	birthdayCake.description();
		 	birthdayCake.eatingVessel();
		 	
		 Modern	cookieDough = new Modern();
		 	cookieDough.numberOfScoops();
		 	cookieDough.description();
		 	cookieDough.eatingVessel();
		 	
		 //Two Italian Objects
		 Italian stracciatella = new Italian();
		 	stracciatella.numberOfScoops();
		 	stracciatella.description();
		 	stracciatella.eatingVessel();
		 	
		 Italian biscotti = new Italian();
		 	biscotti.numberOfScoops();
		 	biscotti.description();
		 	biscotti.eatingVessel();
		 	
		 //Two American Objects
		 American cookiesAndCream = new American();
		 	cookiesAndCream.numberOfScoops();
		 	cookiesAndCream.description();
		 	cookiesAndCream.eatingVessel();
		 	
		 American mintChocolateChip = new American();
		 	mintChocolateChip.numberOfScoops();
		 	mintChocolateChip.description();
		 	mintChocolateChip.eatingVessel();
		 
		 
	}

}
