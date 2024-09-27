import java.util.Scanner; //Importando Scaner para inputs

public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in); // Criando o Scanner para ler entradas do teclado



                //Exercícios do LIVRO: Carlos Assis - Introdução à Programação_
                // * 500 Algoritmos Resolvidos-GEN LTC_ Cd edição (2002)




            }
}

//*************************************************************************************************************





//**************************************************************************************************************
/*


ABAIXO DA DIAGONAL SECUNDARIA
								2-9

							3-8	3-9

						4-7	4-8	4-9

					5-6	5-7	5-8	5-9

				6-5	6-6	6-7	6-8	6-9

			7-4	7-5	7-6	7-7	7-8	7-9

		8-3	8-4	8-5	8-6	8-7	8-8	8-9

	9-2	9-3	9-4	9-5	9-6	9-7	9-8	9-9

                //algoritmo172
                //abaixo da diagonal secundaria

                int l,c,t;
                System.out.println("ABAIXO DA DIAGONAL SECUNDARIA");

                for(l = 2; l <=9; l++){
                    for(t = 10 - l; t >=1; t--){
                        System.out.print("\t");
                    }
                    for(c=11-l;c<=9;c++){
                        System.out.print(l+"-"+c+"\t");

                    }
                    System.out.println("\n");

                }
                System.out.println("\n");


 */

//***************************************************************************************************************




//***************************************************************************************************************

/*

Diagonal Secundária

	                            1-10

							2-9

						3-8

					4-7

				5-6

			6-5

		7-4

	8-3

9-2

                //Algoritmo 171
                // diagonal secundaria
                int l;

                System.out.println("Diagonal Secundária");

                // Loop externo para as linhas
                for (l = 1; l <= 9; l++) {

                    // Espaçamento antes de cada elemento da diagonal secundária
                    for (int t = 10 - l; t > 1; t--) {
                        System.out.print("\t");  // Tabulação para deslocar os números
                    }

                    // Imprime o elemento da diagonal secundária
                    System.out.println(l + "-" + (11 - l) + "\n");  // (11 - l) é o índice da coluna na diagonal secundária
                }

                System.out.println();

 */


//****************************************************************************************************************

    /*

        algoritmo 170


1-1	1-2	1-3	1-4	1-5	1-6	1-7	1-8	1-9

2-1	2-2	2-3	2-4	2-5	2-6	2-7	2-8

3-1	3-2	3-3	3-4	3-5	3-6	3-7

4-1	4-2	4-3	4-4	4-5	4-6

5-1	5-2	5-3	5-4	5-5

6-1	6-2	6-3	6-4

7-1	7-2	7-3

8-1	8-2

9-1
                Solucao chat gpt>>>>>>>>>>>>>>>>>>>>>>>

                    // Loop externo para as linhas
        for (l = 1; l <= 9; l++) {

            // Loop interno para as colunas acima da diagonal secundária
            for (c = 1; c <= 10 - l; c++) {
                // Exibe os pares l-c com tabulação
                System.out.print(l + "-" + c + "\t");
            }

            // Quebra de linha ao final de cada linha
            System.out.println();
        }

        System.out.println();


                <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



                Solucao do livro >>>>>>>>>>>>>>>>>>>
                //Algoritmo 170
                //Acima da diagonal secundaria

                int l, c, t;
                for(l=1; l<=9; l++){

                    for(c = 1; c <11-l; c++){
                        System.out.print(l+"-"+c+"\t");
                    }
                    System.out.println("\n");
                }
                    System.out.println("\n");
                <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

     */

//*****************************************************************************************************************
/*

            algoritmo 169

Abaixo da diagonal principal

        2-1

        3-1	3-2

        4-1	4-2	4-3

        5-1	5-2	5-3	5-4

        6-1	6-2	6-3	6-4	6-5

        7-1	7-2	7-3	7-4	7-5	7-6

        8-1	8-2	8-3	8-4	8-5	8-6	8-7

        9-1	9-2	9-3	9-4	9-5	9-6	9-7	9-8

  */

//Algoritmo 169
//Abaixo da diagonal principal
                /*
                int l, c;
                // Loop externo para as linhas
                for (l = 2; l <= 9; l++) {

                    // Nova linha para separar cada linha
                    System.out.println();

                    // Loop interno para as colunas abaixo da diagonal principal
                    for (c = 1; c < l; c++) {
                        // Exibe os pares l-c com tabulação
                        System.out.print(l + "-" + c + "\t");
                    }

                    // Quebra de linha ao final de cada linha
                    System.out.println();

                }
                 */


