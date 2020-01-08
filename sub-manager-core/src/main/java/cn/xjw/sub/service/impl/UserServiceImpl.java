package cn.xjw.sub.service.impl;

import cn.xjw.sub.bo.UserBO;
import cn.xjw.sub.dao.UserMapper;
import cn.xjw.sub.daomain.User;
import cn.xjw.sub.request.QueryUserRequest;
import cn.xjw.sub.response.user.QueryUserResponse;
import cn.xjw.sub.service.UserService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2020/1/8 9:46
 *
 * @author <a href="1521975316@qq.com">xjw</a>
 * @record:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBO userBO;

    @Autowired
    private UserMapper userMapper;

    @Override
    public QueryUserResponse queryUser(QueryUserRequest request) {
        QueryUserResponse response = new QueryUserResponse();

        User resultUser = userMapper.selectByPrimaryKey(request.getUserId());
        if (resultUser != null) {
            BeanUtils.copyProperties(resultUser, response);
        }

        return response;
    }

}
