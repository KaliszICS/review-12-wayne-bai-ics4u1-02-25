
class Notes {
	public static void main(String[] args) {
		//iterating

		int[] arr = {1, 3, 5};

		//iterate going forwards
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	

		//iterate going backwards
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); //going forwards
			System.out.println(arr[arr.length - 1 - i]); //going backwards
		}

		//parallel array

		String[] arr2  = {"one", "three", "five"};

		String word = "three";

		int index = -1;

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i].equals(word)) {
				index = i;
			}
		}

		System.out.println(arr[index]  + " is associated with " + arr2[index]);

		//swaps need to be done to both arrays

		int temp = arr[index];
		arr[index] = arr[0];
		arr[0] = temp;

		String temp1 = arr2[index];
		arr2[index] = arr2[0];
		arr2[0] = temp1;

		System.out.println(arr[index]  + " is associated with " + arr2[index]);


		//Split

		String phrase = "Hello There Young Fellow";

		String[] phraseArr = phrase.split(" "); //each element is an inividual word
		// String[] phraseArr = phrase.split("l"); //removes all l's and create elements of characters between them
		// String[] phraseArr = phrase.split(""); //Every character

		for (int i = 0; i < phraseArr.length; i++) {
			System.out.println(phraseArr[i]);
		}
	}
}
