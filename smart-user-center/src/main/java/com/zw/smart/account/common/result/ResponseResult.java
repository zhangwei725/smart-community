package com.zw.smart.account.common.result;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author zhangwei
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResponseResult<T> extends BaseResult {
    private int status;
    private String msg;
    private T data;
}
