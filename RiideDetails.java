import java.util.Scanner;

public class RiideDetails extends CarInformation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         final int charge=8;
         double total_charge;
         char cardriver;
         int min_dis=999999;
         String carname;
         Scanner sc=new Scanner(System.in);
         System.out.println("Customer ride distance: ");
         double distance=sc.nextDouble();
         System.out.println("car requested : ");
         carname=sc.next();
         RiideDetails r= new RiideDetails();
         r.CarInformation();
         for(int j=0;j<5;j++) {
        	 if(r.carmodel[j].equals(carname)&& r.rating[j]>=4) {
        		 if(min_dis > r.distance[j]) {
        			 min_dis = r.distance[j];
        			 cardriver=r.driver[j];
        			System.out.println("Driver "+cardriver+ "will get you to the destination");
        		 }
        	 }
         }
         total_charge = distance*8;
         System.out.println("Total charge is: "+total_charge);
	}

}