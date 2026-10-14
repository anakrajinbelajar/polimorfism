package org.example;

public class Programmer extends Pegawai{
    public int bonus;

    @Override
    public void tampilData() {

        super.tampilData();
        System.out.println("BONUS = "+bonus);

    }
}
