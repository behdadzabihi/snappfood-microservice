package krd.bootcamp.address_service.address;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.address_service.common.BaseDTO;
import lombok.Data;



@Data
public class AddressDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String title;

    @ApiModelProperty(required = true,hidden = false)
    private String phoneNumber;

    @ApiModelProperty(required = true,hidden = false)
    private LocationDTO locationDTO;

    @ApiModelProperty(required = true,hidden = false)
    private Long userAppId;
}
