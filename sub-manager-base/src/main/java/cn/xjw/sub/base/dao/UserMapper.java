package cn.xjw.sub.base.dao;

import cn.xjw.sub.base.base.BaseUserMapper;
import cn.xjw.sub.base.daomain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 2020/1/7 15:53
 *
 * @author <a href="1521975316@qq.com">xjw</a>
 * @record:
 */
@Mapper
public interface UserMapper extends BaseUserMapper<User> {
}
