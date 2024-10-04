import java.util.Scanner;
import java.text.DecimalFormat;

class Fruitsale {

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.##");

    double strawberryPrice = 2.50;
    double strawberryDiscountPrice = 2.20;
    double applePrice = 2.80;
    double appleDiscountPrice = 2.50;
    double pearPrice = 2.20;
    double pearDiscountPrice = 2.10;

    double strawberrycost = 0;
    double applecost = 0;
    double pearcost = 0;

    System.out.println("Digite a quantidade em Kg de...");
    System.out.println("Morango: ");
    double strawberryQuantity = scanner.nextDouble();
    System.out.println("Maçã: ");
    double appleQuantity = scanner.nextDouble();
    System.out.println("Pêra: ");
    double pearQuantity = scanner.nextDouble();

    if(strawberryQuantity > 5){
      strawberrycost = strawberryPrice * strawberryDiscountPrice;
    } else if(strawberryQuantity <= 5 && strawberryQuantity >= 0){
      strawberrycost = strawberryPrice * strawberryQuantity;
    }
    
  }
}