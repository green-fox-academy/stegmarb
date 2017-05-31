
public class TennisGame2 implements TennisGame {
  public int p1Point = 0;
  public int p2Point = 0;

  public String p1Res = "";
  public String p2Res = "";
  private String player1Name;
  private String player2Name;

  public TennisGame2(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public String getScore() {
    String score = "";
    if (p1Point == p2Point && p1Point < 4) {
      if (p1Point == 0) {
        score = "Love";
      } else if (p1Point == 1) {
        score = "Fifteen";
      } else if (p1Point == 2) {
        score = "Thirty";
      } else if (p1Point == 3) {
        score = "Forty";
      }
      score += "-All";
    } else if (p1Point == p2Point && p1Point > 3) {
      score = "Deuce";
    } else if (p1Point > 0 && p2Point == 0) {
      if (p1Point == 1) {
        p1Res = "Fifteen";
      } else if (p1Point == 2) {
        p1Res = "Thirty";
      } else if (p1Point == 3) {
        p1Res = "Forty";
      }
      p2Res = "Love";
      score = p1Res + "-" + p2Res;
    } else if (p2Point > 0 && p1Point == 0) {
      if (p2Point == 1) {
        p2Res = "Fifteen";
      } else if (p2Point == 2) {
        p2Res = "Thirty";
      } else if (p2Point == 3) {
        p2Res = "Forty";
      }
      p1Res = "Love";
      score = p1Res + "-" + p2Res;
    } else if (p1Point > p2Point && p1Point < 4) {
      if (p1Point == 2) {
        p1Res = "Thirty";
      } else if (p1Point == 3) {
        p1Res = "Forty";
      } else if (p2Point == 1) {
        p2Res = "Fifteen";
      } else if (p2Point == 2) {
        p2Res = "Thirty";
      }
      score = p1Res + "-" + p2Res;
    } else if (p1Point > p2Point && p2Point >= 3) {
      score = "Advantage player1";
    } else if (p2Point > p1Point && p1Point >= 3) {
      score = "Advantage player2";
    } else if (p1Point >= 4 && p2Point >= 0 && (p1Point - p2Point) >= 2) {
      score = "Win for player1";
    } else if (p2Point >= 4 && p1Point >= 0 && (p2Point - p1Point) >= 2) {
      score = "Win for player2";
    }
    return score;
  }

  public void SetP1Score(int number) {
    for (int i = 0; i < number; i++) {
      P1Score();
    }
  }

  public void SetP2Score(int number) {
    for (int i = 0; i < number; i++) {
      P2Score();
    }
  }

  public void P1Score() {
    p1Point++;
  }

  public void P2Score() {
    p2Point++;
  }

  public void wonPoint(String player) {
    if (player == "player1") {
      P1Score();
    } else {
      P2Score();
    }
  }
}