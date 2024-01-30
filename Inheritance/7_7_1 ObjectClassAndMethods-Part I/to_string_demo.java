class Rectangle{
	int length;
	int width;
	
	public void set(int l, int w){
		length = l;
		width = w;
	}
	
	/*public void print(){
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		
	*/
	
	public String toString(){
		String msg;
		msg = "Length: " + length + " Width: " + width;
		return msg;
	}
		
	public static void main(String [] args){
		Rectangle r = new Rectangle();
		r.set(10,20);
		
		System.out.println(r);
		
	}
}