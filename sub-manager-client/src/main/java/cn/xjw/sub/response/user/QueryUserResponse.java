package cn.xjw.sub.response.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 2020/1/7 16:22
 *
 * @author <a href="1521975316@qq.com">xjw</a>
 * @record:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class QueryUserResponse {

    private String userName;

    private int sex;

    private String userId;

    private int status;

}
