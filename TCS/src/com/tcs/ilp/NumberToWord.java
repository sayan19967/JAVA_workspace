package com.tcs.ilp;

import java.util.*;

public class NumberToWord {

	static int sumOfDigits(int num) {
		int rem = 10, sum = 0;
		while (rem != 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		// System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1, str2;
		int m, len, num, num_1, num_10, len2;
		int flag = 0;
		String str3[] = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
		String str4[] = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
				"Eighteen", "Nineteen" };
		String str5[] = { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 48 && str.charAt(i) <= 57) || str.charAt(i) == 46) {

			} else {
				flag = 1;
			}
		}

		if (str.contains(".") && flag == 0) {
			m = str.indexOf(".");
			str1 = str.substring(0, m);
			str2 = str.substring(m + 1, str.length());
			// System.out.println(str1 + " " + str2);
			len = str1.length();
			len2 = str2.length();
			if (len > 7) // crore
			{
				num = Integer.parseInt(str1.substring(0, len - 7));
				// System.out.println(num);
				if (num >= 1 && num <= 9) // single digit crore
				{
					System.out.print(str3[NumberToWord.sumOfDigits(num) - 1] + " crore ");
				}

				if (num >= 10 && num < 20) // for numbers in between 10 and 19
				{
					// System.out.println(NumberToWord.sumOfDigits(num));
					System.out.print(str4[NumberToWord.sumOfDigits(num) - 1] + " crore ");
				}
				if (num >= 20 && num <= 99) // for numbers in between 20 and 99
				{
					num_1 = num % 10;
					num = num / 10;
					num_10 = num % 10;

					if (num_1 == 0) // if unit digit is zero
					{
						System.out.print(str5[num_10 - 2] + " crore ");
					} else {
						System.out.print(str5[num_10 - 2] + " ");
						System.out.print(str3[num_1 - 1] + " crore ");
					}
				}

				// System.out.print(str1.substring(0, len-7) + " crore ");
			}

			if (len > 6) // double digit lakh
			{
				num = Integer.parseInt(str1.substring(len - 7, len - 5));

				if (num >= 10 && num < 20) // for number between 10 and 19
				{
					// System.out.println(NumberToWord.sumOfDigits(num));
					System.out.print(str4[NumberToWord.sumOfDigits(num) - 1] + " lakh ");
				}

				if (num >= 20 && num <= 99) // for numbers in between 20 and 99
				{
					num_1 = num % 10;
					num = num / 10;
					num_10 = num % 10;

					if (num_1 == 0) // if unit digit is zero
					{
						System.out.print(str5[num_10 - 2] + " lakh ");
					} else {
						System.out.print(str5[num_10 - 2] + " ");
						System.out.print(str3[num_1 - 1] + " lakh ");
					}
				}

			} else if (len > 5) // single digit lakh
			{
				num = Integer.parseInt(str1.substring(len - 6, len - 5));

				if (num >= 1 && num <= 9) {
					System.out.print(str3[NumberToWord.sumOfDigits(num) - 1] + " lakh ");

				}
			}

			if (len > 4) // double digit thousand
			{
				num = Integer.parseInt(str1.substring(len - 5, len - 3));

				if (num >= 10 && num < 20) // for numbers in between 10 and 19
				{
					// System.out.println(NumberToWord.sumOfDigits(num));
					System.out.print(str4[NumberToWord.sumOfDigits(num) - 1] + " thousand ");
				}

				if (num >= 20 && num <= 99) // for numbers in between 20 and 99
				{
					num_1 = num % 10;
					num = num / 10;
					num_10 = num % 10;

					if (num_1 == 0) // if unit digit is zero
					{
						System.out.print(str5[num_10 - 2] + " thousand ");
					} else {
						System.out.print(str5[num_10 - 2] + " ");
						System.out.print(str3[num_1 - 1] + " thousand ");
					}
				}
			} else if (len > 3) // single digit thousand
			{
				num = Integer.parseInt(str1.substring(len - 4, len - 3));

				if (num >= 1 && num <= 9) {
					System.out.print(str3[NumberToWord.sumOfDigits(num) - 1] + " thousand ");

				}
			}

			if (len > 2) // hundred
			{
				num = Integer.parseInt(str1.substring(len - 3, len - 2));

				if (num >= 1 && num <= 9) {
					System.out.print(str3[NumberToWord.sumOfDigits(num) - 1] + " hundred ");

				}
			}

			if (len > 1) // tens rupees
			{
				num = Integer.parseInt(str1.substring(len - 2, len));

				if (num >= 10 && num < 20) // for numbers in between 10 and 19
				{
					// System.out.println(NumberToWord.sumOfDigits(num));
					System.out.print(str4[NumberToWord.sumOfDigits(num) - 1] + " rupees and ");
				}

				if (num >= 20 && num <= 99) // for numbers in between 20 and 99
				{
					num_1 = num % 10;
					num = num / 10;
					num_10 = num % 10;

					if (num_1 == 0) // if unit digit is zero
					{
						System.out.print(str5[num_10 - 2] + " rupees and ");
					} else {
						System.out.print(str5[num_10 - 2] + " ");
						System.out.print(str3[num_1 - 1] + " rupees and ");
					}
				}
			} else if (len > 0) // unit rupees
			{
				num = Integer.parseInt(str1.substring(len - 1));

				if (num >= 1 && num <= 9) {
					System.out.print(str3[NumberToWord.sumOfDigits(num) - 1] + " rupees and ");

				}
			}

			if (len2 > 1) // tens paisa
			{
				num = Integer.parseInt(str2);

				if (num >= 10 && num < 20) // for numbers in between 10 and 19
				{
					// System.out.println(NumberToWord.sumOfDigits(num));
					System.out.print(str4[NumberToWord.sumOfDigits(num) - 1] + " paisa ");
				}

				if (num >= 20 && num <= 99) // for numbers in between 20 and 99
				{
					num_1 = num % 10;
					num = num / 10;
					num_10 = num % 10;

					if (num_1 == 0) // if unit digit is zero
					{
						System.out.print(str5[num_10 - 2] + " paisa ");
					} else {
						System.out.print(str5[num_10 - 2] + " ");
						System.out.print(str3[num_1 - 1] + " paisa ");
					}
				}

				if (num >= 1 && num <= 9) {
					System.out.println(str3[num - 1] + " paisa");
				}

			} else if (len2 > 0) // unit paisa
			{
				num = Integer.parseInt(str2.substring(len2 - 1));

				if (num == 1) {
					System.out.print(str4[num - 1] + " paisa ");

				} else if (num >= 2 && num <= 9) {
					System.out.println(str5[num - 2] + " paisa ");
				}
			}

		} else {
			System.out.println("invalid input");
			System.exit(1);
		}

	}

}
