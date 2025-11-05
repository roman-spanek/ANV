package clean.code.example.refactor;

public abstract class Discount {
    protected Discount next;

    public void setNext(Discount next) { this.next = next; }
    public abstract double apply(double total);
}
