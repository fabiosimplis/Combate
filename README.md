# COMBATE

Em um jogo de combate, cada jogador joga com um campeão. Cada campeão possui um nome, uma
quantidade de ataque, armadura e vida. O combate entre dois campeões é organizado em turnos, de modo
que em cada turno, os dois campeões se atacam. Você deve fazer um programa para instanciar dois
campeões, depois executar N turnos de combate, mostrando a cada turno o estado de cada campeão,
conforme exemplos. Se em um turno um dos campeões morrer (quantidade de vida igual a zero), o
combate deve terminar. Ao final do combate, mostrar na tela "FIM DO COMBATE".
A regra para um campeão A receber dano de outro campeão B é a seguinte:
1) A quantidade de vida do campeão A deve ser decrescida da quantidade de ataque do campeão B, descontada a
quantidade de armadura do campeão A. A quantidade de vida resultante não pode ser menor que zero.
2) Independente da quantidade de armadura do campeão A, pelo menos 1 de vida o campeão A deve perder.
