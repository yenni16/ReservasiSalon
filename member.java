
/**
 *
 * @author YENNI
 */
public class member {
    private String nama_member;
    private String alamat_member;
    private String usernameM;
    private String passwordM;
    private int id_memeber;
    private int nohp_member;
 private String tgllahir_member;
    private int saldo_member;
    char namaSalah[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '@', '*', '_', '-'};

    
    public String getNama_member() {
        return nama_member;
    }

    public void setNama_member(String nama_member) {
              if (isNamaBenar(nama_member) == true) {
            this.nama_member = nama_member;
        } else {
            this.nama_member = null;
        }

    }

    
    public String getAlamat_member() {
        return alamat_member;
    }

    
    public void setAlamat_member(String alamat_member) {
        this.alamat_member = alamat_member;
    }

    public String getUsernameM() {
        return usernameM;
    }

    public void setUsernameM(String usernameM) {
        this.usernameM = usernameM;
    }

    public String getPasswordM() {
        return passwordM;
    }

    public void setPasswordM(String passwordM) {
        this.passwordM = passwordM;
    }

    public int getId_memeber() {
        return id_memeber;
    }

    public void setId_memeber(int id_memeber) {
        this.id_memeber = id_memeber;
    }

    public int getNohp_member() {
        return nohp_member;
    }

    
    public void setNohp_member(int nohp_member) {
        this.nohp_member = nohp_member;
    }

    public String getTgllahir_member() {
        return tgllahir_member;
    }

    public void setTgllahir_member(String tgllahir_member) {
        if (isTTLBenar(tgllahir_member) == true) {
            this.tgllahir_member = tgllahir_member;
        } else {
            this.tgllahir_member = null;
        }

    }

    public int getSaldo_member() {
        return saldo_member;
    }

    public void setSaldo_member(int saldo_member) {
        this.saldo_member = saldo_member;
    }

    public boolean isNamaBenar(String in) {
        char cek;
        for (int i = 0; i < in.length(); i++) {
            cek = in.charAt(i);
            for (int j = 0; j < namaSalah.length; j++) {
                if (cek == namaSalah[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isTTLBenar(String day) {
        if (day.length() != 10) {
            return false;
        }
        String d1 = null, d2 = null, m1 = null, m2 = null;
        char batas[] = new char[2];
        for (int i = 0; i < day.length(); i++) {
            d1 = String.valueOf(day.charAt(0));
            d2 = String.valueOf(day.charAt(1));
            m1 = String.valueOf(day.charAt(3));
            m2 = String.valueOf(day.charAt(4));
            batas[0] = day.charAt(2);
            batas[1] = day.charAt(5);
        }
        int hari = Integer.parseInt(d1 + d2);
        int bulan = Integer.parseInt(m1 + m2);
        if (hari > 31) {
            return false;
        } else if (bulan > 12) {
            return false;
        } else if ((hari > 31) && (bulan > 12)) {
            return false;
        } else if ((batas[0] != '/') && (batas[1] != '/')) {
            return false;
        }
        return true;
    }

}
