package exception;

import constant.ResultCode;

/**
 * @author hdgaadd
 * Created on 2021/12/08/19:42
 */
public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(ResultCode resultCode) {
        throw new ApiException(resultCode);
    }

}
