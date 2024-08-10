package Assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
 FileReader f= new FileReader("C:\\Users\\DELL\\Desktop\\my_self");
	}
		
		Catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
