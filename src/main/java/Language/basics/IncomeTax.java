package Language.basics;

import java.util.ArrayList;
import java.util.List;

public class IncomeTax {

	public static void main(String[] args) {
	    // Indian Tax System, 2500000, 1345556, 489000, 2500000

	        List<Integer> salaries = new ArrayList<Integer>();
	        salaries.add(2500000);
	        salaries.add(1345556);
	        salaries.add(489000);
	        salaries.add(2500000);

//	        System.out.println(salaries);
	       
//	        Without using Loops
	        System.out.println("============Without Loops=================");

	        if (salaries.get(0) <= 500000) {
	            System.out.println(salaries.get(0)); //no tax
	        }else if(salaries.get(0) > 500000 && salaries.get(0) <= 1000000) {
	            System.out.println(salaries.get(0) -salaries.get(0)*0.2);
	        }else {
	            System.out.println(salaries.get(0) -salaries.get(0)*0.3);
	        }
	       
	        if (salaries.get(1) <= 500000) {
	            System.out.println(salaries.get(1)); //no tax
	        }else if(salaries.get(1) > 500000 && salaries.get(1) <= 1000000) {
	            System.out.println(salaries.get(1) -salaries.get(1)*0.2);
	        }else {
	            System.out.println(salaries.get(1) -salaries.get(1)*0.3);
	        }
	       
	        if (salaries.get(2) <= 500000) {
	            System.out.println(salaries.get(2)); //no tax
	        }else if(salaries.get(2) > 500000 && salaries.get(2) <= 1000000) {
	            System.out.println(salaries.get(2) -salaries.get(2)*0.2);
	        }else {
	            System.out.println(salaries.get(2) -salaries.get(2)*0.3);
	        }
	       
	        if (salaries.get(3) <= 500000) {
	            System.out.println(salaries.get(3)); //no tax
	        }else if(salaries.get(3) > 500000 && salaries.get(3) <= 1000000) {
	            System.out.println(salaries.get(3) -salaries.get(3)*0.2);
	        }else {
	            System.out.println(salaries.get(3) -salaries.get(3)*0.3);
	        }
	       

	        // With Loops concept
	        System.out.println("============With Loops=================");
	       
	        for (int i=0;i<salaries.size();i++) {
	           
	            if (salaries.get(i) <= 500000) {
	                System.out.println(salaries.get(i)); //no tax
	            }else if(salaries.get(i) > 500000 && salaries.get(i) <= 1000000) {
	                System.out.println(salaries.get(i) -salaries.get(i)*0.2); //20 % tax
	            }else {
	                System.out.println(salaries.get(i) -salaries.get(i)*0.3); //30% tax
	            }
	           
	        }
	       

	}

}
