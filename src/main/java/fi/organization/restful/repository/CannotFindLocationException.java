package fi.organization.restful.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Exception for if location is not found from the database.
 */

@Getter
@AllArgsConstructor
public class CannotFindLocationException extends IllegalArgumentException {
    private long locationId;
}


