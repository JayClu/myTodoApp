package hoangloc.mytodoapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import hoangloc.mytodoapp.Todo

// Data access object
@Dao
interface TodoDao {

    @Query("SELECT * FROM Todo")
    fun getAllTodo(): LiveData<List<Todo>>

    //@Query("INSERT INTO Todo")
    @Insert
    fun addTodo(todo: Todo)

    @Query("DELETE FROM Todo WHERE id = :id")
    //@Delete
    fun deleteTodo(id: Int)
}