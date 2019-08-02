//questions 8-9-10-11-12-13
package bolum01;


public class JAVAC1_S_8_9_10_11_12_13 {
        public static void main(String[] args) {
            System.out.println("Area and perimeter of a circle: ");
            System.out.println("Perimeter is " + (2 * 6.5 * 3.14159));
            System.out.println("Area is " + (6.5 * 6.5 * 3.14159));
        
            System.out.println();
        
            System.out.println("area : " + (5.3*8.6));
            System.out.println("perimeter : " + (2*(5.3+8.6)));
            
            System.out.println();
            
            System.out.println("Average speed in miles: ");
            System.out.println((1/50.5) * 60 * 15/1.6);
            
            System.out.println("Average speed in kilometers: ");
            System.out.println(24 / (1 + (45 + 30.0 / 60) / 60) * 1.6);
            
            
            System.out.println();

            //Question11
            
            double numberOfBirthInSeconds  = 7.0;
            double numberOfDeathInSeconds  = 13.0;
            double numberOfImmigrantInSeconds = 45.0;
            
            double currentPopulation = 3_120_324_86;
            
            double secondsInYear = 60 * 60 * 24 * 365;
            
            double numberOfBirthInYear = secondsInYear / numberOfBirthInSeconds; 
            double numberOfDeathInYear = secondsInYear / numberOfDeathInSeconds;
            double numberOfImmigrantInYear = secondsInYear / numberOfImmigrantInSeconds;
            
            currentPopulation = currentPopulation + numberOfBirthInYear + numberOfImmigrantInYear + numberOfDeathInYear;
            System.out.println("Population of fifth year: " + (int)(currentPopulation * 5));
            
            
            System.out.println();
          
            
            System.out.println();
            
            System.out.println("y: " + ((3.4*5.9)-(44.5*2.1)) / ((3.4*5.5)-(50.2*2.1)));
            System.out.println("x: " + ((44.5*5.5) - (50.2*5.9)) / ((3.4*5.5) - (50.2*2.1)));
        
            System.out.println();
        
            System.out.println(120*365*24*5);
        
        
        
        
        
        }
}
