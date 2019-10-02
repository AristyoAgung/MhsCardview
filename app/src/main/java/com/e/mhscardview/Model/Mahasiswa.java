package com.e.mhscardview.Model;

public class Mahasiswa {
    private int foto;
    private String nama;
    private String nim;
    private String gender;
    private String hobi;
    private String cita2;
    private String motohidup;

    public Mahasiswa(int foto, String nama, String nim, String gender, String hobi, String cita2, String motohidup) {
        this.foto = foto;
        this.nama = nama;
        this.nim = nim;
        this.gender = gender;
        this.hobi = hobi;
        this.cita2 = cita2;
        this.motohidup = motohidup;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getCita2() {
        return cita2;
    }

    public void setCita2(String cita2) {
        this.cita2 = cita2;
    }

    public String getMotohidup() {
        return motohidup;
    }

    public void setMotohidup(String motohidup) {
        this.motohidup = motohidup;
    }
}

