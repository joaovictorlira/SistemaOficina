# Sistema de Gerenciamento de Oficina 🚗🔧

Este é um sistema de gerenciamento de oficina desenvolvido em Java. Ele permite cadastrar clientes, veículos, funcionários, e serviços, além de emitir notas fiscais e realizar operações específicas relacionadas ao dia a dia de uma oficina.

## ⚙️ Funcionalidades

### Cliente
- Cadastro de clientes com informações pessoais (nome, telefone, CPF).
- Consulta e emissão de Nota Fiscal para serviços realizados.
- Solicitação de diferentes tipos de serviços.

### Veículo
- Cadastro de veículos com informações como placa, modelo e fabricante.

### Funcionário
- Cadastro de mecânicos e borracheiros com nome, telefone, CPF e salário.
- Execução de serviços conforme a especialização:
  - **Mecânicos:** Troca de óleo e peças.
  - **Borracheiros:** Troca e remendo de pneus.

### Serviços
- Tipos de serviços disponíveis:
  - Troca de óleo.
  - Troca de peças.
  - Troca de pneus.
  - Remendo de pneus.
- Exibição da quantidade de clientes na fila de atendimento.

### Nota Fiscal
- Geração de uma nota fiscal associando cliente, veículo e serviço.

## 🛠️ Estrutura do Projeto

- **Pacote `src.models`:** Contém as classes principais do sistema, como `Cliente`, `Veiculo`, `Servico`, `NotaFiscal`, `Mecanico` e `Borracheiro`.
- **Classe `Main`:** Gerencia a interação com o usuário e a execução dos serviços.

