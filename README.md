# Triopedala

# Repositório GitHub para Sistema de Gerenciamento de Eventos

## Estrutura do Repositório

```
event-management-api/
├── .github/
│   └── workflows/          # Configurações de CI/CD
├── src/                    # Código fonte
├── docs/                   # Documentação adicional
├── postman/                # Coleção Postman para testes
├── .gitignore
├── README.md               # Documentação principal
├── pom.xml                 # Configuração Maven
└── LICENSE
```

## README.md (Modelo Base)

```markdown
# Event Management API

API para gerenciamento de eventos e participantes desenvolvida em Spring Boot.

## 🚀 Funcionalidades

- CRUD completo de eventos
- Cadastro de participantes
- Inscrição em eventos com controle de vagas
- Cancelamento de inscrições
- Consultas diversas (eventos disponíveis, participantes por evento)

## 📋 Pré-requisitos

- Java 17+
- Maven 3.8+
- Banco de dados H2 (embutido) ou PostgreSQL

## 🔧 Instalação

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/event-management-api.git
```

2. Configure o banco de dados em `application.properties`

3. Execute o projeto:
```bash
mvn spring-boot:run
```

## 📚 Documentação da API

Acesse a documentação Swagger em:
`http://localhost:8080/swagger-ui.html`

Endpoints principais:

| Método | Endpoint                  | Descrição                     |
|--------|---------------------------|-------------------------------|
| POST   | /api/eventos              | Criar novo evento             |
| GET    | /api/eventos/disponiveis  | Listar eventos disponíveis    |
| POST   | /api/participantes        | Cadastrar participante        |
| POST   | /api/inscricoes           | Realizar inscrição em evento  |

## 🤝 Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Distribuído sob licença MIT. Veja `LICENSE` para mais informações.
```

## Configuração do .gitignore

```
# Arquivos do Maven
target/
pom.xml.tag
pom.xml.releaseBackup
pom.xml.versionsBackup
pom.xml.next

# Arquivos de IDE
.idea/
*.iml
*.ipr
*.iws
.classpath
.project
.settings/
bin/

# Arquivos de log
*.log

# Arquivos do sistema
.DS_Store
Thumbs.db
```

## Boas Práticas para o Repositório

1. **Branches**: 
   - `main` - versão estável
   - `develop` - desenvolvimento contínuo
   - `feature/*` - para novas funcionalidades

2. **Commits**: 
   - Mensagens claras no padrão Conventional Commits
   - Exemplo: `feat: add event creation endpoint`

3. **Issues**: 
   - Usar templates para bugs e features
   - Atribuir labels e milestones

4. **Pull Requests**: 
   - Revisão obrigatória antes do merge
   - Testes automatizados no CI

5. **GitHub Actions**: Configurar workflow básico para:
   - Build do projeto
   - Testes automatizados
   - Análise estática de código

## Configuração Inicial Recomendada

1. Crie o repositório no GitHub (público ou privado)
2. Clone localmente:
```bash
git clone <url-do-repositorio>
cd event-management-api
```

3. Configure o projeto inicial com a estrutura básica do Spring Boot
4. Faça o primeiro commit:
```bash
git add .
git commit -m "chore: initial project setup"
git push origin main
```

5. Crie a branch `develop` para trabalho contínuo

Este modelo fornece uma base sólida para o projeto colaborativo, seguindo boas práticas de desenvolvimento e facilitando a distribuição das tarefas entre os membros da equipe.
