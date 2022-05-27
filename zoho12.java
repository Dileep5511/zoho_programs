//addition of two arrays
import java.util.*;
class zoho12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> ar=new ArrayList<>();
		int t=sc.nextInt();
		int k=0;
		while(k<t){
			String str=scan.nextLine();
			String[] s=str.split(" ");
			int n=Integer.valueOf(s[0]);
			int m=Integer.valueOf(s[1]);
			ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
			arr.add(new ArrayList());
			String s1="",s2="";
			for(int i=0;i<n;i++)
		    {
		    	arr.get(0).add(sc.nextInt());
		    	s1=s1+String.valueOf(arr.get(0).get(i));
		    }
		    arr.add(new ArrayList());
			for(int i=0;i<m;i++)
		    {
		    	arr.get(1).add(sc.nextInt());
		    	s2=s2+String.valueOf(arr.get(1).get(i));
		    }
		    int val=Integer.valueOf(s1)+Integer.valueOf(s2);
		    ar.add(val);
		    k++;
		}
		for(int i=0;i<ar.size();i++){
			ArrayList<Integer> out=new ArrayList<>();
			int res=ar.get(i);
			while(res!=0){
				int rem=res%10;
				out.add(0,rem);
				res=res/10;
			}
			for(Integer value:out){
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}