import java.util.Arrays;
import java.util.Scanner;

public class ResultadoElecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaramos variables
		Scanner scanner = new Scanner(System.in);
		// Solicitar el número de candidatos y votantes
		System.out.print("Ingrese el número de candidatos: ");
		int numCandidatos = scanner.nextInt();
		System.out.print("Ingrese el número de votantes: ");
		int numVotantes = scanner.nextInt();

		// Inicializar arreglo de votos
		int[] votos = new int[numCandidatos];

		// recolectamos votos de los votantes
		for (int i = 0; i < numVotantes; i++) {
			System.out.print("Ingrese el voto del votante " + (i + 1) + ": ");
			int voto = scanner.nextInt();
			if (voto >= 1 && voto <= numCandidatos) {
				votos[voto - 1]++;
			} else {
				System.out.println("Voto invalido");
			}
		}
		// Creamos una matriz para poder almacenar los resultados
		int[][] resultados = new int[numCandidatos][2];
		for (int i = 0; i < numCandidatos; i++) {
			resultados[i][0] = i + 1; // este es el numero de los candidatos
			resultados[i][1] = votos[i]; // este es el numero de votos
		}
		// Ordenamos con bubble sort
		for (int i = 0; i < resultados.length - 1; i++) {
			for (int j = 0; j < resultados.length - i - 1; j++) {
				// Intercambiamos los resultados [j] y los resultados [j+1]
				int[] aux = resultados[j];
				resultados[j] = resultados[j + 1];
				resultados[j + 1] = aux;

			}
		}
		// Mostramos los resultados
		System.out.println("Resultados");
		for (int i = 0; i < numCandidatos; i++) {
			System.out
					.println("Lugar" + (i + 1) + "Candidato " + resultados[i][0] + "con" + resultados[i][1] + "votos");
		}
	}
}
