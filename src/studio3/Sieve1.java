package studio3;

import java.util.Scanner;

public class Sieve1 {
public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	System.out.print("Please enter the value for n:");
	int n = in.nextInt();
	boolean[] prime = new boolean[n];
	for (int i =2; i<=prime.length;i++) {
		if ((i==2)||(i==3)||(i==5)||(i==7)) {
			prime [i]=true;
			System.out.println(i);
		}
		else {
			if ((i%2==0)||(i%3==0)||(i%5==0)||(i%7==0)) {
				prime [i]=false;
				System.out.println(i);
			}
		}

	}

	//check multiples of two, three, five, and seven (exclude 2), then they are composite
	//
}


}
