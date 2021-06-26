package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Project_LockedMe {
	
	public static void displayMainMenu () {
        System.out.println("1. Read file names in ascending order");
        System.out.println("2. Select one of the 3 options below by pressing a key (Ex. A) ");
        System.out.println("  A. Add a file to the existing directory list");
        System.out.println("  B. Delete a file from the existing directory list");
        System.out.println("  C. Search a file in the main directory");
        System.out.println("3. Close the application");
    }

	public static void createFileInDirectory(String fileName, String directory) {
		try {  
            File file = new File(directory+fileName);  // this is used to create the file
        
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            }else {
            	System.out.println("File already exists!");
            }
		}catch(Exception e) {
			System.out.println("Error Creating file");
		}
	}
	
	public static void searchFileInDirectory(String fileName, String directory) throws FileNotFoundException {
		File fileDir = new File(directory); 
		File[] list = fileDir.listFiles();
		
		if (list == null) {
			System.out.println("Directory is Empty!");
		}
		for (File fil: list) {
			try {
				if(fileName.equals(fil.getName())){
					System.out.println("Found File: "+ fileName + " in Directory: "+ fil.getParentFile());
					return;
				}
				
			}catch(Exception e) {
				System.out.println("Error:"+ e.getMessage());
				return;
				
			}
		}
		System.out.println("File not found");
		return;
	}
	
	
	public static void deleteFileInDirectory(String filename, String directory) {
		File fullfile = new File(directory+filename);
		
		try {
			boolean b = fullfile.delete();
			if(b==true)
	        {
	        	System.out.println("File deleted !!");
	        }
	        else
	        {
	        	throw new FileNotFoundException("File was not found!");
	        }
			return;
		}catch(Exception e) {
			System.out.println("Error: "+ e.getMessage());
			return;
		}
		
	}
	
	public static void readFilesAscending(String directory) {
		TreeSet<File> lst = new TreeSet<File>();
		
		File folder = new File(directory);
		File[] listofFiles = folder.listFiles();
		
		for (File files: listofFiles) {
			if(files.isFile()) {
				lst.add(files);
			}
		}
		for (File files: lst) {
			if(files.isFile()) {
				System.out.println(files);
			}
		}
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Please enter directory: ");
		Scanner scanner = new Scanner(System.in);
		String directory = scanner.nextLine();
		
		File folder = new File(directory);
		if (! folder.isDirectory() || (!directory.endsWith("/"))) {
			System.out.println("Not a directory or does not end with '/'");
		}
		while(!folder.isDirectory() || (!directory.endsWith("/"))) {
			System.out.println("Please enter a correct directory: ");
			scanner = new Scanner(System.in);
			directory = scanner.nextLine();
//			System.out.println("Got this directory: "+directory);
			folder = new File(directory);
		}
		
		String fileName, option;
		char continueInput;
	
		do {
	            displayMainMenu();
	            System.out.println("Please select an option from the list above: ");
	            option = scanner.next();
	            switch(option) {
	            case "1":
	                readFilesAscending(directory);
	                break;
	            case "A":
	                System.out.println("Please enter a filename: ");
	                fileName = scanner.next();
	                createFileInDirectory(fileName, directory);
	                break;
	            case "B":
	                System.out.println("Please enter a filename: ");
	                fileName = scanner.next();
	                deleteFileInDirectory(fileName, directory);
	                break;
	            case "C":
	                System.out.println("Please enter a filename: ");
	                fileName = scanner.next();
	                searchFileInDirectory(fileName, directory);
	                break;
	            case "3":
	                System.exit(0);
	            }
	            System.out.println("Do you want to continue (y/n)? ");
	            continueInput = scanner.next().charAt(0);
	        } while (continueInput == 'Y' || continueInput == 'y');
	    
	}


}
