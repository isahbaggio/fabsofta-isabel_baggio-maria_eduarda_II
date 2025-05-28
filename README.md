# 🍽️ Restô com chef Maisa 👩‍🍳✨

---

## 🍲 Sobre o projeto

Bem-vindo ao **Restô com chef Maisa**! Aqui você transforma os ingredientes que tem em casa em receitas deliciosas, com sugestões inteligentes feitas especialmente para você — como se tivesse um chef na sua cozinha! 🧑‍🍳❤️

Nosso sistema usa uma *IA simpática* que entende seus ingredientes, sugere receitas saborosas e ainda te dá dicas de substituições para aquele temperinho que está faltando! 🌿🧄

---

## 🚀 Funcionalidades principais

- 👤 **Cadastro e login** simples para guardar suas preferências (opcional)  
- 🥕 **Cadastro de ingredientes** que você tem em casa  
- 🍛 **Sugestões automáticas de receitas** que combinam com seus ingredientes  
- 📊 Avaliação da **compatibilidade das receitas** com o que você tem  
- 🔄 Sugestões de **substituições inteligentes** para ingredientes que faltam (ex: cebola → cebolinha)  
- 🖥️ Interface simples e funcional em **uma página só (SPA)** para facilitar o uso  

---

## 🛠️ Tecnologias usadas

- Backend: **Java 17 + Spring Boot 3.x**  
- Frontend: **HTML5 + CSS3 + JavaScript** (SPA simples)  
- Build: **Maven**

---

## 📂 Estrutura do projeto
src/
├── main/
│ ├── java/
│ │ └── br/univille/recetasmaisa/
│ │ ├── config/ # Configurações do Spring Boot
│ │ ├── controller/ # API REST para receitas
│ │ ├── model/ # Modelos de dados (Receita, Ingrediente)
│ │ └── service/ # Lógica “IA” de sugestões e substituições
│ └── resources/
│ └── static/
│ └── index.html # Frontend SPA

## ⚡ Como rodar o Restô

1. Garanta que você tem **Java 17** e **Maven** instalados  
2. Clone ou extraia o projeto  
3. No terminal, acesse a pasta do projeto  
4. Rode para baixar dependências e compilar:  
   ```bash
   mvn clean install
5. Inicie o backend:
   mvn spring-boot:run
6. Abra no navegador: http://localhost:8080
7. Comece a adicionar seus ingredientes e descubra receitas deliciosas! 🍝🍲🍰

## 🤖 Como funciona a “IA” do chef Maisa?
Você informa os ingredientes disponíveis na sua cozinha 🍅🧀🥚

- O sistema compara com o banco de receitas e calcula a compatibilidade 🔍
- Mostra receitas que você pode fazer ou quase fazer (com faltas)
- Para os ingredientes que faltam, o chef Maisa sugere substituições inteligentes e práticas 🌿
- Tudo isso em tempo real, direto na sua tela! 🖥️💨

## ✨🥘 Bon appétit! 🥘✨
