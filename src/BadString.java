
public class BadString{
  
  public static void main(String[] args) {
    	
	  	// Test that processor works
	  	// Create FileProcessor
    	FileProcessor goodList = new FileProcessor("GoodString.txt",10);
    	
    	// Process Input
		goodList.processFile();
		
		// Check length of ArrayList
		System.out.println(goodList.getArrayListSize());
		
		// Print contents of ArrayList
		System.out.println(goodList.getStringList());
		
		System.out.println();
		
		// Test exception handling (should throw "String is too long!")
		// Create FileProcessor
    	FileProcessor badList = new FileProcessor("BadString.txt",10);

    	// Process Input
    	badList.processFile();

  }//end main
  
}//end class