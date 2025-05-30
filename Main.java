import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	 static Scanner sc = new Scanner (System.in);
	 
	 static List<String> toDoList = new ArrayList<>();
	 
	 // crud porject where users can Create,Read,Update and Delete their personal list
	public static void main(String[] args) {
		 
		  while (true) {
	            System.out.print("Choose an option (1: Add to list, 2: View list, 3: Edit item, 4: Delete item, 5: Exit): ");
	            int userChoice = sc.nextInt();
	            sc.nextLine(); 

	            if (userChoice == 1) {
	                option1();
	            } else if (userChoice == 2) {
	                option2();
	            } else if (userChoice == 3) {
	                option3();
	            } else if (userChoice == 4) {
	                option4();
	            } else if (userChoice == 5) {
	                System.out.println("Goodbye!");
	                break;
	            } else {
	                System.out.println("Invalid Option!");
	            }
	        }

	        sc.close();
	}
	
	public static void option1(){
	
	System.out.print("Enter something to add to the list: ");
	String input = sc.nextLine(); 

	toDoList.add(input);
	
	System.out.println("Added to the list: \"" + input + "\"");
	}
	public static void option2(){
		System.out.println(toDoList);
	}
	public static void option3(){
		   System.out.print("Enter the exact item you want to edit: ");
		    String itemToEdit = sc.nextLine();
		    
		    if(toDoList.contains(itemToEdit)) {
		    	System.out.print("Enter the new value: ");
		        String newValue = sc.nextLine();
		        // Get the index of the item the user wants to edit
		        int index = toDoList.indexOf(itemToEdit)
		        // Replace the item at that index with the new value
		        toDoList.set(index, newValue);
		        System.out.println("Item updated.");
		    }else {
		    	  System.out.println("Item not found. Make sure you typed it exactly.");
		    	  
		    }
	}
		    
	public static void option4(){
		  System.out.print("Enter the exact item you want to delete: ");
		    String itemToDelete = sc.nextLine();

		    boolean removed = toDoList.remove(itemToDelete);

		    if (removed) {
		        System.out.println("Deleted: \"" + itemToDelete + "\"");
		    } else {
		        System.out.println("Item not found. Make sure you typed it exactly.");
		    }
	}
}
