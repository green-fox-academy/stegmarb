import java.util.*;

public class Dominos {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    List<Domino> orderedDominoes = new ArrayList<>();
    orderedDominoes.add(dominoes.get(0));
    for (int i = 1; i < dominoes.size()-1; i++) {
      for (int j = 0; j < dominoes.size() ; j++) {
        if (orderedDominoes.get(i-1).getValues()[1] == dominoes.get(j).getValues()[0]) {
        orderedDominoes.add(dominoes.get(j));
        }
      }
    }

    System.out.println(orderedDominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
