//frequency of array elements in o(n) tc and o(1) sc;
import java.util.*;
class zoho8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			arr[arr[i]%n]=arr[arr[i]%n]+n;
		}
		for(int i=0;i<n;i++){
			int freq=arr[i]/n;
			if(freq!=0){
				System.out.println(i+" "+freq);
			}
		}
	}
}