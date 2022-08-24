package fi.organization.restful.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

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

    @Schema(description="Auto generated id", required = true)
    @Id
    @GeneratedValue
    private long id;

    @NonNull
    @Size(min = -90, max = 90)
    private double latitude;

    @NonNull
    @Size(min = -180, max = 180)
    private double longitude;
}
