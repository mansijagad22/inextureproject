package com.example;

/**
 * Hello world!
 *
 */
public class App extends Test
{
//	String s;
//	static int a;
//	static {
//		System.out.println("in parent class static block is called...");
//	}
//	void show1() {
//		System.out.println("in parent class show method is called...");
//	}
//	{
//		System.out.println(" in parent class Instance is called...");
//	}
//	
//	App(){
//		System.out.println("COnstructor is called in method....");
//		s = "mansi";
//		a=10;
//	}
    public static void main( String[] args )
    {
    	Test t1 = new Test()
    	{
    		void show() {
    			System.out.println("App class show method");
    		}
    		void display()
    		{
    			System.out.println("App class Display method");
    			}
    		};
    		t1.show();
    		t1.display();
    	Test t2 = new Test();
    	t2.show();
    	t2.display();
//    	Test t = new App();
//    	t.show();// DownCasting 
//    	Test.Demo d = t.new Demo();
//    	Demo d = new Demo();
//    	d.display();
//    	App app = new App(); // UPcasting
//    	System.out.println(app.a);
//    	app.show();
    }
}
