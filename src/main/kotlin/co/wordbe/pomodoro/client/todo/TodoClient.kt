package co.wordbe.pomodoro.client.todo

import org.springframework.stereotype.Component

@Component
class TodoClient {

    fun getById(id: Long): Todo {
        return Todo(
            id = id,
            title = "dummy title",
            description = "dummy description",
        )
    }
}