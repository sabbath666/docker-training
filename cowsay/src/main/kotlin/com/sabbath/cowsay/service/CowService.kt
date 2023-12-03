package com.sabbath.cowsay.service

import com.github.ricksbrown.cowsay.plugin.CowExecutor
import org.springframework.stereotype.Service

@Service
class CowService(
    val cowExecutor: CowExecutor = CowExecutor()
) {
    fun say(message: String): String {
        cowExecutor.apply {
            setMessage(message)
            setHtml(true)
        }
        return cowExecutor.execute()
    }
}