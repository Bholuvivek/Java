class ExceptionHandlingDemo1{
	public static void main(String [] args){
		int a = 10, b;
		try{
				b = Integer.parseInt(args[0]);
				int ans = a/b;
				System.out.println("The ans is :" + ans);
		}
		catch(Exception e){
			System.out.println("Exception is Generated:" + e);
		}
		finally{
			System.out.println("Always Gets Executed");
		}
		System.out.println("After Try block");
	}
}