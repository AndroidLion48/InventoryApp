package com.example.inventory.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

/**
 * Created by Clarence E Moore on 2023-02-26.
 *
 * Description:
 *
 *
 */
@Dao
interface ItemDao {

    @Query("SELECT * from item ORDER BY name ASC")
    fun getItems(): Flow<List<Item>>

    @Query("SELECT * from item WHERE id = :id")
    fun getItem(id: Int): Flow<Item>

    // instructions to Room for what to do in case of a conflict
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)
    /**
     * Now the Room will generate all the necessary code to insert the item into the database.
     * When you call insert() from your Kotlin code,
     * Room executes a SQL query to insert the entity into the database.
     */

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)
}
