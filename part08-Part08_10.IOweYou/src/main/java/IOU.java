import java.util.HashMap;

public class IOU {
    
    private HashMap<String, Double> ious;
    
    public IOU() {
        this.ious = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        if(ious.containsKey(toWhom)) {
            double newAmount = ious.get(toWhom) + amount;
            ious.put(toWhom, newAmount);
            return;
        }
        
        ious.put(toWhom, amount);
        
        
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.ious.getOrDefault(toWhom, 0.0);
    }
    
}
