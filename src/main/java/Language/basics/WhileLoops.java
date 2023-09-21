package Language.basics;

public class WhileLoops {

	public static void main(String[] args) {
		 // When we want to execute until specific condition matches
		   
		   
	    /*
	     * while(condition)
	     * { block of code;
	     * increment/decrement of number; }
	     */
	   
	    //When we are not sure how many iterations or when we want to execute until condition matches
	          
	        int i = 11;
	       
	        while(i<10) {
	            System.out.println(i);
	            i--;
	        }
	       
	       
	        //do-while loop (if we want to execute at-least one time even when no condition satisfies)
	       
	        do {
	            System.out.println(i);
	            i--;
	        } while (i < 10);
	       

	}

}
