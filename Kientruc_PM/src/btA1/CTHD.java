    package btA1;

    public  class CTHD {
        String sanPham;
        int soLuong;
        double donGia ,chietKhau;

        public CTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
            this.sanPham = sanPham;
            this.soLuong = soLuong;
            this.donGia = donGia;
            this.chietKhau = chietKhau;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(sanPham).append("\t")
                    .append("So Luong: ").append(soLuong)
                    .append("Don gia: ").append(donGia)
                    .append("Chiet Khau: ").append(chietKhau);
            return builder.toString();
        }

        public String getSanPham() {
            return sanPham;
        }

        public void setSanPham(String sanPham) {
            this.sanPham = sanPham;
        }

        public int getSoLuong() {
            return soLuong;
        }

        public void setSoLuong(int soLuong) {
            this.soLuong = soLuong;
        }

        public double getDonGia() {
            return donGia;
        }

        public void setDonGia(double donGia) {
            this.donGia = donGia;
        }

        public double getChietKhau() {
            return chietKhau;
        }

        public void setChietKhau(double chietKhau) {
            this.chietKhau = chietKhau;
        }
    }
