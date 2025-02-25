public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(countWords("e e e e e e e e", 'e'));
	}

	public static boolean isPalindrome(String word) {
		word = word.replaceAll(" ", "");
		word = word.toLowerCase();
		int len = word.length();
		int last_ind = len - 1;
		for (int f = 0; f < last_ind; f++) {
			int b = last_ind - f;
			if (b <= f) {
				System.out.println("Break!" + b + " <= " + f);
				break;
			}
			System.out.println(word.charAt(f) + " vs " + word.charAt(b));
			if (word.charAt(f) != word.charAt(b)) {
				return false;
			}
		}

		return true;

	}

	public static int find(String[] names, String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public static int getAge(String[] names, int[] ages, String name) {
		return ages[find(names, name)];
	}

	public static void insert(int[] t, int val) {
		for (int i = 1; i < t.length; i++) {
			if (t[i] == 0) {
				t[i] = val;
				return;
			}
		}
	}

	public static int countWords(String sentence, char thisChar) {
		String thisString = String.valueOf(thisChar);
		int len = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.substring(i, i+1).equals(" ")) {
				len += 1;
			}
		}
		int[] whitespaceIndices = new int[len + 2];
		whitespaceIndices[0] = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.substring(i, i+1).equals(" ")) {
				insert(whitespaceIndices, i+1);
			}
		}
		whitespaceIndices[len + 1] = sentence.length(); 
		int count = 0;
		for (int i = 0; i < whitespaceIndices.length - 1; i++) {
			String word = sentence.substring(whitespaceIndices[i], whitespaceIndices[i + 1]);
			if (word.indexOf(thisString) >= 0) {
				System.out.println("found in word: " + word + " at " + word.indexOf(thisString));
				count += 1;
				continue;
			}
			System.out.println("not found in word: " + word + "sub:" + whitespaceIndices[i] + ", " + whitespaceIndices[i + 1]);
		}

		
		System.out.println("Word count:" + whitespaceIndices.length + " find:" + thisString);
		return count;
	}



}

/*
# Instructions  

  ## Questions

1. Write a method called isPalindrome(String word)</br>
It takes in a word and checks if it is a palindrome.</br>
A palindrome means that the characters are the same forwards and backwards, ignoring spaces.</br>


Examples of palindromes:</br>


- racecar</br>
- was it a car or a cat I saw</br>
- never odd or even</br>
- rats live on no evil star</br>


Your check should be case **insensitive** and should ignore spaces.  For example, "Bob" is a palindrome, despite the first B being capitalized.
Your method will return true if it's a palindrome false otherwise.

2. Create a function called _getAge()_, which takes in a String array (names), integer array (ages) and String (name) as parameters.
Names and ages are parallel arrays.  Return the age associated with the name.

3. Create a function called _countWords()_</br>
It takes in a String and a character as parameters.</br>
Return how many words in the string contain the letter.</br>
*/