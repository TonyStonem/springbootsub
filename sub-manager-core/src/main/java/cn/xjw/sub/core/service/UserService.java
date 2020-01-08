package cn.xjw.sub.core.service;

import cn.xjw.sub.request.QueryUserRequest;
import cn.xjw.sub.response.user.QueryUserResponse;

/**
 * 2020/1/8 9:45
 *
 * @author <a href="1521975316@qq.com">xjw</a>
 * @record:
 */
public interface UserService {

    /**
     * 查询用户信息
     *
     * @param request
     * @return
     */
    QueryUserResponse queryUser(QueryUserRequest request);

}
