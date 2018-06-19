public class Product
{
private String name;
private int stockLevel;
private double price;

public Product (String namein, int StockIn, double pricein)
{
this.name = namein;
this.stockLevel = StockIn;
this.price=pricein;
}
public void reStock (int stockLevelin)
{
this.stockLevel = stockLevelin + stockLevel;
}
public double sell (int itemsSold)
{
if (itemsSold <= stockLevel)
{
this.stockLevel = stockLevel - itemsSold;
double totalprice = itemsSold * price;
return totalprice; 
}
else
{
return 0.0; 
}
}
public void setPrice (double pricein)
{
price = pricein;
}
public String getName()
{
return name;
}
public int getStockLevel()
{
return stockLevel;
}
public double getPrice()
{
return price;
}
}