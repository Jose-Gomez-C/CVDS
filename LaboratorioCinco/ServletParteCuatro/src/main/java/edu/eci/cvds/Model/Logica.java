package edu.eci.cvds.Model;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@ManagedBean(name="guessBean")
@ApplicationScoped
public class Logica {
	private int numeroAdivinar;
	private int numeroIntentos;
	private int puntaje;
	private String estado;
        private boolean estadoBol;
        private List<Integer> intentos;
	
	
	public Logica() {
		numeroAdivinar=(int) ((Math.random() * ((10 - 1) + 1)) + 1);
		puntaje=100000;
		estado="Usted no ha ganado!";
		numeroIntentos=0;
                intentos= new ArrayList();
                estadoBol = false;
	}
	public void guess(int numeroUsuario) {
                if (estadoBol || puntaje == 0) {
                    return;
                }
                
		if (numeroAdivinar != numeroUsuario) {
                        puntaje-=10000;
			numeroIntentos+=1;
                        if (!intentos.contains(numeroUsuario)) intentos.add(numeroUsuario);
		} else {
			estado="Usted ha ganado, adivino el número!";
                        if (!intentos.contains(numeroUsuario)) intentos.add(numeroUsuario);
                        estadoBol = true;
		}
                
	}
	public void restart() {
		estado = "Usted no ha ganado!";
		numeroAdivinar=(int) ((Math.random() * ((11 - 1) + 1)) + 1);
		puntaje=100000;
		numeroIntentos=0;
                intentos=new ArrayList();
                estadoBol = false;
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
        public List<Integer> getIntentos(){
            return intentos;
        }
        
        
}
