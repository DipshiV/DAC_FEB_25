package Package2;
import java.util.Scanner;
class Student{
	String name;
	int marks[]= new int[3];
	/*Student(String name, int marks[]) {
		this.name=name;
		for(int i=0;i<3;i++) {
			this.marks[i]=marks[i];
		}
	}*/
		public void assignValue(String name,int marks[]) {
			this.name=name;
			for(int i=0;i<3;i++) {
				this.marks[i]=marks[i];
			}
			
			
		}
		void calAvg() {
			int total=0;
			for(int i=0;i<3;i++) {
			total+=marks[i];
					}
			double avg=total/3.0;
			System.out.println("Total marks= "+total);
			System.out.print("Average marks are= "+avg);
			
		}
		void display() {
			System.out.println("Student's Name "+name);
		}
}

public class Q1 {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter Student Name");
String name=sc.nextLine();
System.out.println("Enter Marks of 3 Students");
int marks[]=new int[3];
for(int i=0;i<3;i++) {
marks[i]=sc.nextInt();
}
//Student s=new Student(name,marks);
Student s1= new Student();
s1.assignValue(name, marks);
s1.display();
s1.calAvg();

	}

}
