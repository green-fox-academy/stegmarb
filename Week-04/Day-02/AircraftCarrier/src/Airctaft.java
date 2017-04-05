public class Airctaft {
  private int maxAmmo;
  private int baseDamage;
  private int ammoStore;


  public int fight() {
    int damage = ammoStore*baseDamage;
    this.ammoStore = 0;
    return damage;
  }

  public int refill(int ammoNumber) {
    ammoNumber-=(maxAmmo - ammoStore);
    this.ammoStore = maxAmmo;
    return ammoNumber;
  }

  public String getType() {
    if (this instanceof F16) {
      return "F16";
    } else {
      return "F32";
    }
  }

  public String getStatus() {
      return "Type " + getType() + ", Ammo: " + this.ammoStore + ", BaseDamage: " + this.baseDamage + ", All damage: " + fight();
  }

  public Airctaft(int maxAmmo, int baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.ammoStore = 0;
  }

  public Airctaft() {
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }
}
