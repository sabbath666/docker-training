package com.sabbath.cowsay.controller

import com.sabbath.cowsay.service.CowService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CowsayController(
    val cowService: CowService
) {

    @GetMapping("/hi")
    fun sayHi():String {
        val message= listOf(
            "Делай хорошо, а плохо не делай",
            "Ну что там по задачам?",
            "Напиши еще служебок и съешь этих мягких французких булочек",
            "Проблема не нашей стороне",
            "Ну, привед",
            "Х Х и в продакшн",
            "Давайте ночью соберемся потестируем",
            "Дропни ка базу",
            "Я тебе покушать принес",
            "НЕТ - безопасника ответ",
            "Разработаю твой бэкенд ;)",
            "Разработаю твой фронтенд ;)",
            "Маленький сервис - это норма",
            "Давай делай бэкап",
            "Не деплой меня в пятницу",
            "МУ-МУ"
        ).random()
        return cowService.say(message)
    }
}