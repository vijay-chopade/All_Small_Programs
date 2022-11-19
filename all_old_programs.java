package poject_vijay;

import java.util.*;

//import Bank.com.PrimeNo;
public class all_old_programs {
//	*****************************************************************************
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
//		System.out.print("Enter your name: ");
//		String tx = s1.next();
//		System.out.println("welcome, "+tx);

		do {
//			System.out.print("Enter your integer { inputx }: ");
//			String inputx = s1.next();
			System.out.print("Enter your integer { input }: ");
			int input = s1.nextInt();
//			System.out.print("Enter your integer { input1 }: ");
//			int input1 = s1.nextInt();
//			System.out.print("Enter your integer { input2 }: ");
//			int input2 = s1.nextInt();
//			int input = 5864;
			all_old_programs call = new all_old_programs();
			
			
			call.digit_in_words(input);
//			call.pow(input);
//			call.reverse_digit(input);
//			call.count_digit_by_sir(input);
//			call.count_digit(inputx);
//			call.sum_of_digit(65,5);	// you can able to enter multiple parameters
//			call.sum_of_n_no(input);
//			call.odd_in_range(input, input1);
//			call.even_in_range(input, input1);
//			call.print_no(input, input1);
//			call.min(input, input1, input2);
//			call.max(input, input1, input2);
//			call.div_by_3(input);
//			call.no_check_pos_or_neg(input);
//			call.evenOdd(input);
//			call.primeNo(input);
//			call.primeNo(input , input1);
			s1.close();
		}
		while(false);
//		while(true);
			
		
	}
//	******************************************************************************
	
//	
	
//  print 56 patterns all in the link
//	https://www.javainterviewpoint.com/number-pattern-programs-in-java/
	
//  Palindrome check the given no is palindrome or not      OP: 60706 => True
//    Get the number to check for palindrome =>   Hold the number in temporary variable
//    Reverse the number =>    Compare the temporary number with reversed number 
//    If both numbers are same, print "palindrome number" =>    Else print "not palindrome number"

    public void Palindrome() {
		int sum=0,a=60706,n=0,r=0;
		int p=a;
		while(0<a) {
			n=a%10;
			r=(r*10)+n;
			a/=10;
		}
		if(r==p) {
			System.out.println(p + " This is a palindrom number");
		}else {
			System.out.println(p + " This is not a palindrom number");
		}
	}
	
	
//	print the digit in word	    OP:   77536 => SEVEN SEVEN FIVE THREE SIX 
	void digit_in_words(int y) {
		
		int n = 0, r = 0, i = 0;
		while (i < y) {
			n = y % 10;
			r = (r * 10) + n;
			y = y / 10;
		}
		while (i < r) {
			n = r % 10;

			switch (n) {
			case 1:
				System.out.print("ONE ");
				break;
			case 2:
				System.out.print("TWO ");
				break;
			case 3:
				System.out.print("THREE ");
				break;
			case 4:
				System.out.print("FOUR ");
				break;
			case 5:
				System.out.print("FIVE ");
				break;
			case 6:
				System.out.print("SIX ");
				break;
			case 7:
				System.out.print("SEVEN ");
				break;
			case 8:
				System.out.print("EIGHT ");
				break;
			case 9:
				System.out.print("NINE ");
				break;
			default:
				System.out.println("Plz Enter a Single Digit!");
			}
			y = (y * 10) + n;
			r = r / 10;
		}

	
	}
	
//	calculate the power     OP: 8 => 64
	void pow(int a) {
		System.out.println(a*a);
		
	}
	
//	Addition of integer/digits      OP: 456273 => 27
	public void addOfDigits() { 
		int sum=0,a=456273,n=0,r=0;
		while(0<a) {
			n=a%10;
			a/=10;
			sum += n;
		}
		System.out.println("sum of all entered digit is: " +sum);
	}
	
//	print reverse number    OP:	8769 => 9678
	void reverse_digit(int y) {
		int n=0,r=0,i=0;
		while(i<y){
			n=y%10;
			r=(r*10)+n;
			y=y/10;
		}
		System.out.println(r);

	}
	
	
//	print count of digit by sir     OP: 6753 => 4
	void count_digit_by_sir(long y) {
		int i=0;
		while(i<y){
			y=y/10;
			i++;
		}
		System.out.println(" >> total Digit you entered is: " +i);
		
	}
	
	
	
