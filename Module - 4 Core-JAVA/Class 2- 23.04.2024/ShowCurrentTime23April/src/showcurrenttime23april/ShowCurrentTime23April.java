
package showcurrenttime23april;

public class ShowCurrentTime23April {

    
    public static void main(String[] args) {
        //Show Current System Time
        long miliseconds=System.currentTimeMillis();
        long tSeconds=miliseconds/1000;
        long cSeconds=tSeconds%60;
        long tMinutes=tSeconds/60;
        long cMinute=tMinutes%60;
        long tHours=(tMinutes/60)+6;
        long cHour=tHours%24;
        System.out.println("Current time is " + cHour + ":" + cMinute + ":" + cSeconds + " GMT+6");
        
        
    }
    
}
