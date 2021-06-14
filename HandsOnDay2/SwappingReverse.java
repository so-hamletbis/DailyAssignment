package handsonday2;
import java.util.Scanner;
public class SwappingReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array(Even number):");
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i=0; i<len; i++)
		{
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<len/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[len-i-1];
			arr[len-i-1] = temp;
			
		}
		for(int i=0; i<len; i++)
		{
			System.out.println(arr[i]);
		}
	}

}