//array arrangement alternatively high and low
//arr[i]=arr[i]+(arr[min/max]%val)*val
//val=max_value_of_array+1;
//if i is even the max index is considered
//if i is odd the min index is considered


import java.util.*;
class zoho1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<n;i++){
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		//System.out.println(arr);
		int maxi=arr.size()-1;
		//System.out.println(maxi);
		int ele=arr.get(maxi)+1;
		//System.out.println(ele);
		int mini=0;
		for(int i=0;i<n;i++){
			int x;
			if(i%2==0)
			{
				x=maxi;
				maxi--;
			}
			else {
				x=mini;
				mini++;
			}
			int val=arr.get(i)+((arr.get(x)%ele)*ele);
			arr.set(i,val);
			System.out.println(arr);
		}
		for(int i=0;i<n;i++){
			System.out.println(arr.get(i)/ele);
		}
	}
}