import java.util.*;

public class Arr{
	public static void main(String args[]){
		int[] a=new int[10];
		int sum=0,c=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements in array (not more than 10)=>");
		int n=in.nextInt();
		System.out.println("Enter the "+n+" no of elements =>\n");
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		System.out.println("The array elements are =>");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		for(int i=0;i<n;i++){
			if(a[i]%10==0){
				c++;
				sum=sum+a[i];
			}
		}
		System.out.println("The no of numbers having unit place 0 is "+c+" and addition of them is "+sum);

	}
}