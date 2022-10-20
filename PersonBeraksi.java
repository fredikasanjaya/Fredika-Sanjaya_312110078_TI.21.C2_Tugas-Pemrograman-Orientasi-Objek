public class PersonBeraksi{
public static void main(String[] args){
// Membuat object
Person Anton = new Person();
/* memanggil atribut dan memberi nilai */
Anton.Nama = "Anton";
Anton.JenisKelamin = "LakiLaki";
Anton.Umur = 18;
System.out.println("Nama: " + Anton.Nama);
System.out.println("JenisKelamin: " + Anton.JenisKelamin);
System.out.println("Umur: " + Anton.Umur);
Person Riko = new Person();
/* memanggil atribut dan memberi nilai */
Riko.Nama = "Riko";
Riko.JenisKelamin = "LakiLaki";
Riko.Umur = 18;
System.out.println("Nama: " + Riko.Nama);
System.out.println("JenisKelamin: " + Riko.JenisKelamin);
System.out.println("Umur: " + Riko.Umur);
}
}