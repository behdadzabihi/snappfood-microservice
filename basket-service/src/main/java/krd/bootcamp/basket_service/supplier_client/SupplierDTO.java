package krd.bootcamp.basket_service.supplier_client;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.basket_service.common.BaseDTO;
import lombok.Data;

@Data
public class SupplierDTO extends BaseDTO {
    @ApiModelProperty(required = true,hidden = false)
    private String name;

    @ApiModelProperty(required = true,hidden = false)
    private String username;

    @ApiModelProperty(required = true,hidden = false)
    private String password;

    @ApiModelProperty(required = true,hidden = false)
    private LocationDTO locationDTO;

    @ApiModelProperty(required = true,hidden = false)
    private String logo;

    @ApiModelProperty(required = true,hidden = false)
    private String about;

    @ApiModelProperty(required = true,hidden = false)
    private String deliveryPrice;


}
