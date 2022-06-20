public class TurkeyAdapter extends Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public void performFly() {
        for (int i = 0; i < 5; i++){
            this.turkey.fly();
        }
    }

    public void performQuack() {
        this.turkey.gobble();
    }
}
