package br.com.dev.teste;

import br.com.dev.entity.Champion;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nDigite os dados do primeiro campeão:");
        Champion champion1 = createChampion(leitor);
        System.out.println("\nDigite os dados do segundo campeão:");
        Champion champion2 = createChampion(leitor);

        System.out.print("\nQuantidades de Turno: ");
        int rodadas = leitor.nextInt();
        int i = 1;
        while(i <= rodadas && (champion1.getLife() > 0 && champion2.getLife() > 0)){

            System.out.printf("\nResultado do turno %d:\n", i );
            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);

            System.out.println(champion1.status());
            System.out.println(champion2.status());

            i++;

        }
        leitor.close();
        System.out.println("FIM DO COMBATE");
    }

    public static int validaEntrada(String msg, Scanner leitor){
        System.out.print(msg);
        int entrada = leitor.nextInt();

        while (entrada <= 0){
            System.out.println("Valor invalido! Favor digitar um valor positivo: " + entrada);
            entrada = leitor.nextInt();
        }

        return entrada;
    }

    public static Champion createChampion(Scanner leitor){

        String nome = " ";
        int vida = 0;
        int ataque = 0;
        int armadura = 0;


        System.out.print("Nome: ");
        nome = leitor.next();
        vida = validaEntrada("Vida Inicial: ", leitor);
        ataque = validaEntrada("Ataque: ", leitor);
        armadura = validaEntrada("Armadura: ", leitor);

        return new Champion(nome, vida, ataque, armadura);
    }


}
