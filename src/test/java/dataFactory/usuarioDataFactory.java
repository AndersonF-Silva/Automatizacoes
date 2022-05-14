package dataFactory;

import pojo.UsuarioPojo;

public class usuarioDataFactory {
    public static UsuarioPojo criarUsuarioAdministrador() {
        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setUsuarioLogin("andersonsilva");
        usuario.setUsuarioSenha("123456");

        return usuario;

    }
}
