
public class Italian extends Gelato
{
	String name = "Italian";
	String type = "Traditional Italian treat";
	
	@Override
	public void numberOfScoops() 
	{
		System.out.println("Traditional Gelato isn't measured in scoops, it is put into a bowl with a spade!");
	}

	@Override
	public void description() 
	{
		System.out.println("These are flavors of a classic Italian treat that will transport you to the warm climate and rolling hills of Italia.");	
	}

	@Override
	public void eatingVessel() 
	{
		System.out.println("Luxurious flavors that are usually best enjoyed in a traditional bowl.");	
	}

}
