# 📚 Expressões Regulares (Regex)

Expressões regulares são sequências de caracteres que formam um padrão de busca. Elas são amplamente utilizadas para pesquisar, validar e manipular strings em diversas linguagens de programação.

## 🔍 O que são Expressões Regulares?

Uma expressão regular pode ser um único caractere ou um padrão mais complexo que descreve um conjunto de strings. Ao pesquisar dados em um texto, você pode usar esse padrão para identificar, substituir ou validar informações específicas.

## 💡 Utilização de Expressões Regulares

Expressões regulares podem ser utilizadas para:

* ✅ Verificar se uma string contém determinado padrão.
* 🔄 Encontrar todas as ocorrências de um padrão em um texto.
* ✂️ Substituir partes de um texto que correspondam a um padrão.
* 📝 Validar formatos de entrada, como emails ou números de telefone.

## 🚩 Flags (Sinalizações)

As sinalizações no método `compile()` modificam a forma como a pesquisa é realizada. Aqui estão algumas das mais comuns:

* **Pattern.CASE\_INSENSITIVE**: Ignora a diferenciação entre maiúsculas e minúsculas ao realizar a pesquisa.
* **Pattern.LITERAL**: Caracteres especiais no padrão não terão significado especial, sendo tratados como caracteres comuns.
* **Pattern.UNICODE\_CASE**: Usado juntamente com a flag `CASE_INSENSITIVE` para ignorar diferenças de caixa fora do alfabeto inglês.

## 💻 Exemplos de Expressões Regulares em Java

### 📧 Exemplo 1: Verificar um email

```java
String email = "teste@exemplo.com";
Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
Matcher matcher = pattern.matcher(email);
boolean valido = matcher.matches();
System.out.println("Email válido: " + valido);
```

### 🔠 Exemplo 2: Ignorar maiúsculas e minúsculas

```java
String texto = "Olá Mundo";
Pattern pattern = Pattern.compile("olá", Pattern.CASE_INSENSITIVE);
Matcher matcher = pattern.matcher(texto);
boolean encontrado = matcher.find();
System.out.println("Encontrado: " + encontrado);
```

## 💡 Dicas para o Uso de Regex

* 🧰 Utilize ferramentas online para testar expressões regulares, como regex101.com.
* 📝 Mantenha os padrões simples e legíveis, evitando excessos.
* 📑 Documente as regex complexas para facilitar o entendimento futuro.

## 📚 Referências

* [Java Documentation: Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)
* [Guia de Expressões Regulares - Regex101](https://regex101.com)