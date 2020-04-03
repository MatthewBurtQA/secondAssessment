package com.qa.testdrivendevelopment;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}


	/**
	 * Given a string and a char, returns the position in the String where the char first appears.
	 * Ensure the positions are numbered correctly, please refer to the examples for guidance. <br>
	 * Do not ignore case <br>
	 * Ignore whitespace <br>
	 * If the char does not occur, return the number -1. <br>
	 * <br>
	 * For Example: <br>
	 * returnPosition("This is a Sentence",'s') → 4 <br>
	 * returnPosition("This is a Sentence",'S') → 8 <br>
	 * returnPosition("Fridge for sale",'z') → -1
	 */
	public int returnPosition(String input, char letter) {
		return -1;
	}

	/**
	 * Given two Strings of equal length, 'merge' them into one String.
	 * Do this by 'zipping' the Strings together. <br>
	 * Start with the first char of the first String. <br>
	 * Then add the first char from the second String. <br>
	 * Then add the second char from the first String. <br>
	 * And so on. <br>
	 * Maintain case. <br>
	 * You will not encounter whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * zipped("String","Fridge") → "SFtrriidngge" <br>
	 * zipped("Dog","Cat") → "DCoagt"<br>
	 * zipped("True","Tree") → "TTrrueee" <br>
	 * zipped("return","letter") → "rleettutrenr" <br>
	 */
	public String zipped(String input1, String input2) { // have done this one before at uni but with ints return string, use string builder iirc? lets try that?
		// Come back to me, reread the JavaDoc on StringBuilders then attempt. . . you can do this chief cmon. Kongurei. 
		StringBuilder buildyboi = new StringBuilder(); // place holder value 
		
		String output = ""; // might not even be necessary.
		
		if (input1.length() == input2.length()){
			for(int i = 0; i < input1.length(); i++){
				//buildyboi.append(input1.charAt(i) + input2.charAt(i)); // this doesn't work, do individual calls i guess?
				buildyboi.append(input1.charAt(i));
				buildyboi.append(input2.charAt(i));
				
			}
		}
		return buildyboi.toString();
	}

	
	/**
	 * Given an Array of Strings, remove any duplicate Strings that occur, then return the Array. <br>
	 * Do not ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * removeDuplicates({"Dog"}) → {"Dog"} <br>
	 * removeDuplicates({"Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","DoG","Cat"}) → {"Dog","DoG","Cat"} 
	 */
	public String[] removeDuplicates(String[] stringArray) {
		String[] resultSet = new String[stringArray.length];
		//maybe i = 1 so i can check index 1 against index 0
		//what about j = 1, i = 0? 
		int j = 1;
		for (int i = 1;  i < stringArray.length; i++){
		// could be easier using decrement instead of increment. gah. this has taken too long to try and sort and now i have no time for anything else. wonderful.
				
				if(stringArray[i] != stringArray[i-1]){
					resultSet[i] = stringArray[i];
				}
				
				
				
		}
		return resultSet;
		
	}

	/**
	 * Given a large string that represents a csv (comma separated values), the structure of each record will be as follows:
	 * owner,nameOfFile,encrypted?,fileSize <br>
	 * <br>
	 * Example:
	 * "Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445" <br>
	 * <br>
	 * Where a comma separates out the fields, and the \n represents a new line. <br>
	 * For each record, if it is not encrypted, return the names of the owners of the files in a String Array. <br>
	 * Do not include duplicate names. <br>
	 * <br>
	 * For Example: <br>
	 * csvScan("Jeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,True,1318\nJeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,False,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445") → {"Bert","Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445") → {"Bert","Jeff"}
	 */
	public String[] csvScan(String csvInput) {
		return null;
	}

	
	/**
	 * Write a function to randomly generate a list with 5 even numbers between 100 and 200 inclusive. <br>
	 *  <br>
	 * For Example:     <br>
	 * listGen() → {100,102,122,198,200}  <br>
	 * listGen() → {108,104,106,188,200}  <br>
	 * listGen() → {154,102,132,178,164}
	 */
	public int[] listGen() { // needs math.rand()
		int rando = 0;
		int min = 100;
		int max = 200;
		int i = 0;
		
		int[] returnArray = new int[5];
		
		
		while(returnArray.length == 0 && returnArray.length != 5){
			rando = (int) Math.random() * (max - min) + min;
			if(rando % 1 != 0){
				returnArray[i] = rando;
			}
		}
		
		
		return returnArray;
	}


	/**
	 * A prime number is one which is only divisible by one and itself.  <br>
	 * Write a function which returns the boolean True if a number is prime, and the boolean False if not. <br>
	 *  <br>
	 * For Example: <br>
	 * isPrime(3) → True <br>
	 * isPrime(8) → False
	 */
	public boolean isPrime(int num) { 
		
		//prelim checks...
		// 0 and one aren't prime are they?
		
		if (num == 0){
			return false;
		}
		
		if (num == 1){
			return false;
		}
		//prof.Leslie did this in second year...he did something to do with 2 being dodgy
		// two is first prime but...what...
		//and then..something to do with square roots being involved in primes...
		//summer, you sat in the circular lecture theatre. remember.  something to do with sqrt.
		// ok you can't remember and that's ok, brute force works too. if i = math.sqrt doesn't work, try all
		// logical operators until something passes that bloody junit test.
		// ok that worked. Lesson learned: When in doubt, just brute force all possible
		// permutations until something works.
		for (int i = 2; i <= Math.sqrt(num); i++){
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}

	/**
	 * Wrtie a function which returns the number of vowels in a given string.  <br>
	 * You should ignore case. <br>
	 *  <br>
	 * For Example: <br>
	 * getVowel("Hello") → 2  <br>
	 * getVowel("hEelLoooO") → 6
	 */
	public int getVowel(String input) {
		
		int charCount = 0;
		
		 // could have used the case method for ignoring case but last time it went funny
		
			for (int i = 0; i < input.length(); i++){ // sorted. this one works. 
				if(input.charAt(i) == 'A'  || input.charAt(i) == 'a' ||
						   input.charAt(i) == 'E'  || input.charAt(i) == 'e' ||
						   input.charAt(i) == 'I'  || input.charAt(i) == 'i' ||  
						   input.charAt(i) == 'O'  || input.charAt(i) == 'o' ||
						   input.charAt(i) == 'U'  || input.charAt(i) == 'u'){
							
							   charCount++;
						}
			}
		
		return charCount;
		
	}

	/**
	 * Given two string inputs, if one can be made from the other return the boolean True, if not return the boolean False.  <br>
	 *  <br>
	 * For Example:  <br>
	 * wordFinder("dog", "god") → True  <br>
	 * wordFinder("tiredest", "tree") → True  <br>
	 * wordFinder("dog", "cat") → False  <br>
	 * wordFinder("tripping", "gin") → True
	 */
	public boolean wordFinder(String initialWord, String madeString) {
		
		return false;
	}
	

	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which is used to determine which order "ei" or "ie" should be in a word.  <br>
	 *  <br>
	 * Write a function which returns the boolean True if a string follows the mnemonic, and returns the boolean False if not.  <br>
	 *  <br>
	 * For Example:  <br>
	 * iBeforeE("ceiling") → True  <br>
	 * iBeforeE("believe") → True  <br>
	 * iBeforeE("glacier") → False  <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {
		
		
		return false;
	}

	/**
	 * 	A factorial is the product of itself and all previous numbers  <br>
	 * eg 3 factorial is 1 x 2 x 3 = 6  <br>
	 *  <br>
	 * Write a function which can compute the factorial of a given number between 1 and 10 inclusive.   <br>
	 *   <br>
	 * For Example:  <br>
	 * factorial(1) → 1  <br>
	 * factorial(4) → 24  <br>
	 * factorial(8) → 40320
	 */
	public int factorial(int number) {
		int factorial = 1; // will be used for storing and return result chief . . . 0 caused some issues
		//if ( number <= 10 ){ // was gunna add this for validation too
	
		
		
		for(int i = 1; i <= number; i++){
				factorial = factorial * i; // just like earlier this week
			}
		//}
		return factorial;
	}

}
