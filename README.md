# Workshop Spring Boot 3 JPA

Este repositório contém o código fonte para o Workshop Spring Boot 3 JPA.

## Descrição

Este workshop é focado em demonstrar o uso do Spring Boot 3 com JPA para criar aplicações web robustas e escaláveis.

## Requisitos

Certifique-se de ter as seguintes ferramentas instaladas:

- Java Development Kit (JDK) 8 ou superior
- Maven 3.x
- Spring Boot 3
- Um ambiente de desenvolvimento integrado (IDE) de sua escolha, como IntelliJ IDEA, Eclipse, ou Spring Tool Suite (STS)

## Instalação

1. Clone este repositório em sua máquina local usando o seguinte comando:
   ```sh
   git clone https://github.com/DiogoSalesP/workshop-springboot3-jpa.git
2. Navegue até o diretório do projeto:
   ```sh
   cd workshop-springboot3-jpa
3. Abra o projeto em sua IDE e configure as dependências necessárias.

## Como Usar
Siga estes passos para executar os exemplos do workshop:

Compile o projeto usando o Maven:
1. Compile o projeto usando o Maven:
   ```sh
   mvn clean install
2. Execute a aplicação Spring Boot:
   ```sh
   mvn spring-boot:run
3. Acesse a aplicação em seu navegador web através de:
   ```sh
    http://localhost:8080

## Estrutura do Projeto
``` css
  O projeto está estruturado da seguinte forma:
  ├── src
  │   ├── main
  │   │   ├── java
  │   │   │   ├── com.example.demo
  │   │   │   │   ├── controller
  │   │   │   │   ├── model
  │   │   │   │   ├── repository
  │   │   │   │   └── service
  │   │   ├── resources
  │   │   │   ├── application.properties
  │   │   │   └── data.sql
  │   └── test
  │       └── java
  │           └── com.example.demo
  │               └── DemoApplicationTests.java
  ├── pom.xml
  └── README.md
```

# Rotas do Usuários

1. **GET** /api/users
   - Descrição: Retorna todos os usuários cadastrados.
   - Resposta de exemplo:
     ```
     [
       {
         "id": 1,
         "name": "John Doe",
         "email": "john@example.com"
       },
       {
         "id": 2,
         "name": "Jane Smith",
         "email": "jane@example.com"
       }
     ]
     ```

2. **GET** /api/users/{id}
   - Descrição: Retorna um usuário específico com base no ID fornecido.
   - Parâmetros de URL:
     - `id` (obrigatório) - ID do usuário
   - Resposta de exemplo:
     ```
     {
       "id": 1,
       "name": "John Doe",
       "email": "john@example.com"
     }
     ```

3. **POST** /api/users
   - Descrição: Cria um novo usuário.
   - Corpo da solicitação de exemplo:
     ```
     {
       "name": "New User",
       "email": "newuser@example.com"
     }
     ```
   - Resposta de exemplo:
     ```
     {
       "id": 3,
       "name": "New User",
       "email": "newuser@example.com"
     }
     ```

4. **PUT** /api/users/{id}
   - Descrição: Atualiza um usuário existente com base no ID fornecido.
   - Parâmetros de URL:
     - `id` (obrigatório) - ID do usuário
   - Corpo da solicitação de exemplo:
     ```
     {
       "name": "Updated User",
       "email": "updateduser@example.com"
     }
     ```
   - Resposta de exemplo:
     ```
     {
       "id": 3,
       "name": "Updated User",
       "email": "updateduser@example.com"
     }
     ```

5. **DELETE** /api/users/{id}
   - Descrição: Exclui um usuário com base no ID fornecido.
   - Parâmetros de URL:
     - `id` (obrigatório) - ID do usuário
   - Resposta de exemplo:
     ```
     {
       "message": "Usuário excluído com sucesso."
     }
     ```
# Rotas de Produtos

1. **GET** /api/products
   - Descrição: Retorna todos os produtos disponíveis.
   - Resposta de exemplo:
     ```
     [
       {
         "id": 1,
         "name": "Product 1",
         "description": "Description of product 1",
         "price": 29.99
       },
       {
         "id": 2,
         "name": "Product 2",
         "description": "Description of product 2",
         "price": 39.99
       }
     ]
     ```

2. **GET** /api/products/{id}
   - Descrição: Retorna um produto específico com base no ID fornecido.
   - Parâmetros de URL:
     - `id` (obrigatório) - ID do produto
   - Resposta de exemplo:
     ```
     {
       "id": 1,
       "name": "Product 1",
       "description": "Description of product 1",
       "price": 29.99
     }
     ```

3. **POST** /api/products
   - Descrição: Cria um novo produto.
   - Corpo da solicitação de exemplo:
     ```
     {
       "name": "New Product",
       "description": "Description of the new product",
       "price": 49.99
     }
     ```
   - Resposta de exemplo:
     ```
     {
       "id": 3,
       "name": "New Product",
       "description": "Description of the new product",
       "price": 49.99
     }
     ```

4. **PUT** /api/products/{id}
   - Descrição: Atualiza um produto existente com base no ID fornecido.
   - Parâmetros de URL:
     - `id` (obrigatório) - ID do produto
   - Corpo da solicitação de exemplo:
     ```
     {
       "name": "Updated Product",
       "description": "Updated description of the product",
       "price": 59.99
     }
     ```
   - Resposta de exemplo:
     ```
     {
       "id": 3,
       "name": "Updated Product",
       "description": "Updated description of the product",
       "price": 59.99
     }
     ```

5. **DELETE** /api/products/{id}
   - Descrição: Exclui um produto com base no ID fornecido.
   - Parâmetros de URL:
     - `id` (obrigatório) - ID do produto
   - Resposta de exemplo:
     ```
     {
       "message": "Produto excluído com sucesso."
     }
     ```

Certifique-se de revisar e ajustar as rotas de acordo com a implementação específica do seu projeto.




## Contribuição
Sinta-se à vontade para contribuir com novos recursos, correções de bugs ou melhorias para este projeto. Se você encontrar problemas ou tiver sugestões, abra uma issue neste repositório.

