package cap02;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		int age, qtdYears;
		int gender;
		Scanner sc;

		System.out.println("Enter your age");
		sc = new Scanner(System.in);
		age = sc.nextInt();

		System.out.println("Enter quantity of contribuition(years)");
		sc = new Scanner(System.in);
		qtdYears = sc.nextInt();

		System.out.println("Enter your gender");
		sc = new Scanner(System.in);
		gender = sc.nextInt();

		sc.close();

		if (gender == 1) {
			if (age == 65) {
				System.out.println("Você já tem o direito a aposentadoria");
			} else {
				if (qtdYears == 35) {
					System.out.println("Você ja tem o direito a aposentadoria");
				}
			}
			int value = 0;
			if (age < 65 && qtdYears < 35) {
				value = 35 - qtdYears;

				System.out.printf("Faltam %d anos de contribuição", value);
			}
		} else {
			if (gender == 2) {
				if (age == 60) {
					System.out.println("Você já tem o direito a aposentadoria");
				} else {
					if (qtdYears == 30) {
						System.out.println("Você já tem o direito a aposentadoria");
					}
				}
				int value = 0;
				if (age < 60 && qtdYears < 30) {
					value = 30 - qtdYears;

					System.out.printf("Faltam %d anos de contribuição", value);
				}
			}
		}
	}

}
