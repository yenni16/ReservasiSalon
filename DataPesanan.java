/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pti;

/**
 *
 * @author Prasetya
 */
public class DataPesanan {

  private  String tgl_treatment;
    int id_member;
    int jam_treatment;
    String jns_treatment;
    
    
    public String getTgl_treatment(){
        return tgl_treatment;
    }
    
    public void setTgl_treatment(String tgl_treatment){
        if (isTglBenar(tgl_treatment)== true){
            this.tgl_treatment = tgl_treatment;            
        } else{
            this.tgl_treatment= null;
        }
    }
    
        public int getId_memeber() {
        return id_member;
    }


    public void setId_memeber(int id_memeber) {
        this.id_member = id_memeber;
    }
    
    public int getJam_treatment(){
        return jam_treatment;
    }
    public void setJam_treatment(int jam_treatment) {
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

    
 
}
