package CA6;

public class Main {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData(200, 3,100);
        PlayerDataListener dashBoard = new Dasboard(playerData);
        System.out.println("Thiết lập thời gian: ");
        playerData.setThoiGian(400);
        System.out.println("Thiết lập số lượt chơi: ");
        playerData.setSoLuotChoi(4);
        System.out.println("Thiết lập điểm số: ");
        playerData.setDiemSo(200);
    }

}
