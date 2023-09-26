# <img src="https://img.icons8.com/external-justicon-lineal-color-justicon/30/000000/external-archery-sport-avatar-justicon-lineal-color-justicon.png"/> Figure Skating Project
Um projeto criado para modelagem de Patinação Artística utilizando UML e criação de um banco de dados MySQL. A seguir há a descrição do esporte para que, a partir dela fosse feito o código, em Java.

A pasta `ecot12-patinacaogelo-2019008562` refere-se ao código sem o banco de dados e a pasta `ecot13-patinacaogelo-2019008562`.

## <img src="https://img.icons8.com/color/30/ice-skate.png"/> O que é Figure Skating (Patinação Artística no Gelo)?
A Patinação no Gelo é um esporte fantástico que reúne diversos competidores de todo o mundo na pista e os espectadores podem se deleitar com as mais maravilhosas apresentações daqueles que deixam tudo no gelo. Já deve ter visto Frozen, quando as irmãs Anna e Elsa patinam no castelo de gelo, mas já imaginou o quão difícil seria patinar nessa superfície? Parece muito fácil quando vimos na TV ou nas Olimpíadas de Inverno, até mesmo em filmes e séries, mas existem várias técnicas que devem ser levadas em conta para sequer andarmos por 3s sem cair.

## <img src="https://img.icons8.com/stickers/30/where-what-quest.png"/> Como funciona?
A competição de patinação no gelo é composta de várias modalidades: aquelas dos ramos de patinação artística (Single Skating, Pair Skating, Ice Dance e Synchronized Skating) e patinação de velocidade (Long Track Speed Skating e Short Track Speed Skating), sendo todas essas administradas pela `ISU - International Skating Union`, organização fundada em 1892 e reconhecida pela IOC - International Olympic Committee para gerenciar as categorias mencionadas. 

A fim apenas de conhecimento, a ISU é composta por uma quantidade de associações nacionais, chamados ISU Members, que são aqueles que administram o esporte no nível nacional. Além disso, tem outros corpos oficiais parte da organização, que passam por votação periodicamente para serem organizados e haver decisão de membros participantes, como na hierarquia mostrada a seguir, que é a mais recente e foi retirada do próprio site da ISU:

