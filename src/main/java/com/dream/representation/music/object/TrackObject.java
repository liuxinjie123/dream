package com.dream.representation.music.object;

import com.dream.representation.common.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class TrackObject extends BaseObject implements Serializable {
    private Long id;
    private Long albumId;                               //所属专辑id
    private String name;                                //曲目名称
}
