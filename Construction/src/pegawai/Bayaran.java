/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;

/**
 *
 * @author Leman
 */
public class Bayaran {

    public static void main(String[] args) {
        pegawai pegawai = new pegawai("Leman", "pegawai", 5000000);
        Manager manager = new Manager("Vivi", "Manager", 7000000, 1000000);
        Programmer programmer = new Programmer("Ikhsan", "Programmer", 8000000, 1500000);

        System.out.println("Nama \t\t: " + pegawai.name);
        System.out.println("Bagian\t\t: " + pegawai.bagian);
        System.out.println("Gaji \t\t: " + pegawai.gajipokok);
        System.out.println("\nNama\t\t: " + manager.name);
        System.out.println("Bagian\t\t: " + manager.bagian);
        System.out.println("Gaji\t\t: " + manager.gajipokok);
        System.out.println("Tunjangan\t: " + manager.tunjangan);
        System.out.println("\nNama \t\t: " + programmer.name);
        System.out.println("Bagian \t\t: " + programmer.bagian);
        System.out.println("Gaji \t\t: " + programmer.gajipokok);
        System.out.println("Bonus \t\t: " + programmer.bonus);
    }
}
