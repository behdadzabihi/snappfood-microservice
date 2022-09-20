package krd.bootcamp.basket_service.basket;


import krd.bootcamp.basket_service.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
@Entity
@Table(name = "tbl_basket")
@Data
@Audited
public class Basket extends BaseEntity {


    @NotNull
    @Column(name = "paid_price")
    private String paidPrice;

    @NotNull
    @JoinColumn(name = "finalize_basket")
    private Boolean finalizeBasket;

    @NotNull
    @Column(name = "supplier_id")
    private Long supplierId;

    @NotNull
    @Column(name = "address_id")
    private Long addressId;






}
