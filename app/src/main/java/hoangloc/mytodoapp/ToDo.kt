package hoangloc.mytodoapp

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createAt: Date
)

fun getExpTodo(): List<Todo>{
    return listOf<Todo>(
        Todo(1, "Buy milk", Date.from(Instant.now())),
        Todo(2, "Buy water", Date.from(Instant.now())),
        Todo(3, "Buy cheese", Date.from(Instant.now()))
    )
}

