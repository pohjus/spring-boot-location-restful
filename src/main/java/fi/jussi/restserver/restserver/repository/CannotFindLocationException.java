package fi.jussi.restserver.restserver.repository;

/**
 * Exception for if location is not found from the database.
 */
public class CannotFindLocationException extends IllegalArgumentException {

    private long locationId;

    public CannotFindLocationException(long id) {
        locationId = id;
    }

    public long getLocationId() {
        return locationId;
    }
}


