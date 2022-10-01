package co.wordbe.pomodoro.domain.todo.repository

import co.wordbe.pomodoro.domain.todo.entity.Todo
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface TodoRepository : CoroutineCrudRepository<Todo, Long>