package com.hengdong.metrostation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by wyy on 17-7-12.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomResponseBody implements Serializable {
    @JsonProperty("result_code")
    private String resultCode;

    @JsonProperty("error_message")
    private String errorMessage;

    @JsonProperty("content")
    private Object content;

}
