package calculator;

import java.util.Arrays;

public class StringCalculator {

	public int add(String numbers) {
		// TODO Auto-generated method stub
		if (numbers.isEmpty())
			return 0;
		else if (numbers.contains(",")) {
			String [] allNumbersInString = numbers.split(",|\n");
			int [] allNumbersInInteger = Arrays.stream(allNumbersInString).mapToInt(Integer::parseInt).toArray();
			
			return Arrays.stream(allNumbersInInteger).sum();
		}
		else
			return Integer.parseInt(numbers);
	}
	

}
