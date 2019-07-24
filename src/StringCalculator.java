
public class StringCalculator {


	public static String add(String number) {
		if (number == null) {
			return "0";
		}
		if (number.contains("\n")) {
			number = number.replace('\n', ',');
		}
		
//		String fixed = "";
//		for (int i = 0; i < number.length(); ++i) {
//			if (number.substring(i, i + 1).matches("\\d")) {
//				String temp = number.substring(i, i + 1);
//				fixed += temp + ",";
//			} 
//		} number = fixed;
		
		if (number.endsWith("\\D")) {
			number = number.substring(0, (number.length() - 1));
		}

		String[] numbers = number.split(",");
		//System.out.println(numbers[0] + numbers[1]);
		double sum = 0.0;
		
		if (number.isEmpty()) {
			return "0";
		} else if (number.matches("\\d")) {
			return number;
		} else {
			for (String a : numbers) {
				double b = Double.parseDouble(a);
				sum += b;
			} return (String.valueOf(sum));
		}
	}
	
	
	
}//class
