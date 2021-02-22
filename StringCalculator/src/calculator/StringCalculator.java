package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	public int add(String numbers) {
		// TODO Auto-generated method stub
		if (numbers.isEmpty())
			return 0;
		else if (Pattern.compile("\\W").matcher(numbers).find()) {
			String [] allNumbersInString = stringSplitter(numbers);
			int [] allNumbersInInteger = Arrays.stream(allNumbersInString).mapToInt(Integer::parseInt).toArray();
			
			return Arrays.stream(allNumbersInInteger).sum();
		}
		else {
			if (Integer.parseInt(numbers)<0)
				throw new RuntimeException("Negatives not allowed: "+numbers);
			else
				return Integer.parseInt(numbers);
		}
			
	}
	
	public String [] stringSplitter(String passedNumbers) {
		if (passedNumbers.startsWith("//")) {
			Matcher match = Pattern.compile("//(.)\n(.*)").matcher(passedNumbers);
			match.matches();
			String defaultDelimeter = match.group(1);
			String numberSequence = match.group(2);
			return numberSequence.split(defaultDelimeter);
		}
		else {
			return passedNumbers.split(",|\n");
		}
	}
	

}
