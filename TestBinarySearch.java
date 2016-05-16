import java.util.Scanner;
//main class
public class TestBinarySearch{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//print how many do user want
		System.out.println("How many numbers do you want to input ?? ");
		int number = input.nextInt();
		int[] list = new int[number];
		System.out.println("Please input " + number + " number  are  :");
		//storage the number 
		for(int i = 0; i < number; i++){
			list[i] = input.nextInt();
		}
		System.out.println();
		//convey the numbers to check
		Check(list);
		//print number
		for(int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}
	}
	//check number method
	public static void Check(int[] num){
		boolean iftrue = true;
		// iftrue check the number and ensure exchange the number
		for(int k = 1; k < num.length && iftrue; k++){
			iftrue = false;
			//change  num[i] with num[i + 1] if  num[i + 1]  is bigger
			for(int i = 0; i < num.length - k; i++){
				if(num[i] > num[i + 1]){
					int temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
					iftrue = true;
				}
			}
		}
	}
}