package com.trybe.java.regraprogressao;

import java.util.Scanner;


/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    String strqtdAtividades = scanner.next();
    Integer qtdInteger = Integer.parseInt(strqtdAtividades);
    Integer contador = 1;
    Integer pesoXNota = 0;
    Integer peso = 0;

    do {
      System.out.println("Digite o nome da atividade " + contador + ": ");
      String strAtividade = scanner.nextLine();
      scanner.nextLine();
      System.out.println("Digite o peso da atividade " + contador + ": ");
      Integer strPeso = scanner.nextInt();
      System.out.println("Digite a nota obtida para " + strAtividade + ": ");
      Integer strNota = scanner.nextInt();
      pesoXNota = pesoXNota + (strNota * strPeso);
      peso = peso + strPeso;
      contador++;

    } while (contador <= qtdInteger);

    scanner.close();
    double result = (pesoXNota / peso);

    if (result >= 85) {
      System.out.println("Parabéns! Você alcançou " 
          + result + "%! E temos o prazer de informar que você obteve aprovação! ");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação" 
          +  "alcançada neste período, " 
          + result + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}