package As1_Crops;

public class As1_CropCircle {
    double latitude;
    double longitude;
    double radius; /* units are meters */


    /// constructor - creates a new crop circle for aliens to land in
    /// parameters
    ///   latitude - double
    ///   longitude - double
    ///   radius - double (in meters)
    ///
    As1_CropCircle(double latitude, double longitude, double radius) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;

        /* check for northern hemisphere */
        if (this.latitude > 0.0) {
            System.out.println("Creating new crop circle of radius " + this.radius + "m in northern hemisphere.");
        }
    }
}
