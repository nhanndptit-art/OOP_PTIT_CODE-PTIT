package Hoctrenlop.baitap.thiet_bi_nhieu_vai_tro;

public class SmartPhone implements MusicPlayer, Camera {
    @Override 
    public void phatNhac() {
        System.out.println("playing Music");
    }
    @Override 
    public void takePhoto() {
        System.out.println("taked Photo");
    }
}
