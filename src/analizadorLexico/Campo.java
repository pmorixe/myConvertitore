package analizadorLexico;

public class Campo {
	
	String nombre;
	int nivel;
	int longitud;
	String tipoDeDato;
	String informacion;
	Boolean esSupernivel;
	
	
	public void setNombre(String nombre){
		this.nombre = nombre;
		
	}
	
	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public String getTipoDeDato() {
		return tipoDeDato;
	}

// analizar tipo de dato
	
	public void evaluarTipoDato (String charDato){
		if (charDato == "X"){
			this.setTipoDeDato("Caracter");
		}
		this.setTipoDeDato("Numerico");
	}
	
	
	
	public void setTipoDeDato(String tipoDeDato) {
		this.tipoDeDato = tipoDeDato;
	}


	public String getInformacion() {
		return informacion;
	}


	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}


	public String getNombre() {
		return nombre;
	}

	public Boolean getEsSupernivel() {
		return esSupernivel;
	}

	public void setEsSupernivel(Boolean esSupernivel) {
		this.esSupernivel = esSupernivel;
	}
	

}
