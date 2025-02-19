# 🦁 Projeto Zookeeper - EBAC

Este projeto foi desenvolvido para gerenciar e monitorar serviços utilizando **Zookeeper**. Ele permite a coordenação entre serviços distribuídos, fornecendo um registro centralizado para descoberta de serviços e configuração dinâmica. Baseado na aula sobre descoberta de serviços do curso Especialista Back-End Java da Escola Britânica de Artes Criativas e tecnologia, [EBAC](https://ebaconline.com.br/).

---

## 🚀 Tecnologias Utilizadas

- **Apache Zookeeper** 🐘  
- **Spring Boot** ☕  
- **Docker** 🐳  
- **Maven** ⚙️  
- **Java 17** 🔥  

---

## ⚡ Como Executar o Projeto

### 🛠️ **Pré-requisitos**
Antes de iniciar, certifique-se de ter instalado:
- **[Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)**
- **[Docker](https://www.docker.com/)**
- **[Apache Zookeeper](https://zookeeper.apache.org/)**
- **[Maven](https://maven.apache.org/)**

### 🏗️ **Passos para Rodar o Projeto**

1️⃣ **Clone o repositório**
```bash
git clone https://github.com/Artur-Logan/zookeeper-ebac.git
cd zookeeper-ebac

```


2️⃣ **Execute o Zookeeper com Docker**
```bash
docker-compose up -d

```
3️⃣ **Compile e rode o projeto**
```bash
./mvnw spring-boot:run

```
4️⃣ **Acesse a aplicação**
- Zookeeper Admin: http://localhost:2181
- Zookeeper Client: http://localhost:8080
- Zookeeper Server: http://localhost:8081

---
## 🎯 Funcionalidades

✅ Registro Dinâmico de Serviços

✅ Descoberta de Serviços

✅ Gerenciamento de Cluster

✅ Monitoramento com Actuator

---

## 🤝 Contribuição

1. Faça um fork do projeto 🍴

2. Crie uma branch (feature/nova-feature) 🌱
   
3. Faça o commit das suas alterações (git commit -m 'Adicionando nova funcionalidade') 💡
  
4. Faça um push para a branch (git push origin feature/nova-feature)  🚀

5. Envie um Pull Request 📩

--- 

## 📜 Licença

Este projeto está sob a licença **MIT**. Sinta-se à vontade para usá-lo e melhorá-lo! 😊

---

## 💬 Dúvidas?

Caso tenha alguma dúvida ou sugestão, fique à vontade para entrar em contato!

👤 Autor: Artur Logan

📧 E-mail: arturlogan1ferreira@gmail.com




