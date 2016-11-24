package com.dream.representation.music;

import com.dream.representation.common.BaseObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ArtistObject extends BaseObject implements Serializable {
    private Long id;
    private String name;
    private int numbers;
    private String origin;
}
