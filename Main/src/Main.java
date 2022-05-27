import java.util.*;
import java.util.InputMismatchException;
public class Main {
	Scanner sc = new Scanner(System.in);   
	public void InsertionSort(ArrayList<Integer> number)
	{
		int current=1,prv=0;
		for(int num=1; num < number.size(); num++) // This loop get number from array list
		{
			current= number.get(num);  //current element get
			prv=num-1; 
			while(prv >= 0 && number.get(prv) > current) //compare Element with current Element 
			{
				number.set(prv+1,number.get(prv)); 
				prv--;
			}
			number.set(prv+1,current); 
		}

	}
	void printArray(ArrayList<Integer> number)
	{
		System.out.println("\n Numbers in Sorted Manner:");
		for(int i=0; i<number.size(); i++)
		{
			System.out.println(" "+number.get(i));  // to get element i
		}
		System.out.println();
	}
	
	void AddElement(ArrayList<Integer> number) 	// This function for Adding Element with specific position
	{
		try
		{
			System.out.println("Enter at which  Position you want to insert an element:"); // enter position 
			int pos1 = sc.nextInt();
			System.out.println("Enter Element which you want to Add:");//enter element
			int Element1 = sc.nextInt();
			number.add(pos1,Element1);  // adding in array list
			//Sorting and printing
			InsertionSort(number);
			printArray(number);
		}
		catch(Exception e)
		{
			System.out.println("Error In AddElement"+e); // to handle error
		}
	}
	void removeElement(ArrayList<Integer> number)  //This function for remove element from position
	{
		try
		{
			System.out.println("Enter at which Position you want to Remove an element:"); //Enter position for remove element
			int pos2 = sc.nextInt();
			number.remove(pos2);	//remove with specific position
			// Sorting and printing
			InsertionSort(number);
			printArray(number);
		}
		catch(Exception e)
		{
			System.out.println("Error In Remove Element"+e); // to handle error
		}
	}
	
	public static void main(String[] args)throws Exception
	{
		
		Main p1 = new Main();		
		try	
		{
			int Choise; 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter How many Numbers you Want to enter for Sorting :");
			int ArraySize = sc.nextInt();
			if(ArraySize <=0 )
			{
				//throw new Exception();
				System.out.println("Invalid statement");
			}
				
			ArrayList<Integer> number = new ArrayList<Integer>(ArraySize);
			for(int i=0; i< ArraySize; i++)
			{
				System.out.println("Enter Number");
				number.add(sc.nextInt());
			}
			System.out.println("You only Entered the Following Numbers:"+ number);
			p1.InsertionSort(number);
			p1.printArray(number);
			
			
			a: while(true)	
			{
				System.out.println("!---------------------------------!");
				System.out.println("1.Enter New Element in array ");
				System.out.println("2.Remove Element in Array");
				System.out.println("3.Quit");
				System.out.print("Enter your Choice:");
				Choise = sc.nextInt();
				switch(Choise)
				{
					case 1:
						p1.AddElement(number);
						break;
					case 2:
						p1.removeElement(number);
						break;
					case 3:
						break a;
				}
			}
		}
		
		
		catch(InputMismatchException e)
		{
			
			System.out.println("Enter numeric value only");
			
		}
		
		}
	}
