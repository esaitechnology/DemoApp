package prog;

public class Pangram {
	
	public static void main(String[] args) {
		
		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		boolean flag=false;
		s1=s1.replace(" ", "");
		
		char[] ch = s1.toCharArray();
		
		int[] arr = new int[26];
		
		for(int i=0; i<ch.length;i++) {
			
			int index = ch[i]-65;
			arr[index]++;
			}
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
				System.out.println("the String is not pangram");
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("the String is pangram");
		}
		
	}

}
