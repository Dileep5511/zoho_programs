//valid expression or not 
//brackets validity checking

import java.util.*;
class zoho2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] car=str.toCharArray();
		int s=str.length();
		ArrayList<Character> stack=new ArrayList<>();
		for(int i=0;i<s;i++){
			if(car[i]=='('||car[i]=='{'||car[i]=='[')
			{
				stack.add(car[i]);
			}
			if(car[i]==')'||car[i]=='}'||car[i]==']')
			{
				if(car[i]==']')
					car[i]='[';
				if(car[i]==')')
					car[i]='(';
				if(car[i]=='}')
					car[i]='{';
				if(car[i]==stack.get(stack.size()-1))
					stack.remove(stack.size()-1);
			}
		}
		if(stack.size()==0)
			System.out.print("valid");
		else 
			System.out.println("invalid");
	}
}