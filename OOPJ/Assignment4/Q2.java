package Package2;

import java.util.Scanner;

class Room{
	int height;
	int width;
	int breadth;
	Room(int height,int width,int breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
		
	}
	public int volume() {
		return height*width*breadth;
	}
}
	class RoomDemo{
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int b=sc.nextInt();
		int w=sc.nextInt();
		Room room1= new Room(h,b,w);
		
	
		int h1=sc.nextInt();
		int b1=sc.nextInt();
		int w1=sc.nextInt();
		
		Room room2= new Room(h1,b1,w1);
		
		public void display() {
			System.out.println("Volume of room1 "+room1.volume());
			System.out.println("Volume of room2 "+room2.volume());

		}
	}

public class Q2 {

	public static void main(String[] args) {
		
		RoomDemo rd= new RoomDemo();
		rd.display();
		// TODO Auto-generated method stub

	}

}
