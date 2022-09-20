package krd.bootcamp.item_service.item;


import krd.bootcamp.item_service.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "tbl_item")
@Data
@Audited
public class Item extends BaseEntity {

    @NotNull
    private String name;

    @NotNull
    private Integer price;

    @NotNull
    private String image;

    @NotNull
    private String description;


    @NotNull
    @Column(name = "supplier_category_id")
    private Long supplierCategoryId;

}
