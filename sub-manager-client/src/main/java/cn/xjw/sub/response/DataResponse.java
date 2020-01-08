package cn.xjw.sub.response;

import cn.xjw.sub.constants.ErrorCodeConst;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 2020/1/7 16:06
 *
 * @author <a href="1521975316@qq.com">xjw</a>
 * @record:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataResponse<T> implements Serializable {

    private String code;

    private String message;

    private T data;

    public void success() {
        this.code = ErrorCodeConst.SUCCESS;
        this.message = ErrorCodeConst.SUCCESS_MSG;
    }

    public void failure() {
        this.code = ErrorCodeConst.FAILURE;
        this.message = ErrorCodeConst.FAILURE_MSG;
    }

}
