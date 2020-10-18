package com.example.shoppinglistnew.data.repositories

import com.example.shoppinglistnew.data.db.db.ShoppingDatabase
import com.example.shoppinglistnew.data.db.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {

    fun getAllShoppingItem() = db.getShoppingDao().getAllShoppingItems()
}