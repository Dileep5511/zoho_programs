//rotate the matrix 90 or 180
import java.util.*;
class zoho10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int degrees=sc.nextInt();
		int r=degrees/90;
		while(r!=0){
			for(int i=0;i<n;i++){
				for(int j=i;j<m;j++){
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
			for(int i=0;i<m/2;i++){
				for(int j=0;j<n;j++){
					if(i!=m-i-1){
						int temp=arr[j][i];
						arr[j][i]=arr[j][n-i-1];
						arr[j][n-i-1]=temp;
					}
				}
			}
			r--;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}