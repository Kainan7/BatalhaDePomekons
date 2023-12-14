import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        for(int i=0; i < T; i++){
            int bonus = s.nextInt();

            int atkDabriel = s.nextInt();
            int defDabriel = s.nextInt();
            int lvlDabriel = s.nextInt();

            int atkGuarte = s.nextInt();
            int defGuarte = s.nextInt();
            int lvlGuarte = s.nextInt();


            Pomekon pomekon1 = new Pomekon(atkDabriel, defDabriel, lvlDabriel);
            Pomekon pomekon2 = new Pomekon(atkGuarte, defGuarte, lvlGuarte);

            Batalha batalha = new Batalha(bonus, pomekon1, pomekon2);
            double resultado = batalha.vencedor();
        }
    }
}