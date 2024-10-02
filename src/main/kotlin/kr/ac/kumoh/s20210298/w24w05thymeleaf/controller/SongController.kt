package kr.ac.kumoh.s20210298.w24w05thymeleaf.controller

@Controller
class SongController {
    @GetMapping("/song/random")
    fun getRandomSong(model: Model): String {
        model.addAttribute("songTitle", "supernova")
        return "random"
    }
}