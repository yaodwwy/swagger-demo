package cn.adbyte.swagger.model;

import com.google.common.base.Converter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 * @author Adam
 */
@Data
@ApiModel(description = "查询参数")
public class FooQuery {

    private Long id;
    private String name;
    private Gender gender;
    @ApiModelProperty(allowableValues = "FEMALE,MALE",notes = "Gender.class")
    private String genderStr;

    public FooEntity convertTo() {
        return new FooConvert().doForward(this);
    }


    private static class FooConvert extends Converter<FooQuery, FooEntity> {

        @Override
        protected FooEntity doForward(FooQuery fooQuery) {
            FooEntity fooEntity = new FooEntity();
            BeanUtils.copyProperties(fooQuery, fooEntity);
            if(fooQuery.getGenderStr()!=null){
                fooEntity.setGender(Gender.valueOf(fooQuery.getGenderStr()));
            }
            return fooEntity;
        }

        @Override
        protected FooQuery doBackward(FooEntity fooEntity) {
            return null;
        }
    }
}

