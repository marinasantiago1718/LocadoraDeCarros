# Microsserviço de Locadora de Carros

Microsserviço desenvolvido em **Java** com **Spring Boot** para o gerenciamento de usuários de uma locadora de carros.

O principal objetivo deste projeto foi **aplicar na prática conceitos de Engenharia e Arquitetura de Software**,
utilizando uma arquitetura em camadas, desenvolvimento de APIs REST e conteinerização da aplicação com **Docker** para o processo de deploy. 
O projeto também utiliza **MongoDB** como banco de dados NoSQL para persistência das informações.

## Integração com a Aplicação

Este repositório contém um dos microsserviços desenvolvidos para o projeto da locadora de carros, responsável pelo gerenciamento de usuários.

A integração entre este microsserviço e os demais serviços da aplicação pode ser encontrada no repositório principal:

## **Locadora de Carros (Aplicação Integrada)**  
https://github.com/marinasantiago1718/LocadoraCarrosFront

O projeto principal reúne os microsserviços desenvolvidos durante a disciplina de Arquitetura de Software, permitindo a comunicação entre eles e a execução completa da aplicação.

## Objetivos de Aprendizagem

Este projeto foi desenvolvido para exercitar conhecimentos em:

- Engenharia de Software
- Arquitetura de Software
- Arquitetura em Camadas (Layered Architecture)
- Desenvolvimento de APIs REST
- Spring Boot
- Persistência de dados com MongoDB
- Conteinerização e deploy utilizando Docker
- Organização e separação de responsabilidades da aplicação

## Tecnologias

- Java
- Spring Boot
- Spring Web
- Spring Data MongoDB
- MongoDB
- Docker
- Maven

## Funcionalidades

- Cadastro de usuários
- Consulta de usuários
- Atualização de usuários
- Remoção de usuários

## Arquitetura da Aplicação

A aplicação foi estruturada seguindo uma arquitetura em camadas, buscando promover baixo acoplamento, maior organização e facilidade de manutenção.

```
Controller
    │
    ▼
Service
    │
    ▼
Repository
    │
    ▼
MongoDB
```

Cada camada possui uma responsabilidade específica:

### Controller
Responsável por expor os endpoints da API REST e receber as requisições HTTP.

### DTO
Utilizado para transportar dados entre cliente e servidor, desacoplando a API das entidades da aplicação.

### Service
Contém as regras de negócio e centraliza o processamento das operações realizadas pelo sistema.

### Repository
Responsável pela comunicação com o banco de dados através do Spring Data MongoDB.

### Model
Representa as entidades persistidas no banco de dados.

## Estrutura do Projeto

```
src
└── main
      └── java/com/locadora/user_service
            ├── controller
            ├── dto
            ├── model
            ├── repository
            ├── service
            ├── config   
      └── resources
```


## Resultados

Durante o desenvolvimento deste projeto foi possível consolidar conhecimentos relacionados à construção de APIs REST utilizando Spring Boot, 
organização da aplicação em camadas, utilização de MongoDB para persistência de dados e conteinerização da aplicação com Docker, 
aproximando o desenvolvimento de práticas utilizadas no mercado.
