package com.example.springboottodolist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootTodolistApplication

fun main(args: Array<String>) {
	runApplication<SpringBootTodolistApplication>(*args)
}
