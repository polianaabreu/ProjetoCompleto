#language: pt
#econding: UTF-8
#author: Poliana Abreu
#date:24/05/2021
#version:1.0

Funcionalidade: Novo cadastro
  Com essa Funcionalidade iremos conseguir realizar
  um novo cadastro de usuário na aplicação.

  @cadastro
  Cenario: Validar o cadastro realizado com sucesso
    Dado estiver na tela Login
    Quando preencher o cadastro de um novo usuario
    Então deve exibir o cadastro de um novo usuario