![Imagem do esquema da ISU.](https://uploaddeimagens.com.br/images/004/615/070/full/pat01.png?1695259765)

## <img src="https://img.icons8.com/dusk/30/rules.png"/> E as regras?
Cada modalidade possui regras específicas e funciona de uma forma diferente. Nas Olimpíadas de Inverno, por exemplo, temos todas as modalidades citadas, com exceção da patinação sincronizada (Synchronized Skating), que pretende ser adicionada ainda nas próximas edições. 

## <img src="https://img.icons8.com/color/30/categorize.png"/> Quais são as categorias?
Na patinação artística, categoria `Single Skating`, temos a separação em duas categorias: `Men's Single Figure Skating e Women’s Single Figure Skating`, em que ambas os competidores competem sozinhos com acompanhamento de uma música de sua escolha. Temos ainda a categoria `Pair Skating`, que é a patinação no gelo em casais, também com acompanhamento de uma música desejada. 

Também dentro do Figure Skating, temos a dança no gelo (`Ice Dance`) em que casais participam, formados por um homem e uma mulher. Você deve agora mesmo estar se perguntando qual a diferença entre Pair Skating e Ice Dance, uma vez que ambas as categorias referem-se a casais patinando no gelo ao som de alguma música. Bom, na primeira vez pode parecer o mesmo, mas depois de assistir a algumas competições vai perceber que são modalidades realmente distintas.

Apesar de fazer parte do ramo de Figure Skating, a modalidade de `Synchronized Skating` não compõe o quadro de esportes das Olimpíadas de Inverno. Ainda assim, não deixa de ser menos importante, uma vez que possui igualmente dificuldade técnica envolvida. A patinação sincronizada oferece aos atletas a chance de competir com uma equipe e aprender o valor do trabalho em equipe. Formado em 1956 pelo Dr. Richard Porter, o esporte era conhecido como “patinação de precisão” pelos movimentos intrincados que os patinadores executam juntos no gelo. A Patinação Artística dos EUA realizou o primeiro Campeonato Sincronizado de Patinação dos EUA em 1984 e o primeiro Campeonato Mundial de Patinação Sincronizada em 2000. Hoje, existem cerca de 600 equipes sincronizadas registradas nos Estados Unidos. Equipes de oito a 20 patinadores realizam formações desafiadoras e sequências de passos juntos, e as competições usam o mesmo sistema de julgamento de single, pairs e ice dance. Tal como acontece com outras modalidades de patinação no gelo, todas as equipes realizam free skate com os elementos necessários, e as equipes de nível júnior e sênior também realizam um programa curto.

## <img src="https://img.icons8.com/fluency/30/diversity.png"/> Quais são as sub-categorias?
Em todas as categorias de Single Skating e Pair Skating, há duas sub-categorias necessárias e contabilizadas para a classificação: `Short Program (SP) e Free Skating (FS)`. Para o caso de `Men's, women's e pairs' short programs`, o tempo de apresentação é de `2 minutos e 40 segundos` (mais ou menos 10 segundos); para o caso de `Men's and pairs' free skates` o tempo de apresentação é de `4 minutos e 30 segundos` (mais ou menos 10 segundos) e para o caso de `Women's free skate` o tempo deve ser de `4 minutos` (mais ou menos 10 segundos).

Já para a dança no gelo, no entanto, a separação nas olimpíadas se dá por rhythm dance e free dance. Essa é uma diferença em relação à categoria de Pair Skating. Outro ponto: na dança no gelo os competidores praticamente não realizam jumps e não são permitidos elementos próximos a acrobacias. Na dança no gelo, os elementos-chave são twizzle (um giro em um pé com uma ou mais rotações que é feita rapidamente com uma ação contínua), pattern dance, lift, spin, step sequence e elementos coreográficos. Já na patinação em pares, os principais elementos são difíceis de executar; isso inclui twist lifts (o atleta masculino levanta sua parceira sobre a cabeça e a joga no ar; a patinadora completa até três rotações antes de ser pega pela cintura), pair lifts, throw jumps (saltos com assistência nos quais a mulher é arremessada no ar pelo homem na decolagem e aterrissa sem a ajuda de seu parceiro), jumps, death spirals e spins. 

Tal como acontece com outras modalidades de patinação no gelo, todas as equipes realizam free skate com os elementos necessários, e as equipes de nível júnior e sênior também realizam um programa curto.

## <img src="https://img.icons8.com/external-flaticons-lineal-color-flat-icons/30/external-scoreboard-tennis-flaticons-lineal-color-flat-icons.png"/> Como funciona o sistema de Score?

Todas as modalidades possuem um sistema de score de cada evento. Nas Olimpíadas de Inverno há mais uma categoria dividida em: `Team Event Men, Team Event Women, Team Event Pairs e Team Event Ice Dance`. O evento por equipes é uma adição relativamente nova à patinação artística olímpica, fazendo sua estreia nos Jogos Olímpicos de Inverno de 2014 em Sochi, na Rússia. A ideia por trás disso é simples: os países qualificados colocam em campo uma espécie de equipe de estrelas, enviando os melhores em suas modalidades para competir uns contra os outros, com pontos atribuídos aos países com base nas colocações de seus patinadores.

O processo de qualificação começa muito antes dos Jogos Olímpicos. Nas duas temporadas anteriores às Olimpíadas, os países ganham pontos de qualificação com base nas colocações de seus patinadores em uma ampla variedade de eventos internacionais. Apenas equipes que também são capazes de qualificar patinadores individuais em pelo menos três das quatro modalidades são consideradas elegíveis para o evento por equipes olímpicas, independentemente de seus pontos de qualificação.

`A competição consiste em oito segmentos: um programa curto e um longo (free skate) para todas as quatro categorias (Men's Single Skating, Women' s Single Skating, Ice Dance e Pair Skating)`. No programa curto, todos os 10 países competem, com um patinador ou equipe representando cada país. Os pontos são então concedidos com base na colocação no final de cada segmento. O país cujo patinador fica em primeiro lugar em seu segmento recebe 10 pontos, o segundo colocado recebe nove e assim por diante até o último colocado ganhando um ponto. Este processo se repete até que todas as quatro categorias tenham realizado um programa curto.

Para o score das Olimpíadas de Inverno do ano de 2022, em Beijing, os resultados dos três primeiros da categoria de Men’s Single Skating, os colocados foram os mostrados na tabela a seguir, onde SP e FS significam, respectivamente, Short Program e Free Skating:

![Imagem do Score da Categoria Men’s Single Skating.](https://uploaddeimagens.com.br/images/004/617/469/full/01.png?1695523847)

Os resultados dos três primeiros colocados para a categoria Women’s Single Skating foram os mostrados na tabela a seguir:

![Imagem do Score da Categoria Women’s Single Skating.](https://uploaddeimagens.com.br/images/004/617/470/full/02.png?1695523944)

Os resultados dos três primeiros colocados para a categoria Pair Skating foram os mostrados na tabela a seguir:

![Imagem do Score da Categoria Pair Skating.](https://uploaddeimagens.com.br/images/004/617/471/full/03.png?1695524005)

Os resultados dos três primeiros colocados para a categoria Ice Dance foram os mostrados na tabela a seguir:

![Imagem do Score da Categoria Ice Dance.](https://uploaddeimagens.com.br/images/004/617/472/full/04.png?1695524033)

Os resultados dos três primeiros colocados para a categoria Team Event foram os mostrados na tabela a seguir:

![Imagem do Score da Categoria Team Event.](https://uploaddeimagens.com.br/images/004/617/473/full/05.png?1695524057)

O sistema de pontuação de todas as modalidades, independente do evento se ele for oficial, é padronizado pela ISU.

No caso da patinação artística (Figure Skating), composta por Single e Pair Skating e Ice Dance, o Painel Técnico é composto pelo Controlador Técnico (Technical Controller, o Especialista Técnico (Technical Specialist) e o Especialista Técnico Assistente (Assistant Technical Specialist), cada um de diferentes Membros da ISU (países). 

Um `Operador de Dados (Data Operator)` os auxilia para fins de registro. Um vídeo instantâneo em câmera lenta do sistema de replay operado por um `Operador de Replay` funciona como ferramenta de suporte para o Painel Técnico durante a identificação dos elementos executados. O `Especialista Técnico`, auxiliado pelo `Especialista Técnico Assistente`, identifica e chama os elementos executados e os Níveis de Dificuldade específicos de certos elementos (por exemplo, spins, footwork). Ele/Ela identifica elementos ilegais ou adicionais e quedas. O `Controlador Técnico` autoriza e/ou corrige todas as chamadas, supervisiona o Operador de Dados e pode propor correções, se necessário. Em caso de desacordo, prevalece a maioria entre os três Oficiais.

## <img src="https://img.icons8.com/external-flaticons-lineal-color-flat-icons/30/external-score-tennis-flaticons-lineal-color-flat-icons-6.png" alt="external-score-tennis-flaticons-lineal-color-flat-icons-6"/> Quais os elementos que impactam na pontuação?

Cada elemento executado tem um valor base e os juízes atribuem um `Grau de Execução (GOE)` ao elemento permitindo que o elemento aumente em valor quando bem feito ou diminua em valor quando mal feito. Cada passo positivo ou negativo no GOE resulta em aumento ou diminuição do valor em 10% em Single e Pair Skating e em 16% em Ice Dance.

Um grupo de especialistas, incluindo patinadores e treinadores experientes, elaboraram uma lista resumida do Valor Base de cada elemento, bem como seu “Nível de Dificuldade” em caso de spins, steps, lifts, etc.

O nível de pontos do Valor Base depende da dificuldade do elemento. Alguns elementos, como sequências de giros e footwork, são ainda mais detalhados dependendo do seu "Nível de Dificuldade". Esses valores básicos e níveis de dificuldade do elemento garantem que os skatistas recebam o crédito apropriado e consistente para cada elemento executado. O valor base de todos elementos reconhecidos são analisados pelos respectivos Comitês Técnicos e publicado anualmente pela ISU em uma comunicação.

O nome do elemento identificado será listado instantaneamente na tela do Juiz. O Juiz então simplesmente classifica a qualidade do elemento em uma escala de `+5, +4, +3, +2, +1, 0,-1, -2, -3, -4, -5`. Com esta escala e o “julgamento de qualidade” resultante, o Juiz pode aumentar ou diminuir o Valor Base de cada elemento executado. O total de todas as pontuações dos elementos dá a pontuação técnica.

Além da Pontuação Técnica, os Juízes atribuirão pontos em uma escala de 0,25 a 10,00 com incrementos de 0,25 para a pontuação da apresentação para avaliar a apresentação geral da performance com cinco Componentes do Programa: `Habilidades de Patinação, Transições, Performance, Composição e Interpretação da Música/Timing (para Ice Dance)`.

Para Pair Skating e Ice Dance deve haver igual demonstração dos critérios por ambos patinadores. Para o conhecimento de como é dada a pontuação de compoente, são cinco, ao total:

- `Skating Skills (Habilidades de Patinação)`:
São definidas pela limpeza geral e segurança, controle de borda e fluxo sobre a superfície do gelo demonstrado por um comando do vocabulário de patinação (edges, steps, turns etc.), a clareza da técnica e o uso de força sem esforço para acelerar e variar a velocidade.

- `Transitions (Transições)`:
Variedade, dificuldade e uso proposital de footwork intrincado, posições, movimentos e partes que ligam todos os elementos.

- `Performance (Desempenho)`:
Envolvimento físico, emocional e intelectual do patinador/par/casal conforme eles entregam a intenção da música e composição (por exemplo, projeção, variedade, contrastes e personalidade).

- `Composition (Composição)`:
Arranjo intencionalmente desenvolvido e/ou original de todos tipos de movimentos de acordo com os princípios da frase musical, espaço, padrão, e estrutura (por exemplo, ideia, conceito, visão, humor, padrão, uso multidimensional de espaço, fraseado, originalidade, design).

- `Interpretation of the Music /Timing - for Ice Dance (Interpretação da Música/Timing para Dança no Gelo)`:
É o pessoal, criativo e tradução genuína do ritmo, caráter e conteúdo da música para movimento no gelo (por exemplo, tempo, expressão da música, uso de sutileza, relacionamento entre os patinadores, patinando ao ritmo rítmico) em Rhythm Dance e mantendo um bom equilíbrio entre patinar ao ritmo e melodia em Free Dance.

A Pontuação Total do Segmento para cada participante em cada Segmento de uma competição (Short Program/Rhythm Dance, Free Skating/Free Dance ou Pattern Dance(s)) é calculada pela adição da pontuação total dos elementos e as pontuações dos componentes do programa, subtraindo qualquer dedução (por exemplo -1,0 para uma queda) e a menor e maior notas cada uma multiplicada pelo número de componentes ou elementos do programa. Na Dança do Gelo, para eventos com duas Danças Padrão (Pattern Dances), a pontuação total de cada dança será multiplicada por um fator de 0,5. A pontuação total do segmento de ambos os programas é somada e o resultado constitui a pontuação final em uma competição. O participante com a maior pontuação total vence. Para a patinação sincronizada as regras se aplicam assim como para a dança no gelo, mas considerando que são de 8 a 16 patinadores em uma apresentação, então em deduções de queda, por exemplo, caso uma pessoa caia, já é considerada na pontuação -1.0.

## <img src="https://img.icons8.com/officel/30/athlete-female.png" alt="external-score-tennis-flaticons-lineal-color-flat-icons-6"/> Quais são alguns exemplos de competidores, técnicos e comitê do esporte?

Na competição de patinação do gelo, temos os competidores, que são os `patinadores (skaters), técnicos (coaches), juízes (judges) e árbitros (referees)`. 

Temos, por exemplo, `Yuzuru Hanyu`, que nasceu em 7 de dezembro de 1994, mora e compete pelo Japão. Nos Jogos Olímpicos de Inverno de Sochi em 2014, ele ganhou a primeira medalha de ouro olímpica para o Japão no evento masculino de patinação artística. Ele terminou o ano com uma vitória no Campeonato Mundial de Patinação Artística de 2014 em Saitama, Japão. Apesar de sofrer lesões e doenças durante a temporada 2014-15, ele defendeu com sucesso seu título na final do Grande Prêmio e também conquistou uma medalha de prata no Campeonato Mundial de 2015. Naquela temporada, ele conquistou seu terceiro título consecutivo no Campeonato Nacional do Japão e a participação no '2015 World Team Trophy' pela primeira vez ajudou a equipe do Japão a conquistar a medalha de bronze.

Temos também a `Anna Shcherbakova`, que nasceu em 28 de março de 2004, mora e compete pela Rússia. Atual campeã mundial e vice-campeã europeia, Shcherbakova levou a medalha de ouro nas Olimpíadas de Inverno de 2022, onde a atleta de 17 anos acertou praticamente todos os seus elementos em um programa com dois saltos quádruplos e várias combinações entre saltos triplos.

Outro competidor é `Nathan Chen`, nascido em 5 de maio de 1999, competidor dos Estados Unidos. Nathan Chen anotou um recorde mundial com sua apresentação no programa curto individual na patinação artística dos Jogos Olímpicos de Inverno em Pequim. O norte-americano conseguiu a marca de 113.97 pontos, superando o anterior recorde de Yuzuru Hanyu.

Da patinação artística, modalidade dança no gelo, temos, por exemplo, `Gabriella Papadakis e Guillaume Cizeron`, da França, ouro na competição ISU World Championships 2022, sediada em Montpellier, conquistando 229.82 pontos, sendo o Personal Best Total Score atual do par. Os parceiros estavam com os técnicos `Romain Haguenauer, Marie-France Dubreuil, Patrice Lauzon` e como coreógrafos `Romain Haguenauer (RD), Marie-France Dubreuil (FD) e Samuel Chouinard`. As siglas RD e FD são usadas nesta modalidade para se referirem às duas rodadas que os competidores devem participar: Rhythm Dance e Free Dance, respectivamente, para comporem sua pontuação final.

Todo patinador possui um técnico principal que o conduz e guia nos treinos e competições. `Stéphane Lambiel`, por exemplo, é o atual técnico de `Uno Shoma` e que o conduziu à sua medalha de bronze nos jogos olímpicos de inverno de 2022, em Pequim. Lambiel, nascido em 02 de abril de 1985, foi um patinador que competiu pela Suíça, foi medalhista de prata nos jogos olímpicos de 2006, duas vezes campeão do Grand Prix (em 2005 e em 2007) e nove vezes campeão nacional de seu país.

`Eteri Tutberidze` é a técnica de `Kamila Valieva`. Nasceu em 24 de fevereiro de 1974, competiu pela Rússia, fez transição da patinação artística para dança no gelo aos quatro anos e não há relatos de medalhas na modalidade anterior.

`Adam Rippon` é o atual técnico de `Mariah Bell`, que a conduziu nas olimpíadas em Pequim de 2022, possui medalha de bronze em equipe em PyeongChang 2018 e foi quinto lugar no ISU Grand Prix Final 2017.

Um juiz é definido como ISU Judge ou International Judge, tem uma nacionalidade e um título honorífico que o identifica. Há também os Referees (Árbitros), que são os líderes e porta-vozes designados para um evento. Eles também gerenciam o painel de juízes e, dependendo do tamanho da competição, também podem atuar como um dos juízes do evento. São definidos como ISU Referee ou International Referee, possuem uma nacionalidade e um título honorífico que o identifica.

## <img src="https://img.icons8.com/external-icongeek26-linear-colour-icongeek26/30/external-controls-cinema-icongeek26-linear-colour-icongeek26.png"/> Quais os níveis de competição nesse tipo de esporte?

Há alguns níveis de competição no figure skating com cada especificação de idade para que o competidor possa ser considerado:
- `Senior`: deve ter, no mínimo, 15 anos de idade
- `Junior`: deve ter, no mínimo, 13 anos de idade e menos de 19 anos de idade (21 para homens na sub-categoria de pares e dança no gelo)
- `Advanced Novice`: deve ter, no mínimo, 10 anos de idade e menos de 15 anos de idade (17 para homens na sub--categoria de pares e dança no gelo)
- `Intermediate Novice`: deve ter menos de 15 anos de idade
- `Basic Novice`: deve ter menos de 13 anos de idade

Cada evento deve ser identificado pelo nível da competição acima, nome da competição, local e dias que acontecerá.

Para o programa curto de patinação artística individual e em pares, anualmente é atualizado o documento (ISU Communication), se necessário, com a escala de valores (Scale of Values) base para cada tipo de elemento. A última atualização do ano de 2022 foi para a temporada 2022/2023. `Cada tipo de elemento, como saltos, giros e passos, possui 11 valores base, que são os mencionados anteriormente: -5, -4, -3, -2, -1, 0, +1, +2, +3, +4, +5`. Um elemento é definido pelo seu nome, código, 11 valores referentes à escala e a `cor de validação: se foi validado, verde; se foi invalidado, vermelho; se passou por revisão, amarelo`. O score então é dado como na figura a seguir, que é referente ao painel dos juízes para a Anna Shcherbakova no Free Skating nas Olimpíadas de Inverno de 2022:

![Imagem do Score de Anna Shcherbakova no Free Skating 2022.](https://uploaddeimagens.com.br/images/004/617/723/full/06.png?1695595295)

Para facilitar um pouco o processo de pontuação, foi considerada a soma de todas as pontuações dos juízes com a diferença da multiplicação do menor e maior ambos pelo número de elementos técnicos analisados na categoria. Esse critério foi usado tanto para o score referente aos componentes de programa quanto àquele referente aos elementos técnicos.

O resultado final na classificação pode ser visto dessa forma abaixo, onde os pontos correspondem à soma do Short Program e Free Skate e os números nas colunas SP e FS dizem a respeito, respectivamente, à classificação do patinador ou patinadora ou par em cada um dos programas curto e longo:

![Imagem do Score Final da Categoria Feminina de Figure Skating 2022.](https://uploaddeimagens.com.br/images/004/617/725/full/07.png?1695595377)
