package fi.organization.restful.restcontroller;

import fi.organization.restful.repository.CannotFindLocationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Helper class for generating error messages.
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(CannotFindLocationException.class)
    public ResponseEntity<ErrorInfo> handleConflict(CannotFindLocationException ex) {
        var errorInfo = new ErrorInfo("Could not found location with id " + ex.getLocationId());
        return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.NOT_FOUND);
    }
}

