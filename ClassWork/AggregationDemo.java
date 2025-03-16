class Employee{
int id;
String name;
Address a; //Has-a relationship with Address class

Employee(int id, String name, Address a){
this.id= id;
this.name=name;
this.a=a;
}

void display(){
System.out.println(id+ " "+name);
System.out.println(a.city+" "+a.state+" "+a.country);
}
}

class Address{
String city,state,country;

Address(String city, String state, String country){
this.city=city;
this.state=state;
this.country=country;
}
}

class AggregationDemo{
public static void main(String args[]){
Address a1= new Address("Lucknow","UP","India");

Employee e = new Employee(111, "Disphi",a1);
 e.display();

}
}