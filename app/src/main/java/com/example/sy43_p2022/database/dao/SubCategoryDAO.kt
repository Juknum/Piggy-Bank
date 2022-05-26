package com.example.sy43_p2022.database.dao

import androidx.room.*
import com.example.sy43_p2022.database.entities.SubCategory

@Dao
interface SubCategoryDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSubCategory(subcategory: SubCategory)

    @Delete
    fun delete(category: SubCategory)

    @Query ("SELECT * FROM subcategory")
    fun getAllSubCategory(): List<SubCategory>

    @Update
    fun updateObjective(vararg objective: SubCategory)

    @Update
    fun updateSpendings(vararg spendings: SubCategory)

    @Query("SELECT * FROM subcategory WHERE name LIKE :name")
    fun getAllSubCategoryByName(name: String): List<SubCategory>

    @Query("SELECT * FROM subcategory WHERE objective LIKE :objective")
    fun getAllSubCategoryByObjective(objective: Int): List<SubCategory>

    @Query("SELECT * FROM subcategory WHERE spendings LIKE :spendings")
    fun getAllSubCategoryBySpendings(spendings: Int): List<SubCategory>

    @Query("DELETE FROM subcategory")
    fun nukeTable()
}