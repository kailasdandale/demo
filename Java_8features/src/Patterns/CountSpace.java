package Patterns;

public class CountSpace {

	public static void main(String[] args) {

		String s1 = "moto race";
		String s2= "care moto";
		
		
		String str1 = s1.replace(" ", "").toLowerCase();
		String str2 = s2.replace(" ", "").toLowerCase();
		
		char ch1[] = str1.toCharArray();
		char ch2[]= str2.toCharArray();
		
		
		boolean flag = true;
		
		for(int i=1; i<=ch1.length; i++) {
			
			if(ch1!=ch2) {
				flag =false;
			}else {
				flag =true;
			}
			
		}
		
		if(ch1==ch2) {
			System.out.println("Its an angram");
		}else {
			
			System.out.println("Its not ");
		}
		
	}
}
