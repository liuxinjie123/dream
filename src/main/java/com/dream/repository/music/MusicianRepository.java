package com.dream.repository.music;

import com.dream.entity.music.Musician;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicianRepository extends JpaRepository<Musician, Long> {

    List<Musician> findByArtistId(Long artistId);
}
