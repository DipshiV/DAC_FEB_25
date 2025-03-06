/*6. Write a program to display character and string literals along with their ASCII values.*/
public class CharToAscii{
public static void main(String[] args){
		for(int i=97; i<123; i++){
			System.out.println(i + " " +(char)i + " ");
		}
		System.out.println();
		
		String s = "hello world";
		System.out.println(s);
		for(int i=0; i<s.length(); i++){
			System.out.print((int)(s.charAt(i)) + " ");
		}
	}
}