package factory.buttons;

public class AndroidButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changing size from Android button");
    }
}
