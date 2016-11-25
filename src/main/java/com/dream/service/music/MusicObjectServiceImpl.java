package com.dream.service.music;

import com.dream.entity.music.Artist;
import com.dream.entity.music.Musician;
import com.dream.repository.music.MusicianRepository;
import com.dream.representation.music.object.ArtistObject;
import com.dream.representation.music.object.MusicianObject;
import com.dream.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("musicMusicObjectService")
public class MusicObjectServiceImpl {
    @Autowired
    private MusicianRepository musicianRepository;

    public ArtistObject changeArtistObject(Artist artist) {
        if (artist == null) return null;
        ArtistObject artistObject = BeanMapper.map(artist, ArtistObject.class);
        List<Musician> members = musicianRepository.findByArtistId(artist.getId());
        if (members != null && members.size() != 0) artistObject.setMembers(BeanMapper.map(members, MusicianObject.class));
        return artistObject;
    }

    public List<ArtistObject> changeArtistObject(List<Artist> artistList) {
        if (artistList == null || artistList.size() == 0) return null;
        List<ArtistObject> artistObjectList = BeanMapper.map(artistList, ArtistObject.class);
        artistObjectList.parallelStream().forEach(artistObject -> {
            List<Musician> members = musicianRepository.findByArtistId(artistObject.getId());
            if (members != null && members.size() != 0) artistObject.setMembers(BeanMapper.map(members, MusicianObject.class));
        });
        return artistObjectList;
    }

    public MusicianObject changeMusicianObject(Musician musician) {
        if (musician == null) return null;
        MusicianObject musicianObject = BeanMapper.map(musician, MusicianObject.class);
        return musicianObject;
    }

    public List<MusicianObject> changeMusicianObject(List<Musician> musicianList) {
        if (musicianList == null || musicianList.size() == 0) return null;
        List<MusicianObject> musicianObjectList = BeanMapper.map(musicianList, MusicianObject.class);
        return musicianObjectList;
    }
}
