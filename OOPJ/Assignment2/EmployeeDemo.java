class Employee{

//instance var
private int empId;
private String empName;
public static int total;

//instance method
void set(int id, String name){
empId=id;
empName=name;
}
static void add(int a, int b){
	System.out.print(a+b)
}

void show(){
System.out.println(empId+ " " +empName);
}
}
//Drivar class
class EmployeeDemo{
public static void main(String args[]){
Employee e1= new Employee();

e1.set(111, "Dipshi");
e1.show();

Employee e2= new Employee();
e2.set(001, "Parul");
e2.show();

System.out.println()"Addition =" +(Employee.add(15,17)));


}
}
