package Chapter3;

class Gear{
    int chainRing, cog;

    Gear(int chainRing, int cog) {
        this.chainRing = chainRing;
        this.cog = cog;
    }

    int ratio() {
        return chainRing/cog;
    }

    int gear_inches(int diameter) {
        return ratio() * diameter;
    }
}

class Wheel3 {
    int rim, tire;
    Gear gear;

    Wheel(int rim, int tire, int chainRing, int cog) {
        this.rim = rim;
        this.tire = tire;
        this.gear3 = new Gear(chainRing, cog);
    }

    int diameter() {
        return rim + (tire * 2);
    }

    int gear_inches() {
        return gear.gear_inches(diameter());
    }
}
