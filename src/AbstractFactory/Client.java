/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
class Client {

    DevicesFactory technology;

    public void selectTechnology(DevicesFactory df) {
        technology = df;
    }

    public void test(String song) {
        Media media = technology.createMedia();
        Recorder recorder = technology.createRecorder();
        Player player = technology.createPlayer();
        recorder.accept(media);
        System.out.println("Recording the song : " + song);
        recorder.record(song);
        System.out.println("Listening the record:");
        player.accept(media);
        player.play();
    }
}
