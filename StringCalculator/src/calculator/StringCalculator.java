package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {

	private static int count = 0;
	
	public int add(String numbers) {
		// TODO Auto-generated method stub
		
		count++;
		
		if (numbers.isEmpty())
			return 0;
		else if (Pattern.compile("\\W").matcher(numbers).find()) {
			String [] allNumbersInString = stringSplitter(numbers);
			int [] allNumbersInInteger = Arrays.stream(allNumbersInString).mapToInt(Integer::parseInt).toArray();
			
			List<Integer> negativeNumbers = Arrays.stream(allNumbersInInteger).filter(i -> i< 0).boxed().collect(Collectors.toList());
			
			if(negativeNumbers.size()>0)
				throw new RuntimeException("Negatives not allowed: "+negativeNumbers.stream().map(String::valueOf)
				        												.collect(Collectors.joining(",")));
			
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

	public int getCalledCount() {
		// TODO Auto-generated method stub
		return count;
	}
	

}
