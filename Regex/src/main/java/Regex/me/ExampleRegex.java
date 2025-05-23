package Regex.me;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
        🔹 Metacaracteres Básicos
     | Símbolo | Significado                            | Exemplo                        |       |                          |
     | ------- | -------------------------------------- | ------------------------------ | ----- | ------------------------ |
     | `.`     | Qualquer caractere (exceto nova linha) | `a.c` → casa, abc              |       |                          |
     | `^`     | Início da string                       | `^Olá` → "Olá mundo"           |       |                          |
     | `$`     | Fim da string                          | `mundo$` → "Olá mundo"         |       |                          |
     | `*`     | 0 ou mais ocorrências                  | `a*` → "", "a", "aa"           |       |                          |
     | `+`     | 1 ou mais ocorrências                  | `a+` → "a", "aa"               |       |                          |
     | `?`     | 0 ou 1 ocorrência (opcional)           | `a?` → "", "a"                 |       |                          |
     | `[]`    | Conjunto de caracteres                 | `[aeiou]` → "a", "e", etc.     |       |                          |
     | `[^]`   | Negação do conjunto                    | `[^0-9]` → qualquer não número |       |                          |
     | `{n}`   | Exatamente n ocorrências               | `a{3}` → "aaa"                 |       |                          |
     | `{n,}`  | Pelo menos n ocorrências               | `a{2,}` → "aa", "aaa", etc.    |       |                          |
     | `{n,m}` | Entre n e m ocorrências                | `a{2,4}` → "aa", "aaa", "aaaa" |       |                          |
     | \`      | \`                                     | Ou (alternância)               | \`cão | gato\` → "cão" ou "gato" |
     | `()`    | Agrupamento e captura                  | `(ab)+` → "ab", "abab", etc.   |       |                          |

            🔹 Classes de Caracteres Predefinidas
         | Símbolo | Significado                      | Exemplo de uso      |
         | ------- | -------------------------------- | ------------------- |
         | `\d`    | Um dígito (0-9)                  | `\d+` → "123"       |
         | `\D`    | Não dígito                       | `\D+` → "abc"       |
         | `\w`    | Palavra (letra, número, ou \_)   | `\w+` → "abc\_123"  |
         | `\W`    | Não-palavra                      | `\W+` → "!@#"       |
         | `\s`    | Espaço em branco (tab, \n, etc.) | `\s+` → " " ou "\n" |
         | `\S`    | Não espaço                       | `\S+` → "texto"     |
         | `\\`    | Barra invertida                  | `\\` → ""           |


 */
public class ExampleRegex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");

        boolean matchFound = matcher.find();

        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

    }
}