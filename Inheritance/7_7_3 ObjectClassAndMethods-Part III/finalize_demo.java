class FinalizeDemo{
	protected void finalize(){
		System.out.println("Finalize Method is called");
	}
	
	public FinalizeDemo(){
		System.out.println("FinalizeDemo is Created");
	}
	
	public static void main(String [] args){
		FinalizeDemo obj = new FinalizeDemo();
		
		obj = null;
		System.gc();
		System.out.println("Main Exiting");
	}
}