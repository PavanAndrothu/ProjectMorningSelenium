package Language.basics;

public class ComparisionOperators {

	public static void main(String[] args) {
		// Comparison operators will be used to compare two values
		
		// == , != , >= , <= , < , >
		
		int a = 10;
		int b = 20;
		
		System.out.println(a==b);
		
		System.out.println(a!=b);
	       
        System.out.println(a>=b);
       
        System.out.println(a<=b);
       
        System.out.println(a>b);
       
        System.out.println(a<b);        
       
        String name = "XYZ";
       
        //equals
        //equalsIgnoreCase
        //contains
       
        System.out.println(name.equals("XYZ"));
       
        System.out.println(name.equals("xyz"));
       
        System.out.println(name.equalsIgnoreCase("XYZ"));
       
        System.out.println(name.equalsIgnoreCase("xyz"));
       
        System.out.println(name.contains("XY"));
       
        System.out.println(name.contains("xy"));    


	}

}
