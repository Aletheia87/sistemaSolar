package com.fallenblackbird.sistSolar.servicio;

import java.util.ArrayList;

import com.fallenblackbird.sistSolar.modelo.Planeta;
import com.fallenblackbird.sistSolar.repositorio.IPlaneta;

public class PlanetaServicio implements IPlaneta {

	ArrayList<Planeta>planetas = new ArrayList<Planeta>();
	Planeta planeta = new Planeta();
	
	public ArrayList<Planeta> getPlanetas() {
		return planetas;
	}

	public void setPlanetas(ArrayList<Planeta> planetas) {
		this.planetas = planetas;
	}

	public Planeta getPlaneta() {
		return planeta;
	}

	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}

	@Override
	public ArrayList<Planeta> listadoPlanetas() {
		return planetas;
	}

	@Override
	public void agregarPlaneta(Planeta planeta) {
		planetas.add(planeta);
	}

}
