package com.sabbath.cowsay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.io.File
import java.lang.RuntimeException
import javax.annotation.PostConstruct

@SpringBootApplication
class CowsayApplication {
    @PostConstruct
    fun init() {
        val javaVersion = System.getProperty("java.vendor")
        if (!(javaVersion.equals("bellsoft", true)))
            throw RuntimeException("Wrong Java vendor!! Please use JDK or JRE by Bellsoft")
    }
}

fun main(args: Array<String>) {
    runApplication<CowsayApplication>(*args)
}
