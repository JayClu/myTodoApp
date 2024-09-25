package hoangloc.mytodoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.viewModelScope
import hoangloc.mytodoapp.db.TodoDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.Instant
import java.util.Date

class TodoViewModel : ViewModel() {
        //private val _todoList = MutableLiveData<List<Todo>>()

        val todoDao = MainApplication.todoDatabase.getTodoDao()

        val todoList : LiveData<List<Todo>> = todoDao.getAllTodo()

        fun addTodo(title : String){
                viewModelScope.launch(Dispatchers.IO) {
                        todoDao.addTodo(Todo(id = 0, title=title, createAt = Date.from(Instant.now())))
                }

        }

        fun deleteTodo(id:Int) {
                viewModelScope.launch(Dispatchers.IO) {
                        todoDao.deleteTodo(id)
                }
        }


}