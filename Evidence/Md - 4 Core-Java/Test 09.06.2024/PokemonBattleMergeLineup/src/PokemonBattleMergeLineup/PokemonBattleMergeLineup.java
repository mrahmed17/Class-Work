package PokemonBattleMergeLineup;

public class PokemonBattleMergeLineup {

    public static void main(String[] args) {
        int[] pokemon1 = {4, 5, -1, 0, 0};
        int[] pokemon2 = {2, 27, 7, 12, 0};
        int[] mergedLineup = mergeLineup(pokemon1, pokemon2);

        for (int hp : mergedLineup) {
            System.out.print(hp + " ");
        }
    }

    public static int[] mergeLineup(int[] pokemon1, int[] pokemon2) {
        int n=pokemon1.length;
        int[] result =new int[n];
        for(int i=0; i<n; i++){
            int hp1=(pokemon1[i] !=0)?pokemon1[i]:0;
            int hp2=(pokemon2[n-i-1] !=0)?pokemon2[n-i-1]:0;
            result[i]=hp1+hp2;
        }
        return result;
    }
}
