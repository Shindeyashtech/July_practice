class Mobile
{
	public static void main(String [] args)
	{
		System.out.println("This is Mobile testing ");	
	
			Display di = new Display();
				di.setDisplay();
	}			
}

class Display
{
	void setDisplay()
	{
		System.out.println("display is working");
	}
}