package krd.bootcamp.basket_item_service.basket_item;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.basket_item_service.common.BaseDTO;
import lombok.Data;


@Data
public class BasketItemDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private Integer count;

    @ApiModelProperty(required = true,hidden = false)
    private Long basketId;

    @ApiModelProperty(required = true,hidden = false)
    private Long itemId;
}
