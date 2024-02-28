import java.io.*;
class ExceptionHandlingDemo3{
	void m1(int a) throws IOException{
		if (a <0)
			throw new IOException();
		System.out.println("Valid Value a:" +a);
	}
	
	void m2(int a) throws IOException{
		
			m1(a);
		
		
	}
	public static void main(String args[]){
		ExceptionHandlingDemo3 obj = new ExceptionHandlingDemo3();
		int val = Integer.parseInt(args[0]);
		try{
		obj.m2(val);
		}
		catch(Exception e) {}
	}
}
		