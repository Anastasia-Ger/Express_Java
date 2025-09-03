package practice_3;

public class GameSetting {
    private static int maxPlayers = 10;
    final String gameName;
    int currentPlayers;

    public static int getMaxPlayers() {
        return maxPlayers;
    }

    public GameSetting(String name, int currentPlayers) {
        this.gameName = name;
        this.currentPlayers = currentPlayers;
    }
    public static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }
    public void addPlayer() {
        if(currentPlayers < maxPlayers) {
            currentPlayers++;
        } else {
            System.out.println("Number of players exceeded maximum number.");
        }

    }
    public void printGameStatus() {
        String result = String.format("Game Name: %s, Current Number of Players: %s, Maximum Number of Players: %s",
                gameName, currentPlayers, maxPlayers);
        System.out.println(result);
    }

}
