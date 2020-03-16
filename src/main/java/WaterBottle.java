public class WaterBottle {
        private int volume;

    public WaterBottle(int volume){
        this.volume=volume;
    }

    public int checkVolume(){
        return this.volume;
    }

    public int drinkWater(){
        this.volume=this.volume -10;
        return this.volume;
    }
    public int emptyBottle(){
        this.volume=0;
        return this.volume;
    }
    public int refillBottle(){
        this.volume=100;
        return this.volume;
    }
}
