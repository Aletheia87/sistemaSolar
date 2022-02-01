package com.fallenblackbird.sistSolar;

import com.fallenblackbird.sistSolar.modelo.SistemaSolar;
import com.fallenblackbird.sistSolar.servicio.SistemaSolarServicio;

public class App 
{
    public static void main( String[] args ) {
    	SistemaSolarServicio sistemaSolarServicio = new SistemaSolarServicio();
		SistemaSolar sistemaSolar = sistemaSolarServicio.crearSistemaSolar();
		sistemaSolarServicio.mostrarSistema(sistemaSolar);
		System.out.println(" ");
		sistemaSolarServicio.mostrarSistemaYLunas(sistemaSolar);
		
    }
}
