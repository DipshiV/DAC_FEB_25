class Student{
int id;
String name;

//set value for name instance variable
//constructor: parameterized construction
Student(int id, String n){
this.name = n;
this.id = id;      //instance variable = parameter
}
}
class  ArrayDemo9{
 public static void main(String args[]){
 //Student s1 = new Student("Rahul");
 Student[] s1 = new Student[3];
 s1[0] = new Student(111,"Dipshi Verma");
 s1[1] = new Student(222,"Parul");
 s1[2] = new Student(333,"Pushpa");
 for(Student s : s1){
	 System.out.println(s.id+ " "+s.name);
 }
 }
}

//HW: Employee Management System
//Employee:
//Members:
//Employee name,sal,address,ph:15
//insert() ,print()

//HW: Customer Management System.
//Menu driven program
//1.Add new Customer
// 2.Print customer
//3.Delete a customer
//4.Exit



