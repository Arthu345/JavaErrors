public class EasyIf {


    public int horses = 1, pigs = 2, sheeps = 3, cows = 4, ducks = 5;
    public boolean duckysTasteGood = false;

    public void easy() {
        
        if(duckysTasteGood) {
            eatDucks();
         else {
            eatAll();
            if(ducks == 5)
                System.out.println("You saved some ducks!");
            }
        }

    }

    public void eatDucks() {
        ducks = 0;
        System.out.println("please stop eating ducks!");
    }

    public void eatAll() {
        horses = 0;
        pigs = 0;
        sheeps = 0;
        cows = 0;
    }

}
