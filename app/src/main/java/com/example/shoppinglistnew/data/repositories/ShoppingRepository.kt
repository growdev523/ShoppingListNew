package com.example.shoppinglistnew.data.repositories

import com.example.shoppinglistnew.data.db.db.ShoppingDatabase
import com.example.shoppinglistnew.data.db.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {

    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)
    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)
    fun getAllShoppingItem() = db.getShoppingDao().getAllShoppingItems()
}