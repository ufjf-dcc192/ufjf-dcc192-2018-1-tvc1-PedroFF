# dcc192-2018-1-Trabalho 1-Pedro Freitas

Nome: Pedro Fernandes Freitas 

Matrícula: 201576039

2. Cenário do sistema:
  O sistema foi pensado para suprir a demanda de uma boate noturna. Na boate, podem existir várias mesas e nas mesas nós
podemos ter mais de um pedido(que nesse caso é a comanda), então podemos ter mais de uma comanda por mesa.
  Assim que o pedido é criado, ele já guarda a hora de abertura. Podem ser adicionado novos itens ao pedido e quando o pedido for fechado,
ele calcula e mostra o valor final total do pedido e também a hora na qual o pedido foi fechado, junto com a descrição do pedido. Após o
pedido ser fechado se torna impossível adicionar mais itens no mesmo.

3. Modelo de dados:
  O modelo de dados foi feito na ferramenta draw.io e está disponível no link abaixo:
https://drive.google.com/file/d/1ATrRIuXJby1_-FZWwPwYLAwPADAIgvMA/view?usp=sharing

4. Campos necessários para construção das telas:
  Na construção das páginas, foi usado o BootStrap para estilização e no quesito funcional, foi usada a combinação do Servlet com 
as páginas JSP respectivamente, para fazer os processos e disponibilizar as informações nas páginas.
  
5. Descrição de pontos importantes:
  Para a criação ou alteração de um pedido(incluir itens ao pedido), é necessário selecionar a mesa desejada e a partir dela, é possível 
escolher o pedido para fazer a operação. Após o fechamento desse pedido, só é possível ver sua descrição.  

6. Pontos de maior dificuldade:
  O uso do JSTL ainda causa dificuldades pelo aprendizado recente, poderia ter sido mais utilizado, porém ainda não consegui assimilar bem.
O controle de páginas pelo servlet às vezes não é tão claro quanto poderia ser, mas com o passar do desenvolvimento tudo foi se esclarecendo.

7. Futuras Melhorias:
  O sistema foi feito com a utilização dos scriptlets, que é um tanto confuso para leitura por causa da mistura do java com html,
o que também prejudica na sua manutenção, e caso o designer queira fazer alguma melhoria na página, ele terá que conhecer java. Atualmente
existe o JSTL, que traz um código mais limpo e mais similar ao html, ele também usa tags, essa já seria uma melhoria futura. Outra melhoria,
pode ser a persistência dos dados, pois hoje, se o sistema for reinicializado tudo é perdido.

