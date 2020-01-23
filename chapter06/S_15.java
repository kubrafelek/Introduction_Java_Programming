package chapter06;

public class S_15 {

	public static void main(String[] args) {
		System.out.println("Taxable\t" + "Income\t" + "Single Married Joint\t" + "or Qualifying\t" + "Widow(er)\t"
				+ "Married\t" + "Separate\t" + "Head of\t" + "a House");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");
		for (int taxableIncome = 50_000; taxableIncome <= 60_000; taxableIncome += 50) {
			int status = 0;
			if (status == 0 || status == 1 || status == 2 || status == 3) {
				System.out.print(
						taxableIncome + "\t\t\t" + computeTax(0, taxableIncome) + "\t\t\t" + computeTax(1, taxableIncome)
								+ "\t\t\t" + computeTax(2, taxableIncome) + "\t\t\t" + computeTax(3, taxableIncome));
			}
			System.out.println();
		}

	}

	public static int computeTax(int status, int taxableIncome) {
		double tax = 0;

		if (status == 0) {
			if (taxableIncome <= 8_350) {
				tax = taxableIncome * 0.10;

			} else if (taxableIncome <= 33_950) {
				tax = 8_350 * 0.10 + (taxableIncome - 8_350) * 0.15;

			} else if (taxableIncome <= 82_250) {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (taxableIncome - 33_950) * 0.25;

			} else if (taxableIncome <= 171_550) {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25
						+ (taxableIncome - 82_250) * 0.28;

			} else if (taxableIncome <= 372_950) {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28
						+ (taxableIncome - 171_550) * 0.33;

			} else {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28
						+ (372_950 - 171_550) * 0.33 + (taxableIncome - 372_950) * 0.35;
			}
		} else if (status == 1) {
			if (taxableIncome <= 16_700) {
				tax = taxableIncome * 0.10;

			} else if (taxableIncome <= 67_900) {
				tax = 16_700 * 0.10 + (taxableIncome - 16_700) * 0.15;

			} else if (taxableIncome <= 137_050) {
				tax = 16_700 * 0.10 + (67_900 - 16_700) * 0.15 + (taxableIncome - 67_900) * 0.25;

			} else if (taxableIncome <= 208_850) {
				tax = 16_700 * 0.10 + (67_900 - 16_700) * 0.15 + (82_250 - 67_900) * 0.25
						+ (taxableIncome - 82_250) * 0.28;

			} else if (taxableIncome <= 372_950) {
				tax = 16_700 * 0.10 + (67_900 - 16_700) * 0.15 + (82_250 - 67_900) * 0.25 + (171_550 - 82_250) * 0.28
						+ (taxableIncome - 171_550) * 0.33;

			} else {
				tax = 16_700 * 0.10 + (67_900 - 8_350) * 0.15 + (82_250 - 67_900) * 0.25 + (171_550 - 82_250) * 0.28
						+ (372_950 - 171_550) * 0.33 + (taxableIncome - 372_950) * 0.35;
			}
		} else if (status == 2) {
			if (taxableIncome <= 8_350) {
				tax = taxableIncome * 0.10;

			} else if (taxableIncome <= 33_950) {
				tax = 8_350 * 0.10 + (taxableIncome - 8_350) * 0.15;

			} else if (taxableIncome <= 68_525) {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (taxableIncome - 33_950) * 0.25;

			} else if (taxableIncome <= 104_425) {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25
						+ (taxableIncome - 82_250) * 0.28;

			} else if (taxableIncome <= 186_475) {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28
						+ (taxableIncome - 171_550) * 0.33;
			} else {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28
						+ (372_950 - 171_550) * 0.33 + (taxableIncome - 372_950) * 0.35;
			}
		} else if (status == 3) {

			if (taxableIncome <= 11_950) {
				tax = taxableIncome * 0.10;

			} else if (taxableIncome <= 45_500) {
				tax = 8_350 * 0.10 + (taxableIncome - 8_350) * 0.15;

			} else if (taxableIncome <= 117_450) {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (taxableIncome - 33_950) * 0.25;

			} else if (taxableIncome <= 190_200) {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25
						+ (taxableIncome - 82_250) * 0.28;

			} else if (taxableIncome <= 372_950) {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28
						+ (taxableIncome - 171_550) * 0.33;

			} else {
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28
						+ (372_950 - 171_550) * 0.33 + (taxableIncome - 372_950) * 0.35;
			}

		} else {
			System.exit(0);
			return 0;
		}
		return (int) tax;
	}
}
