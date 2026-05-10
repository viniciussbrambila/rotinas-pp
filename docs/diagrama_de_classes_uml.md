# Diagrama de Classes (UML): Rotinas++
**Arquitetura:** Padrão MVC

![Diagrama de Classes do Rotinas++](img/diagrama_classes.png)

### 1. Camada Model (Dados)
É a classe que representa a regra de negócio e os dados puros.

**Classe: Rotina**
- **Atributos:**
  - `- nome: String`
  - `- horaInicio: int`
  - `- minutoInicio: int`
  - `- horaFim: int`
  - `- minutoFim: int`
  - `- diasDaSemana: boolean[]` *(Array ou booleanos separados para Seg, Ter, Qua...)*
  - `- isAtiva: boolean`
- **Métodos:**
  - `+ getHoraFormatada(): String` *(Para exibir bonitinho na tela, ex: "13:00")*

**Interface: RotinaDao** *(Data Access Object - Comunicação com o Banco)*
- **Métodos:**
  - `+ inserir(rotina: Rotina): void`
  - `+ atualizar(rotina: Rotina): void`
  - `+ deletar(rotina: Rotina): void`
  - `+ buscarTodas(): List<Rotina>`

---

### 2. Camada View (Interface do Usuário)
São as telas que o usuário vê e interage.

**Classe: MainActivity** *(Tela Principal)*
- **Atributos:**
  - `- listaDeRotinas: List<Rotina>`
- **Métodos:**
  - `+ exibirRotinas(): void`
  - `+ clicarBotaoNovaRotina(): void`
  - `+ alternarStatusRotina(rotina: Rotina): void` *(Botão de ligar/desligar a rotina)*

**Classe: FormularioActivity** *(Tela de Criar/Editar)*
- **Atributos:**
  - `- rotinaAtual: Rotina`
- **Métodos:**
  - `+ salvarRotina(): void`
  - `+ validarCampos(): boolean` *(Checa se o usuário preencheu a hora certo)*

---

### 3. Camada Controller (Lógica e Sistema)
É o "cérebro" que faz a ponte entre a View, o Model e o sistema Android.

**Classe: GerenciadorDeAlarme**
- **Atributos:**
  - `- alarmManager: AlarmManager` *(Classe nativa do Android)*
- **Métodos:**
  - `+ agendarAlarme(rotina: Rotina): void`
  - `+ cancelarAlarme(rotina: Rotina): void`

**Classe: AudioReceiver** *(O "escutador" que dispara na hora exata)*
- **Atributos:**
  - `- audioManager: AudioManager` *(Classe nativa do Android)*
- **Métodos:**
  - `+ aoReceberAlarme(): void`
  - `+ silenciarAparelho(): void`
  - `+ restaurarSomPadrao(): void`