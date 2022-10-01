package co.wordbe.pomodoro.domain.todo.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "todo")
data class Todo(
    @Id
    val id: Long? = null,
    val title: String,
    val description: String,
)