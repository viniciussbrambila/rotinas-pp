package com.example.rotinasplusplus.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.rotinasplusplus.model.Rotina;

import java.util.List;

@Dao
public interface RotinaDao {
       void inserir (Rotina rotina);

       @Query("SELECT * FROM rotinas")
    List<Rotina> buscarTodas();

       @Update
        void atualizar(Rotina rotina);

       @Delete
        void deletar(Rotina rotina);
}
