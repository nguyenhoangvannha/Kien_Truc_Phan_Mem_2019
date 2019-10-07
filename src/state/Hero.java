package state;

class Hero {

    private HeroState[] heroStates = new HeroState[]{
            new NormalState(), new InjuredState(), new DyingState()
    };
    private HeroState currentState = heroStates[0];

    double baseSpeed = 10;
    double baseAccuracy = 5;
    private double criticalHitRate = 0.1;
    private double hitPoints = 256;
    private double maxHP = 256;

    double speed() {
        return currentState.getSpeedRatio() * baseSpeed;
    }

    double accuracy() {
        return currentState.getAccuracyRate() * baseAccuracy;
    }

    double criticalHitRate() {
        return currentState.getCriticalHitRate() * criticalHitRate;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = Math.max(0, Math.min(hitPoints, maxHP));
        double r = hitPoints / maxHP;
        UpdateStateIfRequired(r);
    }

    private void UpdateStateIfRequired(double r) {
        if (r >= 0.8)
            currentState = heroStates[0];
        else if (r >= 0.4) {
            currentState = heroStates[1];
        } else {
            currentState = heroStates[2];
        }
    }

    public double getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(double maxHP) {
        this.maxHP = maxHP;
    }
}