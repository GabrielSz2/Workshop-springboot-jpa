# Workshop SpringBoot
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/GabrielSz2/Workshop-springboot-jpa/blob/main/LICENSE)

# Sobre

**Workshop SpringBoot** é uma aplicação desenvolvida com Spring Boot e JPA, projetada para demonstrar habilidades essenciais no desenvolvimento de APIs RESTful. A aplicação inclui a gestão de usuários, pedidos, produtos e categorias, com foco em práticas recomendadas de persistência de dados, mapeamento de entidades, e tratamento de exceções. O uso do banco de dados H2 permite testes eficientes em um ambiente de desenvolvimento.

# Funcionalidades Principais
- **Gerenciamento de Usuários**
- **Gerenciamento de Pedidos**
- **Gerenciamento de Produtos**
- **Gerenciamento de Categorias**
- **Associação de Itens de Pedido**
- **Pagamentos**

# Modelo Conceitual

![Modelo Conceitual](https://github.com/GabrielSz2/imagens/blob/main/Modelo%20Conceitual.png)

# Tecnologias Usadas

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2 Database

# Instalação e Execução
## Pré requisito: Java 17

```bash
# 1. Clone o Repositório:
       git clone https://github.com/GabrielSz2/Workshop-springboot-jpa

# 2. Entrar na pasta do projeto:
       cd Workshop-springboot-jpa

# 3. Executar o programa:
       ./mvnw spring-boot:run

# 4. Acesse o banco H2:
       http://localhost:8080/h2-console

# 5. Login:
       JDBC URL: jdbc:h2:mem:testdb
       User Name: sa
```

# Autor
Gabriel Souza

https://www.linkedin.com/in/gabriel-souza-b578962a5/
