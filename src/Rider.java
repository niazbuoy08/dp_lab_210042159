public class Rider {

    private String id;
    private String name;
    private String location;
    private double rating;
    private PaymentMethod preferredPaymentMethod;
    private String notificationPreference;

    public Rider(String id, String name, String location, PaymentMethod preferredPaymentMethod, String notificationPreference) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = 5.0;
        this.preferredPaymentMethod = preferredPaymentMethod;
        this.notificationPreference = notificationPreference;
    }

    public void requestRide(String pickupLocation, String dropOffLocation , RideType rideType )
    {

    }

    public void rateDriver(Driver driver, double rating)
    {

    }

    public void makePayment(Trip trip, PaymentMethod paymentMethod) {

    }

}
