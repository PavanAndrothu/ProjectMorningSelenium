package methodbasics;

import java.util.ArrayList;
import java.util.List;

public class methodclass1 {

	public static void main(String[] args) {
		
		List<Integer> salaries = new ArrayList<Integer>();
		salaries.add(2500000);
		salaries.add(1345556);
		salaries.add(489000);
		salaries.add(2500000);
		
		new methodclass1().printSalaryAfterSalaryDeduction(salaries);
	}
	
	
	void printSalaryAfterSalaryDeduction(List<Integer> salaries ){
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
	
	List<Double> getSalaryAfterSalaryDeduction(List<Double> salaries ){		
		List<Double> finalSalary = new ArrayList<Double>();
		
		for (int i=0;i<salaries.size();i++) {
			
			if (salaries.get(i) <= 500000) {
				finalSalary.add(salaries.get(i));
			}else if(salaries.get(i) > 500000 && salaries.get(i) <= 1000000) {
				finalSalary.add(salaries.get(i) -salaries.get(i)*0.2); //20 % tax
			}else {
				finalSalary.add(salaries.get(i) -salaries.get(i)*0.2); //30% tax
			}			
	}			
		return finalSalary; 

	}

}
