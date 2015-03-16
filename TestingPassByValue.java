
public class TestingPassByValue {
	public static void main( String[] args ){
	    Dog aDog = new Dog("Max");
	    foo(aDog);
//	    if( aDog.getName().equals("Max") ){ //true
//	        System.out.println( "Java passes by value." );
//	    }else if( aDog.getName().equals("Fifi") ){
//	        System.out.println( "Java passes by reference." );
//	    }
//	    System.out.println(aDog.getName());
//	    int a=10;
//	    modify(a);
//	    System.out.println(aDog);
//	    String ab="bipra";
//	    System.out.println(String.valueOf(a).length());
	    String str="bipra";
	    //int a=str.charAt(0);
	    int a='a';
	    System.out.println(a);
	}

	public static void foo(Dog d) {
	  d.getName().equals("Max"); // true
	  Dog b=new Dog("Koo");
	  Dog c=b;
	  System.out.println(b);
	  System.out.println(d);
	  c.setName("Ass");
	  System.out.println(b.getName());
//	  d = new Dog("Fifi");
//	  d.getName().equals("Fifi"); // true
	  //d.setName("Fifi");
	  
	}
	public static void modify(int a)
	{
		a=9;
	}
}
