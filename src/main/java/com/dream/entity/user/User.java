package com.dream.entity.user;

import com.dream.entity.common.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "h_dream_user")
@Data
@NoArgsConstructor
public class User extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", length = 30)
    private Long id;
    @Column(name = "username", length = 50, nullable = false)
    private String username;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "phone", length = 50)
    private String phone;
    @Column(name = "email", length = 100)
    private String email;


}
