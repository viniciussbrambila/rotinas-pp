# Prototipagem de Telas (Wireframes): Rotinas++

O fluxo de navegação do usuário foi projetado visando escalabilidade para futuros módulos.

### 1. Tela Inicial (Dashboard / Menu)
Esta é a tela de entrada do aplicativo, estruturada em grade ou lista de cartões grandes para facilitar a adição de novas funcionalidades no futuro.
- **Cabeçalho:** Título "Rotinas++" e uma saudação.
- **Módulo 1 (Cartão Clicável):** "🎧 Automação de Volume" (Leva para a Tela 2).
- **Módulo 2 (Espaço Futuro):** (Ex: "📚 Rotinas de Estudo" - Em breve).
- **Módulo 3 (Espaço Futuro):** (Ex: "🏍️ Controle de Revisões" - Em breve).

### 2. Tela de Lista de Rotinas (Módulo de Volume)
Acessada ao clicar no cartão de Automação de Volume.
- **Barra Superior:** Botão de voltar (⬅️) e Título "Automação de Volume".
- **Área Central:** Lista de cards (se não houver rotinas, exibir texto "Nenhuma rotina cadastrada").
- **Card de Rotina (Item da Lista):**
  - Título (Ex: "Horário de Almoço")
  - Horários (Ex: "11:30 às 13:00")
  - Dias ativos (Ex: "Seg, Ter, Qua, Qui, Sex")
  - Chave (Toggle/Switch) para ativar/desativar rapidamente.
- **Botão Flutuante (FAB):** Um botão redondo com o símbolo de "+" no canto inferior direito para adicionar nova rotina.

### 3. Tela de Formulário (Criar / Editar Rotina)
Acessada ao clicar no "+" ou ao tocar em uma rotina existente para editá-la.
- **Barra Superior:** Botão de voltar e Título "Nova Rotina" (ou "Editar Rotina").
- **Campo de Texto:** Nome da rotina (Input Text).
- **Seletores de Horário:**
  - Botão "Hora de Início" (Abre o relógio padrão do Android).
  - Botão "Hora de Término" (Abre o relógio padrão do Android).
- **Seletores de Dias:** 7 Checkboxes (Domingo a Sábado).
- **Botões de Ação (Rodapé):** 
  - Botão grande "SALVAR".
  - Botão "EXCLUIR" (Visível apenas se estiver editando uma rotina que já existe).