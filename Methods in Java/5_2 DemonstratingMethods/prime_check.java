class PrimeCheck{
	public static void main(String [] a){
		int num = 121;
		boolean flag = true;
		for (int i=2;i<(int)num/2;i++)
			if (num % i == 0){
				flag = false;
				break;
			}
		if (flag == true)
			System.out.println(num + " is Prime");
		else
			System.out.println(num  + " is Not Prime");
		
		
		int num2 = 456;
		flag = true;
		for (int i=2;i<(int)num2/2;i++)
			if (num2 % i == 0){
				flag = false;
				break;
			}
		if (flag == true)
			System.out.println(num2 + " is Prime");
		else
			System.out.println(num2 + " is Not Prime");
		
		int num3 = 324;
		flag = true;
		for (int i=2;i<(int)num3/2;i++)
			if (num3 % i == 0){
				flag = false;
				break;
			}
		if (flag == true)
			System.out.println(num3 + " is Prime");
		else
			System.out.println(num3 + " is Not Prime");
		
	}
}
				