package krd.bootcamp.basket_item_service.basket_item;


import krd.bootcamp.basket_item_service.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_basket_item")
@Data
@Audited
public class BasketItem extends BaseEntity {

    @NotNull
    private Integer count;

    @NotNull
    @Column(name = "basket_id")
    private Long basketId;


    @NotNull
    @Column(name = "item_id")
    private Long itemId;
}
