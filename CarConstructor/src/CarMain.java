public class CarMain {

	public static void main(String[] args) {
		Car audiCar=new Car("Sports", "Audi", "red");
		audiCar.increaseSpeed(20);
		audiCar.printInfo();
		
		 Car bmw = new Car("Sports" , "BMW" , "blue");
	     bmw.increaseSpeed(10);
	     bmw.increaseSpeed(25);
	     bmw.increaseSpeed(5);
	     bmw.decreaseSpeed(25);
	     bmw.printInfo();
	     
	     Car mercedes = new Car("Corporate" , "Mercedes" , "black");
	     mercedes.speed = 50;
	     mercedes.printInfo();
	}

}
