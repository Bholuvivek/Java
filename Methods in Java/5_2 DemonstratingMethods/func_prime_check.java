class FPrimeCheck{
	public static boolean isPrime(int n){
		boolean flag = true;
		for (int i=2;i<(int)n/2;i++)
			if (n % i == 0){
				flag = false;
				break;
			}
		return flag;
	}
	
	
	public static void main(String [] args){
		int num = 121;
		if (isPrime(num))
			System.out.println(num + " is Prime");
		else
			System.out.println(num  + " is Not Prime");
		
		int num2 = 456;
		if (isPrime(num2))
			System.out.println(num2 + " is Prime");
		else
			System.out.println(num2  + " is Not Prime");
	}
}
		