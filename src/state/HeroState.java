package state;

abstract class HeroState {
    public double getSpeedRatio(){
        return  1.0;
    }

    public double getAccuracyRate(){
        return  1.0;
    }
    public double getCriticalHitRate(){
        return  1.0;
    }
}
