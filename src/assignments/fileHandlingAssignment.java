package assignments;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class fileHandlingAssignment {
	static String path = "/Users/ImranMohdRaji/Desktop/testfile.txt";
	static void writeFile() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter text to write: ");
			String words = scanner.nextLine();
			
			FileWriter output = new FileWriter("/Users/ImranMohdRaji/Desktop/testfile.txt",StandardCharsets.UTF_8);
			System.out.println("User wrote: "+ words);
			output.write(words);
			System.out.println("Data is written in files...");
			output.close();
		}
		catch(Exception e){
			System.out.println("Error writing to file");
		}
		finally {
			System.out.println("Successfully written to file");
		}
	}
	static void readFile() throws IOException{
		
//		char[] array = new char[100];
//		try {
//			FileReader input = new FileReader(path,StandardCharsets.UTF_8);
//			input.read(array);
//			System.out.print("File read:"+ array);
//			input.close();
//		}
//		catch(Exception e) {
//			System.out.println("Error reading file");
//		}
		try {
			FileInputStream fin = new FileInputStream(path);
			int ch;
			while((ch = fin.read())!=-1)
				System.out.print((char)ch);
			fin.close();
		}
		catch(Exception e) {
			System.out.println("Error reading file");
		}
		
		
		
	}
	
	static void deleteFile() {
		File file = new File(path);
		boolean b = file.delete();
        if(b==true)
        {
        	System.out.println("File deleted !!");
        }
        else
        {
        	System.out.println("File not deleted");
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			File file = new File("/Users/ImranMohdRaji/Desktop/testfile.txt");
			if (file.createNewFile()) {
				System.out.println("Creating file...");
			}
			System.out.println("Can write? " + file.canWrite());
			
		}
		catch(Exception e) {
			System.out.println("Error creating file");
		}
		
		finally {
			System.out.println("Succesfully created file");
		}
		
		writeFile();
		try {
			readFile();
		}
		catch(Exception e) {
			System.out.println("Error reading file");
		}
		
		
		System.out.println("\nPress enter to delete file...");
		Scanner scanner = new Scanner(System.in);
		String emptry = scanner.nextLine();
		deleteFile();
		
	}
	

}
