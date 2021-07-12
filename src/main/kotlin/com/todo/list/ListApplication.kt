package com.todo.list

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ListApplication

fun main(args: Array<String>) {
	runApplication<ListApplication>(*args)
}
