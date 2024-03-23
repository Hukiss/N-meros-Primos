import NumeroPrimo.Primo;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException{

        Primo primo = new Primo();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        try{

            System.out.print("\nDígite o intervalo pretendido.\nIntervalo inferior: ");
            int limiteInferior = scanner.nextInt();
            primo.setInicio(limiteInferior);

            System.out.print("Intervalo superior: ");
            int limiteSuperior = scanner.nextInt();
            primo.setLimite(limiteSuperior);

            primo.primo(list);
            System.out.println();
            primo.showToString(list);
            System.out.println();

        } catch (IllegalArgumentException e){
            System.out.println("\nException: " + e.getMessage());
        }
    }
}
