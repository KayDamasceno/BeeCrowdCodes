import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
    
        while (sc.hasNext()) {
            String entrada = sc.nextLine().trim();
            String[] partes = entrada.split(" ");
            String dodo = partes[0];
            String leo = partes[1];
            String pepper = partes[2];
            if(dodo.equals("papel")) {
                if(leo.equals("papel")) {
                    if(pepper.equals("papel")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("tesoura")) {
                        System.out.println("Urano perdeu algo muito precioso...");
                    }else if(pepper.equals("pedra")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }
                }
                else if(leo.equals("tesoura")){
                    if(pepper.equals("papel")) {
                        System.out.println("Iron Maiden's gonna get you, no matter how far!");
                    }else if(pepper.equals("tesoura")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("pedra")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }
                }else if(leo.equals("pedra")){
                    if(pepper.equals("papel")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("tesoura")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("pedra")) {
                        System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
                    }
                }
                    
            }else if(dodo.equals("pedra")) {
                if(leo.equals("papel")) {
                    if(pepper.equals("papel")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("tesoura")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("pedra")) {
                        System.out.println("Iron Maiden's gonna get you, no matter how far!"); //leo
                    }
                }
                else if(leo.equals("tesoura")){
                    if(pepper.equals("papel")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("tesoura")) {
                        System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");  //dodo
                    }else if(pepper.equals("pedra")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }
                }else if(leo.equals("pedra")){
                    if(pepper.equals("papel")) {
                        System.out.println("Urano perdeu algo muito precioso..."); //pepper
                    }else if(pepper.equals("tesoura")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("pedra")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }
                }
            }else {
                if(leo.equals("papel")) {
                    if(pepper.equals("papel")) {
                        System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");  //dodo
                    }else if(pepper.equals("tesoura")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("pedra")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }
                }
                else if(leo.equals("tesoura")){
                    if(pepper.equals("papel")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("tesoura")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("pedra")) {
                        System.out.println("Urano perdeu algo muito precioso..."); //pepper
                    }
                }else if(leo.equals("pedra")){
                    if(pepper.equals("papel")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }else if(pepper.equals("tesoura")) {
                        System.out.println("Iron Maiden's gonna get you, no matter how far!"); //leo
                    }else if(pepper.equals("pedra")) {
                        System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                    }
                }
            }
        }
        

        sc.close();
    }

}

