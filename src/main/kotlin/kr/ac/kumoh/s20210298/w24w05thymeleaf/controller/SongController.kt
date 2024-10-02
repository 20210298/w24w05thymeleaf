package kr.ac.kumoh.s20210298.w24w05thymeleaf.controller

@Controller
class SongController {
    @GetMapping("/song/random")
    fun getRandomSong(): String {
        return "random"
    }
}