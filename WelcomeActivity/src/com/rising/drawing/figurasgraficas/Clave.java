package com.rising.drawing.figurasgraficas;

import android.graphics.Bitmap;

public class Clave {
	
	private Bitmap imagenClave;
	private int x;
	private int y;
	private byte pentagrama;
	private transient byte valorClave;
	private int position;
	
	public Clave() {
		imagenClave = null;
		x = -1;
		y = -1;
		
		pentagrama = -1;
		valorClave = -1;
		position = -1;
	}
	
	public byte getByteClave() {
		return valorClave;
	}
	
	public Bitmap getImagenClave() {
		return imagenClave;
	}
	
	public byte getPentagrama() {
		return pentagrama;
	}
	
	public int getPosition() {
		return position;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setClave(final byte valorClave) {
		this.valorClave = valorClave;
	}
	
	public void setImagenClave(final Bitmap imagenClave) {
		this.imagenClave = imagenClave;
	}
	
	public void setPentagrama(final byte pentagrama) {
		this.pentagrama = pentagrama;
	}
	
	public void setPosition(final int position) {
		this.position = position;
	}
	
	public void setX(final int x) {
		this.x = x;
	}
	
	public void setY(final int y) {
		this.y = y;
	}
	
}
