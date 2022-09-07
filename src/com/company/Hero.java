package com.company;

// TODO: реализовать класс
class Hero {
    private Armor armor;
    private Clazz clazz;
    private Weapon weapon;

    public String print() {
        return "I'm an " + this.clazz + "! I wear " + this.armor + " and am equipped with a " + this.weapon;
    }

    public static class Builder {
        private Hero hero;

        public Builder() {
            hero = new Hero();
        }

        public Builder withArmor(Armor armor) {
            hero.armor = armor;
            return this;
        }

        public Builder withClazz(Clazz clazz) {
            hero.clazz = clazz;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            hero.weapon = weapon;
            return this;
        }

        public Hero build() {
            return hero;
        }
    }
}
