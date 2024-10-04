import java.util.Scanner;
import java.text.DecimalFormat;

class Fruitsale {

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    double strawberryPrice = 2.50;
    double strawberryDiscountPrice = 2.20;
    double applePrice = 2.80;
    double appleDiscountPrice = 2.50;
    double pearPrice = 2.20;
    double pearDiscountPrice = 2.10;

    double strawberryCost = 0;
    double appleCost = 0;
    double pearCost = 0;
    double totalCost = 0;

    System.out.println("Digite a quantidade em Kg de...");
    System.out.println("Morango: ");
    double strawberryQuantity = scanner.nextDouble();
    System.out.println("Maçã: ");
    double appleQuantity = scanner.nextDouble();
    System.out.println("Pêra: ");
    double pearQuantity = scanner.nextDouble();

    if(strawberryQuantity > 5){
      strawberryCost = strawberryQuantity * strawberryDiscountPrice;
    } else if(strawberryQuantity <= 5 && strawberryQuantity >= 0){
      strawberryCost = strawberryQuantity * strawberryPrice;
    }

    if(appleQuantity > 5){
      appleCost = appleQuantity * appleDiscountPrice;
    } else if(appleQuantity <= 5 && appleQuantity >= 0){
      appleCost = appleQuantity * applePrice;
    }

    if(pearQuantity > 5){
      pearCost = pearQuantity * pearDiscountPrice;
    } else if(pearQuantity <= 5 && pearQuantity >= 0){
      pearCost = pearQuantity * pearPrice;
    }

    boolean isStrawberryGreaterThan8 = strawberryQuantity > 8;
    boolean isAppleGreaterThan8 = appleQuantity > 8;
    boolean isPearGreaterThan8 = pearQuantity > 8;
    
    boolean isStrawberryCostGreaterThan25 = strawberryCost > 25;
    boolean isAppleCostGreaterThan25 = appleCost > 25;
    boolean isPearCostGreaterThan25 = pearCost > 25;

    boolean shouldReceiveMoreDiscounts = 
      isStrawberryGreaterThan8 && 
      isAppleGreaterThan8 && 
      isPearGreaterThan8 && 
      isStrawberryCostGreaterThan25 && 
      isAppleCostGreaterThan25 && 
      isPearCostGreaterThan25;
    
    if(shouldReceiveMoreDiscounts){
      strawberryCost = strawberryCost * 0.95;
      appleCost = appleCost * 0.95;
      pearCost = pearCost * 0.95;
    }
    
    totalCost = strawberryCost + appleCost + pearCost;
  
    String printingFinalResult = "RESULTADO DA COMPRA \n \n";
    printingFinalResult += "Morango: R$ " + df.format(strawberryCost) + " \n";
    printingFinalResult += "Maçã: R$ " + df.format(appleCost) + " \n";
    printingFinalResult += "Pêra: R$ " + df.format(pearCost) + " \n";
    printingFinalResult += "_______________ \n";
    printingFinalResult += "Total: R$ " + df.format(totalCost);

    System.out.println(printingFinalResult);
    
  }
}