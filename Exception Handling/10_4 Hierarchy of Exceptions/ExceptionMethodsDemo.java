class ExceptionMethodsDemo{
	public static void main(String [] args){
		try{
			int a = Integer.parseInt(args[0]);
			int b  = Integer.parseInt(args[1]);
			int ans = a/b;
			System.out.println("The Answer is" + ans);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			//System.out.println(e.getStackTrace());
			//e.printStackTrace();
			System.out.println(e.getCause());
			
		}
	}
}
			