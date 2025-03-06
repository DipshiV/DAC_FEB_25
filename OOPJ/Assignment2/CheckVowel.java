/*Q10:  Write a program to determine if a  character is a vowel  or a consonant using the 
ternary operator*/
import java.util.Scanner;
public class BooleanCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
		char ch=sc.next().charAt(0);
		ch=Character.toLowerCase(ch);
		
    String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Consonent";
		System.out.println("character is " +result);
		}
		}