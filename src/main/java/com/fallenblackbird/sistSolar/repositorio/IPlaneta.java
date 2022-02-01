package com.fallenblackbird.sistSolar.repositorio;

import java.util.ArrayList;

import com.fallenblackbird.sistSolar.modelo.Planeta;

public interface IPlaneta {

	public ArrayList<Planeta> listadoPlanetas();
	public void agregarPlaneta(Planeta planeta);
	
}
