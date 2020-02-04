package Homework1TungG1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework1Tung {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// input the Date of Today
		int D; // Current Day
		int M; // Current Month
		int Y; // Current Year
		System.out.println("Input current date: ");
		D = scanner.nextInt();
		System.out.println("Input current month: ");
		M = scanner.nextInt();
		System.out.println("Input current year: ");
		Y = scanner.nextInt();

		// input my birthday
		int bD; // Birth Day
		int bM; // Birth Month
		int bY; // Birth Year

		System.out.println("Input birth date: ");
		bD = scanner.nextInt();
		System.out.println("Input birth month: ");
		bM = scanner.nextInt();
		System.out.println("Input birth year: ");
		bY = scanner.nextInt();

		System.out.println("Today's Date:" + D + "-" + M + "-" + Y);
		System.out.println("Date of Birth:" + bD + "-" + bM + "-" + bY);

		int numberOfYear = 0;
		int numberOfMonth = 0;
		int numberOfDays = 0;

		if (bY < Y) {
			// Birth Year smaller than current Year, so the age in year should be larger
			// than 1
			if (bM == M) {

				if (bD == D) {
					numberOfYear = Y - bY;
					System.out.println("My age:" + numberOfYear + "years");
					System.out.println("My age:" + 0 + "months");
					System.out.println("My age:" + 0 + "days");
//					System.out.println("My age in days:" + (Y - bY)*365 + "days");
				}

				else if (bD < D) {
					numberOfYear = Y - bY;
					System.out.println("My age:" + (Y - bY) + "years");
					numberOfMonth = 12 - bM + M;
					System.out.println("My age:" + numberOfMonth + "months");
					numberOfDays = D - bD;
					System.out.println("My age:" + numberOfDays + "days");
//					System.out.println("My age in days:" + (Y - bY)*365  + "days");
				}

				else {
					numberOfYear = Y - bY - 1;
					System.out.println("My age:" + numberOfYear + "years");
					System.out.println("My age:" + 11 + "months");
					// Take into account the months with 30 days
					if (M == 1 || M == 2 || M == 4 || M == 6 || M == 8 || M == 9 || M == 11) {
						numberOfDays = 31 - bD + D;
						System.out.println("My age:" + numberOfDays + "days");
//						System.out.println("My age in days:" + (Y - bY - 1)*365 + "days");
						// Take into account the months with 31 days
					} else if (M == 5 || M == 7 || M == 10 || M == 12) {
						numberOfDays = 30 - bD + D;
						System.out.println("My age:" + numberOfDays + "days");
//						System.out.println("My age in days:" + (Y - bY)*365 + "days");
					} // Take into account the leap year with or without 29 days in Feb
					else {
						// Leap Year: divisible by 4 and not divisible by 100 | or divisible by 400
						if ((Y % 4 == 0 && Y % 100 != 0) || Y % 400 == 0) {
							numberOfDays = 29 - bD + D;
							System.out.println("My age:" + numberOfDays + "days");
//							System.out.println("My age in days:" + (Y - bY)*365 + "days");
						} else {
							numberOfDays = 28 - bD + D;
							System.out.println("My age:" + numberOfDays + "days");
//							System.out.println("My age in days:" + (Y - bY)*365 + "days");
						}
					}

				}

			}

			else if (bM < M) {

				if (bD == D) {
					numberOfYear = Y - bY;
					numberOfMonth = M - bM;
					System.out.println("My age:" + numberOfYear + "years");
					System.out.println("My age:" + numberOfMonth + "months");
					System.out.println("My age:" + 0 + "days");
//					System.out.println("My age in days:" + (Y - bY)*365 + "days");
				}

				else if (bD < D) {
					numberOfYear = Y - bY;
					numberOfMonth = M - bM;
					numberOfDays = D - bD;
					System.out.println("My age:" + numberOfYear + "years");
					System.out.println("My age:" + numberOfMonth + "months");
					System.out.println("My age:" + numberOfDays + "days");
//					System.out.println("My age in days:" + (Y - bY)*365 + "days");
				}

				else {
					numberOfYear = Y - bY;
					numberOfMonth = M - bM - 1;
					System.out.println("My age:" + numberOfYear + "years");
					System.out.println("My age:" + numberOfMonth + "months");
//					System.out.println("My age in days:" + (Y - bY)*365 + "days");
					if (M == 1 || M == 2 || M == 4 || M == 6 || M == 8 || M == 9 || M == 11) {
						numberOfDays = 31 - bD + D;
						System.out.println("My age:" + numberOfDays + "days");
//						System.out.println("My age in days:" + (Y - bY)*365 + "days");
					} else if (M == 5 || M == 7 || M == 10 || M == 12) {
						numberOfDays = 30 - bD + D;
						System.out.println("My age:" + numberOfDays + "days");
//						System.out.println("My age in days:" + (Y - bY)*365 + "days");
					} else {
						if ((Y % 4 == 0 && Y % 100 != 0) || Y % 400 == 0) {
							numberOfDays = 29 - bD + D;
							System.out.println("My age:" + numberOfDays + "days");
//							System.out.println("My age in days:" + (Y - bY)*365 + "days");
						} else {
							numberOfDays = 28 - bD + D;
							System.out.println("My age:" + numberOfDays + "days");
//							System.out.println("My age in days:" + (Y - bY)*365 + "days");
						}
					}

				}

			}

			else if (bM > M) {

				if (bD == D) {
					numberOfYear = Y - bY - 1;
					numberOfMonth = 12 - bM + M;
					System.out.println("My age:" + numberOfYear + "years");
					System.out.println("My age:" + numberOfMonth + "months");
					System.out.println("My age:" + 0 + "days");
				}

				else if (bD < D) {
					numberOfYear = Y - bY - 1;
					numberOfMonth = 12 - bM + M;
					numberOfDays = D - bD;
					System.out.println("My age:" + numberOfYear + "years");
					System.out.println("My age:" + numberOfMonth + "months");
					System.out.println("My age:" + numberOfDays + "days");

				}

				else if (bD > D) {
					numberOfYear = Y - bY - 1;
					numberOfMonth = 12 - bM + M;
					System.out.println("My age:" + numberOfYear + "years");
					System.out.println("My age:" + numberOfMonth + "months");
					if (M == 1 || M == 2 || M == 4 || M == 6 || M == 8 || M == 9 || M == 11) {
						numberOfDays = 31 - bD + D;
						System.out.println("My age:" + numberOfDays + "days");
					} else if (M == 5 || M == 7 || M == 10 || M == 12) {
						numberOfDays = 30 - bD + D;
						System.out.println("My age:" + numberOfDays + "days");
					} else {
						if ((Y % 4 == 0 && Y % 100 != 0) || Y % 400 == 0) {
							numberOfDays = 29 - bD + D;
							System.out.println("My age:" + numberOfDays + "days");
						} else {
							numberOfDays = 28 - bD + D;
							System.out.println("My age:" + numberOfDays + "days");
						}
					}

				}

			}

		} else if (bY == Y) {
			// Birth Year equal to current Y; so the age in year should be 0
			if (bM == M) {

				if (bD == D) {
					System.out.println("My age:" + (0) + "years");
					System.out.println("My age:" + (0) + "months");
					System.out.println("My age:" + (0) + "days");
				}

				else if (bD < D) {
					numberOfDays = D - bD;
					System.out.println("My age:" + (0) + "years");
					System.out.println("My age:" + (0) + "months");
					System.out.println("My age:" + numberOfDays + "days");
				}
			} else if (bM < M) {

				if (bD == D) {
					numberOfMonth = M - bM;
					System.out.println("My age:" + (0) + "years");
					System.out.println("My age:" + numberOfMonth + "months");
					System.out.println("My age:" + (0) + "days");
				}

				else if (bD < D) {
					numberOfMonth = M - bM;
					numberOfDays = D - bD;
					System.out.println("My age:" + (0) + "years");
					System.out.println("My age:" + numberOfMonth + "months");
					System.out.println("My age:" + numberOfDays + "days");
				}

				else if (bD > D) {
					numberOfMonth = M - bM;
					System.out.println("My age:" + (0) + "years");
					System.out.println("My age:" + numberOfMonth + "months");
					if (M == 1 || M == 2 || M == 4 || M == 6 || M == 8 || M == 9 || M == 11) {
						numberOfDays = 31 - bD + D;
						System.out.println("My age:" + numberOfDays + "days");
					} else if (M == 5 || M == 7 || M == 10 || M == 12) {
						numberOfDays = 30 - bD + D;
						System.out.println("My age:" + numberOfDays + "days");
					} else {
						if ((Y % 4 == 0 && Y % 100 != 0) || Y % 400 == 0) {
							numberOfDays = 29 - bD + D;
							System.out.println("My age:" + numberOfDays + "days");
						} else {
							numberOfDays = 28 - bD + D;
							System.out.println("My age:" + numberOfDays + "days");
						}
					}

				}

			}

		}

		int leap = 0;
		for (int i = bY; i < Y + 1; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				if (i == bY) {
					if (bM == 2 && bD < 29) {
						leap++;
						continue;
					} else
						continue;
				} else if (i == Y) {
					if ((M > 2) || (M == 2 && D == 29)) {
						leap++;
						continue;
					} else
						continue;
				}
				leap++;
			}
		}

		int ageByDays = 0;
		for (int i = bM; i < bM + numberOfMonth; i++) {
			int month = (i <= 12) ? i : i - 12;
			int daysInMonths = daysInMonthsAsMap.get(month);
			ageByDays = ageByDays + daysInMonths;
		}
		ageByDays = ageByDays + 365 * numberOfYear + leap + numberOfDays;
		System.out.println("My age in days: " + ageByDays);

	}

	// cover from Jan to Dec
	private static final int[] daysInMonths = { 31, 28, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private static final Map<Integer, Integer> daysInMonthsAsMap = new LinkedHashMap<>();

	static {
		daysInMonthsAsMap.put(1, 31);
		daysInMonthsAsMap.put(2, 28);
		daysInMonthsAsMap.put(3, 31);
		daysInMonthsAsMap.put(4, 30);
		daysInMonthsAsMap.put(5, 31);
		daysInMonthsAsMap.put(6, 30);
		daysInMonthsAsMap.put(7, 31);
		daysInMonthsAsMap.put(8, 31);
		daysInMonthsAsMap.put(9, 30);
		daysInMonthsAsMap.put(10, 31);
		daysInMonthsAsMap.put(11, 30);
		daysInMonthsAsMap.put(12, 31);
	}

}

// END OF PROGRAM
