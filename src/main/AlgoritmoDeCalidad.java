package main;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor.GetterSetterReflection;

public class AlgoritmoDeCalidad {
	
	private static  Integer pesoDeFuncionabilidad,
							pesoDeEficiencia,
							pesoDeFiabilidad,
							pesoDeMantenibilidad,
							pesoDeUsabilidad,
							pesoDePortabilidad;
	private Integer seguridadDeAcceso,
					exactitudDeResultados,
					utilizacionDeRecursos,
					comportamientoEnElTiempo,
					toleranciaAFallos,
					capacidadDeRecuperacionDeErrores,
					analizabilidadDelCodigo,
					cambiabilidadDelCodigo,
					estabilidadDelCodigo,
					capacidadDeSerEntendido,
					capacidadDeSerOperado,
					capacidadDeSerAtractivo,
					adaptabilidad,
					instalabilidad;
			

	private static Float 	 resultadoFuncionabilidad,
							 resultadoEficiencia,
							 resultadoFiabilidad,
							 resultadoMantenibilidad,
							 resultadoUsabilidad,
							 resultadoPortabilidad,
							 resultadoFinal;

	
	
	public void mostrarFuncionabilidad() {
		JOptionPane.showMessageDialog(null, "Seguridad de Acceso: (" + getSeguridadDeAcceso() + ")\n" +
											"Exactitud de resultados: (" + getExactitudDeResultados() + ")");
	}

	public void mostrarEficiencia() {
		JOptionPane.showMessageDialog(null, "Utilizacion de Recursos: (" + getUtilizacionDeRecursos() + ")\n" +
				"Comportamiento En El Tiempo: (" + getComportamientoEnElTiempo() + ")");
	}
	
	public void mostrarFiabilidad() {
		JOptionPane.showMessageDialog(null, "Tolerancia a Fallos: (" + getToleranciaAFallos() + ")\n" +
				"Capacidad de Recuperacion ante Errores: (" + getCapacidadDeRecuperacionDeErrores() + ")");
	}
	
	public void mostrarMantenibilidad() {
		JOptionPane.showMessageDialog(null, "Analizibilidad Del Codigo: (" + getAnalizabilidadDelCodigo() + ")\n" +
				"Cambiabilidad del Codigo: (" + getCambiabilidadDelCodigo() + ")\n" + 
				"Estabilidad del Codigo: (" + getEstabilidadDelCodigo() + ")");
	}
	
	
	


	public static String calculoDeExperiencia(AlgoritmoDeCalidad algoritmo)
	{
		pesoDeFuncionabilidad = 10;
		pesoDeEficiencia = 5;
		pesoDeFiabilidad = 1;
		pesoDeMantenibilidad = 3;	
		pesoDeUsabilidad = 7;
		pesoDePortabilidad = 3;
		

		 resultadoFuncionabilidad = (float) ((float)( ( algoritmo.getSeguridadDeAcceso() + algoritmo.getExactitudDeResultados() )/2) * (pesoDeFuncionabilidad*0.1));
		 resultadoEficiencia = (float)((float)((algoritmo.getUtilizacionDeRecursos()+algoritmo.getComportamientoEnElTiempo())/2) * (pesoDeEficiencia*0.1));
		 resultadoFiabilidad = (float)((float)((algoritmo.getToleranciaAFallos() + algoritmo.getCapacidadDeRecuperacionDeErrores())/2) * (pesoDeFiabilidad*0.1));
		 resultadoMantenibilidad = (float)((float)((algoritmo.getAnalizabilidadDelCodigo() + algoritmo.getCambiabilidadDelCodigo() + algoritmo.getEstabilidadDelCodigo() )/3) * (pesoDeMantenibilidad*0.1));
		 resultadoUsabilidad = (float)((float)((algoritmo.getCapacidadDeSerEntendido() + algoritmo.getCapacidadDeSerOperado() + algoritmo.getCapacidadDeSerAtractivo() )/3) * (pesoDeUsabilidad*0.1));
		 resultadoPortabilidad = (float)((float)((algoritmo.getAdaptabilidad() + algoritmo.getInstalabilidad() )/2) * (pesoDePortabilidad*0.1));
		
		float resultadoFinal = resultadoFuncionabilidad + resultadoEficiencia + resultadoFiabilidad + resultadoMantenibilidad + resultadoUsabilidad + resultadoPortabilidad;
		float pesoMinimoParaSerExcelente = (float) ((pesoDeFuncionabilidad+pesoDeEficiencia+pesoDeFiabilidad+pesoDeMantenibilidad+pesoDeUsabilidad+pesoDePortabilidad)*1);
		float pesoMinimoParaSerMuyBuena = (float) ((pesoDeFuncionabilidad+pesoDeEficiencia+pesoDeFiabilidad+pesoDeMantenibilidad+pesoDeUsabilidad+pesoDePortabilidad)*0.8);
		float pesoMinimoParaSerBuena = (float) ((pesoDeFuncionabilidad+pesoDeEficiencia+pesoDeFiabilidad+pesoDeMantenibilidad+pesoDeUsabilidad+pesoDePortabilidad)*0.6);
		float pesoMinimoParaSerRegular = (float) ((pesoDeFuncionabilidad+pesoDeEficiencia+pesoDeFiabilidad+pesoDeMantenibilidad+pesoDeUsabilidad+pesoDePortabilidad)*0.4);
		
		
		if(resultadoFinal == pesoMinimoParaSerExcelente) {
			return "EXCELENTE";
		}
		if(resultadoFinal >= pesoMinimoParaSerMuyBuena)
		{
			return "MUY BUENA";
		}
		if(resultadoFinal >= pesoMinimoParaSerBuena)
		{
			return "BUENA";
		}
		if(resultadoFinal >= pesoMinimoParaSerRegular)
		{
			return "REGULAR";
		}
		return "MALA";
	}
	
