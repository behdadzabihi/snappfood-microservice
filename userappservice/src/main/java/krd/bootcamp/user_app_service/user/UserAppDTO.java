package krd.bootcamp.user_app_service.user;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.user_app_service.common.BaseDTO;
import lombok.Data;


@Data
public class UserAppDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String username;

    @ApiModelProperty(required = true,hidden = false)
    private String password;



}
