package core.view;

import java.util.Scanner;

public class ConsoleInterface {
	
	//choice of number of elements
public void numberOfElements() {
	System.out.println("\tWelcome in the array sorter program"
			+ "\n\n Please enter the amount of element you want to enter in list");
}

//choice of the type of the array
public void typeOfArray() {
	System.out.println("Choose your type of data(Elements)"
			+ "\n1.String"
			+ "\n2.Int"
			+ "\n3.Short"
			+ "\n4.Long"
			+ "\n5.Float"
			+ "\n6.Double"
			+ "\n7.Char"
			+ "\n Please enter the number which corresponds to your type of data");
}
	

//enter of data
public void enterOfElements () {
	System.out.println("Please enter the elements of the list. Press enter after each element.");
}

//choice of type of view
public void typeOfView() {
	System.out.println("Choose your type of list view"
			+ "\n1.Horizontal list"
			+ "\n2.Vertical list"
			+ "\n Please enter the number which corresponds to your type of list view");
}

//Horizontal list view 
public void HorizontalListView(String [] array,int a) {
	if (a==1) {
		System.out.println("\n The list is:");
		for(String elem:array) {
			System.out.print(elem+" ");
								}
		System.out.println("\n This list can't be sorted, because it's an object (String) array.");
	}
		else {
	System.out.println("\n The horizontal view of sorting list is:\n");
	for(String elem:array) {
		System.out.print(elem+" ");}
	}
}

//Vertical list view 
public void VerticalListView(String [] array,int a) {
	if (a==1) {
		System.out.println("\n The list is:");
		for(String elem:array) {
			System.out.println(elem);
								}
		System.out.println("\n This list can't be sorted, because it's an object (String) array.");
	}
		else {
	System.out.println("\n The vertical view of sorting list is:\n");
	for(String elem:array) {
		System.out.println(elem);
							}
		}
}

//Restart the program
public void restart () {
	System.out.println("\nWould you want to restart the program?"
			+ "\n0.NO"
			+ "\n1.YES"
			+ "\nPlease enter the number which corresponds to your choice");
}

//The end message
public void endMessage() {
	System.out.println("\tEnd of the program."
			+ "\n\tGOODBYE");
}
}
