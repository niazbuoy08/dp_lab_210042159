public class Driver {
    private String id;
    private String name;
    private String vehicleType;
    private String location;
    private double rating;
    private boolean availability;

    // Constructor
    public Driver(String id, String name, String vehicleType, String location) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.rating = 5.0;
        this.availability = true;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void acceptRide(Trip trip) {

    }

    public void rateRider(Rider rider, double rating) {

    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    public void startTrip(Trip trip) {
        
    }

    public void completeTrip(Trip trip) {

    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
