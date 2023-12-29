package dev.syntax.app;

public class TransportSystem {

	public static void main(String[] args) {
		PublicTransport bus = new PublicTransport("bus", 770, 1500);
		PublicTransport subway = new PublicTransport("subway", 1, 1000);
		
		Student ho = new Student("ho", 3000);
		
		bus.ride(ho);
		System.out.println(ho);
		
		subway.ride(ho);
		System.out.println(ho);
		
		subway.ride(ho);
		System.out.println(ho);
		
		
		System.out.println(bus);
		System.out.println(subway);

	}

}
