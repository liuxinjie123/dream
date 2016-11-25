package com.dream.service.music;

import com.dream.api.music.MusicService;
import com.dream.entity.music.Artist;
import com.dream.entity.music.Musician;
import com.dream.repository.music.ArtistRepository;
import com.dream.repository.music.MusicianRepository;
import com.dream.representation.common.result.Result;
import com.dream.representation.music.enums.EnumMusicianError;
import com.dream.representation.music.object.AlbumObject;
import com.dream.representation.music.object.ArtistObject;
import com.dream.representation.music.object.MusicianObject;
import com.dream.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service("musicMusicService")
public class MusicServiceImpl implements MusicService {
    @Autowired
    private ArtistRepository artistRepository;
    @Autowired
    private MusicianRepository musicianRepository;
    @Autowired
    private MusicObjectServiceImpl musicObjectService;

    @Override
    public boolean predicate(AlbumObject albumObject) {
        if (albumObject == null) return false;
        return albumObject.isReleased();
    }

    @Override
    public Result findArtistById(Long id) {
        Artist artist = artistRepository.findOne(id);
        if (artist == null) return Result.error(EnumMusicianError.此音乐人或乐队不存在.toString());
        ArtistObject artistObject = musicObjectService.changeArtistObject(artist);
        return Result.success().setData(artistObject);
    }

    @Override
    @Transactional
    public Result addArtist(ArtistObject artistObject) {
        Artist artist = BeanMapper.map(artistObject, Artist.class);
        artistRepository.save(artist);
        if (artistObject.getMembers() != null && artistObject.getMembers().size() != 0) {
            List<Musician> musicianList = BeanMapper.map(artistObject.getMembers(), Musician.class)
                    .parallelStream()
                    .map(musician -> {
                        musician.setArtistId(artist.getId());
                        return musician;
                    }).collect(Collectors.toList());
            musicianRepository.save(musicianList);
        }
        Result result = findArtistById(artist.getId());
        if (!result.isSuccess()) return result;
        return Result.success().setData(result.getData());
    }

    @Override
    public Result findArtistList() {
        return Result.success().setData(musicObjectService.changeArtistObject(artistRepository.findAll()));
    }

    @Override
    public Result findMusicianById(Long id) {
        Musician musician = musicianRepository.findOne(id);
        if (musician == null) return Result.error(EnumMusicianError.此艺术家不存在.toString());
        return Result.success().setData(musicObjectService.changeMusicianObject(musician));
    }

    @Override
    public Result findMusicianByArtistId(Long artistId) {
        return Result.success().setData(musicObjectService.changeMusicianObject(musicianRepository.findByArtistId(artistId)));
    }

    @Override
    @Transactional
    public Result addMusician(MusicianObject musicianObject) {
        Musician musician = BeanMapper.map(musicianObject, Musician.class);
        musicianRepository.save(musician);
        return Result.success().setData(findArtistById(musician.getId()));
    }


    @Override
    public Result findAllArtistOrigins() {
        Set<String> origins = artistRepository.findAll().parallelStream()
                .map(artist -> artist.getOrigin()).collect(Collectors.toSet());
        return Result.success().setData(origins);
    }




}
