Skip to content
Search or jump to…
Pull requests
Issues
Marketplace
Explore
 
@Dumbrafia 
Dumbrafia
/
LabTask
Public
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
Settings
LabTask/BuildingTest.java /
@Dumbrafia
Dumbrafia Add files via upload
Latest commit dd5d04a 12 minutes ago
 History
 1 contributor
29 lines (21 sloc)  907 Bytes


package labday8;

import java.util.Scanner;
 
public class BuildingTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of floors: ");
        int f1 = input.nextInt();
        System.out.println("Enter no. of flats: ");
        int f2 = input.nextInt();
        System.out.println("Enter no. of doors: ");
        int d = input.nextInt();
  
        Building b = new Building();
        b.set_number_of_floors(f1);
        b.set_number_of_flat(f2);
        b.set_number_of_doors_per_flat(d);
        
        System.out.println("No. of floors: "+b.get_floors());
        System.out.println("No. of floors: "+b.get_flats());
        System.out.println("No. of floors: "+b.get_number_of_doors_per_flat());
        b.calculate_total_number_of_door_in_building();
        
    }
    
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
