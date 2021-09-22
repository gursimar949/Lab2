package main.java.edu.ben.lab_2;

public class Loop {

	public static int myForLoop(int[] values) {
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] > 5)
				count++;
		}
		return count;
	}

	public static int myEnhancedForLoop(int[] values) {
		int count = 0;
		for (int value : values) {
			if (value % 3 == 0)
				count++;
		}
		return count;
	}

	public static int myWhileLoop(int[] values) {
		int sum = 0;
		int i = 0;
		while (sum <= 50) {
			if (values[i] > 3)
				sum += values[i];
			i++;
		}
		return sum;
	}

	public static int myDoWhileLoop(int[] values) {
		int sum = values[0];
		int i = 1;

		do {
			if (values[i] > 3)
				sum += values[i];
			i++;
		} while (sum <= 50);
		return sum;
	}

}
