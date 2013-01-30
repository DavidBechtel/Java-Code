/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 * FizzBuzz outputs a series of numbers from one to the upperlimit and if
 * the number is divisible by 3 adds "Fizz", if it is divisible by 5 it adds
 * "Buzz, and finally if the number is divisible by 15 (both 3 and 5), it adds
 * "Fizzbuzz" to the output line.
 * @author davidbechtel
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String outStr = "";
        Integer upperlimit = 15;

	for ( int i = 1; i < upperlimit + 1; i++) {

		outStr = outStr + i;

		if (i % 3 == 0 && i % 5 != 0) {
			outStr = outStr + "  Fizz";
		}
		if (i % 5 == 0 && i % 3 != 0) {
			outStr = outStr + "  Buzz";
		}
		if (i % 3 == 0 && i % 5 == 0) {
			outStr = outStr + "  Fizzbuzz";
		}

		System.out.println (outStr);

                outStr = "";

	}
    }
}


