package model;

public class Usuario {
    private String username;
    private String senha;
    private boolean isLogado = false;

    public Usuario(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public void login(String inputUsername, String inputSenha) {
        try {
            if (inputUsername.equals(username) && inputSenha.equals(senha)) {
                isLogado = true;
                System.out.println("Login realizado!");
            } else {
                System.out.println("Usuário ou senha inválidos.");
            }
        } catch (NullPointerException e) {
            System.err.println("Erro ao fazer login: " + e.getMessage());
        }
    }

    public void register(String newUsername, String newSenha) {
        try {
            username = newUsername;
            senha = newSenha;
            isLogado = true;

            System.out.println("Registro realizado");
        } catch (NullPointerException e) {
            System.err.println("Erro ao registrar: " + e.getMessage());
        }
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isLogado() {
        return isLogado;
    }

    public void setLogado(boolean isLogado) {
        this.isLogado = isLogado;
    }
}
