package com.example.ciexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CiexampleApplication

fun main(args: Array<String>) {
    runApplication<CiexampleApplication>(*args)
}
