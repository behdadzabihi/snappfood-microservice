package krd.bootcamp.basket_item_service.basket_client;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.basket_item_service.common.BaseDTO;
import lombok.Data;

@Data
public class BasketDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String paidPrice;

    @ApiModelProperty(required = true,hidden = false)
    private Boolean finalizeBasket;

}
