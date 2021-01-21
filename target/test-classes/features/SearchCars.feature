#language:pt

Funcionalidade: Pesquisar carros Webmotors

  Esquema do Cenário: Pesquisar carros
    Dado que tenho estou na tela de pesquisa de carros
    Quando pesquiso o carro por "<marca>" "<modelo>" "<versao>"
    Então devo visualizar a lista de carros pesquisados por "<marca>" "<modelo>" "<versao>"

    Exemplos:
    |marca|modelo|versao|
    |honda|CITY|1.5 DX 16V FLEX 4P MANUAL|

  Esquema do Cenário: Pesquisar carros por loja
    Dado que tenho estou na tela de estoque de uma loja
    Quando pesquiso o carro por "<marca>" "<modelo>" "<versao>"
    Então devo visualizar a lista de carros pesquisados por "<marca>" "<modelo>" "<versao>"

    Exemplos:
      |marca|modelo|versao|
      |honda|CITY|1.5 EXL 16V FLEX 4P AUTOMÁTICO|

