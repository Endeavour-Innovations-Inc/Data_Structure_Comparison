package Project;

//Albert Lipaev
//Email: allipaev.lipaev@bellevuecollege.edu; phone: +1(425)647-5592
//Student it: 950-67-9663
//11/24/2018
//This is the New_Random class which generates the id and passwords and inputs it into the databases
// This class has been upgraded


import java.util.*;

class input_vars {
	String id;
	String password;
	
	public input_vars(String id, String password) {
		this.id = id;
		this.password = password;
	}
}

class num_gen extends Project_initialization {
String id;
String password;
Random random = new Random();

String letter_gen() {
	// Random random = new Random();
	String symbols = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char one_string = symbols.charAt(random.nextInt(symbols.length()));
	String final_string = Character.toString(one_string);
	return final_string;
}

String id() {
	// Random random = new Random();
	   String a = letter_gen();
	   String b = letter_gen();
	   String c = letter_gen();
	   String d = letter_gen();
	   String e = letter_gen();
	   String f = letter_gen();
	   String g = letter_gen();
	   String h = letter_gen();
	   String l = letter_gen();
	   String m = letter_gen();
	   int decision = random.nextInt(7);
	   String id = null;
	   if (decision == 0) {
		   id = a + b + c + d;
	   }
	   if (decision == 1) {
		   id = a + b + c + d + e;
	   }
	   if (decision == 2) {
		   id = a + b + c + d + e + f;
	   }
	   if (decision == 3) {
		   id = a + b + c + d + e + f + g;
	   }
	   if (decision == 4) {
		   id = a + b + c + d + e + f + g + h;
	   }
	   if (decision == 5) {
		   id = a + b + c + d + e + f + g + h + l;
	   }
	   if (decision == 6) {
		   id = a + b + c + d + e + f + g + h + l + m;
	   }
	   return id; // return id consisting of the several randomly generated symbol in the various length
}

String password() {
	   String A = letter_gen();
	   String B = letter_gen();
	   String C = letter_gen();
	   String D = letter_gen();
	   String E = letter_gen();
	   String F = letter_gen();
	   String G = letter_gen();
	   String H = letter_gen();
	   String L = letter_gen();
	   String M = letter_gen();
	   int decision = random.nextInt(7);
	   String password = null;
	   if (decision == 0) {
		   password = A + B + C + D;
	   }
	   if (decision == 1) {
		   password = A + B + C + D + E;
	   }
	   if (decision == 2) {
		   password = A + B + C + D + E + F;
	   }
	   if (decision == 3) {
		   password = A + B + C + D + E + F + G;
	   }
	   if (decision == 4) {
		   password = A + B + C + D + E + F + G + H;
	   }
	   if (decision == 5) {
		   password = A + B + C + D + E + F + G + H + L;
	   }
	   if (decision == 6) {
		   password = A + B + C + D + E + F + G + H + L + M;
	   }
	   return password; // return password consisting of the several randomly generated symbol in the various length 
}

void dataupload_hashmap(int no_times) { // sort of similar to the login/password system
	for (int i=0; i < no_times; i++) {
		String id_input = id();
		String password_input = password();
		d_hashmap.put(id_input, password_input);
	}
}
void dataupload_arraylist(int no_times) { // faster alternative to the array
	for (int i=0; i < no_times; i++) {
		input_vars x = new input_vars(id(), password());
		d_arraylist.add(x);
}
}

void dataupload_hashset(int no_times) { // doesn't allow duplicates
	for (int i=0; i < no_times; i++) {
		input_vars x = new input_vars(id(), password());
		d_hashset.add(x);
}
}

void dataupload_linkedlist(int no_times) { // when memory is important, linked list is the most effective 
	for (int i=0; i < no_times; i++) {
		input_vars x = new input_vars(id(), password());
        d_linkedlist.add(x);
}
}

void dataupload_vector(int no_times) {
	for (int i=0; i < no_times; i++) {
		input_vars x = new input_vars(id(), password());
		d_vector.add(x);
}
}

void dataupload_stack(int no_times) {
	for (int i=0; i < no_times; i++) {
		input_vars x = new input_vars(id(), password());
		d_stack.push(x);
}
}


void dataupload_arraydeque(int no_times) {
	for (int i=0; i < no_times; i++) {
		input_vars x = new input_vars(id(), password());
		d_arraydeque.add(x);
}
}
	
void dataupload_linkedhashset(int no_times) {
	for (int i=0; i < no_times; i++) {
		input_vars x = new input_vars(id(), password());
		d_linkedhashset.add(x);
}
}
}