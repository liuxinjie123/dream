package com.dream.entity.music;

import com.dream.entity.common.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "music_artist")
@Data
@NoArgsConstructor
public class Artist extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 30)
    private Long id;
    @Column(name = "name", length = 120)
    private String name;                                      //艺术家 / 乐队 名称
    @Column(name = "origin", length = 120)
    private String origin;                                    //来自哪里
    @Column(name = "team", length = 1)
    private boolean team;                                     //是否是乐队

}
