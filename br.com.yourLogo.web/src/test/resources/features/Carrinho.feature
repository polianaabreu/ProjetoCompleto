#language: pt
#enconding: UTF-8
#author: Poliana Abreu
#date: 24/05/2021
#version: 1.0

Funcionalidade: Adicinando o produto no carrinho
  Com essa Funcionalidade iremos conseguir realizar
  interações na tela home e adicionar produto no cart.

  @Smoke_test
  Cenário: Validar interação da tela Women
    Dado estiver na tela women
    E o usuário escolher o produto desejado
    Quando clicar no botão "Add to cart"
    Então devo visualizar a msg "Product successfully added to your shopping cart"