import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		System.out.println("sumEven");
		int sumEven = new ArrayListExample().sumEvenIndexes(new int[] { 1, 2, 3, 4 });
		System.out.println(sumEven);
		sumEven = new ArrayListExample().sumEvenIndexes(new int[] { 8, 16, 10 });
		System.out.println(sumEven);
		sumEven = new ArrayListExample().sumEvenIndexes(new int[] { 5, 0, -10 });
		System.out.println(sumEven);
		System.out.println("evenCount");
		int evenCount = new ArrayListExample().evenCount(new int[] { 1, 2, 3, 4 });
		System.out.println(evenCount);
		evenCount = new ArrayListExample().evenCount(new int[] { 8, 16, 10 });
		System.out.println(evenCount);
		evenCount = new ArrayListExample().evenCount(new int[] { 5, 0, 22 });
		System.out.println(evenCount);
		System.out.println("Backwords");
		String[] x = new ArrayListExample().backwardChars("Career Center");
		printArray(x);
		x = new ArrayListExample().backwardChars("football");
		System.out.println();
		printArray(x);
		x = new ArrayListExample().backwardChars("?");
		System.out.println();
		printArray(x);
		String[] y = new ArrayListExample().catty(new String[] { "buffalo", "dog" });
		System.out.println();
		printArray(y);
		y = new ArrayListExample().catty(new String[] { "bobcat", "siamese cat", "catbird" });
		System.out.println();
		printArray(y);
		y = new ArrayListExample().catty(new String[] { "Cat", "frog", "mouse" });
		System.out.println();
		printArray(y);
	}

	public static void printArray(String[] args) {
		System.out.print("[ ");
		for (int i = 0; i < args.length; i++) {
			System.out.print("\"" + args[i] + "\" ");
		}
		System.out.print("]");
	}

	public int sumEvenIndexes(int[] nums) {

		ArrayList<Integer> numsList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			numsList.add(nums[i]);
		}

		return sumEvenIndexesB(numsList);
	}

	public int sumEvenIndexesB(ArrayList<Integer> numsList) {
		int sum = 0;
		for (int i = 0; i < numsList.size(); i++) {
			if (i % 2 == 0) {
				sum += numsList.get(i);
			}
		}
		return sum;
	}

	public int evenCount(int[] nums) {

		ArrayList<Integer> numsList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			numsList.add(nums[i]);
		}

		return evenCountB(numsList);
	}

	public int evenCountB(ArrayList<Integer> numsList) {
		int sumEven = 0;
		for (int value : numsList) {
			if (value % 2 == 0) {
				sumEven += value;
			}
		}
		return sumEven;
	}

	public String[] backwardChars(String str) {

		ArrayList<String> charsList = backwardCharsB(str);

		String chars[] = new String[charsList.size()];
		for (int i = 0; i < charsList.size(); i++) {
			chars[i] = charsList.get(i);
		}

		return chars;
	}

	public ArrayList<String> backwardCharsB(String str) {

		ArrayList<String> charList = new ArrayList<String>();

		for (int i = str.length() - 1; i >= 0; i--) {
			charList.add(str.charAt(i) + "");

		}

		return charList;
	}

	public String[] catty(String[] animals) {

		ArrayList<String> animalsList = new ArrayList<String>();
		for (int i = 0; i < animals.length; i++) {
			animalsList.add(animals[i]);
		}

		ArrayList<String> catsList = cattyB(animalsList);

		String cats[] = new String[catsList.size()];
		for (int i = 0; i < catsList.size(); i++) {
			cats[i] = catsList.get(i);
		}

		return cats;
	}

	public ArrayList<String> cattyB(ArrayList<String> animalsList) {

		ArrayList<String> catsList = new ArrayList<String>();

		for (int i = 0; i < animalsList.size(); i++) {
			String value = animalsList.get(i);
			if (value.toLowerCase().contains("cat")) {
				catsList.add(value);
			}

		}

		return catsList;
	}

}
