package com.fallenblackbird.sistSolar.modelo;

public class Luna {

	private String nombre;
	private String diametro;
	private String tiempoOrbita;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDiametro() {
		return diametro;
	}
	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}
	public String getTiempoOrbita() {
		return tiempoOrbita;
	}
	public void setTiempoOrbita(String tiempoOrbita) {
		this.tiempoOrbita = tiempoOrbita;
	}
	@Override
	public String toString() {
		return "Luna de nombre " + nombre + ", que mide " + diametro + " km de diámetro, y el tiempo de órbita es de " + tiempoOrbita + " días";
	}

}
