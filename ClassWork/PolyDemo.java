//Polymorphism
class Adder{
int add(int a, int b){
	return a+b;
}
static int add(int a,int b){

return a+b;
}
static int add(int a,int b,int c){

return a+b+c;
}
static long add(int a, int b, long c){
return a+b+c;
}
}
class PolyDemo{
	public static void main(String args[]){
		Adder a1= new Adder();
		a1.add(2,4);
		Adder.add(2,7);
		Adder.add(2,3,5);
		Adder.add(2,3,5L);
	}
}