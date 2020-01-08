package cn.xjw.sub.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 注意：base中的枚举是不对外暴露的，不要跟client应用中的枚举类搞混淆
 *
 */
@Getter
@AllArgsConstructor
public enum StatusEnum {

    FIRST_CHECK("0001", "初审"),
    SECOND_CHECK("0002", "复审");

    private String code;
    private String message;

    /**
     * 根据code获取枚举
     *
     * @param code
     * @return
     */
    public static StatusEnum getStatusEnum(String code) {
        for (StatusEnum statusEnum : values()) {
            if (statusEnum.getCode().equals(code)) {
                return statusEnum;
            }
        }
        return null;
    }
}
