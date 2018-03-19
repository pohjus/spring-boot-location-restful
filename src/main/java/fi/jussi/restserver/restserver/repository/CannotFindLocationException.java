package fi.jussi.restserver.restserver.repository;

/**
 * Class Description.
 *
 * @author Jussi Pohjolainen
 * @version 2017-10-09
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


