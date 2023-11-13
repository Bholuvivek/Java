import java.lang.Math;

class FunctionOverloadingDemo{
	public static void main(String [] args){
		int radius = 5;
		int length = 6, width = 7;
		int a = 8, b = 9, c = 3;
		f(radius);
		int ans = f(radius);
		System.out.println("The Area of Circle is: " + area(radius));
		System.out.println("The Radius From Main:" + radius);

		System.out.println("The Area of Rectangle is: "  + area(length, width));
		System.out.println("The Area of Triangle is: " + area(a,b,c));
	}
	
	/*static void f(int val){
		System.out.println(val);
	}*/
	
	static int f(int val){
		val = val + 10;
		return val;
	}
	
	
	
	
	static float area(int radius){
		float ans = 22/7 * radius * radius;
		radius = radius * 2;
		System.out.println("The Radius within Function:" + radius);
		return ans ;
		
	}
	
	static float area(int length, int width){
		return length * width;
	}
	
	static float area(int a, int b, int c){
		float s = (float)(a + b + c)/2.0f;
		return (float)Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
}
		