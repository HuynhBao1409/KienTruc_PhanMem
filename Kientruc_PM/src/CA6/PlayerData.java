    package CA6;

    import java.util.List;

    public class PlayerData {
        private PlayerDataListener listener;
        private int thoiGian, soLuotChoi, diemSo;

        public PlayerData(int thoiGian, int soLuotChoi, int diemSo) {
            this.thoiGian = thoiGian;
            this.soLuotChoi = soLuotChoi;
            this.diemSo = diemSo;
        }

        public void dangKy(PlayerDataListener listener){
            listener = listener;
            this.listener.listen(this);
        }

        public void huyDangKy(PlayerDataListener listener){
            this.listener = null;
        }

        public void setThoiGian(int thoiGian) {
            this.thoiGian = thoiGian;
            listener.listen(this);
        }

        public void setSoLuotChoi(int soLuotChoi) {
            this.soLuotChoi = soLuotChoi;
            listener.listen(this);
        }

        public void setDiemSo(int diemSo) {
            this.diemSo = diemSo;
            listener.listen(this);
        }

        @Override
        public String toString() {
            StringBuilder b = new StringBuilder();
            b.append("Time: ").append(thoiGian).append("\t")
                    .append("Soluot: ").append(soLuotChoi).append("\t")
                    .append("Diemso: ").append(diemSo);
            return b.toString();
        }

    }
