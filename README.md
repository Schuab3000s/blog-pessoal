# Blog Pessoal

Este é um projeto desenvolvido como parte do programa da [Generation Brasil](https://brazil.generation.org/), que tem como objetivo criar um sistema de blog pessoal. O projeto utiliza diversas tecnologias modernas para implementar funcionalidades de CRUD e está disponível para uso com deploy realizado pelo Render.

## 📝 Sobre o Projeto

O **Blog Pessoal** é uma aplicação web onde usuários podem:
- Criar, visualizar, editar e excluir postagens.
- Gerenciar temas para categorizar as postagens.
- Realizar cadastro e autenticação de usuários.

## 🚀 Tecnologias Utilizadas

- **Java 11**
- **Spring Boot**
- **API Rest**
- **Banco de Dados SQL**
- **HTML5**
- **CSS3**
- **JavaScript**
- **Bootstrap**
- **Render** (Deploy)

## 🔧 Funcionalidades

- **CRUD de Postagens**: Permite criar, listar, editar e excluir postagens.
- **Gerenciamento de Temas**: Relacione postagens a temas específicos.
- **Autenticação de Usuários**: Controle de acesso com segurança.
- **Arquitetura em Camadas**: Organização em Controller, Model e Repository.

## 🌐 Deploy

O projeto foi implantado utilizando o [Render](https://render.com/). Acesse a aplicação online para explorar suas funcionalidades.

link da aplicação [Blog Pessoal](https://blog-pessoal-bjnq.onrender.com)

## ⚙️ Instalação e Uso

### Pré-requisitos

- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- [Insomnia](https://insomnia.rest/download) (para testar as rotas da API)
- Banco de dados SQL configurado (ex.: MySQL)

### Passos para executar localmente

1. Clone este repositório:
  ```
   git clone https://github.com/Schuab3000s/blog-pessoal.git
  ```
<br>

2. Navegue até a pasta do projeto:
  ```
  cd blog-pessoal
  ```
<br>

3. Configuere o `application.properties` com as credenciais do seu banco de dados.

<br>

4. Execute o projeto:
  ```
  mvn spring-boot:run
  ```
<br>

5. Acesse a aplicação em: `http://localhost:8080`
<br>
📂 Estrutura do Projeto

src/main/java:
  ->Controller: Gerencia as requisições HTTP.
  ->Model: Define as entidades e seus atributos.
  ->Repository: Manipula os dados no banco de dados.
src/main/resources:
  ->application.properties: Configurações do banco de dados e da aplicação.

📌 Contato

LinkedIn: [Kevin Schuab](https://www.linkedin.com/in/kevin-schuab/)
E-mail: [kevinschuab@gmail.com](kevinschuab@gmail.com)

Feito por Kevin Schuab durante o programa Generation Brasil.
