package com.hengdong.metrostation.controller.advice;

import com.hengdong.metrostation.dto.CustomResponseBody;
import com.hengdong.metrostation.exception.CustomException;
import com.hengdong.metrostation.utils.ResponseExceptionTranslator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice("com.hengdong.metrostation.controller")
@Slf4j
public class CustomExceptionAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<CustomResponseBody> handleException(Exception e) {
        log.info(String.format("handling error: %s, %s.", e.getClass().getSimpleName(), e.getMessage()));
        return ResponseExceptionTranslator.translate(e);
    }

}
