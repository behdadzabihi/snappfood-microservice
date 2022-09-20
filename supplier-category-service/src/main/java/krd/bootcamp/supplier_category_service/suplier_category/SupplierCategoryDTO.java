package krd.bootcamp.supplier_category_service.suplier_category;

import io.swagger.annotations.ApiModelProperty;
import krd.bootcamp.supplier_category_service.common.BaseDTO;
import lombok.Data;


@Data
public class SupplierCategoryDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String title;

    @ApiModelProperty(required = true,hidden = false)
    private Long supplierId;
}
