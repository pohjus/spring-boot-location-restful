package fi.organization.restful.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Pojo for the RESTful api.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Location {

    public static final byte LATITUDE_MIN = -90;
    public static final byte LATITUDE_MAX = +90;

    public static final short LONGITUDE_MIN = -180;
    public static final short LONGITUDE_MAX = +180;

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private double latitude;
    @NonNull
    private double longitude;
}
