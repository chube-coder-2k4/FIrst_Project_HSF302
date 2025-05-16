package fpt.java.demo_day1_hsf302.dto.response;

import org.springframework.http.HttpStatus;

public class ResponseFailure extends ResponseSuccess{
    public ResponseFailure(HttpStatus status, String message) {
        super(status, message);
    }
}
