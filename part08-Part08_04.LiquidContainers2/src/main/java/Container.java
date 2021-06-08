
public class Container {

    private int quantity;

    public Container() {
        this.quantity = 0;
    }

    public void add(int number) {
        if (number > 0) {
            this.quantity += number;
            if (this.quantity > 100) {
                this.quantity = 100;
            }
        }
    }
    
    public void remove(int number) {
        if (number > 0) {
            this.quantity -= number;
            if (this.quantity < 0) {
                this.quantity = 0;
            }
        }
    }
    
    public int contains() {
        return this.quantity;
    }
    
    public String toString() {
        return this.quantity +"/100";
    }
}
