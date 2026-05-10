# Especificação de Requisitos: Rotinas++
**Versão:** 1.0

## 1. Requisitos Funcionais (RF)
Os Requisitos Funcionais descrevem as ações e comportamentos que o sistema deve executar em resposta às interações do usuário.

- **RF01 - Criação de Rotina:** O sistema deve permitir que o usuário crie uma nova rotina informando o horário de início (quando silenciar) e o horário de término (quando restaurar o som).
- **RF02 - Seleção de Dias:** O sistema deve permitir que o usuário selecione em quais dias da semana (ex: segunda a sexta) a rotina será executada.
- **RF03 - Listagem de Rotinas:** O sistema deve exibir uma tela principal listando todas as rotinas cadastradas pelo usuário.
- **RF04 - Ativação/Desativação:** O sistema deve permitir que o usuário ative ou desative uma rotina específica sem precisar excluí-la.
- **RF05 - Edição e Exclusão:** O sistema deve permitir que o usuário edite os horários/dias de uma rotina existente ou a exclua permanentemente.
- **RF06 - Execução do Perfil de Áudio (Início):** O sistema deve, automaticamente e em segundo plano, alterar o perfil de áudio do dispositivo para "Silencioso" (ou "Vibrar") no horário de início definido na rotina ativa.
- **RF07 - Execução do Perfil de Áudio (Término):** O sistema deve, automaticamente e em segundo plano, restaurar o perfil de áudio do dispositivo para o "Som Padrão" no horário de término definido na rotina ativa.

## 2. Requisitos Não Funcionais (RNF)
Os Requisitos Não Funcionais definem os critérios de qualidade, desempenho, segurança e arquitetura do sistema.

- **RNF01 - Plataforma e Linguagem:** O aplicativo deve ser desenvolvido nativamente para o sistema operacional Android, utilizando a linguagem de programação Java.
- **RNF02 - Arquitetura de Software:** O projeto deve seguir o padrão de arquitetura MVC (Model-View-Controller) para separação de responsabilidades.
- **RNF03 - Armazenamento Local:** Os dados das rotinas devem ser persistidos localmente no dispositivo utilizando a biblioteca Room (baseada em SQLite).
- **RNF04 - Execução em Segundo Plano:** O sistema deve utilizar as APIs nativas do Android (`AlarmManager` e `BroadcastReceiver`) para garantir que as rotinas sejam executadas no horário exato, mesmo se o aplicativo estiver fechado ou com a tela apagada.
- **RNF05 - Permissões do Sistema:** O aplicativo deve solicitar e validar adequadamente a permissão `ACCESS_NOTIFICATION_POLICY` para poder manipular a política de "Não Perturbe" e os volumes do Android de forma segura.
- **RNF06 - Eficiência de Bateria:** O agendamento de tarefas não deve consumir recursos excessivos de processamento ou bateria enquanto aguarda o horário de execução. 