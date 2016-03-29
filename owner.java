package salon1;


/**
 *
 * @author Marcellina Fanny
 */
public class owner {

    private int id_owner;
    private String nama_owner;
    private String usernameO;
    private String passwordO;
    char namaSalah[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!',
        '@', '#', '$', '%', '^', '&', '*', '(', ')', '{', '}',
        '[', ']', ',', ';'};
    char userSalah[] = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '{', '}',
        '[', ']', ',', ';'};

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public String getNama_owner() {
        return nama_owner;
    }

    public void setNama_owner(String nama_owner) {
        if (isNamaBenar(nama_owner) == true) {
            this.nama_owner = nama_owner;
        } else {
            this.nama_owner = null;
        }
    }

    public String getUsernameO() {
        return usernameO;
    }

    public void setUsernameO(String usernameO) {
        if (isUserBenar(usernameO) == true) {
            this.usernameO = usernameO;
        } else {
            this.usernameO = usernameO;
        }
    }

    public String getPasswordO() {
        return passwordO;
    }

    public void setPasswordO(String passwordO) {
        this.passwordO = passwordO;
    }

    public boolean isNamaBenar(String nama) {
        char cek;
        for (int i = 0; i < nama.length(); i++) {
            cek = nama.charAt(i);
            for (int j = 0; j < namaSalah.length; j++) {
                if (cek == namaSalah[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isUserBenar(String user) {
        char cekU;
        for (int i = 0; i < user.length(); i++) {
            cekU = user.charAt(i);
            for (int j = 0; j < userSalah.length; j++) {
                if (cekU == userSalah[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
