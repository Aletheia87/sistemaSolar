package com.fallenblackbird.sistSolar.servicio;

import java.util.ArrayList;

import com.fallenblackbird.sistSolar.modelo.Luna;
import com.fallenblackbird.sistSolar.repositorio.ILuna;

public class LunaServicio implements ILuna {

	ArrayList<Luna>lunas = new ArrayList<Luna>();
	Luna luna = new Luna();
	
	public ArrayList<Luna> getLunas() {
		return lunas;
	}

	public void setLunas(ArrayList<Luna> lunas) {
		this.lunas = lunas;
	}

	public Luna getLuna() {
		return luna;
	}

	public void setLuna(Luna luna) {
		this.luna = luna;
	}

	@Override
	public ArrayList<Luna> listadoLunas() {
		return lunas;
	}

	@Override
	public void agregarLuna(Luna luna) {
		lunas.add(luna);
	}

}
