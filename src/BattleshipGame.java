public class BattleshipGame {
    public static void main(String[] args) {
        //Welcome message
        //While loop til at starte spillet
        //Placer skibet
        //Kald checkHit

        System.out.println("==Welcome Captain!==");
        System.out.println("The enemy ship is hiding in positions 0-6!");
        System.out.println("Sink it by hitting all 3 cells!");

        //battleshipGame();

    }

    public battleshipGame(){
        boolean finished = false;

        while(!finished){
            GameHelper.userInput();
            Ship.checkHit();

            if(Ship.isSunk){
                finished = false;
            }else{
                finished = true;
            }
        }
    }
}
