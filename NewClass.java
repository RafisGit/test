
package test1;

public class NewClass {
    public static void main(String[] args){
        String name="Rafi Haque";
        String lower=name.toLowerCase();
        System.out.println("lowercase= "+lower);
        String replace=name.replace(" ", "_");
        System.out.println("Replace= "+replace);
        String sentence="Dear name.thanks a lot";
        String replace1=sentence.replace("name", "Rafi");
        System.out.println("Replace1= "+replace1);
        
        String DTtest="Rafi   Haque  Rider";
   
         boolean tripletest= DTtest.contains("   ");
         System.out.println("The string contain triple space "+tripletest);
         
         boolean doubletest=DTtest.contains("  ");
         System.out.println("The string contain double space "+doubletest);
         
         
         System.out.println(" “Dear\tHarry,\tThis\tJava\tCourse\tis\tnice.\tThanks”");
        
        
        
    }
    
}