//******************************************************************************************************************

                //nao botei fe nessa solucao aqui nao, acredito estar errado!!! >>>>>

                //Algoritmo 168
                //Diagonal principal
/*
                int l, c, t;
                for(l=1; l<=10;l++){

                    System.out.print(l+"-"+l+"\n");
                    for(t=1; t<=l; t++){
                        System.out.println("\t");
                    }
                    System.out.println("\n");
                }
*/







//********************************************************************************************************

//Algoritmo 167
//matriz triangular diagonal

/*
                ACIMA DA DIAGONAL PRINCIPAL
	1-2	1-3	1-4	1-5	1-6	1-7	1-8	1-9	1-10

		2-3	2-4	2-5	2-6	2-7	2-8	2-9	2-10

			3-4	3-5	3-6	3-7	3-8	3-9	3-10

				4-5	4-6	4-7	4-8	4-9	4-10

					5-6	5-7	5-8	5-9	5-10

						6-7	6-8	6-9	6-10

							7-8	7-9	7-10

								8-9	8-10

*/


//Feito pelo chat GPT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

              /*  int l, c, t;

                System.out.println("ACIMA DA DIAGONAL PRINCIPAL");

                // Loop para as linhas
                for (l = 1; l <= 9; l++) {

                    // Loop para as colunas (apenas acima da diagonal principal)
                    for (c = l + 1; c <= 10; c++) {
                        // Exibe a posição l-c
                        System.out.print("\t" + l + "-" + c);
                    }
                    System.out.println(); // Nova linha após a linha completa

                    // Insere tabulações para alinhar a diagonal
                    for (t = 1; t <= l; t++) {
                        System.out.print("\t");
                    }

                    System.out.println(); // Nova linha após as tabulações
                }
            }
            */
//Feito pelo chat GPT


//Algoritmo 167
//Feito pelo livro>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                /*
                int l, c, t;
                System.out.println("ACIMA DA DIAGONAL PRINCIPAL");

                    for(l =1; l<=9; l++){

                        for(c = l+1; c<= 10; c++){

                            System.out.print("\t"+l+"-"+c);
                        }
                        System.out.println("\n");
                        for(t = 1; t<=l; t++){
                            System.out.print("\t");
                        }
                        System.out.println("\n");
                    }
                    */
//Feito pelo chat GPT<<<<<<<<<<<<<<<<<<<<<<<



//********************************************************************************************************

//algoritmo 166
//triangular matriz de ordem 10 usando for


/*
TODOS
1-1    1-2    1-3    1-4    1-5    1-6    1-7    1-8    1-9    1-10

2-1    2-2    2-3    2-4    2-5    2-6    2-7    2-8    2-9    2-10

3-1    3-2    3-3    3-4    3-5    3-6    3-7    3-8    3-9    3-10
Essa vai ate o 10
*/




//Feito pelo chat GPT>>>>>>>>>>>>>>
                /*int c;
                System.out.println("TODOS");

                // Loop externo para controlar o valor de L
                for (int L = 1; L <= 10; L++) {

                    // Loop interno para controlar o valor de c
                    for (c = 1; c <= 10; c++) {

                        // Correta concatenação de variáveis e strings
                        System.out.print(L + "-" + c + "\t");

                    }
                    // Após terminar o loop interno, imprime uma nova linha
                    System.out.println("\n");
                }
                // Imprime uma nova linha final após terminar o loop externo
                System.out.println("\n");*/
//Feito pelo Chat GPT<<<<<<<<<<<<<<<



//Feito pelo livro >>>>
                    /*
                    int c, t;
                    System.out.println("TODOS");
                    for(int L = 1; L<=10; L++){

                        for(c = 1; c <=10; c++){

                            System.out.println(L+ "-" +c +"\t");

                        }
                            System.out.println("\n");
                    }
                        System.out.println("\n");
                    */
//Feito pelo livro <<<<<<<<<<

