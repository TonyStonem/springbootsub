package cn.xjw.sub.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 2020/1/7 16:24
 *
 * @author <a href="1521975316@qq.com">xjw</a>
 * @record:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class QueryUserRequest {

    @NotBlank(message = "用户ID不能为空")
    private String userId;

}
