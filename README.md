## Modelo UML do projeto
<img alt="Modelo UML" title="#ModeloUML" src="./assets/Diagrama-UML.jpg" />

## Dúvidas
- **Como usar a classe endereço, já que ela se encontra fora de qualquer pacote?**

  Podemos colocar a classe endereço dentro de um pacote 'util' neste caso.
  
- **O que é o Enumeration da classe statusPedido? Foi implementado corretamente?**

  São tipos de campos que consistem em um conjunto fixo de constantes (static final), sendo como uma lista de valores pré-definidos. É útil para definir constantes relacionadas.

  Todos os tipos enums implicitamente estendem a classe java.lang.Enum, sendo que o Java não suporta herança múltipla, não podendo estender nenhuma outra classe.

- **O modo como as classes se relacionam está correto?**



- **Como implementar as relações de multiplicidade?**



- **O que é Aggregate Root?**



## Para fazer 
### Geral
- [X] Estruturar pastas e pacotes de forma correta.

- [X] Desenvolver os atributos simples e métodos padrões (getters e setters).

- [X] Desenvolver relações corretas entre as classes.

- [X] Implementar métodos que façam sentido no contexto do programa.

- [ ] Implementar interface em algum lugar (pedido dela).

### Específico

- [X] Preencher fotoProduto e Produto
  - Quando adicionarmos um produto ao restaurante, adicionamos fotoProduto a Produto.

- [X] Mudar tipo double para big decimal.