	public static String calculoExpFuncionabilidad(Integer pesoSegAcceso, Integer pesoExactRes) {
		Float peso = (float) ( (pesoSegAcceso + pesoExactRes) / 2 );
		
		if(peso == 10) return "EXCELENTE";
		if(peso >= 8) return "MUY BUENA";
		if(peso >= 6) return "BUENA";
		if(peso >= 4) return "REGULAR";
		return "MALA";
		
	}
	
	public static String calculoExpEficiencia(Integer utilRecurso, Integer comportamientoTiemp) {
		
		Float peso = (float) (( utilRecurso + comportamientoTiemp ) / 2); 
		
		if(peso == 10) return "EXCELENTE";
		if(peso >= 8) return "MUY BUENA";
		if(peso >= 6) return "BUENA";
		if(peso >= 4) return "REGULAR";
		return "MALA";
	}
	
	public static String calculoExpFiabilidad(Integer tolFallos, Integer capRecuErrores) {
		
		Float peso = (float) (( tolFallos + capRecuErrores ) / 2); 
		
		if(peso == 10) return "EXCELENTE";
		if(peso >= 8) return "MUY BUENA";
		if(peso >= 6) return "BUENA";
		if(peso >= 4) return "REGULAR";
		return "MALA";
	}


	public static String calculoExpMantenibilidad(Integer analizCod, Integer cambiCod, Integer estabCod  ) {

		Float peso = (float) (( analizCod + cambiCod + estabCod ) / 3); 
		
		if(peso == 10) return "EXCELENTE";
		if(peso >= 8) return "MUY BUENA";
		if(peso >= 6) return "BUENA";
		if(peso >= 4) return "REGULAR";
		return "MALA";
	}
	
	public static String calculoExpUsabilidad(Integer capEntendido, Integer capOperado, Integer capAtractivo) {

		Float peso = (float) (( capEntendido + capOperado + capAtractivo ) / 3); 
		
		if(peso == 10) return "EXCELENTE";
		if(peso >= 8) return "MUY BUENA";
		if(peso >= 6) return "BUENA";
		if(peso >= 4) return "REGULAR";
		return "MALA";
	}
	
	public static String calculoExpPortabilidad(Integer adap, Integer instal) {

		Float peso = (float) (( adap + instal ) / 2); 
		
		if(peso == 10) return "EXCELENTE";
		if(peso >= 8) return "MUY BUENA";
		if(peso >= 6) return "BUENA";
		if(peso >= 4) return "REGULAR";
		return "MALA";
	}
	
	//Getters and setters
		public  Integer getSeguridadDeAcceso() {
			return seguridadDeAcceso;
		}


		public void setSeguridadDeAcceso(Integer seguridadDeAcceso) {
			this.seguridadDeAcceso = seguridadDeAcceso;
		}


		public Integer getExactitudDeResultados() {
			return exactitudDeResultados;
		}


		public void setExactitudDeResultados(Integer exactitudDeResultados) {
			this.exactitudDeResultados = exactitudDeResultados;
		}


		public Integer getUtilizacionDeRecursos() {
			return utilizacionDeRecursos;
		}


		public void setUtilizacionDeRecursos(Integer utilizacionDeRecursos) {
			this.utilizacionDeRecursos = utilizacionDeRecursos;
		}


		public Integer getComportamientoEnElTiempo() {
			return comportamientoEnElTiempo;
		}


