package com.dream.representation.music;

import com.dream.representation.common.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class Album extends BaseObject implements Serializable {
    private Long id;
    private String name;                         //专辑名称
    private List<Track> trackList;               //专辑上所有曲目列表
    private List<Musician> musicianList;         //专辑上所有艺术家列表
}
