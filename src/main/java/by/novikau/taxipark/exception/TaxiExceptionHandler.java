package by.novikau.taxipark.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TaxiExceptionHandler extends ResponseEntityExceptionHandler {
    private static final Logger LOG = LoggerFactory.getLogger(TaxiExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ExceptionResponse> handleкException(Exception exception) {
        LOG.error("Exception happened.", exception);
        return new ResponseEntity<>(new ExceptionResponse("Exception happened. " + exception.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<ExceptionResponse> handleкNotFoundException(NotFoundException exception) {
        LOG.error("Exception happened.", exception);
        return new ResponseEntity<>(new ExceptionResponse("Exception happened. " + exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
