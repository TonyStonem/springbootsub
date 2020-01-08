package cn.xjw.sub.core.bo;

import org.springframework.stereotype.Component;

/**
 * 介于ServiceImplements 与 DB之间，如果Service中的逻辑复杂度
 * 比较高，需要进行封装的话，封装的逻辑放入此文件中
 *
 * 封装后，使用 @Autowired 注入
 *
 */
@Component
public class UserBO {


}
