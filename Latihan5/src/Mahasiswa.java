/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dinda
 */

/*Saya Adinda Salsabilla 2005319 mengerjakan Latihan 5 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin*/

public class Mahasiswa {
    private String nim;
    private String nama;
    private String nilai;
    private String gender;
    
    public Mahasiswa(String nim, String nama, String nilai, String gender){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.gender = gender;
    }
    
    // SETTER
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNilai(String nilai){
        this.nilai = nilai;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    // getter
    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }
    
    public String getNilai(){
        return this.nilai;
    }
     
    public String getGender(){
        return this.gender;
    }
}
