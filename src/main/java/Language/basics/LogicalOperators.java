package Language.basics;

public class LogicalOperators {

	public static void main(String[] args) {
		// Logical operators can be used to perform logical operations
       
        //&& (logical and), ||(logical or) , !(logical not)
       
        int a=10;
        int b=20;
       
        System.out.println(a==b && a<b);
       
        System.out.println(a==b || a<b);
       
        System.out.println(!(a==b || a<b));

	}

}
