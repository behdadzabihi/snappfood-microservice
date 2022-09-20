package krd.bootcamp.basket_service.basket;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.basket_service.common.BaseDTO;
import lombok.Data;


@Data
public class BasketDTO extends BaseDTO {


    @ApiModelProperty(required = true,hidden = false)
    private String paidPrice;

    @ApiModelProperty(required = true,hidden = false)
    private Boolean finalizeBasket;

    @ApiModelProperty(required = true,hidden = false)
    private Long supplierId;

    @ApiModelProperty(required = true,hidden = false)
    private Long addressId;



}
