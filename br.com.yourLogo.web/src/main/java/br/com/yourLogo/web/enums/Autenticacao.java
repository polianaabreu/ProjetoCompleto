package br.com.yourLogo.web.enums;

import br.com.yourLogo.web.interfaces.CredencialUsuario;

public enum Autenticacao implements CredencialUsuario {

    LOGIN_CORRETO{
        @Override
        public String email(){
            return "mentoria_etech@dev.com";
        }

        @Override
        public String senha(){
            return "teste123";
        }
    },

    EMAIL_INCORRETO{
        @Override
        public String email(){
            return "polianabreu@live.com";
        }

        @Override
        public String senha() {
            return "teste123";
        }
    },

    SENHA_INCORRETA{
        @Override
        public String email(){
            return "mentoria_etch@dev.com";
        }

        @Override
        public String senha() {
            return "teste321";
        }
    }
}
