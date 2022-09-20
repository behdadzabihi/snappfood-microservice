package krd.bootcamp.basket_service.address_client;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.basket_service.common.BaseDTO;
import lombok.Data;

@Data
public class AddressDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String title;

    @ApiModelProperty(required = true,hidden = false)
    private String phoneNumber;

    @ApiModelProperty(required = true,hidden = false)
    private LocationDTO locationDTO;
}
