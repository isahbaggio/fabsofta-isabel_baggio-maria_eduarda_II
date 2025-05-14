# 🧑‍🍳 Restô com Chef Maisa

**Restô com Chef Maisa** é um sistema web que ajuda os usuários a encontrar e organizar receitas culinárias com base nos ingredientes disponíveis em casa. Também permite marcar receitas como favoritas, visualizar substituições e acessar instruções detalhadas de preparo.

## 📚 Funcionalidades

### Página de Login
- Login com e-mail e senha para acesso personalizado.

### Página de Receitas Favoritas
- Visualização das receitas favoritas do usuário.
- Remoção de receitas da lista de favoritos.

### Página Principal
- Informar os ingredientes disponíveis no estoque do usuário.
- Visualizar receitas compatíveis com os ingredientes informados.
- Ver sugestões de substituições para ingredientes ausentes.
- Acessar o modo de preparo passo a passo.
- Marcar receitas como favoritas.

## 🗂️ Modelo de Dados (DER)

O sistema é estruturado em torno das seguintes entidades principais:

- **Usuário** (`id_usuario`, `email`, `senha`)
- **Ingrediente** (`id_ingrediente`, `nome`)
- **Receita** (`id_receita`, `nome`, `descricao`, `modo_preparo`)
- **Ingrediente_Receita** (`id_receita`, `id_ingrediente`, `quantidade`, `unidade_medida`)
- **Ingrediente_Substituto** (`id_ingrediente`, `id_substituto`, `observacao`)
- **Estoque_Usuario** (`id_usuario`, `id_ingrediente`)
- **Receita_Favorita** (`id_usuario`, `id_receita`)

📎 Consulte o diagrama visual no repositório para melhor entendimento das relações.

## 🛠️ Tecnologias Utilizadas

- Linguagem: JavaScript/Java (dependendo da implementação escolhida)
- Frameworks sugeridos: Spring Boot, React ou Thymeleaf
- Banco de Dados: MySQL ou PostgreSQL
- Ferramentas de apoio: UML para modelagem, Figma para prototipação (opcional)

## 🚀 Como Executar

1. Clone o repositório
2. Configure o banco de dados com o script de criação das tabelas
3. Execute o backend (Spring Boot ou outro)
4. Execute o frontend (React, HTML ou outro)
5. Acesse a aplicação via navegador

## 👥 Equipe

- Nome: [Seu Nome]
- Nome: [Nome do parceiro, se houver]
- Disciplina: [Nome da disciplina ou curso]
- Professor: [Nome do(a) professor(a)]

---

