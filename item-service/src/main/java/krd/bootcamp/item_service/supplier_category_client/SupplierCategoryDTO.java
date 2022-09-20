package krd.bootcamp.item_service.supplier_category_client;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.item_service.common.BaseDTO;
import lombok.Data;

@Data
public class SupplierCategoryDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String title;

}
