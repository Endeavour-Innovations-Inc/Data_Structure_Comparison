package Project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class Project_initialization {
	// all the data structures
	static HashMap<String, String> d_hashmap = new HashMap<>();
	static ArrayList<input_vars> d_arraylist = new ArrayList<input_vars>();
	static LinkedHashSet<input_vars> d_linkedhashset = new LinkedHashSet<input_vars>();  
	static HashSet<input_vars> d_hashset = new HashSet<input_vars>();  
	static Deque<input_vars> d_arraydeque = new ArrayDeque<input_vars>();
	static Stack<input_vars> d_stack = new Stack<input_vars>(); 
	static Vector<input_vars> d_vector = new Vector<input_vars>(); 
	static LinkedList<input_vars> d_linkedlist = new LinkedList<input_vars>();
	
	
	// variables
	static int no_times;
	static int EvenIndex;
	static long elapsed_hashmap;
	static long elapsed_arraylist;
	static long elapsed_linkedhashset;
	static long elapsed_hashset;
	static long elapsed_arraydeque;
	static long elapsed_stack;
	static long elapsed_vector;
	static long elapsed_linkedlist;
	
	// Measures the time for adding all the values
	
	public void initial_add() {
	// variables declaration
	   long elapsed_hashmap_add;
	   long elapsed_arraylist_add;
	   long elapsed_vector_add;
	   long elapsed_linkedlist_add;
	   long elapsed_stack_add;
	   long elapsed_arraydeque_add;
	   long elapsed_hashset_add;
	   long elapsed_linkedhashset_add;
	   
	   // Class Declaration
	   num_gen identity = new num_gen();
	   
	   // Hashmap
	   long sT_hashmap = System.currentTimeMillis();
	   identity.dataupload_hashmap(no_times); 
	   long eT_hashmap= System.currentTimeMillis();
	   elapsed_hashmap_add = (eT_hashmap - sT_hashmap)/1000;
	   
	   // ArrayList
	   long sT_arraylist = System.currentTimeMillis();
	   identity.dataupload_arraylist(no_times); 
	   long eT_arraylist = System.currentTimeMillis();
	   elapsed_arraylist_add = (eT_arraylist - sT_arraylist)/1000;
	   
	   // Vector
	   long sT_vector = System.currentTimeMillis();
	   identity.dataupload_vector(no_times); 
	   long eT_vector = System.currentTimeMillis();
	   elapsed_vector_add = (eT_vector - sT_vector)/1000;
	   
	   // LinkedList
	   long sT_linkedlist = System.currentTimeMillis();
	   identity.dataupload_linkedlist(no_times); 
	   long eT_linkedlist = System.currentTimeMillis();
	   elapsed_linkedlist_add = (eT_linkedlist - sT_linkedlist)/1000;
	   
	   // Stack
	   long sT_stack = System.currentTimeMillis();
	   identity.dataupload_stack(no_times); 
	   long eT_stack = System.currentTimeMillis();
	   elapsed_stack_add = (eT_stack - sT_stack)/1000;
	   
	   // ArrayDeque
	   long sT_arraydeque = System.currentTimeMillis();
	   identity.dataupload_arraydeque(no_times); 
	   long eT_arraydeque = System.currentTimeMillis();
	   elapsed_arraydeque_add = (eT_arraydeque - sT_arraydeque)/1000;
	   
	   // Hashset
	   long sT_hashset = System.currentTimeMillis();
	   identity.dataupload_hashset(no_times); 
	   long eT_hashset = System.currentTimeMillis();
	   elapsed_hashset_add = (eT_hashset - sT_hashset)/1000;
	   
	   // LinkedHashSet
	   long sT_linkedhashset = System.currentTimeMillis();
	   identity.dataupload_linkedhashset(no_times); 
	   long eT_linkedhashset = System.currentTimeMillis();
	   elapsed_linkedhashset_add = (eT_linkedhashset - sT_linkedhashset)/1000;

	   // Print out statements
	   System.out.println("");
	   System.out.println("Time to add values for HashMap: " + elapsed_hashmap_add + " seconds"); // done
	   System.out.println("Time to add values for ArrayList: " + elapsed_arraylist_add + " seconds"); // done 
	   System.out.println("Time to add values for Vector: " + elapsed_vector_add + " seconds"); // done 
	   System.out.println("Time to add values for LinkedList: " + elapsed_linkedlist_add + " seconds"); // done 
	   System.out.println("Time to add values for Stack: " + elapsed_stack_add + " seconds"); // done 
	   System.out.println("Time to add values for ArrayDeque: " + elapsed_arraydeque_add + " seconds"); // done 
	   System.out.println("Time to add values for HashSet: " + elapsed_hashset_add + " seconds"); // done
	   System.out.println("Time to add values for LinkedHashSet: " + elapsed_linkedhashset_add + " seconds"); // done
	   
	}
    
	// This one seems like it does not need any changes
	public void ask_number_of_identities() {
		System.out.println("Welcome to the Data Structure Comparion Program");
		System.out.println("");
		System.out.print("Please enter the number of identities you would like to add into the data structure: ");
		Scanner scanner = new Scanner(System.in);
		try {
		no_times = scanner.nextInt(); // asks for how many id and passwords will be generated and added
		} catch (InputMismatchException e) {
			System.out.println("integer values only!");
			System.exit(0); // In case of value being not integer, terminates the program
		}
	}
	
	// done
	public void HashMap_check() {
		Random random = new Random();
		for (int i = 0; i < (no_times/2); i++) { 
			// I assume that in case of 100,000 user id and password being generated, 50,000 (which is 100,000/2)
			// will be needed to be retrieved from the HashMap
			Object[] rand_keys = d_hashmap.keySet().toArray();
			Object rand_key = rand_keys[random.nextInt(rand_keys.length)];
			String search_username = rand_key.toString();
			System.out.println("(HashMap) password for " + search_username + ": " + d_hashmap.get(search_username));
			// This program retrieves a random id and consequentially password from the HashMap an prints it out
		}
	}
	
	// 
    public void ArrayList_check() {
		Random random = new Random();
		for (int i = 0; i < (no_times/2); i++) {
			// I assume that in case of 100,000 user id and password being generated, 50,000 (which is 100,000/2)
			int rand_index = 0;
			int size = d_arraylist.size();
			try {
			rand_index = random.nextInt(size - 1); 
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Mistake has occured");
				System.out.println("Please try again");
				System.exit(0);
			}
			input_vars result = d_arraylist.get(rand_index);
			String id = result.id;
			String password = result.password;
				
			System.out.println("(ArrayList) password for " + id + ": " + password);
			}
		}
    
    public void Vector_check() {
    	Random random = new Random();
		for (int i = 0; i < (no_times/2); i++) {
			// I assume that in case of 100,000 user id and password being generated, 50,000 (which is 100,000/2)
			int rand_index = 0;
			int size = d_vector.size();
			try {
			rand_index = random.nextInt(size - 1); 
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Mistake has occured");
				System.out.println("Please try again");
				System.exit(0);
			}
			input_vars result = d_vector.get(rand_index);
			String id = result.id;
			String password = result.password;
				
			System.out.println("(Vector) password for " + id + ": " + password);
			}
    }
	
    public void LinkedList_check() {
    	Random random = new Random();
		for (int i = 0; i < (no_times/2); i++) {
			// I assume that in case of 100,000 user id and password being generated, 50,000 (which is 100,000/2)
			int rand_index = 0;
			int size = d_linkedlist.size();
			try {
			rand_index = random.nextInt(size - 1); 
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Mistake has occured");
				System.out.println("Please try again");
				System.exit(0);
			}
			input_vars result = d_linkedlist.get(rand_index);
			String id = result.id;
			String password = result.password;
				
			System.out.println("(LinkedList) password for " + id + ": " + password);
			}
    }
    
    public void Stack_check() {
    	Random random = new Random();
		for (int i = 0; i < (no_times/2); i++) {
			// I assume that in case of 100,000 user id and password being generated, 50,000 (which is 100,000/2)
			int rand_index = 0;
			int size = d_stack.size();
			try {
			rand_index = random.nextInt(size - 1); 
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Mistake has occured");
				System.out.println("Please try again");
				System.exit(0);
			}
			input_vars result = d_stack.get(rand_index);
			String id = result.id;
			String password = result.password;
				
			System.out.println("(Stack) password for " + id + ": " + password);
			}
    }
    
    public void ArrayDeque_check() {
    	Random random = new Random();
		for (int i = 0; i < (no_times/2); i++) {
			// I assume that in case of 100,000 user id and password being generated, 50,000 (which is 100,000/2)
			Iterator<input_vars> t_set = d_arraydeque.iterator();
			while (t_set.hasNext()) {
				input_vars var_tree = t_set.next();
				System.out.println("(ArrayDeque) password for " + var_tree.id + ": " + var_tree.password);
			}
		}
    }
    
    public void HashSet_check() {
    	Random random = new Random();
		for (int i = 0; i < (no_times/2); i++) {
			// I assume that in case of 100,000 user id and password being generated, 50,000 (which is 100,000/2)
			Iterator<input_vars> t_set = d_hashset.iterator();
			while (t_set.hasNext()) {
				input_vars var_tree = t_set.next();
				System.out.println("(Hashset) password for " + var_tree.id + ": " + var_tree.password);
			}
    }
    }
    
	// Done
	public void LinkedHashSet_check() {
		Random random = new Random();
		for (int i = 0; i < (no_times/2); i++) {
			// I assume that in case of 100,000 user id and password being generated, 50,000 (which is 100,000/2)
			Iterator<input_vars> t_set = d_linkedhashset.iterator();
			while (t_set.hasNext()) {
				input_vars var_tree = t_set.next();
				System.out.println("(LinkedHashSet) password for " + var_tree.id + ": " + var_tree.password);
			}
		}
	}
	
	public void databases_time_check() {
		long elapsed_hashmap;
		long elapsed_arraylist;
		long elapsed_vector;
		long elapsed_linkedlist;
		long elapsed_stack;
		long elapsed_arraydeque;
		long elapsed_hashset;
		long elapsed_linkedhashset;
		
		// HashMap
		long sT_hashmap = System.currentTimeMillis();
		System.out.println("Commencing the Hashmap identification retrieval");
		System.out.println("");
		HashMap_check();
		System.out.println("");
		System.out.println("Hashmap identification retrieval complete");
		System.out.println("");
		long eT_hashmap = System.currentTimeMillis();
		elapsed_hashmap = (eT_hashmap - sT_hashmap)/1000;
		
		// ArrayList
		long sT_arraylist = System.currentTimeMillis();
		System.out.println("Commencing the ArrayList identification retrieval");
		System.out.println("");
		ArrayList_check();
		System.out.println("");
		System.out.println("Arraylist identification retrieval complete");
		long eT_arraylist = System.currentTimeMillis();
		elapsed_arraylist = (eT_arraylist - sT_arraylist)/1000;
		
		// Vector
		long sT_vector = System.currentTimeMillis();
		System.out.println("Commencing the Vector identification retrieval");
		System.out.println("");
		Vector_check();
		System.out.println("");
		System.out.println("Vector identification retrieval complete");
		long eT_vector = System.currentTimeMillis();
		elapsed_vector = (eT_vector - sT_vector)/1000;
		
		// LinkedList
		long sT_linkedlist = System.currentTimeMillis();
		System.out.println("Commencing the LinkedList identification retrieval");
		System.out.println("");
		LinkedList_check();
		System.out.println("");
		System.out.println("Linkedlist identification retrieval complete");
		long eT_linkedlist = System.currentTimeMillis();
		elapsed_linkedlist = (eT_linkedlist - sT_linkedlist)/1000;
		
		// Stack
		long sT_stack = System.currentTimeMillis();
		System.out.println("Commencing the Stack identification retrieval");
		System.out.println("");
		Stack_check();
		System.out.println("");
		System.out.println("Stack identification retrieval complete");
		long eT_stack = System.currentTimeMillis();
		elapsed_stack = (eT_stack - sT_stack)/1000;
		
		// ArrayDeque
		long sT_arraydeque = System.currentTimeMillis();
		System.out.println("Commencing the ArrayDeque identification retrieval");
		System.out.println("");
		ArrayDeque_check();
		System.out.println("");
		System.out.println("ArrayDeque identification retrieval complete");
		long eT_arraydeque = System.currentTimeMillis();
		elapsed_arraydeque = (eT_arraydeque - sT_arraydeque)/1000;
		
		// HashSet
		long sT_hashset = System.currentTimeMillis();
		System.out.println("Commencing the Hashset identification retrieval");
		System.out.println("");
		HashSet_check();
		System.out.println("");
		System.out.println("Hashset identification retrieval complete");
		long eT_hashset = System.currentTimeMillis();
		elapsed_hashset = (eT_hashset - sT_hashset)/1000;
		
		// LinkedHashSet
		long sT_linkedhashset = System.currentTimeMillis();
		System.out.println("Commencing the LinkedHashSet identification retrieval");
		System.out.println("");
		LinkedHashSet_check();
		System.out.println("");
		System.out.println("LinkedHashSet identification retrieval complete");
		long eT_linkedhashset = System.currentTimeMillis();
		elapsed_linkedhashset = (eT_linkedhashset - sT_linkedhashset)/1000;
		
		System.out.println("");
		System.out.println("Time to search values for HashMap: " + elapsed_hashmap + " seconds");
		System.out.println("Time to search values for the ArrayList: " + elapsed_arraylist + " seconds");
		System.out.println("Time to search values for Vector: " + elapsed_vector + " seconds");
		System.out.println("Time to search values for the LinkedList: " + elapsed_linkedlist + " seconds");
		System.out.println("Time to search values for Stack: " + elapsed_stack + " seconds");
		System.out.println("Time to search values for the ArrayDeque: " + elapsed_arraydeque + " seconds");
		System.out.println("Time to search values for HashSet: " + elapsed_hashset + " seconds");
		System.out.println("Time to search values for the LinkedHashSet: " + elapsed_linkedhashset + " seconds");
		
	}
	public void remove_check() {
		
		// Hashmap
		long sT_hashmap = System.currentTimeMillis();
		System.out.println("Commencing the Hashmap identification removal procedure");
		System.out.println("");
		Hashmap_remove();
		System.out.println("");
		System.out.println("Hashmap identification removal procedure complete");
		long eT_hashmap = System.currentTimeMillis();
		elapsed_hashmap = (eT_hashmap - sT_hashmap)/1000;
		
		// ArrayList
		long sT_arraylist = System.currentTimeMillis();
		System.out.println("Commencing the ArrayList identification removal procedure");
		System.out.println("");
		ArrayList_remove();
		System.out.println("");
		System.out.println("Arraylist identification removal procedure complete");
		long eT_arraylist = System.currentTimeMillis();
		elapsed_arraylist = (eT_arraylist - sT_arraylist)/1000;
		
		// Vector
		long sT_vector = System.currentTimeMillis();
		System.out.println("Commencing the ArrayList identification removal procedure");
		System.out.println("");
		ArrayList_remove();
		System.out.println("");
		System.out.println("Arraylist identification removal procedure complete");
		long eT_vector = System.currentTimeMillis();
		elapsed_vector = (eT_vector - sT_vector)/1000;
		
		// LinkedList
		long sT_linkedlist = System.currentTimeMillis();
		System.out.println("Commencing the ArrayList identification removal procedure");
		System.out.println("");
		ArrayList_remove();
		System.out.println("");
		System.out.println("Arraylist identification removal procedure complete");
		long eT_linkedlist = System.currentTimeMillis();
		elapsed_linkedlist = (eT_linkedlist - sT_linkedlist)/1000;
		
		// Stack
		long sT_stack = System.currentTimeMillis();
		System.out.println("Commencing the ArrayList identification removal procedure");
		System.out.println("");
		ArrayList_remove();
		System.out.println("");
		System.out.println("Arraylist identification removal procedure complete");
		long eT_stack = System.currentTimeMillis();
		elapsed_stack = (eT_stack - sT_stack)/1000;
				
		// ArrayDeque
		long sT_arraydeque = System.currentTimeMillis();
		System.out.println("Commencing the ArrayList identification removal procedure");
		System.out.println("");
		ArrayList_remove();
		System.out.println("");
		System.out.println("Arraylist identification removal procedure complete");
		long eT_arraydeque = System.currentTimeMillis();
		elapsed_arraydeque = (eT_arraydeque - sT_arraydeque)/1000;
				
		// HashSet
		long sT_hashset = System.currentTimeMillis();
		System.out.println("Commencing the ArrayList identification removal procedure");
		System.out.println("");
		ArrayList_remove();
		System.out.println("");
		System.out.println("Arraylist identification removal procedure complete");
		long eT_hashset = System.currentTimeMillis();
		elapsed_hashset = (eT_hashset - sT_hashset)/1000;
				
		// LinkedHashSet
		long sT_linkedhashset = System.currentTimeMillis();
		System.out.println("Commencing the ArrayList identification removal procedure");
		System.out.println("");
		ArrayList_remove();
		System.out.println("");
		System.out.println("Arraylist identification removal procedure complete");
		long eT_linkedhashset = System.currentTimeMillis();
		elapsed_linkedhashset = (eT_linkedhashset - sT_linkedhashset)/1000;
		
		// Print out
		System.out.println("");
		System.out.println("Time to remove values for HashMap: " + elapsed_hashmap + " seconds");
		System.out.println("Time to remove values for ArrayList: " + elapsed_arraylist + " seconds");
		System.out.println("Time to remove values for Vector: " + elapsed_vector + " seconds");
		System.out.println("Time to remove values for LinkedList: " + elapsed_linkedlist + " seconds");
		System.out.println("Time to remove values for Stack: " + elapsed_stack + " seconds");
		System.out.println("Time to remove values for ArrayDeque: " + elapsed_arraydeque + " seconds");
		System.out.println("Time to remove values for HashSet " + elapsed_hashset + " seconds");
		System.out.println("Time to remove values for LinkedHashSet: " + elapsed_linkedhashset + " seconds");
		
	}
	public void Hashmap_remove() {
		Random random = new Random();
		for (int i=0; i < no_times/10; i++) {
		Object[] rand_keys = d_hashmap.keySet().toArray();
		Object rand_key = rand_keys[random.nextInt(rand_keys.length)];
		String search_username = rand_key.toString();
		System.out.println("removed value id: " + search_username + ", password:  " + d_hashmap.remove(search_username));
		// Same procedure as getting the id and password, but instead removes the random value from the HashMap
		}
	}
	
	public void ArrayList_remove() {
		Random random = new Random();
		for (int i = 0; i < (no_times/10); i++) {
			int ar_size = d_arraylist.size();
			int rand_index = random.nextInt(ar_size - 1);
            input_vars var = d_arraylist.remove(rand_index);
			String id = var.id;
			String password = var.password;
			System.out.println("id removed: " + id);
			System.out.println("password removed: " + password);
    }
    }
	
	public void Vector_remove() {
		Random random = new Random();
		for (int i = 0; i < (no_times/10); i++) {
			int size = d_vector.size();
			int rand_index = random.nextInt(size - 1);
            input_vars var = d_vector.remove(rand_index);
			String id = var.id;
			String password = var.password;
			System.out.println("id removed: " + id);
			System.out.println("password removed: " + password);
    }
    }
	
	public void LinkedList_remove() {
		Random random = new Random();
		for (int i = 0; i < (no_times/10); i++) {
			int size = d_linkedlist.size();
			int rand_index = random.nextInt(size - 1);
            input_vars var = d_linkedlist.remove(rand_index);
			String id = var.id;
			String password = var.password;
			System.out.println("id removed: " + id);
			System.out.println("password removed: " + password);
    }
    }
	
	public void Stack_remove() {
		Random random = new Random();
		for (int i = 0; i < (no_times/10); i++) {
			int size = d_stack.size();
			int rand_index = random.nextInt(size - 1);
            input_vars var = d_stack.remove(rand_index);
			String id = var.id;
			String password = var.password;
			System.out.println("id removed: " + id);
			System.out.println("password removed: " + password);
    }
    }
	
	public void ArrayDeque_remove() {
		Random random = new Random();
		for (int i = 0; i < (no_times/10); i++) {
			int size = d_arraydeque.size();
			int rand_index = random.nextInt(size - 1);
            input_vars var = d_arraydeque.remove();
			String id = var.id;
			String password = var.password;
			System.out.println("id removed: " + id);
			System.out.println("password removed: " + password);
    }
    }
	
	public void Hashset_remove() {
		Random random = new Random();
		for (int i = 0; i < (no_times/10); i++) {
			int size = d_hashset.size();
			int rand_index = random.nextInt(size - 1);
			Iterator<input_vars> iter = d_hashset.iterator();
            input_vars var = iter.next();
			String id = var.id;
			String password = var.password;
			System.out.println("id removed: " + id);
			System.out.println("password removed: " + password);
    }
    }
	
	public void LinkedHashSet_remove() {
		Random random = new Random();
		for (int i = 0; i < (no_times/10); i++) {
			int size = d_linkedhashset.size();
			int rand_index = random.nextInt(size - 1);
			Iterator<input_vars> iter = d_linkedhashset.iterator();
            input_vars var = iter.next();
			String id = var.id;
			String password = var.password;
			System.out.println("id removed: " + id);
			System.out.println("password removed: " + password);
    }
    }
	
	public void essentials() {
		ask_number_of_identities();
		initial_add();
		comparison();
		choice();
	}
	public void choice() {
		System.out.println("What action would you like to perform next: ");
		System.out.println("");
		System.out.println("1 - check data structures passwords by their id (time measurement included)");
		System.out.println("");
		System.out.println("2 - remove from databases structures id's and passwords assigned for them (time measurement included)");
		System.out.println("");
		System.out.println("Note: time for adding values for data structures is measured by default");
		System.out.print("Choice: ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		if (choice.equals("1")) {
			databases_time_check();
		} if (choice.equals("2")) {
			remove_check();
		} else if (!choice.equals("1") && !choice.equals("2")) {
			System.out.println("The value you have provided does not exist. Please try again");
		}
		comparison();
		// This program asks for which action user would like to perform, either get the identifications or remove them 
		// also provides the time for each database to process the information and outputs the final verdict on which is faster
	}

	public void comparison() {
		System.out.println("");
		ArrayList<Long> times = new ArrayList<Long>();
		times.add(elapsed_hashmap);
		times.add(elapsed_arraylist);
		times.add(elapsed_linkedhashset);
		times.add(elapsed_hashset);
		times.add(elapsed_arraydeque);
		times.add(elapsed_stack);
		times.add(elapsed_vector);
		times.add(elapsed_linkedlist);
		Long i = Collections.max(times);
		
		if (i == elapsed_hashmap) {
			System.out.println("Most effectice structure in respect to time is: " + i + "  for the hashmap");
		} else if (i == elapsed_arraylist) {
			System.out.println("Most effectice structure in respect to time is: " + i + "  for the arraylist");
		} else if (i == elapsed_linkedhashset) {
			System.out.println("Most effectice structure in respect to time is: " + i + "  for the linkedhashset");
		} else if (i == elapsed_hashset) {
			System.out.println("Most effectice structure in respect to time is: " + i + "  for the hashset");
		} else if (i == elapsed_arraydeque) {
			System.out.println("Most effectice structure in respect to time is: " + i + "  for the arraydeque");
		} else if (i == elapsed_stack) {
			System.out.println("Most effectice structure in respect to time is: " + i + "  for the stack");
		} else if (i == elapsed_vector) {
			System.out.println("Most effectice structure in respect to time is: " + i + "  for the vector");
		} else if (i == elapsed_linkedlist) {
			System.out.println("Most effectice structure in respect to time is: " + i + "  for the linkedlist");
		} else {
			System.out.println("Mistake has occured");
		}
		
		
		
	}
}

