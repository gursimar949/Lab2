package main.java.edu.ben.lab_2;

public class Conditional {

	public static String myConditional(int value) {
		if (value > 0)
			return "Positive";
		else if (value < 0)
			return "Negative";
		else
			return "0";
	}

	public static String mySwitch(int value) {
		switch (value) {
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		default:
			return "Invalid";
		}
	}

	public static String myTernary(int value) {
		return value >= 0 ? "whole number" : "negative integer";
	}

}
