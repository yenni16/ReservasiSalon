
/**
 *
 * @author YENNI
 */
public class Member {
    private String nama_member;
    private String alamat_member;
    private String usernameM;
    private String passwordM;
    private String nohp_member;
 private String tgllahir_member;
    private int saldo_member;
    private String role;

    
    public String getNama_member() {
        return nama_member;
    }

    public void setNama_member(String nama_member) {
//              if (isNamaBenar(nama_member) == true) {
//            this.nama_member = nama_member;
//        } else {
//            this.nama_member = null;
//        }
this.nama_member=nama_member;
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

    public String getTgllahir_member() {
        return tgllahir_member;
    }

    public void setTgllahir_member(String tgllahir_member) {

this.tgllahir_member=tgllahir_member;
    }




    /**
     * @return the nohp_member
     */
    public String getNohp_member() {
        return nohp_member;
    }

    /**
     * @param nohp_member the nohp_member to set
     */
    public void setNohp_member(String nohp_member) {
        this.nohp_member = nohp_member;
    }

    /**
     * @return the saldo_member
     */
    public int getSaldo_member() {
        return saldo_member;
    }

    /**
     * @param saldo_member the saldo_member to set
     */
    public void setSaldo_member(int saldo_member) {
        this.saldo_member = saldo_member;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

}
