package Language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//challenges with Array
		//1. fixed in length
		//2. static memory allocation
		//3. only we can store same data type
		
		
		//Collections 
		//List - arraylist, linkedlist ==> to store multiple values with same datatype, list can store duplicates
		
		
		//Set - Hashset, linkedhashset , treeset => to store multiple values with same datatype, set cann't store duplicates
		
		//Map - hashmap , TreeMap , treemap and hashtable ==>. can store multiple values with different data types 
		//and can store duplicate values but cannot store duplicate keys
		
		
		/**********************************LIST********************************/
		
		//List - arraylist, linkedlist ==> to store multiple values with same datatype, list can store duplicates
		//Syntax : List<DataType> Variable = new ArrayList<DataType>();
		//we can store values using List.add(value);
		System.out.println("*******ArrayLIST*******");
		//Order => Insertion Order
		//Null ==> Null values are allowed
		
		
		List<String> empNamesArrayList = new ArrayList<String>();
		System.out.println("Size of ArrayList :" +empNamesArrayList.size());
		
		empNamesArrayList.add("Murali");
		empNamesArrayList.add("Pavan1");
		empNamesArrayList.add("Pavan2");
		empNamesArrayList.add("Pavan3");
		empNamesArrayList.add("Pavan4");
		empNamesArrayList.add(null);
		
		
		empNamesArrayList.remove(3);
		System.out.println(empNamesArrayList);
		System.out.println(empNamesArrayList.get(2));
		
		System.out.println("*******LinkedLIST*******");
		//Order => Insertion Order
		//Null ==> Null values are allowed
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		System.out.println("Size of LinkedList :" +empNamesLinkedList.size());
		
		empNamesLinkedList.add("Murali");
		empNamesLinkedList.add("Pavan1");
		empNamesLinkedList.add("Pavan2");
		empNamesLinkedList.add("Pavan3");
		empNamesLinkedList.add("Pavan4");
		empNamesLinkedList.add(null);
		
		System.out.println(empNamesLinkedList);
		
		
		//Set - Hashset, linkedhashset , treeset => to store multiple values with same datatype, set cann't store duplicates

		/**********************************SET********************************/
		
		System.out.println("*******HashSet*******");
		//Order => Random Order
		//Null ==> Null values are allowed
		//duplicates are not allowed
		
		
		
		Set<String> empNamesHashSet = new HashSet<String>();
		System.out.println("Size of HashSet :" +empNamesHashSet.size());
		
		empNamesHashSet.add("Murali");
		empNamesHashSet.add("Pavan1");
		empNamesHashSet.add("Pavan2");
		empNamesHashSet.add("Pavan3");
		empNamesHashSet.add("Pavan4");
		empNamesHashSet.add(null);
		
		System.out.println(empNamesHashSet);

		
		
		System.out.println("*******LinkedHashSet*******");
		//Order => Insertion Order
		//Null ==> Null values are allowed
		//duplicates are not allowed
		
		
		
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		System.out.println("Size of LinkedHashSet :" +empNamesLinkedHashSet.size());
		
		empNamesLinkedHashSet.add("Murali");
		empNamesLinkedHashSet.add("Pavan1");
		empNamesLinkedHashSet.add("Pavan2");
		empNamesLinkedHashSet.add("Pavan3");
		empNamesLinkedHashSet.add("Pavan4");
		empNamesLinkedHashSet.add(null);
		
		System.out.println(empNamesLinkedHashSet);
		
		
		
		System.out.println("*******TreeSet*******");
		//Order => accending Order
		//Null ==> Null values are allowed
		//duplicates are not allowed
		
		
		
		Set<String> empNamesTreeSet = new TreeSet<String>();
		System.out.println("Size of TreeSet :" +empNamesTreeSet.size());
		
		empNamesTreeSet.add("Murali");
		empNamesTreeSet.add("Pavan1");
		empNamesTreeSet.add("Pavan2");
		empNamesTreeSet.add("Pavan3");
		empNamesTreeSet.add("Pavan4");
		//empNamesTreeSet.add(null);
		
		System.out.println(empNamesTreeSet);

/***********************************************MAP******************************************/
		
		//Map - hashmap , TreeMap , treemap and hashtable ==>. can store multiple values with different data types 
		//and can store duplicate values but cannot store duplicate keys
		//Map<Key,Value> variable = new HashMap<Key,Value>();
		
		System.out.println("*******HashMap*******");
		//Order => Random Order of keys
		//Null ==> Null values are allowed , null keys are not allowed
		
		
		
		
		Map<String,Integer> empNamesHashMap = new HashMap<String,Integer>();
		System.out.println("Size of HashMap :" +empNamesHashMap.size());
		
		empNamesHashMap.put("Murali",1);
		empNamesHashMap.put("Pavan1",2);
		empNamesHashMap.put("Pavan2",2);
		empNamesHashMap.put("Pavan3",3);
		empNamesHashMap.put("Pavan4",4);
		empNamesHashMap.put("Pavan5",5);
		empNamesHashMap.put("Pavan6",null);
		empNamesHashMap.put(null,7);
		
		System.out.println(empNamesHashMap);
		
		
		System.out.println("*******TreeMap*******");
		//Order => Insertion Order of keys
		//Null ==> Null values are allowed , null keys are not allowed
		
		
		
		
		Map<String,Integer> empNamesTreeMap = new TreeMap<String,Integer>();
		System.out.println("Size of TreeMap :" +empNamesTreeMap.size());
		
		empNamesTreeMap.put("Murali",1);
		empNamesTreeMap.put("Pavan1",2);
		empNamesTreeMap.put("Pavan2",2);
		empNamesTreeMap.put("Pavan3",3);
		empNamesTreeMap.put("Pavan4",4);
		empNamesTreeMap.put("Pavan5",5);
		//empNamesTreeMap.put("Pavan6",null);
		//empNamesTreeMap.put(null,7);
		
		System.out.println(empNamesTreeMap);
		
		System.out.println("*******TreeMap*******");
		//Order => Insertion Order of keys
		//Null ==> Null values are allowed , null keys are not allowed
		
		
		
		
		Map<String,Integer> empNamesHashTable = new Hashtable<String,Integer>();
		System.out.println("Size of HashTable :" +empNamesHashTable.size());
		
		empNamesHashTable.put("Murali",1);
		empNamesHashTable.put("Pavan1",2);
		empNamesHashTable.put("Pavan2",2);
		empNamesHashTable.put("Pavan3",3);
		empNamesHashTable.put("Pavan4",4);
		empNamesHashTable.put("Pavan5",5);
		//empNamesHashTable.put("Pavan6",null);
		//empNamesHashTable.put(null,7);
		
		System.out.println(empNamesHashTable);


		
		
				
		
	}

}
