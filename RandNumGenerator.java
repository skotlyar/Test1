
public class RandNumGenerator {

public static void main(String [] args) {
		int range = 4000;      // Prints a number from 0 to max
		int min = 10;
		int num = (int) (Math.random() * range) + min;
		System.out.println(num);
	}
}

