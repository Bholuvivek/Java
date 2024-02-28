class TryCatchFinallyInDetailDemo{
	public static void main(String [] args){
		try{
			int a;
			int b;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			if ((a == 0) || (b == 0))
				throw new ArithmeticException();
			System.out.println("After Exception in Try Block");
			if ((a < 0) || (b < 0))
				throw new Exception();
		}
		catch(ArithmeticException ae){
			System.out.println("Either of the Values entered are Zero");
			//return;
		}
		catch(ArrayIndexOutOfBoundsException aiob){
			System.out.println("Please provide 2 command line arguments");
		}
		catch(NumberFormatException nfe){
			System.out.println("Please provide integer values only");
		}
		catch(Exception e){
			System.out.println("Either of the Value entered is less than zero");
		}
		finally{
			System.out.println("Finally1: Thank You for using this class");
		}
		finally{
			System.out.println("Finally2: Thank You for using this class");
		}
		System.out.println("After Finally Block");

		
	}
}