package com.countchar;

public class CountCharacter {
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String Str = "Naveen is a good boy";
			System.out.println(Str);
			
			int count = 0;
			
			for(int i=0;i<Str.length();i++) {
				
				if (Str.charAt(i) != ' ') {
					
					count = count+1;
		
				}
				
			}
			
			System.out.println("The total number of characters in the given string is "+count);
			

		}

}
