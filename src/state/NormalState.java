package state;

public class NormalState extends HeroState {
    @Override
    public double getSpeedRatio() {
        return 1.0;
    }

    @Override
    public double getAccuracyRate() {
        return 0.9;
    }

    @Override
    public double getCriticalHitRate() {
        return 0.1;
    }
}
