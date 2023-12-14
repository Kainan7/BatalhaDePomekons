public class Batalha{
    private int bonus;
    private Pomekon treinador1;
    private Pomekon treinador2;

    public Batalha(int bonus, Pomekon treinador1, Pomekon treinador2) {
        this.bonus = bonus;
        this.treinador1 = treinador1;
        this.treinador2 = treinador2;
    }

    public double vencedor(){
        double golpe1 = treinador1.valorGolpe();
        double golpe2 = treinador2.valorGolpe();

        if (treinador1.getLvl() % 2 == 0){
            golpe1 += bonus;
        }
        if (treinador2.getLvl() % 2 == 0) {
            golpe2 += bonus;
        }

        if (golpe1 > golpe2){
            System.out.println("Dabriel");
            return golpe1;
        } else if (golpe2 > golpe1){
            System.out.println("Guarte");
            return golpe2;
        } else {
            System.out.println("Empate");
            return 0;
        }
    }
}