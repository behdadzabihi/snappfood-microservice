package krd.bootcamp.basket_item_service.common.exception;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String exception) {
        super(exception);
    }
}
