package com.dream.representation.music.object;

import com.dream.exception.IndexException;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class ArtistObjectList implements Serializable {
    private List<ArtistObject> artistObjectList;

    public ArtistObjectList(List<ArtistObject> artistObjectList) {
        this.artistObjectList = artistObjectList;
    }

    public ArtistObject getArtistObject(int index) throws IndexException {
        if (index < 0 || index >= artistObjectList.size()) throw new IndexException(index);
        return artistObjectList.get(index);
    }

    public String getArtistName(int index) {
        ArtistObject artistObject = null;
        try {
            artistObject = getArtistObject(index);
        } catch (IndexException e) {
            e.printStackTrace();
        }
        return artistObject.getName();
    }


}
