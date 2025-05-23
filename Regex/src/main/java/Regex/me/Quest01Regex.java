package Regex.me;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**

        Validação de Email:
 Escreva uma expressão regular que valide emails no formato:
    Deve começar com letras, números ou os caracteres . e _. Ok

    Deve ter um símbolo @. OK

    Após o @, deve haver um domínio (letras e números). OK

    O domínio deve ser seguido por um ponto (.) e uma extensão de 2 a 4 letras. OK

 */

public class Quest01Regex {
    public static void main(String[] args) {
        String emailFalso = "asdiodhqaefhaofaedahjw";
        String email = "example123@gmail.com";
        String outroEmail = "dickvigarista332@gmail.com";
        String test = "Xextssss@gmail.com";
        String test02 = "user.name_123@host.net";
        String test03 = "user@fegr.commbr";


        // Testando
        Pattern pattern = Pattern.compile("^[a-zA-Z]{6,}[0-9]{1,6}?[@]gmail\\.com$"); // Expressão Regular
        Matcher matcher = pattern.matcher(email); // Verificação de validação

        System.out.println(matcher.find());

        Pattern patternReal = Pattern.compile("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}$");
        Matcher matcherReal = patternReal.matcher(test03);

        System.out.println(matcherReal.find());

    }
}
