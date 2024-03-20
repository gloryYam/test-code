package sample.cafekiosk.spring.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    PRODUCT_NOT_FIND(HttpStatus.BAD_REQUEST, "상품을 찾을 수 없습니다");

    private final HttpStatus status;
    private final String errorMessage;

    ErrorCode(HttpStatus status, String errorMessage) {
        this.status = status;
        this.errorMessage = errorMessage;
    }
}
