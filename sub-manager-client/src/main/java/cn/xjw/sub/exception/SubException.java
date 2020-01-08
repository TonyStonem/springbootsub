package cn.xjw.sub.exception;

import lombok.Data;

@Data
public class SubException extends RuntimeException {

    private String code;

    public SubException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    /**
     * 你可以重载其它方法
     * 配合：ErrorCodeConst.java 定义某些业务异常
     */
}