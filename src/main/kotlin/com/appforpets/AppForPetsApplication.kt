package com.appforpets

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppForPetsApplication

fun main(args: Array<String>) {
	runApplication<AppForPetsApplication>(*args)
}
