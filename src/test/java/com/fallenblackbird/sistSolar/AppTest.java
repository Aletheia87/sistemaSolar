package com.fallenblackbird.sistSolar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.fallenblackbird.sistSolar.modelo.Luna;
import com.fallenblackbird.sistSolar.modelo.Planeta;
import com.fallenblackbird.sistSolar.modelo.SistemaSolar;
import com.fallenblackbird.sistSolar.servicio.LunaServicio;
import com.fallenblackbird.sistSolar.servicio.PlanetaServicio;


public class AppTest { 
	
    @Test
    public void agregarPlanetaTest() {
        Planeta crearPlaneta;
        PlanetaServicio planetas = new PlanetaServicio();
        
        crearPlaneta = new Planeta();
        crearPlaneta.setNombre("MERCURIO");
        crearPlaneta.setTamaño("4.880");
        crearPlaneta.setDistanciaSol("57.910.000");
        crearPlaneta.setCantLunas("0");
        planetas.agregarPlaneta(crearPlaneta);
        assertEquals("0", planetas.getPlanetas().get(0).getCantLunas());
    }
    

	@Test
    public void agregarLunasTest() {
    	Luna crearLuna;
        LunaServicio lunas = new LunaServicio();
		
        crearLuna = new Luna();
		crearLuna.setNombre("Europa");
		crearLuna.setDiametro("3.126");
		crearLuna.setTiempoOrbita("3.551");
		lunas.agregarLuna(crearLuna);
		assertEquals("3.551", lunas.getLunas().get(0).getTiempoOrbita());    
	}
	
	@Test 
	 public void mostrarSistemaTest() {
		
		Planeta crearPlaneta;
        PlanetaServicio planetas = new PlanetaServicio();

		SistemaSolar sistemaSolar = new SistemaSolar();
        
        crearPlaneta = new Planeta();
        crearPlaneta.setNombre("Júpiter");
		crearPlaneta.setTamaño("142.984");
		crearPlaneta.setDistanciaSol("778.330.000");
		crearPlaneta.setCantLunas("79");
        planetas.agregarPlaneta(crearPlaneta);
		sistemaSolar.setPlanetas(planetas.listadoPlanetas());
        assertTrue(planetas.listadoPlanetas().get(0).getCantLunas() == "79");
       
	}
	
	@Test
	public void mostrarSistemaYLunasTest() {

		Planeta crearPlaneta;
        PlanetaServicio planetas = new PlanetaServicio();
		Luna crearLuna;
        LunaServicio lunas = new LunaServicio();
		SistemaSolar sistemaSolar = new SistemaSolar();
        
		crearPlaneta = new Planeta();
		crearPlaneta.setNombre("Saturno");
		crearPlaneta.setTamaño("108.728");
		crearPlaneta.setDistanciaSol("1.429.400.000");
		crearPlaneta.setCantLunas("82");
		planetas.agregarPlaneta(crearPlaneta);

		crearLuna = new Luna();
		crearLuna.setNombre("Atlas");
		crearLuna.setDiametro("37 X 27");
		crearLuna.setTiempoOrbita("0.602");
		lunas.agregarLuna(crearLuna);

		crearPlaneta.setLunas(lunas.listadoLunas());
		sistemaSolar.setPlanetas(planetas.listadoPlanetas());
		
		assertTrue(lunas.listadoLunas().get(0).getNombre() == "Atlas");

	}
	
	
}
