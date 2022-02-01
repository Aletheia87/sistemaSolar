package com.fallenblackbird.sistSolar.repositorio;

import java.util.ArrayList;

import com.fallenblackbird.sistSolar.modelo.Luna;

public interface ILuna {

	public ArrayList<Luna> listadoLunas();
	public void agregarLuna(Luna luna);
}