//**********************************************************************************************************


                /* ALGORITMO 161
                Criar um algoritmo que entre com cinco números e imprimir o quadrado de cada número.
                 */

                /*
                int i;
                int num;
                for(i = 0; i < 5; i++){

                    System.out.println("Digite um numero: ");
                    num = scanner.nextInt();

                    System.out.println("O quadrado do numero eh: "+ (num * num));
                */

//***********************************************************************************************************


                /* Algoritmo 154

                A policia rodoviaria resolveu fazer cumprir a lei e cobrar dos motoristas
                o DUT. Sabendo-se que o mes em que o emplacamento do carro deve ser renovado
                é determinado pelo ultimo numero da placa do mesmo, criar um algoritmo que apartir
                da leitura da placa do carro, informe o mes em que o emplacamento deve ser renovado.
                 */
/*
                String placa;
                String [] mes_ano = {"janeiro", "fevereiro", "marco", "abril",
                "maio", "junho", "julho", "agosto", "setembro", "outubro",};
                char UltDig;
                System.out.println("Digite o numero do placa: ");
                placa = scanner.nextLine();

                UltDig = placa.charAt(placa.length()-1);
                System.out.println("ultimo digito: "+UltDig);

                // Converte o caractere para um número (de Char para Int)
                int ultimoDigito = Character.getNumericValue(UltDig); //<<<<<<<<<<<<<<<<<<<<<<<<<

                if(ultimoDigito == 0){
                System.out.println("Mes do emplacamento eh: Outubro ");
                }
                else {
                    System.out.println("Mes do emplacamento eh: " + mes_ano[ultimoDigito - 1]);
                }
*/
//************************************************************************************************************

                /*ALGORITMO 138
                Ler um número inteiro entre 1 e 12 e escrever o mês correspondente. Caso o
usuário digite um número fora desse intervalo, deverá aparecer uma mensagem
informando que não existe mês com este número.

                 */
                /*
                        // Array com os meses do ano
                        String[] mes_do_ano = {
                                "janeiro", "fevereiro", "março", "abril", "maio", "junho",
                                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
                        };

                        System.out.println("Digite o número do mês (1 a 12): ");
                        int i = scanner.nextInt();

                            // Verifica se o número do mês está dentro do intervalo válido
                        if (i >= 1 && i <= 12) {
                            // Subtrai 1 para ajustar o índice para o array (índices são baseados em 0)
                            System.out.println("O mês correspondente é: " + mes_do_ano[i - 1]);
                        } else {
                            System.out.println("Número do mês inválido. Digite um número entre 1 e 12.");
                        }

                        scanner.close(); // Fecha o scanner
                  */

//*************************************************************************************************************

          /*
            algoritmo 131
A turma de Programação 1, por ter muitos alunos, será dividida em dias de provas.
Após um estudo feito pelo coordenador, decidiu-se dividi-la em três grupos.
Fazer um algoritmo que leia o nome do aluno e indicar a sala em que ele deverá
fazer as provas, tendo em vista a tabela a seguir e sabendo-se que todas as salas
se encontram no bloco F:
A - K:sala 101
L-N:sala 102
O - Z:sala 103
             */
/*
                String nome;
                System.out.println("Digite o nome do aluno: ");
                nome = scanner.nextLine();

                char letra = nome.charAt(0);

                if ((letra >= 'a' || letra >= 'A') && (letra <='K' || letra <= 'k')) {

                    System.out.println("O aluno devera realizar a prova na sala: 101");
                }
                else if ((letra >= 'l' || letra >= 'L') && (letra <= 'n' || letra <= 'N')) {

                    System.out.println("O aluno devera realizar a prova na sala: 102");
                }
                else if ((letra >= 'O' || letra >= 'o') && (letra <= 'z' || letra <= 'Z')){

                    System.out.println("O aluno devera realizar a prova na sala: 103");
                }
*/

//**************************************************************************************************************



                /* ALGORITMO 128
                Entrar com um verbo no infinitivo e imprimir uma das mensagens:
                 verbo não está no infinitivo
                 verbo da 1a conjugação
                 verbo da 2a conjugação
                 verbo da 3a conjugação
                 */
