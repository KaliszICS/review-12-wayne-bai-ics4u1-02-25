
class Notes {
	public static void main(String[] args) {
		//iterating

		int[] arr = {1, 3, 5};

		//forwards

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		//backwards
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

		//both

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println(arr[arr.length - 1 - i]);
		}

		//parallel arrays

		String[] arr2 = {"one", "three", "five"};

		String word = "three";
		int index = -1;

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i].equals(word)) {
				index = i;
			}
		}

		System.out.println(arr[index] + " is associated with " + arr2[index]);

		//swaps need to be done to both arrays

		int temp = arr[index];
		arr[index] = arr[0];
		arr[0] = temp;

		String temp1 = arr2[index];
		arr2[index] = arr2[0];
		arr2[0] = temp1;

		//Split - String method - creates an array based on a delimiter

		String phrase = "Hello There Young Fellow";

		//delimiter character will always be removed
		String[] phraseArr = phrase.split(" ");
		//String[] phraseArr = phrase.split("e");
		//String[] phraseArr = phrase.split(""); //splits every character into its own index

		for (int i = 0; i < phraseArr.length; i++) {
			System.out.println(phraseArr[i]);
		}


	}	
}
