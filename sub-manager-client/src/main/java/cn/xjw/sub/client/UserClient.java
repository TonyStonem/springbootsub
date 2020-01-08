package cn.xjw.sub.client;

import cn.xjw.sub.request.QueryUserRequest;
import cn.xjw.sub.response.DataResponse;
import cn.xjw.sub.response.user.QueryUserResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 2020/1/7 16:05
 *
 * @author <a href="1521975316@qq.com">xjw</a>
 * @record:
 */
public interface UserClient {

    /**
     * 查询用户
     *
     * @param request
     * @return
     */
    @PostMapping(value = "queryUser")
    DataResponse<QueryUserResponse> queryUser(@Validated @RequestBody QueryUserRequest request);

}
