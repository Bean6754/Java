import java.lang.Math;
import java.io.File;
import java.io.IOException;
import java.io.Writer;

public class HelloWorld
{
  public static void main(String[] args)
  {
    //Class1 loop_message = new Class1("Loop!!\n");
    int i;
    
    System.out.print("\033[H\033[2J");
    System.out.flush();
    for (i = 1; i < 6; i++) {
        
        
        try {
	     File file = new File(i + ".txt");
	     /*If file gets created then the createNewFile() 
	      * method would return true or if the file is 
	      * already present it would return false
	      */
             boolean fvar = file.createNewFile();
	     if (fvar){
	          System.out.println("File has been created successfully");
	     }
	     else{
	          System.out.println("File already present at the specified location");
	     }
    	} catch (IOException e) {
    		System.out.println("Exception Occurred:");
	        e.printStackTrace();
	  }
        
	    //Write Content
	File writer = new File(File);
	writer.write("This is file: " + i);
	writer.close();
        
        
      System.out.print("Created file: ");
      System.out.println(i + ".");
    }
  }
}
/*
public class Class1
{
 public Class1()
 {
   
 }
} */
