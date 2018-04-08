package com.hengdong.metrostation.utils;

import com.hengdong.metrostation.dto.CustomResponseBody;
import com.hengdong.metrostation.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Slf4j
public class ResponseExceptionTranslator {

    public static ResponseEntity<CustomResponseBody> translate(Exception e) {

        HttpHeaders headers = new HttpHeaders();
        headers.set("Cache-Control", "no-store");
        headers.set("Pragma", "no-cache");
        CustomResponseBody body = new CustomResponseBody();

        ResponseEntity<CustomResponseBody> response;
        HttpStatus httpStatus;
        if (e instanceof CustomException) {
            CustomException ce = (CustomException) e;
            body.setResultCode(ce.getErrorCode());
            body.setErrorMessage(ce.getMessage());
            httpStatus = HttpStatus.valueOf(ce.getHttpCode());
        } else {
            body.setResultCode("server_error");
            body.setErrorMessage(e.getMessage());
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        body.setContent("");

        response = new ResponseEntity<>(body, headers, httpStatus);
        return response;
    }

}
