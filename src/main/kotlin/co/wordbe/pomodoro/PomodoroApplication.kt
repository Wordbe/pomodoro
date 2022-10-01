package co.wordbe.pomodoro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PomodoroApplication

fun main(args: Array<String>) {
    runApplication<PomodoroApplication>(*args)
}
