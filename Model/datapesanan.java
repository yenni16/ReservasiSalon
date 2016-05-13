/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Prasetya
 */
public class datapesanan {

  private  String tgl_treatment;
    private int id_member;
    private String jam_treatment;
    private String jns_treatment;
   private String username;
   private String status;
   
   
   
    
    public String getTgl_treatment(){
        return tgl_treatment;
    }
    
    public void setTgl_treatment(String tgl_treatment){
     
            this.tgl_treatment = tgl_treatment;            
         
   
    }
        public int getId_memeber() {
        return getId_member();
    }


    public void setId_memeber(int id_memeber) {
        this.setId_member(id_memeber);
    }
    
    public String getJam_treatment(){
        return jam_treatment;
    }
    public void setJam_treatment(String jam_treatment) {
        this.jam_treatment = jam_treatment;
    }
    public String getJns_treatment(){
        return jns_treatment;
    }
    public void setJns_treatment(String jns_treatment) {
        this.jns_treatment = jns_treatment;
    }
    
    public boolean isTglBenar(String day){
        
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

    /**
     * @return the id_member
     */
    public int getId_member() {
        return id_member;
    }

    /**
     * @param id_member the id_member to set
     */
    public void setId_member(int id_member) {
        this.id_member = id_member;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the status
     */
//    public String getStatus() {
//        return status;
//    }

    /**
     * @param status the status to set
     */
//    public void setStatus(String status) {
//        this.status = status;
//    }

    void setStatus(int status2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the status
     */
  
    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    
 
}

