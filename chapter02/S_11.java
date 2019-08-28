/*(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and displays the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. The population
should be cast into an integer.*/

package bolum02;

public class S_11 {

	public static void main(String[] args) {

		double numberOfBirthInSeconds = 7.0;
		double numberOfDeathInSeconds = 13.0;
		double numberOfImmigrantInSeconds = 45.0;

		double currentPopulation = 312_032_486;

		double secondsInYear = 60 * 60 * 24 * 365;

		double numberOfBirthsInYear = secondsInYear / numberOfBirthInSeconds;
		double numberOfDeathsInYear = secondsInYear / numberOfDeathInSeconds;
		double numberOfImmigrantsInYear = secondsInYear / numberOfImmigrantInSeconds;

		currentPopulation = currentPopulation + numberOfBirthsInYear + numberOfImmigrantsInYear + numberOfDeathsInYear;
		System.out.println("Population of first year: " + (int) currentPopulation);

		currentPopulation = currentPopulation + numberOfBirthsInYear + numberOfImmigrantsInYear + numberOfDeathsInYear;
		System.out.println("Population of second year: " + (int) currentPopulation);

		currentPopulation = currentPopulation + numberOfBirthsInYear + numberOfImmigrantsInYear + numberOfDeathsInYear;
		System.out.println("Population of third year: " + (int) currentPopulation);

		currentPopulation = currentPopulation + numberOfBirthsInYear + numberOfImmigrantsInYear + numberOfDeathsInYear;
		System.out.println("Population of fourth year: " + (int) currentPopulation);

		currentPopulation = currentPopulation + numberOfBirthsInYear + numberOfImmigrantsInYear + numberOfDeathsInYear;
		System.out.println("Population of fifth year: " + (int) currentPopulation);
	}
}
