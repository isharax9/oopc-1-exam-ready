package GunQues;

// Define the base class named Gun with a method fire() that prints a generic sound
class Gun {

    public void fire() {
        System.out.println("Bang!");
    }
}

// Define the AK47 class extending Gun and overriding the fire method
class AK47 extends Gun {

    @Override
    public void fire() {
        System.out.println("AK47 firing sound");
    }
}

// Define the Sniper class extending Gun and overriding the fire method
class Sniper extends Gun {

    @Override
    public void fire() {
        System.out.println("Sniper firing sound");
    }
}

// Define the Pistol class extending Gun and overriding the fire method
class Pistol extends Gun {

    @Override
    public void fire() {
        System.out.println("Pistol firing sound");
    }
}

// Define the Soldier class that can use different types of guns
class Soldier {

    private Gun gun;

    // Method to pick a gun
    public void pickGun(Gun gun) {
        this.gun = gun;
    }

    // Method to fire the currently held gun
    public void fireGun() {
        if (gun != null) {
            gun.fire();
        } else {
            System.out.println("No gun selected");
        }
    }
}

// Define the Game class to create instances of different guns and a soldier
public class MilitaryGame {

    public static void main(String[] args) {
        Soldier soldier = new Soldier();

        Gun ak47 = new AK47();
        Gun sniper = new Sniper();
        Gun pistol = new Pistol();

        // Soldier picks and fires AK47
        soldier.pickGun(ak47);
        soldier.fireGun();

        // Soldier picks and fires Sniper
        soldier.pickGun(sniper);
        soldier.fireGun();

        // Soldier picks and fires Pistol
        soldier.pickGun(pistol);
        soldier.fireGun();
    }
}
