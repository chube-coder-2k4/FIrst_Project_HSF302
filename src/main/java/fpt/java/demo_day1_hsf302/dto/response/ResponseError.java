package fpt.java.demo_day1_hsf302.dto.response;

public class ResponseError extends ResponseData{
    public ResponseError(int status,String message) {
        super(status,message);
    }
}
