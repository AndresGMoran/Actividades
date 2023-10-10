import java.util.Scanner;
	public class Actividad10 {
		public enum Meses {
			Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre
		}
		public enum NotasMusica {
			Do,Re,Mi,Fa,Sol
		}
		public enum CalificacionesAlumnos {
			Insuficiente,Suficiente,Bien,Excelente
		}
	
		public static void main(String[] args) {
			Meses mes = Meses.Septiembre;
			System.out.println(mes);

			NotasMusica nota = NotasMusica.Sol;
			System.out.println(nota);

			CalificacionesAlumnos calificacion = CalificacionesAlumnos.Suficiente;
			System.out.println(calificacion);
		}
	}