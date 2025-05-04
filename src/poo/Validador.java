package poo;

import java.util.ArrayList;
import java.util.List;

public class Validador {
    private boolean loginOk;

    List<User> usuariosCadastrados;

    public Validador(){
        this.usuariosCadastrados = new ArrayList<>();

        usuariosCadastrados.add(new User("admin", "1234"));
        usuariosCadastrados.add(new User("kvnog", "0811"));
        usuariosCadastrados.add(new User("java", "0000"));
    }

    public boolean validar(User user){
        for (User u : usuariosCadastrados){
            if (u.getLogin().equals(user.getLogin()) && u.getSenha().equals(user.getSenha())){
                return true;
            }
        }
        return false;
    }

    public void logado(boolean loginOk){
        if (loginOk){
            System.out.println("✅ Login efetuado com sucesso!");
        } else {
            System.out.println("❌ Login não efetuado. Verifique suas credenciais.");
        }
    }
}
