package btA1;

import vd2.Computer;

import java.util.ArrayList;
import java.util.List;

public class hoaDon {
    private hoaDonHeader header;
    private List<CTHD> cthds;

    public hoaDon(hoaDonHeader header, List<CTHD> cthds) {
        this.header = header;
        this.cthds = cthds = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(header.toString());
        builder.append("Chi tiet hoa don: ");
        for(CTHD cthd: cthds)
            builder.append("\n").append(cthd.toString());
        return builder.toString();
    }

    public static class Builder {
        private hoaDonHeader header;
        private List<CTHD> list;

        public Builder() {
            this.list = new ArrayList<>();
        }

        public Builder sethoaDonHeader(hoaDonHeader header) {
            this.header = header;
            return this;
        }

        public Builder addCTHD(CTHD cthd) {
            list.add(cthd);
            return this;
        }

        public hoaDon build() {
            return new hoaDon(header, list);
        }
    }
  }
