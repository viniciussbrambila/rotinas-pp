# Modelagem de Banco de Dados: Rotinas++
**Banco de Dados:** SQLite (via Room Persistence Library)
**Tabela:** `rotinas`

Abaixo está o Dicionário de Dados definindo a estrutura da entidade principal do sistema.

| Coluna | Tipo (Java/Room) | Restrição | Descrição |
| :--- | :--- | :--- | :--- |
| `id` | `int` | Chave Primária (Auto Incremento) | Identificador único da rotina. |
| `nome` | `String` | Não Nulo | Nome amigável para a rotina (ex: "Almoço Ciape", "Aula ADS"). |
| `horaInicio` | `int` | Não Nulo (0 a 23) | Hora em que o celular será silenciado. |
| `minutoInicio` | `int` | Não Nulo (0 a 59) | Minuto em que o celular será silenciado. |
| `horaFim` | `int` | Não Nulo (0 a 23) | Hora em que o som padrão será restaurado. |
| `minutoFim` | `int` | Não Nulo (0 a 59) | Minuto em que o som padrão será restaurado. |
| `domingo` | `boolean` | Padrão: false | Define se a rotina roda aos domingos. |
| `segunda` | `boolean` | Padrão: false | Define se a rotina roda às segundas-feiras. |
| `terca` | `boolean` | Padrão: false | Define se a rotina roda às terças-feiras. |
| `quarta` | `boolean` | Padrão: false | Define se a rotina roda às quartas-feiras. |
| `quinta` | `boolean` | Padrão: false | Define se a rotina roda às quintas-feiras. |
| `sexta` | `boolean` | Padrão: false | Define se a rotina roda às sextas-feiras. |
| `sabado` | `boolean` | Padrão: false | Define se a rotina roda aos sábados. |
| `isAtiva` | `boolean` | Padrão: true | Status (Liga/Desliga) da rotina na tela principal. |

## Observações de Arquitetura
- Optou-se por separar horas e minutos em colunas do tipo `int` para facilitar a injeção direta desses valores na API `Calendar` e no `AlarmManager` do Android.
- Os dias da semana foram modelados como atributos booleanos individuais para mapeamento direto com os componentes de interface (Checkboxes) na tela de criação de rotinas.