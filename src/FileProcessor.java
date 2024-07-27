import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	private  ArrayList<String> stringList;
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		
		this.setFileName(fileName);
		this.setStringLength(stringLength);
		stringList = new ArrayList<String>();
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		
		return stringList.size();
	}//end getArrayListSize
	
	public void processFile() {
		
		File file = new File(fileName);
		
		try {
			
			input = new Scanner(file);
			
			while(input.hasNextLine()) {
				
				String currentLine = input.nextLine();
				
				if (currentLine.length() > this.stringLength) {
					
					throw new StringTooLongException("String is too long!");
					
				} else {
					
					stringList.add(currentLine);
				}
			}
			
			input.close();

		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		} catch (StringTooLongException e) {
			
			System.out.println(e.getMessage());
		}
	}//end processFile
	

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the stringLength
	 */
	public int getStringLength() {
		return stringLength;
	}

	/**
	 * @param stringLength the stringLength to set
	 */
	public void setStringLength(int stringLength) {
		
		if(stringLength < 5) {
			this.stringLength = 5;
		}
		
		this.stringLength = stringLength;
	}

	/**
	 * @return the stringList
	 */
	public ArrayList<String> getStringList() {
		return stringList;
	}
	
	
	
	
}//end class
