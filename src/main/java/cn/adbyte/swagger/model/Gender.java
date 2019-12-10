package cn.adbyte.swagger.model;

import io.swagger.annotations.ApiModel;

/**
 * @author Adam
 */
@ApiModel(description = "性别")
public enum Gender {

    /**
     *
     */
    FEMALE(0,"女"),
    MALE(1,"男");

    private int code;
    private String type;

    Gender(int code, String type) {
        this.code = code;
        this.type = type;
    }

    /**
     * 如果出现ToString必须入参是String
     * 不然swagger-ui无法识别
     * @return
     */
    @Override
    public String toString() {

        return "Gender{" +
                "code=" + code +
                ", type='" + type + '\'' +
                '}';
    }

}
