package hoangloc.mytodoapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import hoangloc.mytodoapp.Todo


@Database(entities = [Todo::class], version = 1)
@TypeConverters(Converters::class)
abstract class TodoDatabase : RoomDatabase() {

    companion object {
        const val DATABASE_NAME = "Todo_Db"
    }

    abstract fun getTodoDao(): TodoDao
}