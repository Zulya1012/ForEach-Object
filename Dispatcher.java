package frch;
public class Dispatcher {
	public static void main(String[] args) {
	
		Car c1 = new Car("Lada",2000);
		Car c2 = new Car("Tavria",1000);
		Car c3 = new Car("Opel",4000);
		Car[] c = {c1,c2,c3};
		for (Car temp : c) {
			temp.price = temp.price + 500;
		}
		
		for (Car temp : c) {
			System.out.println(temp.model + " " + temp.price);
			
		}
	}

}
