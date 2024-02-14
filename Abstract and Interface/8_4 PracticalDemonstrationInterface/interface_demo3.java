import java.util.Scanner;

class Vehicle{
	int noSeats;
	String fuel;
	int speed;
	
	public Vehicle(int noSeats, String fuel, int speed){
		this.noSeats = noSeats;
		this.fuel = fuel;
		this.speed = speed;
	}
	
	public String toString(){
		return "No of Seats:" + noSeats + " Fuel Used: " + fuel + " Speed: " + speed;
	}
}

interface FlyingObject{
	int maxheight = 20000;
	
}

class Aeroplane extends Vehicle implements FlyingObject{
		int takeoffSpeed;
		
		public Aeroplane(int noSeats, String fuel, int speed, int takeoffSpeed){
			super(noSeats, fuel, speed);
			this.takeoffSpeed = takeoffSpeed;
		}
		
		public String toString(){
			String aeroPrint;
			aeroPrint = "Attributes of Aeroplane\n";
			aeroPrint = aeroPrint + "No of Seats:" + noSeats + " Fuel Used: " + fuel + " Speed: " + speed;
			aeroPrint = aeroPrint + " Maximum Height: " + maxheight;
			aeroPrint = aeroPrint + " TakeOffSpeed: " + takeoffSpeed;
			return aeroPrint;
	}
}

class Rocket extends Vehicle implements FlyingObject{
	public Rocket(int noSeats, String fuel, int speed){
		super(noSeats, fuel, speed);
	}
}
class Bus extends Vehicle{
	String type ;
	
	public Bus(int noSeats, String fuel, int speed, String type){
		super(noSeats, fuel, speed);
		this.type = type;
	}
	
	public String toString(){
		String aeroPrint;
		aeroPrint = "Attributes of Bus\n";
		aeroPrint = aeroPrint + "No of Seats:" + noSeats + " Fuel Used: " + fuel + " Speed: " + speed;
		aeroPrint = aeroPrint + " Type" + type;
		return aeroPrint;
	}
}
	
class InterfaceDemo{
	public static void main(String [] args){
		Vehicle v [] = new Vehicle[5];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<5;i++){
			System.out.println("Enter 1 to create Bus, 2 to create Aeroplane and 3 to create Rocket");
			int choice = sc.nextInt();
			if (choice == 1){ 	//user wants to create bus
				int seats;
				String fuel;
				int speed;
				String type;
				System.out.println("Enter Seats, Fuel, Speed and Type of Bus");
				seats = sc.nextInt();
				fuel = sc.next();
				speed = sc.nextInt();
				type = sc.next();
				v[i] = new Bus(seats, fuel, speed, type);
			}
			else if (choice == 2){
				int seats;
				String fuel;
				int speed;
				int takeoffSpeed;
				System.out.println("Enter Seats, Fuel, Speed and takeoffSpeed of Aeroplane");
				seats = sc.nextInt();
				fuel = sc.next();
				speed = sc.nextInt();
				takeoffSpeed = sc.nextInt();
				v[i] = new Aeroplane(seats, fuel, speed, takeoffSpeed);
			}
			else{
				int seats;
				String fuel;
				int speed;
				System.out.println("Enter Fuel, Speed of Rocket");
				seats = 4;
				fuel = sc.next();
				speed = sc.nextInt();
				
				v[i] = new Rocket(seats, fuel, speed);
			}	
			
		}
		int count = 0;
		for (int i = 0; i<5;i++)
		{
			if (v[i] instanceof FlyingObject)
				count ++;
			System.out.println(v[i]);
		}
		System.out.println("Total FlyingObjects are: " + count);
	}
}