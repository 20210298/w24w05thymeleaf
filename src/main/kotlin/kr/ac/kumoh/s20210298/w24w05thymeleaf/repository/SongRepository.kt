package kr.ac.kumoh.s20210298.w24w05thymeleaf.repository

import kr.ac.kumoh.s20210298.w24w05thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    val songs = listOf(
        Song(1, "supernova", "aespa"),
        Song(2, "talking", "Bruno"),
        Song(3, "Chemi", "Post"),
    )

    val songSize: Int
        get()=songs.size

    fun getSong(index: Int) = songs[index]
    //fun getSinger(singer: String)=songs[index].singer
}