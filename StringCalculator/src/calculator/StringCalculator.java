package calculator;

public class StringCalculator {

	public int add(String numbers) {
		// TODO Auto-generated method stub
		if (numbers.isEmpty())
			return 0;
		else if (numbers.contains(",")) {
			String [] allNumbers = numbers.split(",");
			return Integer.parseInt(allNumbers[0])+Integer.parseInt(allNumbers[1]);
		}
		else
			return Integer.parseInt(numbers);
	}

}
