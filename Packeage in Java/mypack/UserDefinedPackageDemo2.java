package mypack;

public class UserDefinedPackageDemo2{
	int i;
	int j;
	
	public UserDefinedPackageDemo2(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	public String toString(){
		return "I: " + i + " J: " + j;
	}
}