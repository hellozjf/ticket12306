package com.hellozjf.ticket12306.exception;

import com.hellozjf.ticket12306.constant.ResultEnum;
import lombok.Getter;

/**
 * @author Jingfeng Zhou
 */
@Getter
public class Ticket12306Exception extends RuntimeException {

    private Integer code;

    public Ticket12306Exception(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Ticket12306Exception(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
