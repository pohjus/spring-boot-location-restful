package fi.organization.restful.repository;

import fi.organization.restful.model.Location;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface for handling create, read, update and delete from database.
 */
public interface MyDatabaseHandler extends CrudRepository<Location, Long> {
    Iterable<Location> findByLatitude(double latitude);
}