//	print count of digit
	void count_digit(String a) {
		int count=0;
		for(int i=0;i<=a.length();i++) {
			count=i;
		}
		System.out.println(count);
	}
	
	
//	print the sum of 0 to n number      OP: 1+2+3+4+5 => 15
	void sum_of_n_no(int b) {
		int sum=0;
		if(true) {
			int i;
			for(i=0;i<=b;i++) {
				sum+=i;
			}
			System.out.println("sum of "+ 0 + " to " + b +" is: "+ sum);}
//		}else {
//			System.out.println("plz enter a no thouse Less than B");			
//		}
	}
	
//	print odd number from range to range
	void odd_in_range(int a,int b) {
		if(a<b) {
			for(int i=a;i<=b;i++) {
				if((i%2)!=0) {
					System.out.println(i);
				}
			}
		}
		else if(a>b) {
			for(int i=a;i>=b;i--) {
				if((i%2)!=0) {
					System.out.println(i);
				}
			}
		}
	}
	
//	print even number from range to range       OP a=1,b=65 => 2,4,6,8,10,12,...,64
	void even_in_range(int a, int b) {
		if(true){
			
			if(a<b) {
				for(int i=a;i<=b;i++) {
					if((i%2)==0) {
						System.out.println(i);
					}
				}
			}
			else if(a>b) {
				for(int i=a;i>=b;i--) {
					if((i%2)==0) {
						System.out.println(i);
					}
				}
			}
			else {
				System.out.println("Plz enter differant values!");
			}
		}
	}
	
//	print 1 to 10 number    OP a=1,b=65 => 1,2,3,4,5,...,65
	
	void print_no(int a, int b) {
		
		if(a<b) {
			for(int i=a;i<=b;i++) {
				System.out.println(i);
			}
		}
		else if(a>b) {
			for(int i=a;i>=b;i--) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("Plz enter differant values!");
		}
	}
	
//	find min number from 3 numbers
	void min(int a, int b, int c) {
		if((a<b)&&(a<c)) {
			System.out.println(a + " is Less then "+ b+" & "+ c);
		}
		else if((b<a)&&(b<c)) {
			System.out.println(b + " is Less then "+ a + " & " +c);
		}else if((c<a)&&(c<b)) {
			System.out.println(c + " is Less then "+ a + " & " +b);
		}else if((b == c)&& (b == a)) {
			System.out.println("All are equal");
			}
	}
	
//	find max number from 3 numbers
	void max(int a,int b, int c) {
		if((a > b)&& (a > c)) {
			System.out.println(a + " is Greater then "+ b+" & "+ c);
		}
		else if((b > c)&& (b > a)) {
			System.out.println(b + " is Greater then "+ a + " & " +c);
		}
		else if((c > a)&& (c > b)) {
			System.out.println(c +" is Greater then "+ a+" & " +b);
		}
		else if((b == c)&& (b == a)) {
			System.out.println("All are equal");
		}
	}	
//	check the number divisible by 3 or 5
	void div_by_3(int a) {
		if(a==0) {
			System.out.println("if you divid n by zero then ans become => Zero");
		}
		else if((a%3)==0 && (a%5)==0) {
			System.out.println(a + " -is Divided Both 3 & 5, Successfully.");
		}
		else if(a%3==0) {
			System.out.println(a + " -is Divided by 3, Successfully.");
		}
		else if(a%5==0) {
			System.out.println(a + " -is Divided by 5, Successfully.");
		}
		else {
			System.out.println(a + " -is not be Divided by 3 or 5.");
		}
	}
//	check the number -ve or +ve
	void no_check_pos_or_neg(int a) {
		if(a<0) {
			System.out.println(a + " -is a Negative number.");
		}
		else if(a>0) {
			System.out.println(a + " -is a Positive Number.");
		}
		else {
			System.out.println("you entered number is Zero!");
		}
	}
//	check given no is even odd or prime.
	void evenOdd(int a) {
		if((a%2)==0) {
			System.out.println(a + " -is even number.");
		}
		else {
				System.out.println(a + " -is odd number.");
			}
		}
	
