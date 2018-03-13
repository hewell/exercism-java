import java.util.Arrays;

class ArmstrongNumbers {
	boolean isArmstrongNumber(int input) {
		String[] chars = Integer.toString(input).split("");
		int sum = Arrays.stream(chars).map(c -> Integer.parseInt(c)).map(i -> Math.pow(i, chars.length))
				.mapToInt(d -> d.intValue()).sum();
		return sum == input;
	}
}
