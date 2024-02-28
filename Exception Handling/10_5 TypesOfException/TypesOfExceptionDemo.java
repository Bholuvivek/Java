import java.io.*;
class TypesOfExceptionDemo{
	public static void main(String [] args) throws Exception{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if ((a==0) || (b==0))
			throw new Exception();
		System.out.println("Ans is: " + (a/b));
		/*try{
		FileInputStream f = null;
		f = new FileInputStream("D:\temp\dummy.txt");
		int m;
		while ((m = f.read()) != -1) {
			System.out.println((char) m);
		}
		f.close();
		}
		catch(FileNotFoundException fnf){
			System.out.println("Please check...File is not there");
		}
		catch(IOException ioe){
			System.out.println("Could not perform operation on file");
		}*/
	}
}
		
		