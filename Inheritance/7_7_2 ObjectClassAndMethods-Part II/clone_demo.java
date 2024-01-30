class Rectangle implements Cloneable{
	int length;
	int width;
	
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public String toString(){
		return "Length: " + length + " Width: " + width;
	}
	
	public static void main(String [] args){
		Rectangle r1 = new Rectangle(10,20);
		try{
			Rectangle r2 = (Rectangle) r1.clone();
			System.out.println(r1);
			System.out.println(r2);
		
			r2.length = 35;
			System.out.println("After Modifying R2 - length");
		
			System.out.println(r1);
			System.out.println(r2);
		}
		catch(CloneNotSupportedException ce){
			System.out.println(ce);
		}
		
	}
		
}
