package com.example.rotinasplusplus.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
   @Entity(tableName = "rotinas")
public class Rotina {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nome;
    private int horaInicio;
    private int minutoInicio;
    private int horaFim;
    private int minutoFim;

    private boolean domingo;
    private boolean segunda;
    private boolean terca;
    private boolean quarta;
    private boolean quinta;
    private boolean sexta;
    private boolean sabado;

   private boolean isAtiva;

   public String getHoraInicioFormatada(){
       return String.format("%02d:%02d",horaInicio,minutoInicio);
    }

    public String GetHoraFormatada(){
        return String.format("%02d:%02d", horaFim, minutoFim);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getMinutoInicio() {
        return minutoInicio;
    }

    public void setMinutoInicio(int minutoInicio) {
        this.minutoInicio = minutoInicio;
    }

    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }

    public int getMinutoFim(){
       return minutoFim;
    }

    public void setMinutoFim(){
       this.minutoFim = minutoFim;
    }

    public boolean isDomingo() {
        return domingo;
    }

    public void setDomingo(boolean domingo) {
        this.domingo = domingo;
    }

    public boolean isSegunda() {
        return segunda;
    }

    public void setSegunda(boolean segunda) {
        this.segunda = segunda;
    }

    public boolean isTerca() {
        return terca;
    }

    public void setTerca(boolean terca) {
        this.terca = terca;
    }

    public boolean isQuarta() {
        return quarta;
    }

    public void setQuarta(boolean quarta) {
        this.quarta = quarta;
    }

    public boolean isQuinta() {
        return quinta;
    }

    public void setQuinta(boolean quinta) {
        this.quinta = quinta;
    }

    public boolean isSexta() {
        return sexta;
    }

    public void setSexta(boolean sexta) {
        this.sexta = sexta;
    }

    public boolean isSabado() {
        return sabado;
    }

    public void setSabado(boolean sabado) {
        this.sabado = sabado;
    }

    public boolean isAtiva() {
        return isAtiva;
    }

    public void setAtiva(boolean ativa) {
        isAtiva = ativa;
    }
}
