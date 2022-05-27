//convert the string 2d array
// Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search 
// for substring like “too” in the two dimensional string both from left to right and from top to bottom.


import java.util.*;
class zoho6{
	public static void main(String[] args){
		ArrayList<ArrayList<Character>> arr=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] car=str.toCharArray();
		double m=Math.sqrt(str.length());
		if(m-Math.floor(m)!=0)
			m=m+1;
		int n=(int)Math.floor(m);
		for(int i=0;i<n;i++){
			arr.add(new ArrayList());
			for(int j=0;j<n;j++){
				int index=(n*i)+j;
				if(index<str.length())
					arr.get(i).add(car[index]);
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int index=(n*i)+j;
				if(index<str.length())
					System.out.print(arr.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}
