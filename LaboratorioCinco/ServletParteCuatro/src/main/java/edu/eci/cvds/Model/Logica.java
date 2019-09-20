package edu.eci.cvds.Model;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@ManagedBean(name="guessBean")
@SessionScoped
public class Logica {
	private int numeroAdivinar;
	private int numeroIntentos;
	private int puntaje;
	private String estado;
	
	
	public Logica() {
		numeroAdivinar=(int) ((Math.random() * ((11 - 1) + 1)) + 1);
		puntaje=100000;
		estado="F";
		numeroIntentos=0;
	}
	public void guess(int numeroUsuario) {
		if (numeroAdivinar!=numeroUsuario) {
			puntaje-=10000;
			numeroIntentos+=1;
		}else {
			estado="T";
		}
	}
	public void restart() {
		estado = "F";
		numeroAdivinar=(int) ((Math.random() * ((11 - 1) + 1)) + 1);
		puntaje=100000;
		numeroIntentos=0;
	}
	public int getNumeroAdivinar() {
		return numeroAdivinar;
	}
	public void setNumeroAdivinar(int numeroAdivinar) {
		this.numeroAdivinar = numeroAdivinar;
	}
	public int getNumeroIntentos() {
		return numeroIntentos;
	}
	public void setNumeroIntentos(int numeroIntentos) {
		this.numeroIntentos = numeroIntentos;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