/*
                        String verbo;
                        char letra;
                        int num;

                        System.out.println("Digite seu verbo: ");
                        verbo = scanner.nextLine();  // Lê o verbo digitado pelo usuário

                        // Obtendo a última letra do verbo
                        letra = verbo.charAt(verbo.length() - 1);

                        // Verifica se a última letra é 'R' ou 'r'
                        if (letra == 'R' || letra == 'r') {

                            num = verbo.length() - 2; // Calcula o comprimento do verbo e subtrai 2 para pegar o antepenúltimo caractere
                            letra = verbo.charAt(num); // Obtém o caractere na posição 'num'

                            // Verifica a conjugação com base no antepenúltimo caractere
                            if (letra == 'A' || letra == 'a') {
                                System.out.println("Primeira Conjugação");
                            } else if (letra == 'E' || letra == 'e' || letra == 'O' || letra == 'o') {
                                System.out.println("Segunda Conjugação");
                            } else if (letra == 'I' || letra == 'i') {
                                System.out.println("Terceira Conjugação");
                            } else {
                                System.out.println("Não existe verbo na conjugação UR");
                            }
                        } else {
                            System.out.println("Não é um verbo no infinitivo");
  */

//**************************************************************************************************************



                /*algoritmo 127
                Entrar com nome, nota da PR e nota da PR2 de um aluno. Imprimir nome, nota
                da PR1, nota da PR2, média e uma das mensagens: Aprovado, Reprovado ou em
                Prova Final (a média é 7 para aprovação, menor que 3 para reprovação e as demais em prova final).
                */
/*
                String nome;
                int nota1, nota2, notaFinal, media;
                System.out.println("Digite o nome: ");
                nome = scanner.nextLine();

                System.out.println("Digite a nota 1: ");
                nota1 = scanner.nextInt();

                System.out.println("Digite a nota 2: ");
                nota2 = scanner.nextInt();

                System.out.println("Digite a prova final: ");
                notaFinal = scanner.nextInt();

                media = (nota1 + nota2 + notaFinal) / 3;
                System.out.println("Nome: " + nome);
                System.out.println("Nota 1: " + nota1);
                System.out.println("Nota 2: " + nota2);
                System.out.println("Nota Final: " + notaFinal);
                System.out.println("Media: " + media);

                if (media >= 7)
                {
                    System.out.println("Aprovado!");
                }
                if (media <= 6)
                {
                    System.out.println("Reprovado!");
                }
*/


//*****************************************************************************************************************

//Algoritmo 103
                /*
                Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimira idade da
                pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido.
                 */

                /*
                int anoatual, anonasc;
                System.out.print("Digite o ano atual: ");
                anoatual = scanner.nextInt();

                System.out.print("Digite o ano de nascimento: ");
                anonasc = scanner.nextInt();

                if(anonasc > anoatual){
                    System.out.println("Invalido...");
                }
                else
                {
                    int idade = anoatual - anonasc;
                    System.out.println("Sua idade eh: "+idade);
                }
                */
//*******************************************************************************************************************

//Algoritmo 99
//Ler um número inteiro de 3 casas decimais e imprimir se o algarismo da casa das
//centenas é par ou ímpar.
/*
                int num, centena;
                System.out.println("Digite um numero: ");
                num = scanner.nextInt();
                centena = (num / 100) % 10;

                System.out.println(centena);

                if(centena % 2 == 0)
                {
                System.out.println("Numero eh par: " + centena);
                }
                else {
                    System.out.println("Numero eh impar: " + centena);

 */

//***********************************************************************************************************************
//Algoritmo 88
//Criar uma calculadora simples
/*
                int opcao;
                int num1, num2, resultado;

                do {
                    System.out.println("\n**************** CALCULADORA SIMPLES ****************");
                    System.out.println("\nDigite uma opcao: ");
                    System.out.println("\n1. Somar");
                    System.out.println("\n2. Subtrair");
                    System.out.println("\n3. Multiplicar");
                    System.out.println("\n4. Dividir");
                    System.out.println("\n0. Sair");
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                        {
                            System.out.println("\nVoce Selecionou SOMAR");
                            System.out.println("\nDigite o primeiro numero: ");
                            num1 = scanner.nextInt();
                            System.out.println("\nDigite o segundo numero: ");
                            num2 = scanner.nextInt();

                            resultado = num1 + num2;
                            System.out.println("\nResultado da soma: " + resultado);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("\nVoce Selecionou SUBTRAIR");
                            System.out.println("\nDigite o primeiro numero: ");
                            num1 = scanner.nextInt();
                            System.out.println("\nDigite o segundo numero: ");
                            num2 = scanner.nextInt();

                            resultado = num1 - num2;
                            System.out.println("\nResultado da subtracao: " + resultado);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("\nVoce Selecionou MULTIPLICAR");
                            System.out.println("\nDigite o primeiro numero: ");
                            num1 = scanner.nextInt();
                            System.out.println("\nDigite o segundo numero: ");
                            num2 = scanner.nextInt();

                            resultado = num1 * num2;
                            System.out.println("\nResultado da multiplicacao: " + resultado);
                            break;
                        }
                        case 4:
                        {
                            System.out.println("\nVoce Selecionou DIVIDIR");
                            System.out.println("\nDigite o primeiro numero: ");
                            num1 = scanner.nextInt();
                            System.out.println("\nDigite o segundo numero: ");
                            num2 = scanner.nextInt();

                            resultado = num1 / num2;
                            System.out.println("\nResultado da divisao: " + resultado);
                            break;
                        }

                        default:
                        {
                        System.out.println("Algo deu errado...");
                        break;

                        }
                    }

                } while (opcao != 0);
                 System.out.println("Saindoo...");

            */



