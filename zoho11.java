//array rotation
import java.util.*;
class zoho11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		for(int i=0;i<k/2;i++){
			int temp=arr[i];
			arr[i]=arr[k-i-1];
			arr[k-i-1]=temp;
		}
		for(int i=k;i<(n+k)/2;i++){
		    int temp=arr[i];
			arr[i]=arr[n+k-i-1];
			arr[n+k-i-1]=temp;
		}
		int left=0,right=n-1;
		while(left<right){
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}