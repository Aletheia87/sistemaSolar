package com.fallenblackbird.sistSolar.servicio;

import com.fallenblackbird.sistSolar.modelo.Luna;
import com.fallenblackbird.sistSolar.modelo.Planeta;
import com.fallenblackbird.sistSolar.modelo.SistemaSolar;

public class SistemaSolarServicio {

	private PlanetaServicio planetas = new PlanetaServicio();
	private LunaServicio lunas;
	
	private Planeta crearPlaneta;
	private Luna crearLuna;
	
	
	private SistemaSolar sistemaSolar = new SistemaSolar();
	
	public SistemaSolarServicio() {
		
	}
	
public SistemaSolar crearSistemaSolar() {
		
		//MERCURIO
		crearPlaneta = new Planeta();
		crearPlaneta.setNombre("Mercurio");
		crearPlaneta.setTamaño("4.880");
		crearPlaneta.setDistanciaSol("57.910.000");
		crearPlaneta.setCantLunas("0");
		planetas.agregarPlaneta(crearPlaneta);
		
		//VENUS
		crearPlaneta = new Planeta();
		crearPlaneta.setNombre("Venus");
		crearPlaneta.setTamaño("12.104");
		crearPlaneta.setDistanciaSol("108.200.000");
		crearPlaneta.setCantLunas("0");
		planetas.agregarPlaneta(crearPlaneta);
		
		//TIERRA
		crearPlaneta = new Planeta();
		crearPlaneta.setNombre("Tierra");
		crearPlaneta.setTamaño("12.756");
		crearPlaneta.setDistanciaSol("149.600.000");
		crearPlaneta.setCantLunas("1");
		planetas.agregarPlaneta(crearPlaneta);
		
		//LUNA TIERRA
		lunas  = new LunaServicio();
		
		crearLuna = new Luna();
		crearLuna.setNombre("Luna");
		crearLuna.setDiametro("3.476");
		crearLuna.setTiempoOrbita("27.322");
		lunas.agregarLuna(crearLuna);
		
		crearPlaneta.setLunas(lunas.listadoLunas());
		
		//MARTE
		crearPlaneta = new Planeta();
		crearPlaneta.setNombre("Marte");
		crearPlaneta.setTamaño("6.794");
		crearPlaneta.setDistanciaSol("227.940.000");
		crearPlaneta.setCantLunas("2");
		planetas.agregarPlaneta(crearPlaneta);
		
		//LUNA MARTE
		lunas  = new LunaServicio();
		
		crearLuna = new Luna();
		crearLuna.setNombre("Phobos");
		crearLuna.setDiametro("28 X 20");
		crearLuna.setTiempoOrbita("0.319");
		lunas.agregarLuna(crearLuna);
		
		crearLuna = new Luna();
		crearLuna.setNombre("Deimos");
		crearLuna.setDiametro("8");
		crearLuna.setTiempoOrbita("1.263");
		lunas.agregarLuna(crearLuna);
		
		crearPlaneta.setLunas(lunas.listadoLunas());
		
		//JUPITER
		crearPlaneta = new Planeta();
		crearPlaneta.setNombre("Júpiter");
		crearPlaneta.setTamaño("142.984");
		crearPlaneta.setDistanciaSol("778.330.000");
		crearPlaneta.setCantLunas("79");
		planetas.agregarPlaneta(crearPlaneta);
		
		//LUNA JUPITER
		lunas  = new LunaServicio();
		
		crearLuna = new Luna();
		crearLuna.setNombre("Europa");
		crearLuna.setDiametro("3.126");
		crearLuna.setTiempoOrbita("3.551");
		lunas.agregarLuna(crearLuna);
		
		crearLuna = new Luna();
		crearLuna.setNombre("Io");
		crearLuna.setDiametro("3.629");
		crearLuna.setTiempoOrbita("1.769");
		lunas.agregarLuna(crearLuna);
		
		crearPlaneta.setLunas(lunas.listadoLunas());
		
		//SATURNO
		crearPlaneta = new Planeta();
		crearPlaneta.setNombre("Saturno");
		crearPlaneta.setTamaño("108.728");
		crearPlaneta.setDistanciaSol("1.429.400.000");
		crearPlaneta.setCantLunas("82");
		planetas.agregarPlaneta(crearPlaneta);
		
		//LUNA SATURNO
		lunas  = new LunaServicio();
		
		crearLuna = new Luna();
		crearLuna.setNombre("Atlas");
		crearLuna.setDiametro("37 X 27");
		crearLuna.setTiempoOrbita("0.602");
		lunas.agregarLuna(crearLuna);
		
		crearLuna = new Luna();
		crearLuna.setNombre("Calypso");
		crearLuna.setDiametro("30 X 16");
		crearLuna.setTiempoOrbita("1.888");
		lunas.agregarLuna(crearLuna);
		
		crearPlaneta.setLunas(lunas.listadoLunas());
		
		//URANO
		crearPlaneta = new Planeta();
		crearPlaneta.setNombre("Urano");
		crearPlaneta.setTamaño("51.118");
		crearPlaneta.setDistanciaSol("2.870.990.000");
		crearPlaneta.setCantLunas("27");
		planetas.agregarPlaneta(crearPlaneta);
		
		//LUNA URANO
		lunas  = new LunaServicio();
		
		crearLuna = new Luna();
		crearLuna.setNombre("Titania");
		crearLuna.setDiametro("1.580");
		crearLuna.setTiempoOrbita("8.706");
		lunas.agregarLuna(crearLuna);
		
		crearLuna = new Luna();
		crearLuna.setNombre("Ophelia");
		crearLuna.setDiametro("30.4");
		crearLuna.setTiempoOrbita("0.3764");
		lunas.agregarLuna(crearLuna);
		
		crearPlaneta.setLunas(lunas.listadoLunas());
		
		//NEPTUNO
		crearPlaneta = new Planeta();
		crearPlaneta.setNombre("Neptuno");
		crearPlaneta.setTamaño("49.532");
		crearPlaneta.setDistanciaSol("4.504.300.000");
		crearPlaneta.setCantLunas("14");
		planetas.agregarPlaneta(crearPlaneta);
		
		//LUNA NEPTUNO
		lunas  = new LunaServicio();
		
		crearLuna = new Luna();
		crearLuna.setNombre("Triton");
		crearLuna.setDiametro("2.705");
		crearLuna.setTiempoOrbita("5.877");
		lunas.agregarLuna(crearLuna);
		
		crearLuna = new Luna();
		crearLuna.setNombre("Proteus");
		crearLuna.setDiametro("420");
		crearLuna.setTiempoOrbita("1.12");
		lunas.agregarLuna(crearLuna);
		
		crearPlaneta.setLunas(lunas.listadoLunas());
		
		sistemaSolar.setPlanetas(planetas.listadoPlanetas());
		
		return sistemaSolar;
		
	} 	
	
	public void mostrarSistema(SistemaSolar sistema) {
		
		for(Planeta planeta : sistema.getPlanetas()) {
			System.out.println(planeta);
		}
	}
	
	public void mostrarSistemaYLunas(SistemaSolar sistema) {
		
		for(Planeta planeta : sistema.getPlanetas()) {
			if (planeta.getLunas() == null) {
				System.out.printf("%s \n",planeta);
				
			}else {
				System.out.printf("%s %s \n",planeta, planeta.getLunas());
			}
			
		}
	}
	

	
	
}
