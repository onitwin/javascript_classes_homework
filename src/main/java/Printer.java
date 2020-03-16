public class Printer {
    private int pagesLeft;
    private int tonerVolume;
    private int total;

    public Printer( int pagesLeft,int tonerVolume){
        this.pagesLeft=pagesLeft;
        this.tonerVolume=tonerVolume;
    }

    public int printPages(int numberOfPages, int numberOfCopies){
        int total=numberOfPages*numberOfCopies;
        if(total >= this.pagesLeft) {
            this.pagesLeft = this.pagesLeft - total;
            this.tonerVolume = this.tonerVolume - total;
        }
        return this.pagesLeft;
    }

}