		public void setComportamientoEnElTiempo(Integer comportamientoEnElTiempo) {
			this.comportamientoEnElTiempo = comportamientoEnElTiempo;
		}


		public Integer getToleranciaAFallos() {
			return toleranciaAFallos;
		}


		public void setToleranciaAFallos(Integer toleranciaAFallos) {
			this.toleranciaAFallos = toleranciaAFallos;
		}


		public Integer getCapacidadDeRecuperacionDeErrores() {
			return capacidadDeRecuperacionDeErrores;
		}


		public void setCapacidadDeRecuperacionDeErrores(Integer capacidadDeRecuperacionDeErrores) {
			this.capacidadDeRecuperacionDeErrores = capacidadDeRecuperacionDeErrores;
		}


		public Integer getAnalizabilidadDelCodigo() {
			return analizabilidadDelCodigo;
		}


		public void setAnalizabilidadDelCodigo(Integer analizabilidadDelCodigo) {
			this.analizabilidadDelCodigo = analizabilidadDelCodigo;
		}


		public Integer getCambiabilidadDelCodigo() {
			return cambiabilidadDelCodigo;
		}


		public void setCambiabilidadDelCodigo(Integer cambiabilidadDelCodigo) {
			this.cambiabilidadDelCodigo = cambiabilidadDelCodigo;
		}


		public Integer getEstabilidadDelCodigo() {
			return estabilidadDelCodigo;
		}


		public void setEstabilidadDelCodigo(Integer estabilidadDelCodigo) {
			this.estabilidadDelCodigo = estabilidadDelCodigo;
		}


		public Integer getCapacidadDeSerEntendido() {
			return capacidadDeSerEntendido;
		}


		public void setCapacidadDeSerEntendido(Integer capacidadDeSerEntendido) {
			this.capacidadDeSerEntendido = capacidadDeSerEntendido;
		}


		public Integer getCapacidadDeSerOperado() {
			return capacidadDeSerOperado;
		}


		public void setCapacidadDeSerOperado(Integer capacidadDeSerOperado) {
			this.capacidadDeSerOperado = capacidadDeSerOperado;
		}


		public Integer getCapacidadDeSerAtractivo() {
			return capacidadDeSerAtractivo;
		}


		public void setCapacidadDeSerAtractivo(Integer capacidadDeSerAtractivo) {
			this.capacidadDeSerAtractivo = capacidadDeSerAtractivo;
		}


		public Integer getAdaptabilidad() {
			return adaptabilidad;
		}


		public void setAdaptabilidad(Integer adaptabilidad) {
			this.adaptabilidad = adaptabilidad;
		}


		public Integer getInstalabilidad() {
			return instalabilidad;
		}


		public void setInstalabilidad(Integer instalabilidad) {
			this.instalabilidad = instalabilidad;
		}

		public static Float getResultadoFuncionabilidad() {
			return resultadoFuncionabilidad;
		}

		public static void setResultadoFuncionabilidad(Float resultadoFuncionabilidad) {
			AlgoritmoDeCalidad.resultadoFuncionabilidad = resultadoFuncionabilidad;
		}

		public static Float getResultadoEficiencia() {
			return resultadoEficiencia;
		}

		public static void setResultadoEficiencia(Float resultadoEficiencia) {
			AlgoritmoDeCalidad.resultadoEficiencia = resultadoEficiencia;
		}

		public static Float getResultadoFiabilidad() {
			return resultadoFiabilidad;
		}

		public static void setResultadoFiabilidad(Float resultadoFiabilidad) {
			AlgoritmoDeCalidad.resultadoFiabilidad = resultadoFiabilidad;
		}

		public static Float getResultadoMantenibilidad() {
			return resultadoMantenibilidad;
		}

		public static void setResultadoMantenibilidad(Float resultadoMantenibilidad) {
			AlgoritmoDeCalidad.resultadoMantenibilidad = resultadoMantenibilidad;
		}

		public static Float getResultadoUsabilidad() {
			return resultadoUsabilidad;
		}

		public static void setResultadoUsabilidad(Float resultadoUsabilidad) {
			AlgoritmoDeCalidad.resultadoUsabilidad = resultadoUsabilidad;
		}

		public static Float getResultadoPortabilidad() {
			return resultadoPortabilidad;
		}

		public static void setResultadoPortabilidad(Float resultadoPortabilidad) {
			AlgoritmoDeCalidad.resultadoPortabilidad = resultadoPortabilidad;
		}

		public static Float getResultadoFinal() {
			return resultadoFinal;
		}

		public static void setResultadoFinal(Float resultadoFinal) {
			AlgoritmoDeCalidad.resultadoFinal = resultadoFinal;
		}
		


	


}
