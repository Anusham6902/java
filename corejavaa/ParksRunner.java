public class ParksRunner{
	public static void main(String[] args) {
        Parks park = new Parks();
        park.isParkOpen("Saturday");
        park.hasFacility("Playground");
        park.calculateArea(50, 30);
        int[] treeCounts = {20, 30, 50, 10};
        park.checkTreeCount(treeCounts);
    }
}