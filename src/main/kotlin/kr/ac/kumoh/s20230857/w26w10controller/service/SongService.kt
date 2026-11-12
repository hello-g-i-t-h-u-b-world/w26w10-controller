package kr.ac.kumoh.s20230857.w26w10controller.service

import kr.ac.kumoh.s20230857.w26w10controller.model.Song
import org.springframework.stereotype.Service

@Service
class SongService {
    fun findAllSongs(): List<Song> = listOf(
        Song(1, "Cosmic Echo", "NEBULA")
    )
}