package NumeroPrimo;

import java.util.ArrayList;

public class Primo {

    //public static int PRIMEIRO = 2;
    private int inicio;
    private int limite;

    public void setInicio(int inicio){
        if (inicio < 0)                                                                              // Verifica se o valor a ser inserido no campo "inicio"
            throw new IllegalArgumentException("inicio não pode ser um número negativo");            // caso não cumpre a condisão então lança uma Exceção
        this.inicio = inicio;
    }
    public int getInicio(){
        return inicio;
    }

    public void setLimite(int limite){
        if (limite <= 0)                                                                                  // Verifica se o valor a ser inserido no campo "limite"
            throw new IllegalArgumentException("limite não pode ser um número negativo, nem nulo");     // caso não cumpre a condisão então lança uma Exceção
        this.limite = limite;
    }
    public int getLimite(){
        return limite;
    }

    public void primo(ArrayList<Integer> list){
        for (int counter = 2; counter < limite; counter++) {           // Os valores a serem adicionados ao ArrayList virão do "For"
            if (!(auxiliar(counter, list))){                     // e serão verificados no método "auxiliar", podendo retornar "false ou true"
                list.add(counter);                                      // caso seja false então ele adiciona ao ArrayList "list", caso não pila para outra iteraçÕ
            }
        }
    }

    public boolean auxiliar(int counter, ArrayList<Integer> list){
        boolean valor = false;
        for (int i = 0; i < list.size(); i++)                           // Verifica os valores alocados antes da novo armazenamento
            if ( (counter % list.get(i) == 0 ) ){                       // apenas se for false, e se for verdadeiro significa que tem
                valor = true;                                           // um valor na qual ele pode ser dividido
                break;
            }

        return valor;                                                   // Retorna o valor "false ou true"
    }

    public void showToString(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++){                        // Apresenta todos os números guardadas no ArrayList
            if (list.get(i) >= getInicio() ){                        // começando pelo limite inferior até ao limite superior
                System.out.printf("%d ", list.get(i));
            }
        }
    }
}
