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
					


	
	
	public void mostrarFuncionabilidad() {
		JOptionPane.showMessageDialog(null, "Seguridad de Acceso: (" + getSeguridadDeAcceso() + ")\n" +
											"Exactitud de resultados: (" + getExactitudDeResultados() + ")");
	}

	public void mostrarEficiencia() {
		JOptionPane.showMessageDialog(null, "Utilizacion de Recursos: (" + getUtilizacionDeRecursos() + ")\n" +
				"Comportamiento En El Tiempo: (" + getComportamientoEnElTiempo() + ")");
	}
	
	
	
	


	public static String ingresoDeDatosYCalculoDeExperiencia()
	{
		pesoDeFuncionabilidad = 10;
		
		//Integer pesoDeFuncionabilidad = 10; // Los pesos varían de 0 a 1.
		Integer seguridadDeAcceso = Integer.parseInt(JOptionPane.showInputDialog("FUNCIONABILIDAD - Seguridad de acceso - Capacidad del producto software para asegurar la integridad de los datos y la confidencialidad de éstos - Características a medir: Encriptación de datos e inicio de sesión de usuarios - Ingrese calificación del 0 al 10."));		
		Integer exactitudDeResultados = Integer.parseInt(JOptionPane.showInputDialog("FUNCIONABILIDAD - Exactitud de resultados - Capacidad del producto software para proporcionar los resultados con el grado necesario de precisión. - Ingrese calificación del 0 al 10."));
		
		pesoDeEficiencia = 5;
		Integer utilizacionDeRecursos = Integer.parseInt(JOptionPane.showInputDialog("EFICIENCIA - Utilización de recursos\n\nEficiencia del producto software de acuerdo al porcentaje de uso de procesador que realice. - Ingrese calificación del 0 al 10."));
		Integer comportamientoEnElTiempo = Integer.parseInt(JOptionPane.showInputDialog("EFICIENCIA - Comportamiento en el tiempo\n\nTiempo que está el producto software sin informarle al usuario del estado en que se encuentra la solicitud que realizó. - Ingrese calificación del 0 al 10."));
		
		pesoDeFiabilidad = 1;
		Integer toleranciaAFallos = Integer.parseInt(JOptionPane.showInputDialog("FIABILIDAD - Tolerancia a fallos\n\nCapacidad del producto software para mantener la integridad de los datos cuando se producen fallas en el sistema.\n\n\nCaracterísticas a medir: Protección de los datos necesarios al generarse un error y generación de log con las actividades que el sistema estaba haciendo antes de fallar. - Ingrese calificación del 0 al 10."));
		Integer capacidadDeRecuperacionDeErrores = Integer.parseInt(JOptionPane.showInputDialog("FIABILIDAD - Capacidad de recuperación de errores\n\nCapacidad del sistema de reanudar sus actividades cuando se producen errores críticos.\n\n\nCaracterísticas a medir: Reanudación de actividades al producirse una falla crítica y reanudación del sistema desde el estado en que estaba antes de fallar. - Ingrese calificación del 0 al 10."));
		
		pesoDeMantenibilidad = 3;		
		Integer analizabilidadDelCodigo = Integer.parseInt(JOptionPane.showInputDialog("MANTENIBILIDAD - Capacidad del código para ser analizado\n\nAnalizabilidad del código teniendo en cuenta el porcentaje de comentarios por método y en general. - Ingrese calificación del 0 al 10."));
		Integer cambiabilidadDelCodigo = Integer.parseInt(JOptionPane.showInputDialog("MANTENIBILIDAD - Capacidad del código para ser cambiado\n\nAnalizabilidad del código teniendo en cuenta la complejidad ciclomática del método. - Ingrese calificación del 0 al 10."));
		Integer estabilidadDelCodigo = Integer.parseInt(JOptionPane.showInputDialog("MANTENIBILIDAD - Estabilidad\n\nPromedio de fallas del sistema por prueba. - Ingrese calificación del 0 al 10."));
		
		pesoDeUsabilidad = 7;
		Integer capacidadDeSerEntendido = Integer.parseInt(JOptionPane.showInputDialog("USABILIDAD - Capacidad de ser entendido\n\n Capacidad del producto software para ayudar a los usuarios cuando necesiten asistencia.\n\n\nCaracterísticas a medir: Posee ayuda contextual sobre menúes y botones de acción e incorporación de manual de usuario en el sistema con un menú dedicado. - Ingrese calificación del 0 al 10."));
		Integer capacidadDeSerOperado = Integer.parseInt(JOptionPane.showInputDialog("USABILIDAD - Capacidad de ser entendido\n\n Capacidad del producto software para ayudar a los usuarios cuando necesiten asistencia.\n\n\nManual de usuario incorporado al sistema como un menú dedicado.\nMALA - REGULAR - BUENA - Ingrese calificación del 0 al 10."));
		Integer capacidadDeSerAtractivo = Integer.parseInt(JOptionPane.showInputDialog("USABILIDAD - Capacidad de ser operado\n\nCapacidad del producto software de ser utilizado sin asistencia adicional. - Ingrese calificación del 0 al 10."));
		
		pesoDePortabilidad = 3;
		Integer adaptabilidad = Integer.parseInt(JOptionPane.showInputDialog("PORTABILIDAD - Adaptabilidad\n\nCapacidad del producto software de adaptarse a diferentes sistemas operativos sin cambiar su estructura interna. - Ingrese calificación del 0 al 10."));
		Integer instalabilidad = Integer.parseInt(JOptionPane.showInputDialog("PORTABILIDAD - Instalabilidad\n\nCapacidad del producto software de poder ser instalado en una cantidad mínima de pasos. - Ingrese calificación del 0 al 10."));
		
		
		Float resultado = (float) ((float)((seguridadDeAcceso+exactitudDeResultados)/2) * (pesoDeFuncionabilidad*0.1));
		resultado += (float)((float)((utilizacionDeRecursos+comportamientoEnElTiempo)/2) * (pesoDeEficiencia*0.1));
		resultado += (float)((float)((toleranciaAFallos+capacidadDeRecuperacionDeErrores)/2) * (pesoDeFiabilidad*0.1));
		resultado += (float)((float)((analizabilidadDelCodigo+cambiabilidadDelCodigo+estabilidadDelCodigo)/3) * (pesoDeMantenibilidad*0.1));
		resultado += (float)((float)((capacidadDeSerEntendido+capacidadDeSerOperado+capacidadDeSerAtractivo)/3) * (pesoDeUsabilidad*0.1));
		resultado += (float)((float)((adaptabilidad+instalabilidad)/2) * (pesoDePortabilidad*0.1));
		
		Float pesoMinimoParaSerBuena = (float) ((pesoDeFuncionabilidad+pesoDeEficiencia+pesoDeFiabilidad+pesoDeMantenibilidad+pesoDeUsabilidad+pesoDePortabilidad)*0.7);
		Float pesoMinimoParaSerRegular = (float) ((pesoDeFuncionabilidad+pesoDeEficiencia+pesoDeFiabilidad+pesoDeMantenibilidad+pesoDeUsabilidad+pesoDePortabilidad)*0.4);
		if(resultado >= pesoMinimoParaSerBuena)
		{
			return "BUENA";
		}
		if(resultado >= pesoMinimoParaSerRegular)
		{
			return "REGULAR";
		}
		return "MALA";
	}


	//Getters and setters
		public Integer getSeguridadDeAcceso() {
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

	


}
