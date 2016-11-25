package com.dream.entity.music;

import com.dream.entity.common.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "music_track")
@Data
@NoArgsConstructor
public class Track extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 30)
    private Long id;
    @Column(name = "album_id", length = 30)
    private Long albumId;                                   //所属专辑id
    @Column(name = "name", length = 120)
    private String name;                                    //曲目名称

}
