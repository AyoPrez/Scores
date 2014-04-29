package com.rising.drawing;

public class Config {
	
	private boolean supported = true;
	
	private int ancho_beams;
	private int ancho_cabeza_nota;
	private int ancho_cabeza_nota_gracia;
	private int ancho_hooks;
	private int distancia_entre_beams;
	private int distancia_lineas_pentagrama;
	private int distancia_lineas_pentagrama_mitad;
	private int distancia_pentagramas;
	private int x_inicial_pentagramas;
	private int x_final_pentagramas;
	private int largo_imagen_corchete;
	private int largo_imagen_corchete_gracia;
	private int longitud_plica;
	private int longitud_plica_nota_gracia;
	private int margen_ancho_cabeza_nota;
	private int margen_autor;
	private int margen_derecho_compases;
	private int margen_inferior_autor;
	private int margen_izquierdo_compases;
	private int margen_nota_gracia;
	private int margen_obra;
	private int margen_superior;
	private int mitad_cabeza_nota;
	private int mitad_cabeza_nota_gracia;
	private int radio_puntillos;
	private int radio_staccatos;
	private int tamano_letra_obra;
	private int tamano_letra_autor;
	private int unidad_desplazamiento;
	private int width;
	
	private int x_inicio_slash;
	private int x_fin_slash;
	private int y_inicio_slash;
	private int y_fin_slash;
	private int x_accidental;
	private int y_accidental;
	private int y_accidental_flat;
	private int x_puntillo;
	private int y_puntillo_arriba;
	private int y_puntillo_abajo;
	private int x_staccato;
	private int y_staccato_arriba;
	private int y_staccato_abajo;
	
	public Config(int densityDPI, int width) {
		switch (densityDPI) {
			case 120:
				break;
			case 160:
				break;
			case 213:
				ancho_beams = 5;
				ancho_cabeza_nota = 10;
				ancho_cabeza_nota_gracia = 5;
				ancho_hooks = 16;
				distancia_entre_beams = 5;
				distancia_lineas_pentagrama = 12;
				distancia_lineas_pentagrama_mitad = 6;
				distancia_pentagramas = 150;
				largo_imagen_corchete = 10;
				largo_imagen_corchete_gracia = 5;
				longitud_plica = 40;
				longitud_plica_nota_gracia = 20;
				margen_ancho_cabeza_nota = 5;
				margen_autor = 120;
				margen_derecho_compases = 30;
				margen_inferior_autor = 230;
				margen_izquierdo_compases = 30;
				margen_nota_gracia = 6;
				margen_obra = 60;
				margen_superior = 50;
				mitad_cabeza_nota = 6;
				mitad_cabeza_nota_gracia = 3;
				radio_puntillos = 4;
				radio_staccatos = 4;
				tamano_letra_obra = 50;
				tamano_letra_autor = 30;
				unidad_desplazamiento = 25;
				this.width = width;
				
				x_inicial_pentagramas = 50;
				x_final_pentagramas = width - x_inicial_pentagramas;
				x_inicio_slash = 5;
				x_fin_slash = 5;
				y_inicio_slash = 5;
				y_fin_slash = 10;
				x_accidental = 10;
				y_accidental = 10;
				y_accidental_flat = 15;
				x_puntillo = ancho_cabeza_nota + 10;
				y_puntillo_arriba = mitad_cabeza_nota - 10;
				y_puntillo_abajo = mitad_cabeza_nota + 10;
				x_staccato = 15;
				y_staccato_arriba = 20;
				y_staccato_abajo = 8;
				break;
			case 240:
				break;
			case 320:
				ancho_beams = 8;
				ancho_cabeza_nota = 26;
				ancho_cabeza_nota_gracia = 15;
				ancho_hooks = 16;
				distancia_entre_beams = 12;
				distancia_lineas_pentagrama = 19;
				distancia_lineas_pentagrama_mitad = 9;
				distancia_pentagramas = 200;
				largo_imagen_corchete = 25;
				largo_imagen_corchete_gracia = 5;
				longitud_plica = 60;
				longitud_plica_nota_gracia = 30;
				margen_ancho_cabeza_nota = 5;
				margen_autor = 180;
				margen_derecho_compases = 70;
				margen_inferior_autor = 320;
				margen_izquierdo_compases = 50;
				margen_nota_gracia = 4;
				margen_obra = 90;
				margen_superior = 80;
				mitad_cabeza_nota = 10;
				mitad_cabeza_nota_gracia = 4;
				radio_puntillos = 4;
				radio_staccatos = 4;
				tamano_letra_obra = 80;
				tamano_letra_autor = 50;
				unidad_desplazamiento = 200;
				this.width = width;
				
				x_inicial_pentagramas = 80;
				x_final_pentagramas = width - x_inicial_pentagramas;
				x_inicio_slash = 15;
				x_fin_slash = 5;
				y_inicio_slash = 10;
				y_fin_slash = 20;
				x_accidental = 16;
				y_accidental = 10;
				y_accidental_flat = 17;
				x_puntillo = ancho_cabeza_nota + 10;
				y_puntillo_arriba = mitad_cabeza_nota - 10;
				y_puntillo_abajo = mitad_cabeza_nota + 10;
				x_staccato = 15;
				y_staccato_arriba = 28;
				y_staccato_abajo = 14;
				break;
			case 400:
				break;
			case 480:
				break;
			default: 
				supported = false;
		}
	}
	
