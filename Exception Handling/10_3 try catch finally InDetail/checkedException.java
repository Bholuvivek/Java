import java.io.*;  
class CheckedExceptionExample {  
    public static void main(String args[]) {  
        FileInputStream file_data = null;  
      try{
        	file_data = new FileInputStream("D:/temp/dummy.txt");  
        	int m;  
       	 while(( m = file_data.read() ) != -1) {  
            	System.out.print((char)m);  
        	}	  
        	file_data.close();  
    }
catch (FileNotFoundException fnf){}
catch (IOException ioe){}

    }  
}  