
public class DataTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assignment for today is 24th march
		// Try all the conversion from String to all premitive datatype.

		// string to int
		String s = "123";// try it with value as "hemant" will throw you an errror.
		int i = Integer.parseInt(s);
		System.out.println("string is" + s);
		System.out.println("int is" + i);

		// string to double
		Double d = Double.parseDouble(s);
		System.out.println("double is" + d);

		// string to char ERROR
		/*
		 Character c=Character.parseCharacter(s); System.out.println("chart is"+c);
		 */

		// string to short
		Short sh = Short.parseShort(s);
		System.out.println("short is " + sh);

		// String to bye
		Byte by = Byte.parseByte(s);
		System.out.println("byte is " + by);

		// String to long
		Long l = Long.parseLong(s);
		System.out.println("long is " + l);

		// String to Float
		Float f = Float.parseFloat(s);
		System.out.println("float is " + f);

		// String to Boolean
		Boolean b = Boolean.parseBoolean(s);
		System.out.println("boolean is " + b);

	}

}
