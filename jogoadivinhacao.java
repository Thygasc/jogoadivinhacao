import java.util.Random;
import java.util.Scanner;

public class jogoadivinhacao{

public static void main(String[] arguments ) {

    Scanner leia = new Scanner(System.in);
    Random random = new Random();
    int num, num_sort=0, num_acima,num_abaixo,tentativas=1;
    boolean status=false;
    String nome="";
    
    num_sort= random.nextInt(10000);
    System.out.println(num_sort);
    
    System.out.println("Que comece os jogos!");
    System.out.println("Digite o seu nome: ");
    nome = leia.nextLine();

    System.out.println("Foi sorteado um numero de 1 a 10000, seu objetivo é acertar esse numero, boa sorte!");
    
    do {
        System.out.println("Digite um numero: ");
        num = leia.nextInt();

        if (num == num_sort){
            System.out.println("Você acertou o número sorteado, parabens "+nome);
            System.out.println("Você ganhou com um total de "+tentativas+" tentativas");
            status=true;
            break;
        }
        else if(tentativas==5){
            num_abaixo = num_sort - 500;
            num_acima = num_sort + 500;
            System.out.println("VOCÊ ERROU 5 VEZES JA, VOU TE DAR UMA DICA\nO NUMERO QUE DESEJA ESTÁ ENTRE "+num_abaixo+" e "+num_acima);
            tentativas= tentativas + 1;
        }
        else if(tentativas==10){
            num_abaixo = num_sort - 100;
            num_acima = num_sort + 100;
            System.out.println("VOCÊ ERROU 10 VEZES JA, VOU TE DAR UMA DICA\nO NUMERO QUE DESEJA ESTÁ ENTRE "+num_abaixo+" e "+num_acima);
            tentativas= tentativas + 1;
        }
        else if(tentativas==15){
            num_abaixo = num_sort - 50;
            num_acima = num_sort + 50;
            System.out.println("VOCÊ ERROU 15 VEZES JA, VOU TE DAR UMA DICA\nO NUMERO QUE DESEJA ESTÁ ENTRE "+num_abaixo+" e "+num_acima);
            tentativas= tentativas + 1;
        }
        else if(tentativas==20){
            System.out.println("Você perdeu o jogo :c\nO numero sorteador era: "+num_sort);
        }
        else{
            tentativas= tentativas + 1;
        }
        }while(status=!true || tentativas<20);
        
    }

}