	public int getAnchoBeams() {
		return ancho_beams;
	}
	
	public int getAnchoCabezaNota() {
		return ancho_cabeza_nota;
	}
	
	public int getAnchoCabezaNotaGracia() {
		return ancho_cabeza_nota_gracia;
	}
	
	public int getAnchoHooks() {
		return ancho_hooks;
	}

	public int getDistanciaEntreBeams() {
		return distancia_entre_beams;
	}
	
	public int getDistanciaLineasPentagrama() {
		return distancia_lineas_pentagrama;
	}
	
	public int getDistanciaLineasPentagramaMitad() {
		return distancia_lineas_pentagrama_mitad;
	}
	
	public int getDistanciaPentagramas() {
		return distancia_pentagramas;
	}
	
	public int getLargoImagenCorchete() {
		return largo_imagen_corchete;
	}
	
	public int getLargoImagenCorcheteGracia() {
		return largo_imagen_corchete_gracia;
	}
	
	public int getLongitudPlica() {
		return longitud_plica;
	}
	
	public int getLongitudPlicaNotaGracia() {
		return longitud_plica_nota_gracia;
	}
	
	public int getMargenAnchoCabezaNota() {
		return margen_ancho_cabeza_nota;
	}
 	
	public int getMargenAutor() {
		return margen_autor;
	}
	
	public int getMargenInferiorAutor() {
		return margen_inferior_autor;
	}
	
	public int getMargenDerechoCompases() {
		return margen_derecho_compases;
	}
	
	public int getMargenIzquierdoCompases() {
		return margen_izquierdo_compases;
	}
	
	public int getMargenNotaGracia() {
		return margen_nota_gracia;
	}
	
	public int getMargenObra() {
		return margen_obra;
	}
	
	public int getMargenSuperior() {
		return margen_superior;
	}
	
	public int getMitadCabezaNota() {
		return mitad_cabeza_nota;
	}
	
	public int getMitadCabezaNotaGracia() {
		return mitad_cabeza_nota_gracia;
	}
	
	public int getRadioPuntillos() {
		return radio_puntillos;
	}
	
	public int getRadioStaccatos() {
		return radio_staccatos;
	}
	
	public int getTamanoLetraAutor() {
		return tamano_letra_autor;
	}
	
	public int getTamanoLetraObra() {
		return tamano_letra_obra;
	}
	
	public int getUnidadDesplazamiento() {
		return unidad_desplazamiento;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getXInicialPentagramas() {
		return x_inicial_pentagramas;
	}
	
	public int getXFinalPentagramas() {
		return x_final_pentagramas;
	}
	
	public int getXInicioSlash() {
		return x_inicio_slash;
	}
	
	public int getXFinSlash() {
		return x_fin_slash;
	}
	
	public int getYInicioSlash() {
		return y_inicio_slash;
	}
	
	public int getYFinSlash() {
		return y_fin_slash;
	}
	
	public int getXAccidental() {
		return x_accidental;
	}
	
	public int getYAccidental() {
		return y_accidental;
	}
	
	public int getYAccidentalFlat() {
		return y_accidental_flat;
	}
	
	public int getXPuntillo() {
		return x_puntillo;
	}
	
	public int getYPuntilloArriba() {
		return y_puntillo_arriba;
	}
	
	public int getYPuntilloAbajo() {
		return y_puntillo_abajo;
	}
	
	public int getXStaccato() {
		return x_staccato;
	}
	
	public int getYStaccatoArriba() {
		return y_staccato_arriba;
	}
	
	public int getYStaccatoAbajo() {
		return y_staccato_abajo;
	}
	
	/**
	 * 
	 * @return True if the screen specifications of the device are supported, false otherwise
	 */
	public boolean supported() {
		return supported;
	}
}