//*********************************************************************************************************************

/*
                //Algoritmo 84
                //Ler um numero e imprimir se ele eh par ou impar

                int num;
                System.out.println("Digite seu numero: ");
                num = scanner.nextInt();

                if(num % 2 == 0){

                    System.out.println("Seu numero eh par: ");


                }
                else {

                    System.out.println("Seu numero eh impar: ");
                }
*/

//*****************************************************************************************************************
//ALGORITMO 63
                /*Criar um algoritmo que efetue o cálculo do salário líquido de um professor.
                 Os dados fornecidos serão: valor da hora aula, número de aulas dadas
                 no mês e percentual de desconto do INSS.
                */
//vha = valor de hora aula
//numADD = Numero de aulas dadas

                /*
                float vha, numADD, desconto, salarioLiquido, SalarioBruto;
                //valor da hora
                System.out.println("o valor da hora do professor: ");
                vha = scanner.nextFloat();
                //quantidade de aulas
                System.out.println("o numero de aulas dadas no mes: ");
                numADD = scanner.nextFloat();
               //salario bruto
                SalarioBruto = vha * numADD;
                System.out.println("O salario bruto eh de: "+ SalarioBruto);

                //algoritmo de desconto
                desconto = (float) (SalarioBruto * 0.1);
                System.out.println("o desconto do professor: "+ desconto);

                //salario liquido
                salarioLiquido = SalarioBruto - desconto;
                System.out.println("o salario liquido eh de: "+ salarioLiquido);
                */

//*********************************************************************************************************************

                /*algoritmo 62
                Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas
                vendas oferecendo desconto. Faça um algoritmo que possa entrar com o valor de
                um produto e imprima o novo valor tendo em vista que o desconto foi de 9%.
                */
/*
                float preco;
                float NovoPreco = 0;
                System.out.print("Digite o preco do produto: ");
                preco = scanner.nextFloat();

                NovoPreco = (float) (preco * 0.91);

                System.out.println("Preco com desconto eh de: " + NovoPreco);

*/

//*********************************************************************************************************************
            /*
                Scanner scanner = new Scanner(System.in); // Criando o Scanner para ler entradas do teclado

                //algoritmo 49
                String nome;
                System.out.print("Digite um nome: ");
                nome = scanner.nextLine();
*/
/*todo o nome*/
//                System.out.println("O nome eh: " + nome);
/*
                //primeiro caracter
                char priChar = nome.charAt(0);
                System.out.println("Primeira letra do nome: "+priChar);

                //ultimo caracter
                char ultChar = nome.charAt(nome.length() -1);
                System.out.println("Ultima letra do nome: "+ultChar);

                //da primeira letra ate a terceira do nome
                String letras3 = nome.substring(0,3);
                System.out.println("do primeiro ao terceiro: "+letras3);

                //somente quatro letras
                String letras4 = nome.substring(0,4);
                System.out.println("somente quatro letras: "+letras4);

                //todas as letras menos a primeira
                String MenosPrim = nome.substring(1);
                System.out.println("menos a primeira letra: "+MenosPrim);

                //somente os dois ultimos
                String doisult = nome.substring(nome.length() -2);
                System.out.println("duas ultimas letras: "+doisult);
                */