//		Start code for prime no
//		under the range of prime no 
		public void primeNo(int n1 , int n2) {			
			int i=0,j=0;
			
	//		if(n1==1 || n2==1) {	System.out.println(">>>>>>>>>>>" + 1);}
			if(n1 == 0 && n2 ==0) {
				System.out.println("Enter a valid no!");
			}
			else if(n1<n2) {
				for(i = n1;i<n2;i++) {
					for(j = 2;j<i;j++) {
						if (i%j==0) {
							break;}
					}				
					if (i==j) {
						System.out.println(">>>>>>>>>>>" + i);
					}
				}
			}
			else if(n1>n2) {
				for(i = n1;i>n2;i--) {
					for(j = 2;j<i;j++) {
						if (j==2) {	continue;}
						else if (i%j==0) {
								break;}
					}	
					if (j==2) {continue;}
					else if (i==j) {
						System.out.println(">>>>>>>>>>>" + i);
					}
				}
			}
		}
//		for single prime no
		void primeNo(int a ){				
			boolean mess = true;
			for (int i = 2;i < a; i++) {
				if(a%i == 0) {
					mess = false;
					break;
				}
			}
			if(mess == true) {
				System.out.println("It's a prime no...");
			}		
		}
		
//      Array Programming


        	
//	print sum of multiple digit         OP: int[] a={34,56,7,6,4} => 107
	void sum_of_digit(int ... a) {
		int sum=0;
		for(int x:a) {
			sum += x;
		}
		System.out.println("sum of all entered digit is: " +sum);
	}

//      Print Duplicate Number inside the array     OP: int[] x = { 1, 1, 1, 2, 3, 4, 5, 8, 5, 6, 3, 5, 6 } => 1,1,1,3,5,5,5,6
public void DuplicateNo() {
		int[] x = { 1, 1, 1, 2, 3, 4, 5, 8, 5, 6, 3, 5, 6 };

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					System.err.print(x[j]);
				}
			}
		}
	}		
		
		
		
		
		
		
		
//          String


//  count string and occurrences/char         OP: "Today is Monday" => 'a'=2, "String"=15  
    public void countString() {
		String input = "Today is Monday";
		char []ch =  input.toCharArray();
		int intstring=0,intchar=0;
		for (char c : ch) {
			if(c == 'a') {
				intchar++;
			}
			intstring++;
		}
		System.out.println("total 'a' character prasent in '"+input+"' : "+intchar);
		System.out.println("total character inside the String: "+intstring);

	}
	
//  Print the reverse String 	OP: Today is Monday => yadnoM si yado
	public void reverseString() {
		String input = "Today is Monday";
		System.out.println("input String is: "+input);
		char []ch =  input.toCharArray();
		char []charreverse = new char[50];
		int j=0;
		int s=(ch.length-1);
		for(int i=s;i>0;i--) {
			charreverse[j]=ch[i];
			j++;
		}
		String a = new String(charreverse);
		System.out.println("Output String is: "+a);
		
	}
	
	
//  print dublicate charector in given string      OP: "Today_is_Monday" => oday_
	public void duplicateChar() {
		String input = "Today_is_Monday";
		System.out.println("input String is: '"+input+"'.");
		System.out.print("Dublicate String is: '");
		char []ch =  input.toCharArray();
		for(int i=0;i<input.length();i++) {
			for(int k=i+1;k<input.length();k++) {
				if(ch[i] == ch[k]) {
					System.out.print(ch[i]);
				}
			}
		}
		System.out.print("'.");
		
	}
	
	
//  print dublicate string in given strng       OP: "contains two words, one and two" => [two]
	public void duplicateString() {

		String test = "This sentence contains two words, one and two";

		Set<String> duplicates = new HashSet<>();

		String[] words = test.split("\\s+");
		Set<String> set = new HashSet<>();

		for (String word : words) {
			if (!set.add(word)) {
				duplicates.add(word);
			}
		}
		System.out.println(test);
		System.out.println(duplicates);

	}
	
	
//  check given string is Palindrome or not
	public void palindromeString() {
		String input = "nxoxn";
		System.out.println("input String is: " + input);
		char[] ch = input.toCharArray();
		char[] ch3 = new char[ch.length];
		int j = 0;
		for (int i = ch.length - 1; i > (-1); i--) {
			ch3[j] = ch[i];
			j++;
		}

		String ch2 = new String(ch3);
		if (input.equals(ch2)) {
			System.out.print("palindrom");

		} else {
			System.out.println("It's Not!");
		}

	}



		
		
//		End code writing
	

}
