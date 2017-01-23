import java.util.*;

public class Conver{
	public static void main(String args[]){
		System.out.println("Enter the Decimal Number =>");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		String bin=Integer.toBinaryString(a);
		System.out.println("Binary representation =>"+bin);
		int i=0,c=0;
		while(i<(bin.length())){
			if(bin.charAt(i)=='1'){
				c++;
			}
			i++;
		}
		System.out.println("No of 1 in Binary representation of "+a+" is "+c);
	}
}