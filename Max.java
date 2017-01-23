import java.util.*;

public class Max{
	public static void main(String args[]){
		int[] a=new int[10];
		int i,max=0,j,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements in array (not more than 10)=>");
		int n=in.nextInt();
		System.out.println("Enter the "+n+" no of elements =>");
		for(i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		System.out.println("The array elements are =>\n");
		for(i=0;i<n;i++){
			System.out.print(a[i]+"\t");
		}

		//System.out.println("Output");
		for(j=0;j<3;j++){
			max=a[0];
			for(i=1;i<n-j;i++){
				if(a[i]>=max){
					max=a[i];
				}
				else{
					temp=max;
					a[i-1]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("The 3rd max no is =>"+max);
	}
}