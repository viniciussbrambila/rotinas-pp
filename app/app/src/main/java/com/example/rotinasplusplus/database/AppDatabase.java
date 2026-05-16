package com.example.rotinasplusplus.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.rotinasplusplus.model.Rotina;

@Database(entities = {Rotina.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract RotinaDao RotinaDao();

}
