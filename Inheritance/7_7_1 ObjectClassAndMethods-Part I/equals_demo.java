class Rectangle{
	int length;
	int width;
	
	Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	public String toString(){
		return "Length:" + length + " Width: " + width;
	}
	
	public boolean equals(Object obj){
		Rectangle r = (Rectangle) obj;
		if ((this.length == r.length) && (this.width == r.width))
			return true;
		return false;
	}
	
	
	public static void main(String [] args){
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(10, 20);
		//Rectangle r3 = r1;
		if (r1.equals(r2))
			System.out.println("Both are Equal");
		else
			System.out.println("Both are Different");
		
		/*String s1 = "Hello";
		String s2 = new String("Hello");
		
		if (s1 == s2)
			System.out.println("Both are Equal");
		else
			System.out.println("Both are Different");*/
	}
}
		
		