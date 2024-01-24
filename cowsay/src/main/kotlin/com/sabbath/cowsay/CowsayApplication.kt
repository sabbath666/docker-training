package com.sabbath.cowsay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.io.File
import java.lang.RuntimeException
import javax.annotation.PostConstruct

@SpringBootApplication
class CowsayApplication {

}

fun main(args: Array<String>) {
    runApplication<CowsayApplication>(*args)
}
