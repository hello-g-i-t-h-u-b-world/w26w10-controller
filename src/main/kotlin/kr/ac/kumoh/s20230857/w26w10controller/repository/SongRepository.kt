package kr.ac.kumoh.s20230857.w26w10controller.repository

import kr.ac.kumoh.s20230857.w26w10controller.model.Song

interface SongRepository {
    fun findAll(): List<Song>
}