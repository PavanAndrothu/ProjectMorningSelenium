package Language.basics;

public class ArrayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String EmpName1 = "Pavan";
		int empid1 = 1;
		
		String EmpName2 = "Androt";
		int empid2 = 2;
		
		System.out.println(EmpName1 + EmpName2);
		System.out.println(empid1);
		System.out.println(empid2);
		//array = the datatype we are using to store 'multiple values with same data type' in single variable;
		// array are fixed in length( meaning , user should specify the values count while initiating array);
		//Syntax : DataType [] variable = new dataType[length];
		//we can store values using index , index always starts from zero(0) == variable[index] = data;
		
		// store multiple employee names in single variable
		String [] employeeNames = new String [4];
		System.out.println("Length of array :" +employeeNames.length);
		
		employeeNames[0] = "Murali";
		employeeNames[1] = "Pavan1";
		employeeNames[2] = "Pavan2";
		employeeNames[3] = "Pavan3";
		

		
	//	String [] group1 = {"Ram","bheem"};
	//	String [] group2 = {"Hanuman","bharat"};
		//String [] group3 = {"Ram2", "Ram3"};
		
		
		
		
		String [][] groups = {{"Ram","bheem"},{"Hanuman","bharat"},{"Ram2","Ram3"}};
		
		System.out.println(groups[0][0]);
		
		
		
		
		String [][] friends = new String [3][2];
		friends[0][0] = "Ram";
		friends[0][1] = "bheem";
		friends[1][0] = "Hanuman";
		friends[1][1] = "bharat";
		friends[2][0] = "Ram2";
		friends[2][1] = "Ram3";
		
		
		//challenges with Array
		//1. fixed in length
		//2. static memory allocation
		//3. only we can store same data type
		
		

	}

}
