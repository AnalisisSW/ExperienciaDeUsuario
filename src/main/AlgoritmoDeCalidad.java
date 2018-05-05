package main;

import javax.swing.JOptionPane;

public class AlgoritmoDeCalidad {
	
	public static String ingresoDeDatosYCalculoDeExperiencia()
	{
		Integer pesoDeFuncionabilidad = 10; // Los pesos varían de 0 a 1.
		Integer seguridadDeAcceso = Integer.parseInt(JOptionPane.showInputDialog("FUNCIONABILIDAD - Seguridad de acceso - Capacidad del producto software para asegurar la integridad de los datos y la confidencialidad de éstos - Características a medir: Encriptación de datos e inicio de sesión de usuarios - Ingrese calificación del 0 al 10."));		
		Integer exactitudDeResultados = Integer.parseInt(JOptionPane.showInputDialog("FUNCIONABILIDAD - Exactitud de resultados - Capacidad del producto software para proporcionar los resultados con el grado necesario de precisión. - Ingrese calificación del 0 al 10."));
		
		Integer  pesoDeEficiencia = 5;
		Integer utilizacionDeRecursos = Integer.parseInt(JOptionPane.showInputDialog("EFICIENCIA - Utilización de recursos\n\nEficiencia del producto software de acuerdo al porcentaje de uso de procesador que realice. - Ingrese calificación del 0 al 10."));
		Integer comportamientoEnElTiempo = Integer.parseInt(JOptionPane.showInputDialog("EFICIENCIA - Comportamiento en el tiempo\n\nTiempo que está el producto software sin informarle al usuario del estado en que se encuentra la solicitud que realizó. - Ingrese calificación del 0 al 10."));
		
		Integer pesoDeFiabilidad = 1;
		Integer toleranciaAFallos = Integer.parseInt(JOptionPane.showInputDialog("FIABILIDAD - Tolerancia a fallos\n\nCapacidad del producto software para mantener la integridad de los datos cuando se producen fallas en el sistema.\n\n\nCaracterísticas a medir: Protección de los datos necesarios al generarse un error y generación de log con las actividades que el sistema estaba haciendo antes de fallar. - Ingrese calificación del 0 al 10."));
		Integer capacidadDeRecuperacionDeErrores = Integer.parseInt(JOptionPane.showInputDialog("FIABILIDAD - Capacidad de recuperación de errores\n\nCapacidad del sistema de reanudar sus actividades cuando se producen errores críticos.\n\n\nCaracterísticas a medir: Reanudación de actividades al producirse una falla crítica y reanudación del sistema desde el estado en que estaba antes de fallar. - Ingrese calificación del 0 al 10."));
		
		Integer pesoDeMantenibilidad = 3;		
		Integer analizabilidadDelCodigo = Integer.parseInt(JOptionPane.showInputDialog("MANTENIBILIDAD - Capacidad del código para ser analizado\n\nAnalizabilidad del código teniendo en cuenta el porcentaje de comentarios por método y en general. - Ingrese calificación del 0 al 10."));
		Integer cambiabilidadDelCodigo = Integer.parseInt(JOptionPane.showInputDialog("MANTENIBILIDAD - Capacidad del código para ser cambiado\n\nAnalizabilidad del código teniendo en cuenta la complejidad ciclomática del método. - Ingrese calificación del 0 al 10."));
		Integer estabilidadDelCodigo = Integer.parseInt(JOptionPane.showInputDialog("MANTENIBILIDAD - Estabilidad\n\nPromedio de fallas del sistema por prueba. - Ingrese calificación del 0 al 10."));
		
		Integer pesoDeUsabilidad = 7;
		Integer capacidadDeSerEntendido = Integer.parseInt(JOptionPane.showInputDialog("USABILIDAD - Capacidad de ser entendido\n\n Capacidad del producto software para ayudar a los usuarios cuando necesiten asistencia.\n\n\nCaracterísticas a medir: Posee ayuda contextual sobre menúes y botones de acción e incorporación de manual de usuario en el sistema con un menú dedicado. - Ingrese calificación del 0 al 10."));
		Integer capacidadDeSerOperado = Integer.parseInt(JOptionPane.showInputDialog("USABILIDAD - Capacidad de ser entendido\n\n Capacidad del producto software para ayudar a los usuarios cuando necesiten asistencia.\n\n\nManual de usuario incorporado al sistema como un menú dedicado.\nMALA - REGULAR - BUENA - Ingrese calificación del 0 al 10."));
		Integer capacidadDeSerAtractivo = Integer.parseInt(JOptionPane.showInputDialog("USABILIDAD - Capacidad de ser operado\n\nCapacidad del producto software de ser utilizado sin asistencia adicional. - Ingrese calificación del 0 al 10."));
		
		Integer pesoDePortabilidad = 3;
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

}
