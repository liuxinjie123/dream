package com.dream.entity.music;

import com.dream.entity.common.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "music_musician")
@Data
@NoArgsConstructor
public class Musician extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 30)
    private Long id;
    @Column(name = "artist_id", length = 30)
    private Long artistId;                               //所属乐队id
    @Column(name = "name", length = 60)
    private String name;                                 //艺术家姓名
    @Column(name = "origin", length = 120)
    private String origin;

}
