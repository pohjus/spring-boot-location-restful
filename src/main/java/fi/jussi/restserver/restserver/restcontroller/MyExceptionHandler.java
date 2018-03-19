package fi.jussi.restserver.restserver.restcontroller;

import fi.jussi.restserver.restserver.repository.CannotFindLocationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Class Description.
 *
 * @author Jussi Pohjolainen
 * @version 2017-10-09
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(CannotFindLocationException.class)
    public ResponseEntity<ErrorInfo> handleConflict(CannotFindLocationException ex) {
        ErrorInfo e = new ErrorInfo("Could not found location with id " + ex.getLocationId());
        return new ResponseEntity<ErrorInfo>(e, HttpStatus.NOT_FOUND);
    }
}

