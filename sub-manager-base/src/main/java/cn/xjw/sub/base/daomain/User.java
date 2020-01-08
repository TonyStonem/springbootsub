package cn.xjw.sub.base.daomain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 2020/1/7 15:56
 *
 * @author <a href="1521975316@qq.com">xjw</a>
 * @record:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "T_USER")
public class User {

    /**
     * @Column，指定数据库列与实体类转换
     * 它会自动将下划线的变量跟驼峰变量绑定
     * 也就是说，如果你的字段是the_user_name，你的变量是theUserName，则不需要加@Column注解
     */
    @Column(name = "user_name")
    private String userName;

    @Column(name = "sex")
    private String sex;

    /**
     * @Id 指定该字段为主键
     */
    @Id
    private String userId;

    private String status;

}
