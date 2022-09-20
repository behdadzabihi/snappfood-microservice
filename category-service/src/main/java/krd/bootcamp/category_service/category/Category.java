package krd.bootcamp.category_service.category;


import krd.bootcamp.category_service.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
@Entity
@Table(name = "tbl_category")
@Data
@Audited
public class Category extends BaseEntity {

    @NotNull
    private String title;

    @NotNull
    private String logo;



}
