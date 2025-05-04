package app;

import poo.User;
import poo.Validador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Validador validador = new Validador();

        int tentativas = 0;
        final int limiteTentativas = 3;
        boolean logado = false;

        while (tentativas < limiteTentativas && !logado){
            User user = new User();

            System.out.println("Digite o seu login: ");
            user.setLogin(scn.nextLine());
            System.out.println("Digite a sua senha: ");
            user.setSenha(scn.nextLine());

            logado = validador.validar(user);
            validador.logado(logado);

            if (!logado){
                tentativas++;
                if (tentativas < limiteTentativas){
                    System.out.println("Tentativa " + tentativas + " de " + limiteTentativas + ". Tente novamente.\n");
                }
            }
        }

        if (!logado){
            System.out.println("Número máximo de tentativas excedido, Acesso bloqueado.");
        }
    }
}
