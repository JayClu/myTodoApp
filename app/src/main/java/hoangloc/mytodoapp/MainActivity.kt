package hoangloc.mytodoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import hoangloc.mytodoapp.ViewModel.TodoViewModel
import hoangloc.mytodoapp.screen.TodoListpage
import hoangloc.mytodoapp.ui.theme.MyTodoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val todoViewModel = ViewModelProvider(this).get(TodoViewModel::class.java)
        enableEdgeToEdge()
        setContent {
            MyTodoAppTheme {
                Surface(
                    modifier = Modifier.fillMaxWidth().padding(top = 30.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TodoListpage(todoViewModel)


                }
                }
            }
        }
    }

