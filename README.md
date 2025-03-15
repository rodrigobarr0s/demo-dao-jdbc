# Sistema de Gerenciamento de Banco de Dados

Este é um projeto de um sistema de gerenciamento de banco de dados desenvolvido em Java, que interage com um banco de dados MySQL. Ele permite realizar operações CRUD (Criar, Ler, Atualizar e Excluir) em duas entidades principais: **Vendedores (Seller)** e **Departamentos (Department)**.

## Funcionalidades

- **Vendedores (Seller)**
  - Buscar um vendedor pelo ID.
  - Buscar vendedores por departamento.
  - Listar todos os vendedores.
  - Inserir um novo vendedor.
  - Atualizar informações de um vendedor.
  - Excluir um vendedor.

- **Departamentos (Department)**
  - Buscar um departamento pelo ID.
  - Listar todos os departamentos.
  - Inserir um novo departamento.
  - Atualizar o nome de um departamento.
  - Excluir um departamento.

## Pré-requisitos

- Java 8 ou superior.
- Banco de dados MySQL (ou outro de sua escolha).
- Driver JDBC para MySQL (ou o driver adequado para o seu banco de dados).

## Como Rodar o Projeto

### Passo 1: Configuração do Banco de Dados

1. Crie um banco de dados no MySQL (ou outro banco de dados de sua escolha).
2. Altere as credenciais de acesso no arquivo `db.properties` para refletir as configurações do seu banco de dados.

Exemplo de configuração no arquivo `db.properties`:

```properties
dburl=jdbc:mysql://localhost:3306/seu_banco
user=seu_usuario
password=sua_senha
useSSL=false
```
### Passo 2: Configuração da Classe DB

A classe `DB` é responsável pela conexão com o banco de dados. O método `getConnection()` obtém a conexão com o banco usando as propriedades definidas no arquivo `db.properties`.

```java
public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/seu_banco", 
        "seu_usuario", 
        "sua_senha");
}
```
### Passo 3: Compilar e Executar o Programa

1. Compile o projeto utilizando sua IDE preferida ou através do comando `javac`.
2. Execute a classe `Program2` para testar as funcionalidades dos vendedores e departamentos.

## Exemplos de Testes

### Testes de Vendedores (Seller)

- Buscar um vendedor pelo ID.
- Buscar vendedores por departamento.
- Listar todos os vendedores.
- Inserir um novo vendedor.
- Atualizar informações de um vendedor.
- Excluir um vendedor.

### Testes de Departamentos (Department)

- Buscar um departamento pelo ID.
- Listar todos os departamentos.
- Inserir um novo departamento.
- Atualizar o nome de um departamento.
- Excluir um departamento.

## Contribuições

Contribuições são bem-vindas! Caso queira melhorar o projeto, faça um fork e envie um pull request com suas alterações.

### Passos para Contribuir:

1. Faça um fork deste repositório.
2. Crie uma nova branch (`git checkout -b feature/nova-funcionalidade`).
3. Realize as modificações.
4. Envie as modificações para o repositório original (`git push origin feature/nova-funcionalidade`).
5. Crie um pull request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.
