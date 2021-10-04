package itheritance;

public class JajarGenjang extends BangunDatar{
    float alas;
    float tinggi;
    float AB, BC, CD, DA;

    float luas() {
        float luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang : " + luas);
        return luas;
    }

    float keliling() {
        float keliling = AB + BC + CD + DA;
        System.out.println("Luas Jajar Genjang : " + keliling);
        return keliling;
    }


}
