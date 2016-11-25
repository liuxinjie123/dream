package com.dream.representation.music.object;

import com.dream.representation.common.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class ArtistObject extends BaseObject implements Serializable {
    private Long id;
    private String name;                                      //艺术家 / 乐队 名称
    private List<MusicianObject> members;                     //乐队成员
    private String origin;                                    //来自哪里
    private boolean team;                                     //是否是乐队

    public boolean isFrom(String place) {
        return origin.equals(place);
    }

    public ArtistObject(String name, String origin, boolean team, LocalDateTime createTime, String createManId, LocalDateTime lastUpdateTime, String lastUpdateManId) {
        super(createManId, createTime, lastUpdateManId, lastUpdateTime);
        this.name = name;
        this.origin = origin;
        this.team = team;
    }
}
