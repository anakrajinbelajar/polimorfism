package org.example;

public class Security extends Pegawai{
    public int lembur;

    @Override
    public void tampilData() {

        super.tampilData();
        System.out.println("LEMBUR = "+lembur);

    }
}
