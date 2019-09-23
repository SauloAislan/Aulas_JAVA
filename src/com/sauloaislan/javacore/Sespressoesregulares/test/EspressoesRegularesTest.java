package com.sauloaislan.javacore.Sespressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EspressoesRegularesTest {
    public static void main(String[] args) {
        // \d - todos os digitos(numeros)
        // \D tudo que não for digito(numeros
        // \s espaços em branco \t \n \f \r
        // \S caractere que não é branco
        // \w caracteres de palavras  a-z A-Z, digitos e _
        // \W tudo que não for um caractere de palavra
        // [] procure apenas esses caracteres [abcABC] ou [a-cA-C]
        // Quantificadores
            // ? zero ou uma ocorrencias
            // * zero ou mais ocorrencias
            // + uma ou mais ocorrencias
            // {n,m} de n ate m ocorrencias
            // ( )
            // |
            // $
            // ^ = negação ex [^abc]
            // . coring 1.3 = 123,133,1A3,A33,1 3
            // o(v|c)o = ovo, oco

//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; // hex
//        String texto = "12 0x 0X 0xffABC 0x10G 0x1";
//        String regex = "([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // hex
//        String texto = "ulan@gmail.com, 102ABC@hotmail.com, #@!asd@mail.com, test@gmail.br, test@gmail.com.br, teest@mail";

        String regex = "proj([^,])*"; // hex
        String texto = "proj1.bkp, proj1.java, proj1.class, projfinal.java";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Email valido? "+ "#@!asd@mail.com".matches(regex));
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("prosição encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
