package com.dream.representation.music.object;

import com.dream.representation.common.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class MusicianObject extends BaseObject implements Serializable {
    private Long id;
    private Long artistId;                               //所属乐队id
    private String name;                                 //艺术家姓名
    private String origin;                               //来自哪里

    public MusicianObject(String name, String origin, LocalDateTime createTime, String createManId, LocalDateTime lastUpdateTime, String lastUpdateManId) {
        super(createManId, createTime, lastUpdateManId, lastUpdateTime);
        this.name = name;
        this.origin = origin;
    }
}
