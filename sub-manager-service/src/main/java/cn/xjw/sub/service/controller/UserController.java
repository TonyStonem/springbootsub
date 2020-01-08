package cn.xjw.sub.service.controller;

import cn.xjw.sub.client.UserClient;
import cn.xjw.sub.core.service.UserService;
import cn.xjw.sub.exception.SubException;
import cn.xjw.sub.request.QueryUserRequest;
import cn.xjw.sub.response.DataResponse;
import cn.xjw.sub.response.user.QueryUserResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020/1/8 10:31
 *
 * @author <a href="1521975316@qq.com">xjw</a>
 * @record:
 */
@Slf4j
@RestController
@Api(description = "用户模块")
public class UserController implements UserClient {

    @Autowired
    private UserService userService;

    @Override
    @PostMapping("queryUser")
    @ApiOperation("查询用户详情")
    public DataResponse<QueryUserResponse> queryUser(@Validated @RequestBody QueryUserRequest request) {
        log.info("call queryUser start, request: " + request);
        DataResponse<QueryUserResponse> response = new DataResponse<>();
        try {
            response.setData(userService.queryUser(request));
            response.success();
        } catch (SubException e) {
            response.setCode(e.getCode());
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            log.error("查询用户信息失败", e);
            response.failure();
        }
        log.info("call queryUser end, response: " + response);
        return response;
    }

}
