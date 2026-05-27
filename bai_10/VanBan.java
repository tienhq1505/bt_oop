package bai_10;

public class VanBan {
    private String st;

    public VanBan() {
        st = "";
    }

    public VanBan(String st) {
        this.st = st;
    }

    public int demSoTu() {
        String temp = st.trim();// bỏ dấu cách 2 đầu
        if (temp.isEmpty()) {
            return 0;
        }
        return temp.split("\\s+").length;// tách từ ở dấu cách
    }

    public int demKyTuA() {
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (c == 'A' || c == 'a')
                count++;
        }
        return count;
    }

    public String chuanHoa() {
        return st.trim().replaceAll("\\s+", " ");
    }

    public void hienthi() {
        System.out.println(st);
    }
}
