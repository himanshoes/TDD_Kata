package calculator;

public class StringCalculator {

	public int add(String numbers) {
		// TODO Auto-generated method stub
		if (numbers.isEmpty())
			return 0;
		else if (numbers.contains(",")) {
			String [] allNumbers = numbers.split(",");
			return parseStringToInteger(allNumbers[0])+parseStringToInteger(allNumbers[1]);
		}
		else
			return parseStringToInteger(numbers);
	}
	
	public int parseStringToInteger(String str) {
		return Integer.parseInt(str);
	}

}
