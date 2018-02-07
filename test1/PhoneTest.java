package test1;
import java.util.Scanner;
public class PhoneTest {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		Phone phone1 = new Phone("iPhone","iPhoneX", 2017, 999.99);
		System.out.println(phone1.PhoneName);
		System.out.println(phone1.Brand);
		System.out.println(phone1.yearReleased);
		System.out.println("Insert 1 for iPhoneX");
		double X = 999.99;
		
		Phone phone2 = new Phone("Samsung", "Glaxay edge 8", 2017, 899.99);
		System.out.println(phone2.PhoneName);
		System.out.println(phone2.Brand);
		System.out.println(phone2.yearReleased);
		System.out.println("Insert 2 for Glaxay edge 8");
		double y = 899.99;
		
		Phone phone3 = new Phone("iPhone", "iPhone 8", 2017, 799.99);
		System.out.println(phone3.PhoneName);
		System.out.println(phone3.Brand);
		System.out.println(phone3.yearReleased);
		System.out.println("Insert 3 for iPhone8");
		double p = 799.99;
		
		System.out.println("Which phone would you like to buy?");
		int which = scanner.nextInt();
		
		if(which == 1) {
			System.out.println(X);
		}
		
		else if(which == 2) {
			System.out.println(y);
		}
		
		else if(which == 3){
			System.out.println(p);
		}
			
		scanner.close();
}

}
