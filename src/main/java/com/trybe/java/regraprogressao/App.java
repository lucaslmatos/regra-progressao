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
    System.out.print("Digite a quantidade de atividades para cadastrar: \n");
    String strqtdAtividades = scanner.next();
    Integer qtdInteger = Integer.parseInt(strqtdAtividades);
    Integer contador = 1;

    do {
      System.out.print("Digite o nome da atividade " + contador + ": \n");
      String strAtividades = scanner.next();
      System.out.print("Digite o peso da atividade " + contador + ": \n");
      String strPesos = scanner.next();
      contador++;

    } while (contador <= qtdInteger);
    scanner.close();
  }
}