//***********************************************************************************************************************
      /*
                Scanner scanner = new Scanner(System.in); // Criando o Scanner para ler entradas do teclado

                //ALGORITMO 25 separar dia, mes e ano de uma determinada data escrita sem separador

                int data, dia, mes, ano;
                System.out.println("Digite a data: ");
                data = scanner.nextInt();

                dia = data / 10000;
                mes = data % 10000 / 100;
                ano = data % 100;

                System.out.println("Dia: "+dia);
                System.out.println("Mes: "+mes);
                System.out.println("Ano: "+ano);
                */
//**********************************************************************************************************************

                /*Scanner scanner = new Scanner(System.in); // Criando o Scanner para ler entradas do teclado

                //algoritmo 23 encontrar o numero na casa das dezenas

                int num1, decimal;
                System.out.println("Digite um numero acima de 100 e menor que 1000: ");
                num1 = scanner.nextInt();

                if (num1 > 100 && num1 < 1000) {

                    decimal = (num1 % 100) / 10;
                    System.out.println("a casa da dezena eh: " + decimal);

                }
                else {
                    System.out.println("Numero nao corresponde a condição inicial");
                }
                */

//********************************************************************************************************************

//ALGORITMO 20:
//Scanner scanner = new Scanner(System.in); // Criando o Scanner para ler entradas do teclado

/*
 *
 * Exercícios do LIVRO: Carlos Assis - Introdução à Programação_
 * 500 Algoritmos Resolvidos-GEN LTC_ Cd edição (2002)
 *
 * ALGORITMO 20:
 *
 * */

                    /*
                    String P1, P2; //Declaração de variaveis
                    System.out.println("Digite a primeira palavra: "); //output do monitor
                    P1 = scanner.next(); // next() lê apenas uma palavra

                    System.out.println("Digite a segunda palavra: ");
                    P2 = scanner.next();

                    //length() retorna a quantidade de caracter de uma string
                    System.out.println("O tamanho da primeira palavra eh:  " + P1.length());
                    //int tamanhoP1 = P1.length(); // Comando para saber quantidade de caracter de uma string

                    //concatenando
                    String concat = P1.concat(P2); //Concatenando as Palavras
                    System.out.println("Concatenando as duas palavras: " + concat);

                    //copiando o conteudo de uma variavel string a outra
                    String D1 = P1;

                    //Exibindo conteudo
                    System.out.println("O conteúdo da variavel D1 eh: " + D1);

                    //atribuindo conteudo a variavel D2 "concatenar P1 + P2"
                    String D2 = P1.concat(P2);
                    System.out.println("O conteudo da variavel D2 eh a concatenacao de P1 e P2: " + D2);
                */
                /* retornando a primeira letra de uma string:

                O metodo charAt(index) é o que você usa para obter
                qualquer caractere em uma posição específica de uma string.
                Para o primeiro caractere, você usa charAt(0).

                */
                /*
                    //retornando a primeira letra de uma string:
                    char strPrim = P1.charAt(0);
                    System.out.println("Primeiro caracter: " + strPrim);

                    //retornando o ultimo caracter de uma string
                    // calculando o tamanho da string e retornando a ultima posicao int como index para charAt()
                    char strUlt = P1.charAt(P1.length() - 1);
                    System.out.println("Ultimo caracter: " + strUlt);

                    //retornando todas as letras menos a primeira:
                    String StrResto = P1.substring(1);
                    System.out.println("Resto: " + StrResto);

                    //exibir apenas o terceiro elemento
                    char str3 = P1.charAt(2);
                    System.out.println("terceiro caracter: " + str3);

                    //exibindo apenas os tres primeiros elementos
                    String StrFirst3 = P1.substring(0, 3);
                    System.out.println("3 primeiros caracteres: " + StrFirst3);

                    //exibir os tres ultimos elementos
                    String str3Ult = P1.substring(P1.length() - 3);
                    System.out.println("Ultimos 3 caracteres: " + str3Ult);
                    */
//*********************************************************************************************************************


//Exercício qqr da maratona:
                /*int M = 3;
                int T = 5;
                int E = 3;
                int P = (E % T) - 1;

                String texto = "abcde";

                for (int i = 0; i < M; i++) {
                    System.out.print(texto.charAt((P + i + 1) % T));*/

//*********************************************************************************************************************