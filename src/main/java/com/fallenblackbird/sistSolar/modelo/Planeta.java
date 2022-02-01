package com.fallenblackbird.sistSolar.modelo;

import java.util.ArrayList;

public class Planeta {

	private String nombre;
	private String distanciaSol; 
	private String tamaño; 
	private String cantLunas;
	private ArrayList <Luna> lunas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDistanciaSol() {
		return distanciaSol;
	}
	public void setDistanciaSol(String distanciaSol) {
		this.distanciaSol = distanciaSol;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getCantLunas() {
		return cantLunas;
	}
	public void setCantLunas(String cantLunas) {
		this.cantLunas = cantLunas;
	}
	public ArrayList<Luna> getLunas() {
		return lunas;
	}
	public void setLunas(ArrayList<Luna> lunas) {
		this.lunas = lunas;
	}
	@Override
	public String toString() {
		return "Planeta " + nombre + " está a " + distanciaSol + " km del Sol, su tamaño es de " + tamaño + "km de diámetro, y tiene "
				+ cantLunas + " lunas.";
	}
	
}
