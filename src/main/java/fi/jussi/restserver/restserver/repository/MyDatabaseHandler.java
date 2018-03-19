package fi.jussi.restserver.restserver.repository;

import fi.jussi.restserver.restserver.model.Location;
import org.springframework.data.repository.CrudRepository;

/**
 * Class Description.
 *
 * @author Jussi Pohjolainen
 * @version 2017-10-09
 */
public interface MyDatabaseHandler extends CrudRepository<Location, Long> {

}
