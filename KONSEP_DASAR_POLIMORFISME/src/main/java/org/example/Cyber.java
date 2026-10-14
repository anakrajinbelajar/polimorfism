package org.example;

public class Cyber extends Pegawai{
    public int ekstra;

    @Override
    public void tampilData() {

        super.tampilData();
        System.out.println("EKSTRA = "+ekstra);

    }
}
