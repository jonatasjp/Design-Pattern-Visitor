# Repositório da implementação do padrão de Projeto Visitor

Este repositório contém a implementação do padrão de Projeto Visitor, foi desenvolvido em Java.

O padrão Visitor utiliza em sua estrutura o padrão Double Dispatch, esse padrão tem em sua estrutura um visitante e um visitado, onde o visitado recebe o visitante e faz a solicitação de alguma coisa a ele.

Explicando o cenário acima, a classe ComprasCliente é o visitado, que recebe o visitante como parâmetro no seu método gerarRelatorio, e com o próprio objeto visitante faz solicitações a ele, passando seus dados como parâmetro.