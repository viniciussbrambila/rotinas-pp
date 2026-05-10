# Documento de Visão: Rotinas++

### 1. Introdução
Este documento define a visão geral do aplicativo Rotinas++, detalhando o problema de negócio que ele se propõe a resolver, o público-alvo e os principais benefícios da solução. O objetivo é estabelecer um alinhamento claro sobre o escopo do sistema antes do detalhamento dos requisitos técnicos.

### 2. O Problema (A Necessidade)
O problema central é a inconveniência de ter que alterar manualmente o perfil de som do smartphone várias vezes ao dia. Durante momentos de pausa e descanso, como o horário de almoço, o usuário precisa que o telefone toque normalmente com o som padrão para não perder mensagens, notificações ou ligações importantes. Já em horários de foco, o aparelho deve retornar imediatamente ao modo silencioso. 

A dependência da memória humana para fazer essa troca manual todos os dias, de segunda a sexta-feira, inevitavelmente gera falhas: ou o usuário perde comunicações porque esqueceu de ligar o som no intervalo, ou passa por interrupções porque o celular tocou em um momento inoportuno. A falta de uma automação nativa simples no sistema para agendar essas trocas gera um atrito diário.

### 3. Descrição do Produto
O Rotinas++ é um aplicativo móvel nativo para Android focado na automação de perfis de áudio. Ele permite que o usuário crie programações personalizadas (rotinas) baseadas em horários específicos e dias da semana para alternar automaticamente o estado do volume do dispositivo (Silencioso, Vibrar ou Som Padrão) sem necessidade de intervenção manual.

### 4. Público-Alvo
- **Pessoas com rotinas estruturadas:** Qualquer indivíduo (estudantes, trabalhadores) que possua horários fixos de pausas (como almoço) e de foco durante a semana.
- **Usuários práticos de Android:** Pessoas que buscam garantir que seus dispositivos estejam no perfil de áudio correto automaticamente, eliminando a preocupação de checar o volume do celular o tempo todo.

### 5. Benefícios e Valor Agregado
- **Foco e Produtividade:** Evita notificações sonoras indesejadas durante o expediente ou horário de estudo.
- **Previsibilidade:** Garante que o telefone estará com o volume adequado nos momentos de pausa e descanso.
- **Simplicidade:** Interface direta e limpa, eliminando a complexidade de aplicativos de automação avançados, focando apenas na necessidade real do usuário.

### 6. Restrições e Ambiente
- O sistema será desenvolvido exclusivamente para a plataforma Android (utilizando a linguagem Java).
- A arquitetura do software seguirá o padrão MVC (Model-View-Controller).
- O armazenamento das rotinas será feito localmente no dispositivo usando banco de dados (offline).