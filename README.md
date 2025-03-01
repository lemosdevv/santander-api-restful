# Santander Dev 2025

Java RESTful API criada para a Santander Dev Week.

## Principais Tecnologias
 - **Java 17+**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
 - **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
 - **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
 - **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;

## [Link do Figma](https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=1421%3A432&mode=design&t=6dPQuerScEQH0zAn-1)

O Figma foi utilizado para a abstração do domínio desta API, sendo útil na análise e projeto da solução.

## Diagrama de Claasses

```mermaid
classDiagram
    class User {
        - String name
        - Account account
        - List~Feature~ features
        - Card card
        - List~News~ news
    }
    
    class Account {
        - String number
        - String agency
        - double balance
        - double limit
    }
    
    class Feature {
        - String icon
        - String description
    }
    
    class Card {
        - String number
        - double limit
    }
    
    class News {
        - String icon
        - String description
    }
    
    User "1"*-- "1" Account
    User "1"*-- "N" Feature
    User "1"*-- "1"Card
    User "1"*-- "N" News
```
