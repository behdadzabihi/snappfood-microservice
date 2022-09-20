package krd.bootcamp.supplier_category_service.suplier_category;


import krd.bootcamp.supplier_category_service.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "tbl_supplier_category")
@Data
@Audited
public class SupplierCategory extends BaseEntity {

    @NotNull
    private String title;

    @NotNull
    @Column(name = "supplier_id")
    private Long supplierId;




}
