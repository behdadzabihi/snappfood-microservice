package krd.bootcamp.supplier_service.supplier;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.supplier_service.common.BaseDTO;
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

    @ApiModelProperty(required = true,hidden = false)
    private Long categoryId;

}
