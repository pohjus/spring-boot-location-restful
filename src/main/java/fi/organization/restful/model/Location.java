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

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private double latitude;
    @NonNull
    private double longitude;
}
