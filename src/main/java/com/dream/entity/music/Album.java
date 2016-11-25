package com.dream.entity.music;

import com.dream.entity.common.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "music_album")
@Data
@NoArgsConstructor
public class Album extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 30)
    private Long id;
    @Column(name = "artist_id", length = 30)
    private Long artistId;                                   //所属 艺术家/乐队 id
    @Column(name = "name", length = 120)
    private String name;                                     //专辑名称
    @Column(name = "released", length = 1)
    private boolean released;                                //是否已经发行

}
