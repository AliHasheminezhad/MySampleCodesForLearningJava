package ca.mysamplecodes.javase;

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		
		// Range from -128 to 127
		byte byteNumber = 50;
		
		// Range from -32,768 to 32,767
		short shortNumber = 32765;
		
		// Range from -(2 to the power of 31) to (2 to the power of 31) - 1
		//
		// If you use more than the capacity of signed int (or long) it will be considered unsigned automatically
		//
		// Underscore is used to improve readability of the code
		// You can only use underscores between digits. NOT:
		// * At the beginning or end of a number
		// * Adjacent to a decimal point in a floating point literal
		// * Prior to an F or L suffix
		// * In positions where a string of digits is expected
		int intNumber = 57_568_000;
		
		// If we do not use "L" or "l" after a long number, it will be considered as an int
		// "L" is used by convention
		long longNumber = 9__651__862__855__555L;
		
		// If we do not use "F" or "f" after a float number, it will be considered as a double
		// then because double cannot be casted to a float, we will get a syntax error
		// "F" is used by convention
		float floatNumber = 3.14159F;
		
		// Using a "D" or "d" after a double number is optional
		double doubleNumber = 59.5182176D;
		
		char charCharacter = 'A';
		
		boolean booleanValue = true;
	}
}
