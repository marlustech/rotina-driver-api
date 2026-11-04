# 🚗 Rotina Driver API (Java 21 + Spring Boot + Spring AI)

API REST desenvolvida para apoiar a gestão financeira e operacional de motoristas parceiros e entregadores de aplicativo.

## 🛠️ Tecnologias
- **Java 21** & **Spring Boot 3.2**
- **Spring AI** (Integração com LLMs da OpenAI)
- **OpenAPI / Swagger UI**

## 💻 Como Executar no Windows (PowerShell)
```powershell
cd "C:\Users\Marlus Tensai\Desktop\Construção rotina Driver\projetos-genai-tech\rotina-driver-api"
$env:OPENAI_API_KEY="SUA_CHAVE_AQUI"
mvn spring-boot:run


🧪 Teste de Requisição REST
Para testar a inteligência da API, abra um novo terminal do PowerShell (mantendo esse com a aplicação em execução) e envie o seguinte comando:

Invoke-RestMethod -Uri "http://localhost:8080/api/v1/expenses/analyze" -Method Post -ContentType "application/json" -Body '{"description": "Abastecimento de GNV", "amount": 120.00}'

Se o retorno for um JSON com o campo "analysis" contendo a avaliação do modelo da OpenAI, o Projeto 1 (rotina-driver-api) estará 100% validado na máquina local.
