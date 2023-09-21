/**
 * 
 */
package Language.basics;

/**
 * @author 91949
 *
 */
public class SwitchCaseStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch and execute particular case based on expression
		
		int a = 10;
		
		char b = 10;
		int c;
		
	    if (a==b) {
	    	c = 1;
	    }else {
	    	c = 2;
	    }
		
		switch (c){
		case 1:
			System.out.println("a and b are equal");
			break;
		case 2:
			System.out.println("a and b are not equal");
			break;
		default:
			System.out.println("this is default -result");
			
			
		}
			
			
			  // Switch and execute particular case based on expression

	        int direction = 10;

	        switch (direction) {
	        case 1:
	            System.out.println("EAST");
	            break;
	        case 2:
	            System.out.println("WEST");
	            break;
	        case 3:
	            System.out.println("NORTH");
	            break;
	        case 4:
	            System.out.println("SOUTH");
	            break;
	        default:
	            System.out.println("This is invalid Input");
		}

	}

}
