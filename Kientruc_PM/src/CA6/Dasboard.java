package CA6;

public class Dasboard implements PlayerDataListener{
    PlayerData playerData;

    public Dasboard(PlayerData playerData) {
        this.playerData = playerData;
        this.playerData.dangKy(this);
    }

    @Override
    public void listen(PlayerData playerData) {
        System.out.println(playerData.toString());
    }
}
