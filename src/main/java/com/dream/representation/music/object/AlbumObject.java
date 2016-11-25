package com.dream.representation.music.object;

import com.dream.representation.common.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class AlbumObject extends BaseObject implements Serializable {
    private Long id;
    private Long artistId;                                   //所属乐队id
    private String name;                                     //专辑名称
    private boolean released;                                //是否已经发行
    private List<TrackObject> trackObjectList;               //专辑上所有曲目列表
    private List<MusicianObject> musicianObjectList;         //专辑上所有艺术家列表
}
