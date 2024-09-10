package com.DP;

public class RideSharingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       UserAuthentication auth = UserAuthentication.getInstance();
       auth.authenticate("Rushita");
       VehicleFactory carFactory = new CarFactory();
       Vehicle vehicle = carFactory.createVehicle();
       vehicle.startRide();
       PaymentFactory paymentFactory = new CreditCardFactory();
       PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
       paymentMethod.processPayment();
       VehicleFactory bikeFactory = new BikeFactory();
       Vehicle vehicle1 = bikeFactory.createVehicle();
       vehicle1.startRide();
       PaymentFactory paymentFactory1 = new CreditCardFactory();
       PaymentMethod paymentMethod1 = paymentFactory1.createPaymentMethod();
       paymentMethod1.processPayment();
       VehicleFactory scooterFactory = new ScooterFactory();
       Vehicle vehicle2 = scooterFactory.createVehicle();
       vehicle2.startRide();
       PaymentFactory paymentFactory2 = new CreditCardFactory();
       PaymentMethod paymentMethod2 = paymentFactory2.createPaymentMethod();
       paymentMethod2.processPayment();
	}

}
