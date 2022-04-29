/*
package com.example.androidstudio.ui.Pantry;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface PantryList {
    @Insert
    void insertPantryList(PantryList item, PantryList quantity, PantryList date);

    @Query("SELECT item_name FROM Item I,Pantry P WHERE p.item_id = Iid ORDER BY pid");
    List<PantryList> getPantryList();

    @Query("SELECT quantity FROM Item I,Pantry P WHERE p.item_id = Iid ORDER BY pid");
    List<PantryList> getQuantity();

    @Query("SELECT exp_date FROM Item I,Pantry P WHERE p.item_id = Iid ORDER BY pid");
    List<PantryList> getDate();

    @Delete
    void deleteItem(PantryList item);

    @Update
    void updateQuantity(PantryList item, PantryList Quantity);

    @Query("SELECT item_name FROM Item I,Pantry P WHERE p.item_id = Iid ORDER BY pid")
    LiveData<List<PantryList>> findAllPantry();
    }
}
*/