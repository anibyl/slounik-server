package org.anibyl.slounik.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @author Usievaład Kimajeŭ
 * @created 23.12.2017
 */
@SpringBootApplication
class Application

fun main(args: Array<String>) {
	SpringApplication.run(Application::class.java, *args)
}
