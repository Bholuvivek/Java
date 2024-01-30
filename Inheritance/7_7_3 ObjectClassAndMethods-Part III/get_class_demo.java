class GetClassDemo{
	public static void main(String [] args){
		Object obj = new GetClassDemo();
		String className = obj.getClass().getSuperclass().getName();
		System.out.println(className);
		System.out.println(className.getClass().getName());
		
	}
}