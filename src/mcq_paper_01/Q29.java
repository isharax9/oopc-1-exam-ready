/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcq_paper_01;

/**
 *
 * @author isharaLakshitha
 */
class Vehicle {

    protected String licensePlate = null;

    public void setLicensePlate(String license) {
        this.licensePlate = license;
    }
}

class Car extends Vehicle {

    protected String owner = null;

    public String getLicenseAndOwner() {
        return this.licensePlate + " : " + this.owner;
    }
}

class Police {

    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();
        v.setLicensePlate("00CAR123");
        c.owner = "Mr. Nirodha";
        System.out.println(c.getLicenseAndOwner());
    }
}
