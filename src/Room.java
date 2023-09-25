public class Room {
    String intro;

    public Room (String intro){
        this.intro = intro;
    }
    public void playIntro() {
        System.out.print (this.intro);
    }
}
