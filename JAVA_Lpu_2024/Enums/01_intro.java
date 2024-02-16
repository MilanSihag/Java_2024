package Enums;
enum Game{
    EASY,
    MEDIUM,
    HARD
}
class intro {
    public static void main(String[] args){
        Game g1 = Game.EASY;
        System.out.println(g1);
        switch (g1) {
            case EASY:
                System.out.println("easy");
                break;
            case MEDIUM:
                System.out.println("medium");
                break;
            case HARD:
                System.out.println("hard");
                break;
            default:
                break;
        }
    }
}
