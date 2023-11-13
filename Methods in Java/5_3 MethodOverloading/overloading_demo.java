import java.lang.Math;
class OverloadingDemo{
	public static void main(String [] args){
		int radius = 20;
	
		int len=5, wid=3;
		int a = 8, b = 3, c = 9;
		f(len);
		System.out.println("The area of Circle is: " + area(radius));
		//System.out.println("The radius is: " + radius);
		System.out.println("The area of Rectangle is: " + area(len,wid));
		System.out.println("The area of Triangle is: " + area(a,b,c));
	}
	
	static void f(float val){
		System.out.println(val);
	}
	static float area(int radius){
		float retval = (float) 22/7 * radius;
		//radius = radius  * 2;
		//System.out.println("The radius is: " + radius);

		return retval;
	}
	
	static float area(int l, int w){
		return l * w;
	}
	
	static float area(int a, int b, int c){
		float s = (float)(a + b + c)/2.0f;
		return (float) Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
}
		