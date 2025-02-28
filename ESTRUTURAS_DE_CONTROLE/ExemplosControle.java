package ESTRUTURAS_DE_CONTROLE;

public class ExemplosControle {
    public static void main(String[] args) {
        // condicional if else
        int idade = 17;
        if (idade >= 18 && idade < 60) {
            System.out.println("Deve votar");
        } else if (idade >= 16 || idade >= 60) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }

        // condicional switch
        String nome = "Gabriel";

        switch (nome) {
            case "Gabriel":
                System.out.println("Olá, Gabriel!");
                break;
            
            case "Tony":
                System.out.println("Olá, Tony!");
                break;
        
            default:
                System.out.println("Olá! Não sei o seu nome, desculpe.");
                break;
        }

        // repeticao for
        for (int i = 0; i <= 5; i++) {
            System.out.println("Rodada: " + i); // Rodada: 0 1 2 3 4 5
        }
        
        // repeticao for percorrendo array
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int num : numeros) {
            System.out.println(num); // 1 2 3 4 5 6 7 8 9
        }

        // repeticao while
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Rodada: " + contador); // Rodada: 0 1 2 3 4 5
            contador++;
        }

        // repeticao do while
        contador = 0;
        do {
            System.out.println("Rodada: " + contador); // Rodada: 0 1 2 3 4 5
            contador++;
        } while (contador <= 5);

        // break e continue
        for(int num : numeros) {
            if (num == 2) {
                continue;
            }

            if (num > 5) {
                break;
            }

            System.out.println(num); // 1 3 4 5
        }
    }
}
