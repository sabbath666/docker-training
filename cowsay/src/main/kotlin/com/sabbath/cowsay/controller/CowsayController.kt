package com.sabbath.cowsay.controller

import com.sabbath.cowsay.service.CowService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CowsayController(
    val cowService: CowService
) {

    @GetMapping("/")
    fun sayHi():String {
        val message= listOf(
            "Hi there",
            """
            Junior: Where is the documentation 
            Senior: I am the documentation    
            """.trimIndent(),
            """
             - It works on my machine 
             - Then we'll ship your machine
             That is how Docker was born   
            """.trimIndent(),
            "CI/CD - continuous irritation / continuous disappointment =)",
            "Why would a DevOps go to Mars? - To Terraform it",
            """
            A DevOps walks into a bar 
            puts the bartender in a container 
            put K8s behind the bar
            spins up 100 bartenders
            orders 1 beer
            """.trimIndent()
        ).random()
        return cowService.say(message)
    }
}