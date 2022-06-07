package cleancode_refactoring.tennisGame_tennisGameTest;

public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String result = "";
        int tempScore;
        boolean equalScore = scorePlayer1 == scorePlayer2;
        if (equalScore)
        {
            switch (scorePlayer1)
            {
                case 0:
                    result = LOVE_ALL;
                    break;
                case 1:
                    result = FIFTEEN_ALL;
                    break;
                case 2:
                    result = THIRTY_ALL;
                    break;
                case 3:
                    result = FORTY_ALL;
                    break;
                default:
                    result = DEUCE;
                    break;

            }
        }
        else {
            boolean advantageScore = scorePlayer1 >= 4 || scorePlayer2 >= 4;
            if (advantageScore)
            {
                int minusResult = scorePlayer1-scorePlayer2;
                if (minusResult==1) result = ADVANTAGE_PLAYER_1;
                else if (minusResult ==-1) result = ADVANTAGE_PLAYER_2;
                else if (minusResult>=2) result = WIN_FOR_PLAYER_1;
                else result = WIN_FOR_PLAYER_2;
            }
            else
            {
                for (int i=1; i<3; i++)
                {
                    if (i==1) tempScore = scorePlayer1;
                    else { result+="-"; tempScore = scorePlayer2;}
                    switch(tempScore)
                    {
                        case 0:
                            result+="Love";
                            break;
                        case 1:
                            result+="Fifteen";
                            break;
                        case 2:
                            result+="Thirty";
                            break;
                        case 3:
                            result+="Forty";
                            break;
                    }
                }
            }
        }
        return result;
    }
//    public static final String LOVE_ALL = "Love-All";
//    public static final String FIFTEEN_ALL = "Fifteen-All";
//    public static final String THIRTY_ALL = "Thirty-All";
//    public static final String FORTY_ALL = "Forty-All";
//    public static final String DEUCE = "Deuce";
//    public static final String LOVE = "Love";
//    public static final String FIFTEEN = "Fifteen";
//    public static final String THIRTY = "Thirty";
//    public static final String FORTY = "Forty";
//    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
//    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
//    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
//    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
//
//    public static void main(String[] args) {
//        String result = getScore(55, 5);
//        System.out.println(result);
//    }
//
//    public static String draw(int score) {
//        String result = null;
//        switch (score) {
//            case 0:
//                result = LOVE_ALL;
//                break;
//            case 1:
//                result = FIFTEEN_ALL;
//                break;
//            case 2:
//                result = THIRTY_ALL;
//                break;
//            case 3:
//                result = FORTY_ALL;
//                break;
//            default:
//                result = DEUCE;
//                break;
//        }
//        return result;
//    }
//
//    public static String advantageThan(int range) {
//        if (range == 1)
//            return ADVANTAGE_PLAYER_1;
//        if (range == -1)
//            return ADVANTAGE_PLAYER_2;
//        if (range >= 2)
//            return WIN_FOR_PLAYER_1;
//        return WIN_FOR_PLAYER_2;
//    }
//
//    public static String getScore(int scorePlayer1, int scorePlayer2) {
//        String score = "";
//        int tempScore = 0;
//        if (scorePlayer1 == scorePlayer2) {
//            score = draw(scorePlayer1);
//            return score;
//        }
//        if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
//            int minusResult = scorePlayer1 - scorePlayer2;
//            return advantageThan(minusResult);
//        }
//        for (int i = 1; i < 3; i++) {
//            if (i == 1) tempScore = scorePlayer1;
//            else {
//                score += "-";
//                tempScore = scorePlayer2;
//            }
//            switch (tempScore) {
//                case 0:
//                    score += LOVE;
//                    break;
//                case 1:
//                    score += FIFTEEN;
//                    break;
//                case 2:
//                    score += THIRTY;
//                    break;
//                case 3:
//                    score += FORTY;
//                    break;
//            }
//        }
//
//        return score;
//    }
}
