package krd.bootcamp.supplier_service.common;

import feign.Logger;
import feign.codec.ErrorDecoder;
import krd.bootcamp.supplier_service.common.exception.CustomApiErrorDecoder;
import org.springframework.context.annotation.Bean;

public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomApiErrorDecoder();
    }
}
