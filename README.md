
# Conversor de Moedas - API ExchangeRate

Este é um projeto simples de conversor de moedas em Java, que utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/) para converter valores entre diferentes moedas. A aplicação oferece um menu interativo que permite ao usuário selecionar pares de moedas e informar o valor a ser convertido.

## Funcionalidades

- Conversão entre diversas moedas:
  - Dólar (USD) para Peso Argentino (ARS)
  - Peso Argentino (ARS) para Dólar (USD)
  - Dólar (USD) para Real Brasileiro (BRL)
  - Real Brasileiro (BRL) para Dólar (USD)
  - Dólar (USD) para Peso Colombiano (COP)
  - Peso Colombiano (COP) para Dólar (USD)
- Utiliza a API ExchangeRate para obter taxas de câmbio atualizadas.
- Interface interativa no terminal com um menu de opções.

## Tecnologias Utilizadas

- **Java**: Linguagem principal utilizada no projeto.
- **HttpClient**: Biblioteca nativa do Java para fazer requisições HTTP.
- **Gson**: Biblioteca para manipulação de JSON.
- **ExchangeRate-API**: API utilizada para obter as taxas de câmbio.

## Como Executar o Projeto

1. Clone o repositório para sua máquina local:
   ```bash
   git clone https://github.com/seu-usuario/currency-converter.git
   ```
   
2. Acesse o diretório do projeto:
   ```bash
   cd currency-converter
   ```

3. Compile e execute o projeto:
   ```bash
   javac ConversorApp.java
   java ConversorApp
   ```

4. Siga as instruções no terminal para escolher as moedas e valores a serem convertidos.

## Exemplo de Uso

```bash
**********************************************
Seja bem-vindo(a) ao conversor de moedas =]
1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileiro
4) Real brasileiro =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Sair
Escolha uma opção válida: 3
Digite um valor que deseja converter: 100
Valor 100,00 [USD] corresponde ao valor final de = 545,80 [BRL]
```

## Estrutura do Projeto

- **ExchangeRateApi**: Classe responsável por fazer as requisições à API ExchangeRate e processar os dados de conversão de moeda.
- **Moeda**: Classe modelo que representa a estrutura dos dados retornados pela API, incluindo valor original, valor convertido e os códigos das moedas.
- **ConversorApp**: Classe principal que contém o menu interativo e faz a chamada para a API de conversão.

## Pré-requisitos

- Java 11 ou superior.

## Contato

Caso tenha alguma dúvida ou sugestão, entre em contato:

- [LinkedIn](https://www.linkedin.com/in/seu-usuario)
- [GitHub](https://github.com/seu-usuario)
