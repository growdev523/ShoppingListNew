package com.example.shoppinglistnew.ui.shoppinglist

import com.example.shoppinglistnew.data.db.db.entities.ShoppingItem


interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}