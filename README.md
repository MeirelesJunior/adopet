
# 🐶 Sistema de Adoção de Pets - Adopet

![GitHub last commit](https://img.shields.io/github/last-commit/MeirelesJunior/adopet?style=flat-square)
![GitHub repo size](https://img.shields.io/github/repo-size/MeirelesJunior/adopet?style=flat-square)
![GitHub license](https://img.shields.io/github/license/MeirelesJunior/adopet?style=flat-square)
![GitHub language count](https://img.shields.io/github/languages/count/MeirelesJunior/adopet?style=flat-square)

> Sistema desenvolvido para simular a gestão de abrigos e adoção de pets, aplicando boas práticas de programação orientada a objetos com Java.

---

## 🖼️ Ilustração do Projeto

![banner](https://raw.githubusercontent.com/MeirelesJunior/adopet/main/.github/adopet-banner.png)

---

## 📚 Sumário

- [Sobre o Projeto](#sobre-o-projeto)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Padrões e Boas Práticas](#padrões-e-boas-práticas)
- [Como Executar](#como-executar)
- [Testes](#testes)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Como Contribuir](#como-contribuir)
- [Licença](#licença)

---

## 📖 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de **praticar e aplicar conceitos de refatoração, princípios SOLID, testes, camadas de arquitetura e boas práticas de versionamento** com Git e GitHub.

A aplicação permite que abrigos cadastrem pets disponíveis para adoção, com funcionalidades organizadas em camadas e de forma extensível.

---

## ✅ Funcionalidades

- 🏠 Cadastro e listagem de abrigos
- 🐕 Listagem de pets por abrigo
- 📥 Importação de pets via JSON (usando Jackson)
- 🌐 Disparo de requisições HTTP (GET e POST)
- 📂 Estrutura em camadas (`domain`, `service`, `command`)
- ✅ Testes de verificação (com e sem abrigos cadastrados)
- 🛠️ Refatoração contínua e modularidade

---

## 🧰 Tecnologias Utilizadas

- **Java 17**
- **Jackson (jackson-databind)**
- **JUnit (ou testes manuais estruturados)**
- **Git + GitHub**
- **IntelliJ IDEA**
- **Terminal / CLI**

---

## 🧠 Padrões e Boas Práticas

- ✔️ Princípios **SOLID**
- ✔️ Separação por camadas de responsabilidade
- ✔️ Uso de **Streams** e boas práticas com coleções
- ✔️ Refatoração incremental com commits descritivos
- ✔️ Estrutura orientada a domínio (DDD simplificado)
- ✔️ Commits seguindo [Conventional Commits](https://www.conventionalcommits.org/)

---

## 🚀 Como Executar

1. **Clone o repositório**
```bash
git clone https://github.com/MeirelesJunior/adopet.git
cd adopet
```

2. **Execute no IntelliJ ou terminal**

Se estiver usando Maven:
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.seuprojeto.Main"
```

> 🧠 Substitua `"com.seuprojeto.Main"` pelo nome real da classe com método `main`.

---

## 🧪 Testes

- Criada classe de testes para verificar cenários com e sem abrigos
- Métodos GET e POST simulados com lógica de entrada
- Testes executáveis pelo IntelliJ ou terminal

---

## 📁 Estrutura do Projeto

```
📦 adopet
 ┣ 📂 domain
 ┣ 📂 service
 ┣ 📂 command
 ┣ 📂 test
 ┣ 📄 Main.java
 ┣ 📄 README.md
 ┣ 📄 .gitignore
 ┣ 📄 api.jar (ignorado no Git)
```

---

## 🤝 Como Contribuir

1. Faça um fork
2. Crie uma branch: `git checkout -b feature/nome-da-feature`
3. Commit suas alterações: `git commit -m "feat: adicionei nova feature"`
4. Push: `git push origin feature/nome-da-feature`
5. Abra um Pull Request

---

## 📄 Licença

Distribuído sob a licença MIT. Veja [`LICENSE`](LICENSE) para mais informações.

---

## 👨‍💻 Autor

**Jorge Meireles**  
Estudante de Java com foco em back-end, refatoração, boas práticas e domínio de código limpo.

Conecte-se comigo:  
[![LinkedIn](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=linkedin)](https://www.linkedin.com/in/seu-perfil)

---
