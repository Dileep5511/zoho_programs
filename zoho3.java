//print the word as cross pattern

import java.util.*;
class zoho3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] car=str.toCharArray();
		int s=str.length();
		int start=0,end=s-1;
	    for(int i=0;i<s;i++){
	    	int j=end-i;
	    	for(int k=0;k<s;k++){
	    		if(k==i||k==j){
	    			System.out.print(car[i]);
	    		}
	    		else {
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println();
	    }
	}
}