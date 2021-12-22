package exception;

import constant.ResultCode;

/**
 * @author hdgaadd
 * Created on 2021/12/08/19:43
 */
public class ApiException extends RuntimeException{
    public ApiException(String message) {
        super(message);
    }

    public ApiException(ResultCode resultCode) {
        super(resultCode.getMessage());
    }
}
