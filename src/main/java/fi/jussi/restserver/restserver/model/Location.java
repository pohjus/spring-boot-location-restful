package fi.jussi.restserver.restserver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Class Description.
 *
 * @author Jussi Pohjolainen
 * @version 2017-10-09
 */
@Entity
public class Location implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private double latitude;
    private double longitude;

    public long getId() {
        return this.id;
    }

    public Location() {
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
