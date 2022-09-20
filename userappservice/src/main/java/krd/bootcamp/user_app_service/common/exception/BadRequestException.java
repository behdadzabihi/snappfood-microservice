package krd.bootcamp.user_app_service.common.exception;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String exception) {
        super(exception);
    }
}
