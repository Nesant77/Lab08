import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        int birthYear=SafeInput.getRangedInt(pipe, "Enter your year of birth",1949,2011);
        System.out.println("Year of birth:" + birthYear);

        int birthMonth=SafeInput.getRangedInt(pipe, "Enter your month of birth",0,13);
        System.out.println("Month of birth:" + birthMonth);

        int birthDay=0;

        switch(birthMonth)
        {
            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:birthDay=SafeInput.getRangedInt(pipe, "Enter your day of birth",0,32);break;

            case 2:birthDay=SafeInput.getRangedInt(pipe, "Enter your day of birth",0,30);break;

            default:birthDay=SafeInput.getRangedInt(pipe, "Enter your day of birth",0,31);break;}

        System.out.println("Day of birth:" + birthDay);

        int birthHour=SafeInput.getRangedInt(pipe, "Enter your hour of birth",0,25);
        System.out.println("Hour of birth:" + birthHour);

        int birthMin=SafeInput.getRangedInt(pipe, "Enter your minute of birth",0,60);
        System.out.println("Minute of birth:" + birthMin);

    }


}
