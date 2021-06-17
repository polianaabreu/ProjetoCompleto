#language: pt
#enconding: UTF-8
#author: Poliana Abreu
#date: 24/05/2021
#version: 1.0

Funcionalidade: Login
  Com essa Funcionalidade iremos conseguir realizar
  o login na aplicação com o usuário já cadastrado.

  Contexto: Entrar na tela Login
    Dado estiver na tela Login

  @smoke_test
  Cenário: Validar o login na aplicação
    Quando inserir os dados do usuario "login correto"
    Então devo visualizar o nome "Etech Mentoria"

  @regression
  Esquema do Cenario: Validar mensagem de erro ao inserir dados incorretos
    Quando inserir os dados do usuario <dados_usuarios>
    Então devo visualizar a mensagem de erro "Authentication failed."

    Exemplos:
      | dados_usuarios    |
      | "email incorreto" |
      | "senha incorreta" |