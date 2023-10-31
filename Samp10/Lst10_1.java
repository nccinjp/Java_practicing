package Samp10;

public class Lst10_1 {
    public static void main(String[] args){
        // IUsb型に Mouseクラスのオブジェクトが代入できる
        IUsb device1 = new Mouse();

        // IUsb型に Printerクラスのオブジェクトが代入できる
        IUsb device2 = new Printer();

        Pc pc = new Pc();
        pc.actionxxx(device1);
        pc.actionxxx(device2);

    }
}
