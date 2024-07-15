<h1 align="center">API REST de Fórum</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-blue" alt="Java">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.3.1-brightgreen" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Maven-3.8.4-yellow" alt="Maven">
  <img src="https://img.shields.io/badge/MySQL-8.0.26-orange" alt="MySQL">
  <img src="https://img.shields.io/badge/JWT-0.11.2-red" alt="JWT">
</p>

## Descrição do Projeto

Esta é uma API RESTful para um fórum que permite aos usuários criar, editar, listar e deletar tópicos. A API utiliza autenticação JWT (JSON Web Token) para garantir que apenas usuários autenticados possam realizar operações CRUD.
## Funcionalidades

- **Autenticação**
  - Login de usuário
  - Registro de usuário

- **CRUD de Tópicos**
  - Criar um novo tópico
  - Editar um tópico existente
  - Listar um tópico específico
  - Listar todos os tópicos
  - Deletar um tópico

## Tecnologias Utilizadas

- Java 21
- Spring Boot 2.7.2
- Maven 3.8.4
- MySQL 8.0.26
- JWT 0.11.2

## Como Usar a API
### Autenticação
#### Registro de Usuário

- **Endpoint:** `/api/register`
- **Método:** `POST`
- **Request Body:**
  ```json
  {
    "username": "seu_nome_de_usuário",
    "password": "sua_senha"
  }
#### Login de Usuário

- **Endpoint:** `/api/login`
- **Método:** `POST`
- **Request Body:**
  ```json
  {
    "username": "seu_nome_de_usuário",
    "password": "sua_senha"
  }
- **Response:**
  ```json
  {
    "token": "seu_token_aqui"
  }
### Operações CRUD de Tópicos
#### Criar um novo tópico

- **Endpoint:** `/api/topics`
- **Método:** `POST`
- **Headers:**
  - **Authorization:** `Bearer seu_token_jwt`
- **Request Body:**
  ```json
  {
    "title": "Título do tópico",
    "description": "Conteúdo do Tópico"
  }
#### Editar um tópico

- **Endpoint:** `/api/topics/{id}`
- **Método:** `PUT`
- **Headers:**
  - **Authorization:** `Bearer seu_token_jwt`
- **Request Body:**
  ```json
  {
    "title": "Novo Título do tópico",
    "description": "Novo Conteúdo do Tópico"
  }
#### Listar um tópico específico

- **Endpoint:** `/api/topics/{id}`
- **Método:** `GET`
- **Headers:**  "Authorization: Bearer seu_token_jwt"

#### Listar todos tópico

- **Endpoint:** `/api/topics`
- **Método:** `GET`
- **Headers:**  "Authorization: Bearer seu_token_jwt"

#### Deletar um tópico 

- **Endpoint:** `/api/topics/{id}`
- **Método:** `DELETE`
- **Headers:**  "Authorization: Bearer seu_token_jwt"

### Executando o Projeto
### Clone o projeto no seu PC
#### Pré-requisitos

- **JDK 21**
- **Maven 3.8.4+**
- **Mysql 8.0.26+**

#### Configurações do Banco de Dados
1. Crie um banco de dados no MySQL:
    - CREATE DATABASE forumdb;
2. Configure as credenciais do banco de dados em application.properties:
    - No projeto estou usando variáveis de ambiente, sem as variáveis seria assim:
      ```sql
      {
          spring.datasource.url=jdbc:mysql://localhost:3306/forumdb
          spring.datasource.username=seu_usuario
          spring.datasource.password=sua_senha
          spring.jpa.hibernate.ddl-auto=update
      }
#### Executando a Aplicação
1. Navegue até o diretório raiz do projeto.
2. Execute o comando Maven para iniciar a aplicação:
 
     ```mvn
      {
        mvn spring-boot:run
      }
3. A aplicação estará disponível em http://localhost:8080
### Testando a API
Você pode usar ferramentas como Postman ou Insomnia para testar os endpoints da API.
