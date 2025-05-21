# Cadastro de Ninjas 🥷

Este projeto é uma API REST feita com Spring Boot que permite cadastrar e gerenciar ninjas e suas missões.

## 🔧 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (ou outro banco relacional)
- Maven

## 📁 Estrutura do Projeto

```
├── CadastroDeNinjasApplication.java
├── Ninjas
│   ├── NinjaModel.java
│   ├── NinjaRepository.java
│   ├── NinjaController.java
│   └── NoArsConstructor.java
├── Missoes
│   ├── MissoesModel.java
│   └── (pode conter MissoesController e MissoesRepository futuramente)
```

## 📌 Endpoints Principais

### 🔹 `GET /ninjas`
Retorna todos os ninjas cadastrados.

### 🔹 `POST /ninjas`
Cadastra um novo ninja.
```json
{
  "nome": "Naruto Uzumaki",
  "email": "naruto@konoha.com",
  "idade": 17
}
```

## 🧠 Observações

- O projeto ainda está em desenvolvimento, futuras melhorias serão feitas (CRUD de missões, relacionamentos completos, validações, etc).
- O objetivo é praticar o uso do Spring Boot com JPA.

## 🚀 Como Rodar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/cadastro-de-ninjas.git
```

2. Rode o projeto pela sua IDE (VS Code, Eclipse, IntelliJ) ou use o Maven:
```bash
./mvnw spring-boot:run
```

3. Acesse: `http://localhost:8080/ninjas`
