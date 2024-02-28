class ExceptionHandlingDemo2{
	public static void main(String [] args){
		int a, b;
		try{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			if ((b <= 0) || (a <=0))
			throw new ArithmeticException();
			int ans = a/b;
			System.out.println("The answe is :" + ans);
		}
		catch(ArithmeticException e){
			System.out.println("Sorry we want both numbers to be Non-Zero Positive");
		}
	}
}
			