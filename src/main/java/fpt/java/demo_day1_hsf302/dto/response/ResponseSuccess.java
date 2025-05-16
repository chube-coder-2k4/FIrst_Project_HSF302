package fpt.java.demo_day1_hsf302.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class ResponseSuccess extends ResponseEntity<ResponseSuccess.Payload> {

    // PUT PATCH DELETE
    public ResponseSuccess(HttpStatusCode status, String message) {
        super(new Payload(status.value(),message), HttpStatus.OK);
    }

    public ResponseSuccess(HttpStatusCode status, String message, Object data) {
        super(new Payload(status.value(),message,data), HttpStatus.OK);
    }

    public static class Payload {
        private final String message;
        private final int status;
        private Object data;

        public Payload(int status, String message) {
            this.status = status;
            this.message = message;
        }

        public Payload(int status, String message, Object data) {
            this.status = status;
            this.message = message;
            this.data = data;
        }

        public String getMessage() {
            return message;
        }

        public int getStatus() {
            return status;
        }

        public Object getData() {
            return data;
        }
    }
}
