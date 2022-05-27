//spiral traversal of a matrix

import java.util.*;
class zoho9{
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
		int dir=0,top=0,down=n-1,left=0,right=m-1;
		while(top<=down && left<=right){
			if(dir==0){
				for(int i=left;i<=right;i++)
					System.out.print(arr[top][i]+" ");
				top++;
			}
			else if(dir==1){
				for(int i=top;i<=down;i++)
					System.out.print(arr[i][right]+" ");
				right--;
			}
			else if(dir==2){
				for(int i=right;i>=left;i--){
					System.out.print(arr[down][i]+" ");
				}
				down--;
			}
			else if(dir==3){
				for(int i=down;i>=top;i--){
					System.out.print(arr[i][left]+" ");
				}
				left++;
			}
			dir=(dir+1)%4;
		}
	}
}