package projetos.loja;

public class Produto {

    String name;
    double price;
    int quantity;

    public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }
    public Produto(String name) {
        this.name = name;
    }

    public Produto() {
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProductQuantity(int quantity){
        this.quantity+=quantity;
    }
    public void removeProductQuantity(int quantity){
        this.quantity-=quantity;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                String.format(", price=$%.2f", price) +
                ", quantity=" + quantity +
                String.format(", Total=$%.2f", totalValueInStock()) +
                '}';
    }
}
