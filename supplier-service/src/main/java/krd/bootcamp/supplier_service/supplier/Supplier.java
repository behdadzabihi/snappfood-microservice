package krd.bootcamp.supplier_service.supplier;


import krd.bootcamp.supplier_service.common.BaseEntity;
import lombok.Data;

import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "tbl_supplier")
@Data
@Audited
public class Supplier extends BaseEntity {

    @NotNull
    private String name;

    @NotNull
    private String username;

    @NotNull
    private String password;


    @NotNull
    @Column(name = "supplier_location")
    private Point<G2D> location;

    @NotNull
    private String logo;

    @NotNull
    private String about;

    @NotNull
    @Column(name = "delivery_price")
    private String deliveryPrice;

    @NotNull
    @Column(name = "category_id")
    private Long categoryId;

}
