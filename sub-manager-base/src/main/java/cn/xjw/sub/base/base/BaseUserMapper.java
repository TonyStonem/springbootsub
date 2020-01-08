package cn.xjw.sub.base.base;

import tk.mybatis.mapper.common.Mapper;

/**
 * 2020/1/7 15:54
 *
 * @author <a href="1521975316@qq.com">xjw</a>
 * @record:
 *
 * 继承自己的MyMapper,特别注意，该接口不能被扫描到，否则会出错
 */
public interface BaseUserMapper<T> extends Mapper<T> {
}
