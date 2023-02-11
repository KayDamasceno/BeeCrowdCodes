import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
    
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            int team1 = 0;
            int team2 = 0;
            String[] input = br.readLine().split(" ");
            String[] input2 = br.readLine().split(" ");
            team1 = Integer.parseInt(input[0])+Integer.parseInt(input2[2]);
            team2 = Integer.parseInt(input[2])+Integer.parseInt(input2[0]);
            
            if(team1>team2)
                System.out.println("Time 1");
            else if(team1<team2)
                System.out.println("Time 2");
            else {
                if(Integer.parseInt(input[2])>Integer.parseInt(input2[2]))
                    System.out.println("Time 2");
                else if(Integer.parseInt(input[2])<Integer.parseInt(input2[2]))
                    System.out.println("Time 1");
                else
                    System.out.println("Penaltis");
            }
        }
    }
}

