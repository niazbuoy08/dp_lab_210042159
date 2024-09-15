public class Trip {
    private String id;
    private String pickupLocation;
    private String dropOffLocation;
    private RideType rideType;
    private String status;
    private double fare;
    private double distance;
    private Driver driver;
    private Rider rider;

    public Trip(String id, String pickupLocation, String dropOffLocation, RideType rideType, double distance, Rider rider) {
        this.id = id;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.distance = distance;
        this.fare = calculateFare(rideType, distance);
        this.status = "Pending";
        this.rider = rider;
    }

    public double calculateFare(RideType rideType, double distance) {

        double baseFare = switch (rideType) {
            case STANDARD -> 5.0;
            case PREMIUM -> 10.0;
            default -> 5.0;
        };


        double ratePerKm = 2.0;
        return baseFare + (distance * ratePerKm);
    }

    public void assignDriver(Driver driver) {

    }

    public void completeTrip() {

    }


    public double getFare() {
        return fare;
    }

    public String getId() {
        return id;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
