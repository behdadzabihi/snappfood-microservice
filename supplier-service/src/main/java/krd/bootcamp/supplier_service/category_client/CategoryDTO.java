package krd.bootcamp.supplier_service.category_client;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.supplier_service.common.BaseDTO;
import lombok.Data;

@Data
public class CategoryDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String title;

    @ApiModelProperty(required = true,hidden = false)
    private String logo;
}
