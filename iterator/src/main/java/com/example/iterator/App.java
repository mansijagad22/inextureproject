package com.example.iterator;

import java.util.*;
import java.util.Map.Entry;


/**
 * Hello world!
 *
 */
public class App extends Employee
{
public App(int id, String name, String author, String publisher, int quantity) {
		super(id, name, author, publisher, quantity);
		// TODO Auto-generated constructor stub
	}

//	public App(int i, String string, int j) {
//		super(i, string, j);
//		// TODO Auto-generated constructor stub
//	}

	public static void main( String[] args )
    {
		
		
		
		
		Map<Integer,Employee> map = new HashMap<Integer,Employee>();
		Employee e1 = new Employee(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Employee e2 = new Employee(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Employee e3 = new Employee(103,"Operating System","Galvin","Wiley",6);
		
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		
		for(Map.Entry<Integer, Employee> obj : map.entrySet()) {
			int key = obj.getKey();
			Employee e = obj.getValue();
			System.out.println(key + " Details: ");
			System.out.println(e.id + " "+ e.name + " "+ e.author+" "+ e.publisher+" "+e.quantity);
//			System.out.print(obj.getKey()+" "obj.getValue());
//			
		}

				
		
//		  HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
//		   map.put(1,"Mango");  //Put elements in Map  
//		   map.put(2,"Apple");    
//		   map.put(3,"Banana");   
//		   map.put(1,"Grapes"); 
//		   map.put(null, "orange");
//		   map.put(null, "strawbarry");//trying duplicate key  
//		       
//		   System.out.println("Iterating Hashmap...");  
//		   for(Map.Entry m : map.entrySet()){    
//		    System.out.println(m.getKey()+" "+m.getValue());    
//		   }
    	
		
//		Map<Integer,String> map = new HashMap<Integer,String>();
//		map.put(1, "mansi");
//		map.put(2, "mansi1");
//		map.put(3, "mansi2");
//		map.put(4, "mansi3");
//		map.put(6, "mansi4");
//		map.entrySet()
//		.stream().sorted(Map.Entry.comparingByValue())
//		.forEach(System.out::println);
//    	List<Student>  s = new ArrayList<Student>();
//    	s.add(new Student(101,"hello",32));
//    	s.add(new Student(102,"World",24));
//    	System.out.print(s);
//    	
//    	Iterator i = s.iterator();
//    	while(i.hasNext()) {
//    		Student std = (Student) i.next();
//    		System.out.print(std);
//    	}
    	
    	
    	
    	
    	
    	
    	
    	
     /*   List<String> l1 = new ArrayList();
        l1.add("Hello");
        l1.add("Mansi");
        l1.add("Ravi");//Adding object in arraylist  
        l1.add("Vijay");  
        l1.add("Ravi");  
        l1.add("Ajay");  
//        System.out.print(l1.toString());
*/        
//        Iterator<String> i = l1.iterator();
//        while(i.hasNext()) {
//        	System.out.println(i.next());
//        }
        // Two type of iterator we have 
//        1) Iterator : used for every Collection
//        2) List Iterator : only use for collection which have  it have next and previous both side next which we can get
        
        
   /*     ArrayList<Integer> al = new ArrayList<>();
        al.add(80);
        al.add(90);
        al.add(100);
        */
//        Iterator i1 = al.iterator();
//        while(i1.hasNext())
//        	System.out.println(i1.next());
//        
     /*  List iterator implementation 
      *  ListIterator<Integer> li = al.listIterator();
        while(li.hasNext()) {
        	System.out.println(li.next());
        	System.out.println(li.nextIndex());
        	System.out.println();
        }
        while(li.hasPrevious()) {
        	System.out.println(li.previous());
        	System.out.println(li.previousIndex());
        	System.out.println();

        }
        */
        /* Maps implementation
         * 
         
        Map<Integer,String> m = new HashMap<Integer,String>();
        m.put(0, "Hello ");
        m.put(null, "World");
        m.put(null, "Good");
        System.out.print(m);
        Set s = m.entrySet();
        Iterator i = s.iterator();
        while(i.hasNext()) {
        	System.out.print(i.next());
        }
        Set<Entry<Integer, String>> me = m.entrySet(); */
//        me.add(90,"Mansi");
//        Map
        
//        

//        me = (Map.Entry)<>.Next();
    }
}
