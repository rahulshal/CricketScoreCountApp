package com.example.cricketscorecount.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cricketscorecount.models.Runs

@Dao
interface RunsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(runs : Runs)

    @Query("SELECT * FROM `runs_table`")
    fun fetchAllDates(): List<Runs>
}