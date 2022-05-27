//sorting the elements according to their points using hashmap

import java.util.*;
import java.io.*;
class zoho4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
			map.put(sc.nextInt(),0);
		Set<Integer> list1=map.keySet();
		for(Integer i:list1){
			int sum=0;
			int x=i;
			double y=Math.sqrt(x);
			if(y-Math.floor(y)==0)
				sum=sum+5;
			if(x%4==0 && x%6==0)
				sum=sum+4;
			if(x%2==0)
				sum=sum+3;
			map.put(x,sum);
		}
		Set<Map.Entry<Integer,Integer>> entry=map.entrySet();
		List<Map.Entry<Integer,Integer>> list=new ArrayList<>(entry);
		Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
			public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		list.forEach(s->
			System.out.println(s.getKey()+" "+s.getValue()));
	}
}
