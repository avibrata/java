package interfaace;

public interface Player {
    public void play();
    public void stop();
    public void pause();
    public void reverse();


}
class cdPlayer implements Player{
    public void audio(){
        System.out.println("can be play audio");

    }

    @Override
    public void play() {
        System.out.println("it can play");
    }

    @Override
    public void stop() {
        System.out.println("it can stop");
    }

    @Override
    public void pause() {
        System.out.println("it can pause");
    }

    @Override
    public void reverse() {
        System.out.println("it can reverse");
    }
}
class dvdPlayer implements Player{
    public void video(){
        System.out.println("It can play video");
    }

    @Override
    public void play() {
        System.out.println("");
    }

    @Override
    public void stop() {
        System.out.println();
    }

    @Override
    public void pause() {
        System.out.println();
    }

    @Override
    public void reverse() {
        System.out.println();
    }
}

