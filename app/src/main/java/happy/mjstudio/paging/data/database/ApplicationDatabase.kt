package happy.mjstudio.paging.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import happy.mjstudio.paging.data.database.dao.FeedDao
import happy.mjstudio.paging.domain.entity.Feed

/**
 * Created by mj on 25, November, 2019
 */
@Database(entities = [Feed::class],version = 1,exportSchema = true)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun feedDao() : FeedDao
}