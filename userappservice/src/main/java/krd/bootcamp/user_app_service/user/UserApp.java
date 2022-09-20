package krd.bootcamp.user_app_service.user;


import krd.bootcamp.user_app_service.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "tbl_user")
@Data
@Audited
public class UserApp extends BaseEntity {

    @NotNull
    @Column(name = "user_name")
    private String username;

    @NotNull
    private String password;



}
