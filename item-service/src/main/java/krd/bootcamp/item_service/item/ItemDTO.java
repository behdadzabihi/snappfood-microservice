package krd.bootcamp.item_service.item;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.item_service.common.BaseDTO;
import lombok.Data;


@Data
public class ItemDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String name;

    @ApiModelProperty(required = true,hidden = false)
    private Integer price;

    @ApiModelProperty(required = true,hidden = false)
    private String image;

    @ApiModelProperty(required = true,hidden = false)
    private String description;

    @ApiModelProperty(required = true,hidden = false)
    private Long supplierCategoryId;
}
