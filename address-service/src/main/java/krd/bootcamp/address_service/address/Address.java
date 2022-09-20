package krd.bootcamp.address_service.address;


import krd.bootcamp.address_service.common.BaseEntity;
import lombok.Data;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "tbl_address")
@Data
@Audited
public class Address extends BaseEntity {

    @NotNull
    private String title;

    @NotNull
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotNull
    @Column(name = "user_location")
    private Point<G2D> location;

    @NotNull
    @Column(name = "user_id")
    private Long userAppId;


}
