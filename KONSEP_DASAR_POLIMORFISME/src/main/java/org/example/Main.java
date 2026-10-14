package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pegawai p = new Pegawai();
        p = new Programmer();
        p = new Manajer();
        p = new Security();
        p = new Cyber();

        Manajer m = new Manajer();
        m.gajipokok = 10000;
        m.nama = "Bagas";
        m.tunjangan = 5000;
        p = m;
        p.tampilData();

        m.tampilData();

        Security s = new Security();
        s.gajipokok = 20000;
        s.nama = "Waluyo";
        s.lembur = 10000;
        p = s;
        p.tampilData();

        s.tampilData();



        Pegawai[] arrPeg = new Pegawai[3];
        Programmer pr = new Programmer();
        pr.nama = "Sasuke";
        pr.gajipokok = 100000;
        pr.bonus = 120000;
        pr.tampilData();
        arrPeg[0] = p;
        arrPeg[1] = m;
        arrPeg[2] = new Programmer();
        arrPeg[0].tampilData();
        arrPeg[1].tampilData();

        Cyber[] arrSec = new Cyber[3];
        Cyber c = new Cyber();
        c.nama = "Naruto";
        c.gajipokok = 100000;
        c.ekstra = 21000;
        c.tampilData();
        arrSec[0] = c;
        arrSec[1] = c;
        arrSec[2] = new Cyber();
        arrSec[0].tampilData();
        arrSec[1].tampilData();

        hitungGajiTotal(m);
        hitungGajiTotal(pr);

        hitungGajiTotal(s);
        hitungGajiTotal(c);

    }

    public static void hitungGajiTotal(Pegawai p) {
        if (p instanceof Programmer) {
            Programmer prog = (Programmer) p;
            int gajiTot = prog.gajipokok + prog.bonus;
            System.out.println("Gaji Pokok Programmer :"+gajiTot);

        } else if (p instanceof Manajer) {
            Manajer man = (Manajer) p;
            int gajiTot = man.gajipokok + man.tunjangan;
            System.out.println("Gaji Pokok Manajer =" + gajiTot);

        }
        if (p instanceof Security) {
            Security s = (Security) p;
            int gajiTot = s.gajipokok + s.lembur;
            System.out.println("GAJI POKOK SECURITY ="+gajiTot);

        } else if (p instanceof Cyber) {
            Cyber c = (Cyber) p;
            int gajiTot = c.gajipokok + c.ekstra;
            System.out.println("GAJI POKOK CYBER="+gajiTot);
        }
    }
}
