package com.ilabs.cardservice.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResponse {
    private Object data;
    private String message;
    private int statusCode;
}
