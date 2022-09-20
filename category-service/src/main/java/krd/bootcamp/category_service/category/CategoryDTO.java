package krd.bootcamp.category_service.category;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.category_service.common.BaseDTO;
import lombok.Data;


@Data
public class CategoryDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String title;

    @ApiModelProperty(required = true,hidden = false)
    private String logo;




}
