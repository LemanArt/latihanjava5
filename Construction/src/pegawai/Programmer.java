/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;

/**
 *
 * @author Leman
 */
public class Programmer  {
    String name;
    String bagian;
    double gajipokok;
    double bonus;
    
    // Overloading constructor inherite superclass
    public Programmer(String name, String bagian, double gajipokok, double bonus) {
        this.name = name;
        this.bagian = bagian;
        this.bonus=bonus;
        this.gajipokok = gajipokok;
    }
}
