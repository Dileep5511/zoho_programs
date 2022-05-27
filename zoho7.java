// Given a two dimensional array of string like 
//  <”luke”, “shaw”>
//  <”wayne”, “rooney”>
//  <”rooney”, “ronaldo”>
//  <”shaw”, “rooney”> 
// Where the first string is “child”, second string is “Father”. And given “ronaldo” we have to find his 
// no of grandchildren Here “ronaldo” has 2 grandchildren. So our output should be 2.


import java.util.*;
class zoho7{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			Scanner scan=new Scanner(System.in);
			HashMap<String,String> map=new HashMap<>();
			int n=scan.nextInt();
			for(int i=0;i<n;i++){
				map.put(sc.nextLine(),sc.nextLine());
			}
			String out="";
			String str=sc.nextLine();
			for(Map.Entry<String,String> entry:map.entrySet()){
				if(entry.getValue().equals(str)){
					out=entry.getKey();
				}
			}
			int count=0;
			Set<String> list=map.keySet();
			for(String i:list){
				if(map.get(i).equals(out)){
					count++;
				}
			}
			System.out.println(count);
		}
	}
