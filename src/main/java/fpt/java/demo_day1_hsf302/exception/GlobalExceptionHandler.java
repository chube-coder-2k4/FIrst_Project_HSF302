package fpt.java.demo_day1_hsf302.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;


@RestControllerAdvice // Annotation này tập trung xử lý các exception cho tất cả các controller
public class GlobalExceptionHandler {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleValidationException(Exception e, WebRequest request) {

        System.out.println("GlobalExceptionHandler handleValidationException");
       ErrorResponse errorResponse = new ErrorResponse();
    errorResponse.setTimestamp(new Date());
    errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());

    errorResponse.setError(HttpStatus.BAD_REQUEST.getReasonPhrase());
    errorResponse.setPath(request.getDescription(false).replace("uri=", ""));
    String message = e.getMessage();
    int start = message.lastIndexOf("[");
    int end = message.lastIndexOf("]");
    message = message.substring(start + 1, end - 1);
    errorResponse.setMessage(message);

       return errorResponse;


    }
}
