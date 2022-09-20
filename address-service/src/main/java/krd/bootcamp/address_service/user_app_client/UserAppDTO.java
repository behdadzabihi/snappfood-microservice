package krd.bootcamp.address_service.user_app_client;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.address_service.common.BaseDTO;
import lombok.Data;

@Data
public class UserAppDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String username;

    @ApiModelProperty(required = true,hidden = false)
    private String password;
}
