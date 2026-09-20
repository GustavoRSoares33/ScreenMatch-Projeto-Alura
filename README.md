# ScreenMatch

Projeto desenvolvido em **Java com Spring Boot** durante os estudos da Alura. A aplicação consome dados de séries e episódios da **OMDb API**, persiste as informações em **PostgreSQL** e disponibiliza consultas através de uma API REST.

## 🎬 Sobre o projeto

O ScreenMatch permite buscar séries na internet, armazenar seus dados e episódios no banco de dados e realizar diferentes tipos de consultas.

O projeto começou com uma interface executada pelo terminal e evoluiu para uma aplicação Spring Boot com persistência usando **Spring Data JPA** e endpoints REST.

## ✨ Funcionalidades

- Busca de séries pela OMDb API
- Busca e armazenamento de episódios por temporada
- Persistência de séries e episódios no PostgreSQL
- Listagem das séries cadastradas
- Busca de série por título
- Busca de séries por ator
- Top 5 séries por avaliação
- Busca por categoria/gênero
- Filtro por quantidade de temporadas e avaliação
- Busca de episódios por trecho do título
- Ranking de episódios de uma série
- Busca de episódios por ano de lançamento
- Tradução de informações utilizando serviços externos
- API REST para consulta dos dados cadastrados

## 🌐 Endpoints da API

Base:

```text
/series
```

| Método | Endpoint | Descrição |
| --- | --- | --- |
| GET | `/series` | Lista todas as séries |
| GET | `/series/top5` | Retorna as 5 séries mais bem avaliadas |
| GET | `/series/lancamentos` | Retorna lançamentos |
| GET | `/series/{id}` | Busca uma série pelo ID |
| GET | `/series/{id}/temporadas/todas` | Lista todos os episódios da série |
| GET | `/series/{id}/temporadas/{numero}` | Lista episódios de uma temporada |
| GET | `/series/categoria/{categoria}` | Filtra séries por categoria |

## 🛠️ Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven
- OMDb API
- Jackson / JSON
- API REST

## 📁 Estrutura principal

```text
src/main/java/br/com/gustavo/Screenmatch/
├── Model/
├── Principal/
├── Repository/
├── Service/
│   └── Traducao/
├── config/
├── controller/
└── dto/
```

## 🚀 Como executar

### Pré-requisitos

- Java 17
- Maven
- PostgreSQL
- Uma chave válida para os serviços externos utilizados pelo projeto

Clone o repositório:

```bash
git clone https://github.com/GustavoRSoares33/ScreenMatch-Projeto-Alura.git
cd ScreenMatch-Projeto-Alura
```

Configure a conexão com o PostgreSQL e as credenciais necessárias utilizando propriedades ou variáveis de ambiente locais.

> Não coloque chaves de API, senhas ou outros segredos diretamente no código-fonte ou em commits do Git.

Depois execute:

```bash
./mvnw spring-boot:run
```

No Windows:

```powershell
mvnw.cmd spring-boot:run
```

Com a aplicação iniciada, a API pode ser consultada a partir de:

```text
http://localhost:8080/series
```

## 🗃️ Persistência

As entidades de séries e episódios são armazenadas no PostgreSQL por meio do Spring Data JPA.

O repositório possui consultas personalizadas para recursos como:

- Top 5 séries por avaliação
- Séries por ator
- Séries por gênero
- Filtro por temporadas e avaliação
- Episódios por título
- Episódios por temporada
- Episódios por período de lançamento

## 📚 Aprendizados

O projeto exercita conceitos importantes do ecossistema Java:

- Consumo de APIs HTTP
- Conversão de JSON em objetos Java
- Streams e Collections
- Orientação a objetos
- Persistência com JPA
- Derived Queries e consultas personalizadas
- DTOs
- Arquitetura em camadas
- APIs REST com Spring Boot

---

Projeto desenvolvido para fins de estudo durante a formação da **Alura**.
