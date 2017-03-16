import java.util.Scanner;

public class ZodiacSigns {
	public static void main(String[] args) {
		// setup scanner for user input
		Scanner stdin = new Scanner(System.in);

		// enter your birth month
		System.out.println("please enter your birth month (in digits): ");
		int month = stdin.nextInt();

		// enter your birth day
		System.out.println("please enter your birth day (in digits): ");
		int day = stdin.nextInt();

		// Conditions to ensure month is between 1 and 12
		if (month >= 1 && month <= 12) {

			// setup the switch
			switch (month) {

			// January month signs
			case 1:
				System.out.println("January " + day);

				if (day >= 20 && day <= 31) {
					System.out.println("you are a Aquarius, your Strengths: "
							+ " Progressive, original, independent, humanitarian");
				}
				if (day >= 1 && day <= 19) {
					System.out.println("you are a Capricorn, your Strengths: "
							+ "Responsible, disciplined, self-control, good managers");
				}
				if (day < 1 || day > 31) {
					System.out.println("invalid day");
				}
				break;

			// February month signs
			case 2:
				System.out.println("February " + day);

				if (day >= 1 && day <= 18) {
					System.out.println("you are a Aquarius, your Strengths: "
							+ " Progressive, original, independent, humanitarian");
				}
				if (day >= 19 && day <= 28) {
					System.out.println("you are a Pisces, your Strengths: "
							+ "Compassionate, artistic, intuitive, gentle, wise, musical");
				}
				if (day < 1 || day > 28) {
					System.out.println("invalid day");
				}
				break;

			// March month signs
			case 3:
				System.out.println("March " + day);

				if (day >= 1 && day <= 20) {
					System.out.println("you are a Pisces, your Strengths: "
							+ "Compassionate, artistic, intuitive, gentle, wise, musical");
				}
				if (day >= 21 && day <= 31) {
					System.out.println("you are a Aries, your Strengths: "
							+ "Courageous, determined, confident, enthusiastic, " + "optimistic, honest, passionate");
				}
				if (day < 1 || day > 31) {
					System.out.println("invalid day");
				}
				break;

			// April month signs
			case 4:
				System.out.println("April " + day);

				if (day >= 1 && day <= 19) {
					System.out.println("you are a Aries, your Strengths: "
							+ "Courageous, determined, confident, enthusiastic, " + "optimistic, honest, passionate");
				}
				if (day >= 20 && day <= 30) {
					System.out.println("you are a Taurus, your Strengths: "
							+ "Reliable, patient, practical, devoted, responsible, " + " stable");
				}
				if (day < 1 || day > 30) {
					System.out.println("invalid day");
				}
				break;

			// May month signs
			case 5:
				System.out.println("May " + day);

				if (day >= 1 && day <= 20) {
					System.out.println("you are a Taurus, your Strengths: "
							+ "Reliable, patient, practical, devoted, responsible, " + " stable");
				}
				if (day >= 21 && day <= 31) {
					System.out
							.println("you are a Gemini, your Strengths: " + "Gentle, affectionate, curious, adaptable, "
									+ "ability to learn quickly and exchange ideas");
				}
				if (day < 1 || day > 31) {
					System.out.println("invalid day");
				}
				break;

			// June month signs
			case 6:
				System.out.println("June " + day);

				if (day >= 1 && day <= 20) {
					System.out
							.println("you are a Gemini, your Strengths: " + "Gentle, affectionate, curious, adaptable, "
									+ "ability to learn quickly and exchange ideas");
				}
				if (day >= 21 && day <= 31) {
					System.out.println("you are a Cancer, your Strengths: "
							+ "Tenacious, highly imaginative, loyal, emotional, " + "sympathetic, persuasive");
				}
				if (day < 1 || day > 30) {
					System.out.println("invalid day");
				}
				break;

			// July month signs
			case 7:
				System.out.println("July " + day);

				if (day >= 1 && day <= 22) {
					System.out.println("you are a Cancer, your Strengths: "
							+ "Tenacious, highly imaginative, loyal, emotional, " + "sympathetic, persuasive");
				}
				if (day >= 23 && day <= 31) {
					System.out.println("you are a Leo, your Strengths: "
							+ "Creative, passionate, generous, warm-hearted, " + "cheerful, humorous");
				}
				if (day < 1 || day > 31) {
					System.out.println("invalid day");
				}
				break;

			// August month signs
			case 8:
				System.out.println("August " + day);

				if (day >= 1 && day <= 22) {
					System.out.println("you are a Leo, your Strengths: "
							+ "Creative, passionate, generous, warm-hearted, " + "cheerful, humorous");
				}
				if (day >= 23 && day <= 30) {
					System.out.println(
							"you are a Virgo, your Strengths: " + "Loyal, analytical, kind, hardworking, practical");
				}
				if (day < 1 || day > 31) {
					System.out.println("invalid day");
				}
				break;

			// September month signs
			case 9:
				System.out.println("September " + day);

				if (day >= 1 && day <= 22) {
					System.out.println(
							"you are a Virgo, your Strengths: " + "Loyal, analytical, kind, hardworking, practical");
				}
				if (day >= 23 && day <= 30) {
					System.out.println("you are a Libra, your Strengths: "
							+ "Cooperative,diplomatic, gracious, fair-minded, social");
				}
				if (day < 1 || day > 30) {
					System.out.println("invalid day");
				}
				break;

			// October month signs
			case 10:
				System.out.println("October " + day);

				if (day >= 1 && day <= 22) {
					System.out.println("you are a Libra, your Strengths: "
							+ "Cooperative,diplomatic, gracious, fair-minded, social");
				}
				if (day >= 23 && day <= 31) {
					System.out.println("you are a Scorpio, your Strengths: "
							+ "Resourceful, brave, passionate, stubborn, a true friend");
				}
				if (day < 1 || day > 31) {
					System.out.println("invalid day");
				}
				break;

			// November month signs
			case 11:
				System.out.println("November " + day);

				if (day >= 1 && day <= 21) {
					System.out.println("you are a Scorpio, your Strengths: "
							+ "Resourceful, brave, passionate, stubborn, a true friend");
				}
				if (day >= 22 && day <= 30) {
					System.out.println(
							"you are a Sagittarius, your Strengths: " + "Generous, idealistic, great sense of humor");
				}
				if (day < 1 || day > 30) {
					System.out.println("invalid day");
				}
				break;

			// December month signs
			case 12:
				System.out.println("December " + day);

				if (day >= 1 && day <= 21) {
					System.out.println(
							"you are a Sagittarius, your Strengths: " + "Generous, idealistic, great sense of humor");
				}
				if (day >= 22 && day <= 31) {
					System.out.println("you are a Capricorn, your Strengths: "
							+ "Responsible, disciplined, self-control, good managers");
				}
				if (day < 1 || day > 31) {
					System.out.println("invalid day");
				}
				break;

			}
			stdin.close();
		}

		System.out.println("\n Random generated entry follows");

		// enter your birth month
		int month1 = 1 + (int) (Math.random() * 12);

		// enter your birth day
		int day1 = 1 + (int) (Math.random() * 31);

		// Conditions to ensure month is between 1 and 12
		if (month1 >= 1 && month1 <= 12) {

			// setup the switch
			switch (month1) {

			// January month signs
			case 1:
				System.out.println("January " + day1);

				if (day1 >= 20 && day1 <= 31) {
					System.out.println("you are a Aquarius, your Strengths: "
							+ " Progressive, original, independent, humanitarian");
				}
				if (day1 >= 1 && day1 <= 19) {
					System.out.println("you are a Capricorn, your Strengths: "
							+ "Responsible, disciplined, self-control, good managers");
				}
				if (day1 < 1 || day1 > 31) {
					System.out.println("invalid day");
				}
				break;

			// February month signs
			case 2:
				System.out.println("February " + day1);

				if (day1 >= 1 && day1 <= 18) {
					System.out.println("you are a Aquarius, your Strengths: "
							+ " Progressive, original, independent, humanitarian");
				}
				if (day1 >= 19 && day1 <= 28) {
					System.out.println("you are a Pisces, your Strengths: "
							+ "Compassionate, artistic, intuitive, gentle, wise, musical");
				}
				if (day1 < 1 || day1 > 28) {
					System.out.println("invalid day");
				}
				break;

			// March month signs
			case 3:
				System.out.println("March " + day1);

				if (day1 >= 1 && day1 <= 20) {
					System.out.println("you are a Pisces, your Strengths: "
							+ "Compassionate, artistic, intuitive, gentle, wise, musical");
				}
				if (day1 >= 21 && day1 <= 31) {
					System.out.println("you are a Aries, your Strengths: "
							+ "Courageous, determined, confident, enthusiastic, " + "optimistic, honest, passionate");
				}
				if (day1 < 1 || day1 > 31) {
					System.out.println("invalid day");
				}
				break;

			// April month signs
			case 4:
				System.out.println("April " + day1);

				if (day1 >= 1 && day1 <= 19) {
					System.out.println("you are a Aries, your Strengths: "
							+ "Courageous, determined, confident, enthusiastic, " + "optimistic, honest, passionate");
				}
				if (day1 >= 20 && day1 <= 30) {
					System.out.println("you are a Taurus, your Strengths: "
							+ "Reliable, patient, practical, devoted, responsible, " + " stable");
				}
				if (day1 < 1 || day1 > 30) {
					System.out.println("invalid day");
				}
				break;

			// May month signs
			case 5:
				System.out.println("May " + day1);

				if (day1 >= 1 && day1 <= 20) {
					System.out.println("you are a Taurus, your Strengths: "
							+ "Reliable, patient, practical, devoted, responsible, " + " stable");
				}
				if (day1 >= 21 && day1 <= 31) {
					System.out
							.println("you are a Gemini, your Strengths: " + "Gentle, affectionate, curious, adaptable, "
									+ "ability to learn quickly and exchange ideas");
				}
				if (day1 < 1 || day1 > 31) {
					System.out.println("invalid day");
				}
				break;

			// June month signs
			case 6:
				System.out.println("June " + day1);

				if (day1 >= 1 && day1 <= 20) {
					System.out
							.println("you are a Gemini, your Strengths: " + "Gentle, affectionate, curious, adaptable, "
									+ "ability to learn quickly and exchange ideas");
				}
				if (day1 >= 21 && day1 <= 31) {
					System.out.println("you are a Cancer, your Strengths: "
							+ "Tenacious, highly imaginative, loyal, emotional, " + "sympathetic, persuasive");
				}
				if (day1 < 1 || day1 > 30) {
					System.out.println("invalid day");
				}
				break;

			// July month signs
			case 7:
				System.out.println("July " + day1);

				if (day1 >= 1 && day1 <= 22) {
					System.out.println("you are a Cancer, your Strengths: "
							+ "Tenacious, highly imaginative, loyal, emotional, " + "sympathetic, persuasive");
				}
				if (day1 >= 23 && day1 <= 31) {
					System.out.println("you are a Leo, your Strengths: "
							+ "Creative, passionate, generous, warm-hearted, " + "cheerful, humorous");
				}
				if (day1 < 1 || day1 > 31) {
					System.out.println("invalid day");
				}
				break;

			// August month signs
			case 8:
				System.out.println("August " + day1);

				if (day1 >= 1 && day1 <= 22) {
					System.out.println("you are a Leo, your Strengths: "
							+ "Creative, passionate, generous, warm-hearted, " + "cheerful, humorous");
				}
				if (day1 >= 23 && day1 <= 30) {
					System.out.println(
							"you are a Virgo, your Strengths: " + "Loyal, analytical, kind, hardworking, practical");
				}
				if (day1 < 1 || day1 > 31) {
					System.out.println("invalid day");
				}
				break;

			// September month signs
			case 9:
				System.out.println("September " + day);

				if (day1 >= 1 && day1 <= 22) {
					System.out.println(
							"you are a Virgo, your Strengths: " + "Loyal, analytical, kind, hardworking, practical");
				}
				if (day1 >= 23 && day1 <= 30) {
					System.out.println("you are a Libra, your Strengths: "
							+ "Cooperative,diplomatic, gracious, fair-minded, social");
				}
				if (day1 < 1 || day1 > 30) {
					System.out.println("invalid day");
				}
				break;

			// October month signs
			case 10:
				System.out.println("October " + day1);

				if (day1 >= 1 && day1 <= 22) {
					System.out.println("you are a Libra, your Strengths: "
							+ "Cooperative,diplomatic, gracious, fair-minded, social");
				}
				if (day1 >= 23 && day1 <= 31) {
					System.out.println("you are a Scorpio, your Strengths: "
							+ "Resourceful, brave, passionate, stubborn, a true friend");
				}
				if (day1 < 1 || day1 > 31) {
					System.out.println("invalid day");
				}
				break;

			// November month signs
			case 11:
				System.out.println("November " + day);

				if (day1 >= 1 && day1 <= 21) {
					System.out.println("you are a Scorpio, your Strengths: "
							+ "Resourceful, brave, passionate, stubborn, a true friend");
				}
				if (day1 >= 22 && day1 <= 30) {
					System.out.println(
							"you are a Sagittarius, your Strengths: " + "Generous, idealistic, great sense of humor");
				}
				if (day1 < 1 || day1 > 30) {
					System.out.println("invalid day");
				}
				break;

			// December month signs
			case 12:
				System.out.println("December " + day1);

				if (day1 >= 1 && day1 <= 21) {
					System.out.println(
							"you are a Sagittarius, your Strengths: " + "Generous, idealistic, great sense of humor");
				}
				if (day1 >= 22 && day1 <= 31) {
					System.out.println("you are a Capricorn, your Strengths: "
							+ "Responsible, disciplined, self-control, good managers");
				}
				if (day1 < 1 || day1 > 31) {
					System.out.println("invalid day");
				}
				break;

			}
		}
	}
}
