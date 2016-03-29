/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS;

/**
 *
 * @author User
 */
public class CS {
    private String nama_cs;
    private String usernameCS;
    private String passwordCS;
    private int id_cs;

    char namaExcep[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!',
        '@', '#', '$', '%', '^', '&', '*', '(', ')', '{', '}',
        '[', ']', ',', ';'};
    char userExcep[] = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '{', '}',
        '[', ']', ',', ';'};

    public int getId_cs() {
        return id_cs;
    }

    public void setId_cs(int id_cs) {
        this.id_cs = id_cs;
    }

    public String getNama_cs() {
        return nama_cs;
    }

    public void setNama_cs(String nama_cs) {
        if (NamaBerhasil(nama_cs) == true) {
            this.nama_cs = nama_cs;
        } else {
            this.nama_cs = null;
        }
    }

    public String getUsernameCS() {
        return usernameCS;
    }

    public void setUsernameCS(String usernameCS) {
        if (UserBerhasil(usernameCS) == true) {
            this.usernameCS= usernameCS;
        } else {
            this.usernameCS = usernameCS;
        }
    }

    public String getPasswordCS() {
        return passwordCS;
    }

    public void setPasswordCS(String passwordO) {
        this.passwordCS = passwordCS;
    }

    public boolean NamaBerhasil(String nama) {
        char test;
        for (int i = 0; i < nama.length(); i++) {
            test = nama.charAt(i);
            for (int j = 0; j < namaExcep.length; j++) {
                if (test == namaExcep[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean UserBerhasil(String user) {
        char tesUser;
        for (int i = 0; i < user.length(); i++) {
            tesUser = user.charAt(i);
            for (int j = 0; j < userExcep.length; j++) {
                if (tesUser == userExcep[j]) {
                    return false;
                }
            }
        }
        return true;
    }

}


