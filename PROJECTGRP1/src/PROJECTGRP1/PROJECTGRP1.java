package PROJECTGRP1;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PROJECTGRP1 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

        
        //COLOR ON TEXTS\\
        final String Reset = "\u001B[0m";
        final String Green = "\u001B[32m";
        final String Red = "\u001B[31m";
        final String Yellow = "\u001B[33m";
        final String Blue = "\u001B[34m";
        final String Purple = "\u001B[35m";
        final String Cyan = "\u001B[36m"; 
        final String White = "\u001B[37m";
        
        //COLOR ON BACKGROUND\\
        final String Black_BG = "\u001B[40m";
        final String Blue_BG = "\u001B[44m";
        
        // LOADING SCREEN \\
        System.out.println(Red + Black_BG  + "  𝐍𝐨𝐰 𝐥𝐨𝐚𝐝𝐢𝐧𝐠. . .                                                                  ");
        for (int i = 0; i < 1; i++) {
            try {
                Thread.sleep(700); // Pause for half a second
                System.out.println(Red + Black_BG +"  𝟏𝟎%    ███▒▒▒▒▒▒▒▒▒                                                             ");
                Thread.sleep(700);
                System.out.println(Red + Black_BG +"  𝟐𝟎%    █████▒▒▒▒▒▒▒                                                             ");
                Thread.sleep(700);
                System.out.println(Red + Black_BG +"  𝟓𝟎%    ███████▒▒▒▒▒                                                             ");
                Thread.sleep(700);
                System.out.println(Red + Black_BG +"  𝟕𝟎%    █████████▒▒▒                                                             ");
                Thread.sleep(700);
                System.out.println(Red + Black_BG +"  𝟏𝟎𝟎%   ████████████                                                             ");
                Thread.sleep(700);
                System.out.println(Red + Black_BG +"  𝐂𝐨𝐦𝐩𝐥𝐞𝐭𝐞!                                                                        ");
                Thread.sleep(1000); 
                System.out.println("  •:•.•:•.•:•:•:•:•:•:•:••:•.•:•.•:•:•:•:•:•:•:••:•.•:•.•:•:•:•:•:•:•:••:•.••:•   \r\n"
       		         + "  .............................................................................   \r\n"
       		         + "               ☆ ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂✦ ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂ ☆                 \r\n"
       	             + "  .............................................................................   \r\n"
       		         + "  •:•.•:•.•:•:•:•:•:•:•:••:••:•.•:•.•:•:•:•:•:•:•:••:•.•:•.•:•:•:•:•:•:•:••:•.•   ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       
		
		// DO LOOP \\
		
        do {
        	try {
    		// MENU1 \\
                                                                                                                                                            
        	    System.out.print(Purple + Black_BG + "╔════════════════════════════════════════════════════════════════════════════════╗\n"
        	    		+ "║" + White + "`.      `(       ) )     .  (   .  )     (   )  ._     -*-   +    .     .=(`    " + Purple + "║\r\n"
        	    		+ "║" + White + "  )       ` __.:'   )      (   (   ))  .  `-'.-(`  )   .   (`  ).      :(       " + Purple + "║\r\n" 
        	    		+ "║" + White + ")  )  ( )       --'         `- __.'  -*-    :(      ))   (       '`.   `(       " + Purple + "║\r\n" 
        	    		+ "║" + White + ".-'  (_.'   .   +    .')    *     +    .    `(    )  ))  (         ) ) --` __.:'" + Purple + "║\r\n" 
        	    		+ "║" + White + "              .     (_  )         .      *    ` __.:'     ` __.:'-'             " + Purple + "║\r\n" 
        	    		+ "║" + White + "   .     +  " + Blue + "_ _ _ _____ __    _____ _____ _____ _____    _____ _____            " + Purple + "║\r\n"
        	    		+ "║" + Blue + "           | | | |   __|  |  |     |     |     |   __|  |_   _|     |" + White + "  .   +    " + Purple + "║\r\n" 
        	    		+ "║" + White + "        .  " + Blue + "| | | |   __|  |__|  ---|  |  | | | |   __|    | | |  |  |" + White + "       *" + Purple + "   ║\r\n"
        	    		+ "║           " + Blue + "|_____|_____|_____|_____|_____|_|_|_|_____|    |_| |_____|           " + Purple + "║\r\n" 
        	    		+ "║" + White + "  .                                                                       .     " + Purple + "║\r\n" 
        	    		+ "║" + White + "         +          " + Cyan + "= JAVA BASIC CALCULATION & CONVERTION =" + White + "       +             " + Purple + "║\r\n" 
        	    		+ "║" + White + "  *            .                                                                " + Purple + "║\r\n" 
        	    		+ "║" + White + "       -*-             .                 *             .             .      +   " + Purple + "║\r\n" 
        	    		+ "║                ┌──────────────────────────────────────────────┐                ║\r\n" 
        	    		+ "║" + White + "     *     ." + Purple + "    │         " + Yellow + "{1} Proceed to Calculator ₊˚" + Purple + "         │" + White + "  .     *       " + Purple + "║\r\n" 
        	    		+ "║                '----------------------------------------------'                ║\r\n"
        	    		+ "║                ┌──────────────────────────────────────────────┐                ║\r\n"
        	    		+ "║                │         " + Yellow + "{2} Proceed to Conversion ₊˚" + Purple + "         │                ║\r\n"
        	    		+ "║                '----------------------------------------------'                ║\r\n"
        	    		+ "║                ┌──────────────────────────────────────────────┐                ║\r\n"
        	    		+ "║" + Green + "       _-_      " + Purple + "│    " + Yellow + "{3} Proceed to Area & Circumference ₊˚" + Purple + "    │                ║\r\n"
        	    		+ "║" + Green + "    /~~   ~~\\   " + Purple + "'----------------------------------------------'                ║\r\n"
        	    		+ "║" + Green + " /~~         ~~\\" + Purple + "┌──────────────────────────────────────────────┐                ║\r\n"
        	    		+ "║" + Green + "{               " + Purple + "│      " + Yellow + "{4} Proceed to Area & Perimeter ₊˚" + Purple + "      │                ║\r\n"
        	    		+ "║" + Green + " \\  _-     -_  /" + Purple + "'----------------------------------------------'                ║\r\n"
        	    		+ "║" + Green + "   ~  " + Yellow + "\\\\ //" + Green + "  ~  " + Purple + "┌─────────────────────┐  " + Red + "┌─────────────────────┐                " + Purple + "║\r\n"
        	    		+ "║" + Green + "_- -   " + Yellow + "| |" + Green + " _- _" + Purple + " │    " + Yellow + "{5} Credits ₊˚" + Purple + "   │  " + Red + "│     {6} Exit ₊˚     │" + Green + "   _   -    _ - " + Purple + "║\r\n"
        	    		+ "║" + Green + "  _ -  " + Yellow + "| |" + Green + "   -_" + Purple + " '---------------------'  " + Red + "'---------------------'        " + Green + "~^      " + Purple + "║\r\n"
        	    		+ "║" + Green + "__ _ _" + Yellow + "// \\\\" + Green + "  _ ___/\\^.          ___ __ _/\\   -- _ _  _   __      .^/\\--___  -_  " + Purple + "║\r\n"
        	    		+ "║" + Green + "\\|/   -_      /\\__--                                   __--                    -" + Purple + "║\r\n"
        	    		+ "║" + Green + "   .-~^\"^-__                             \\|/                 -\"~\"-              " + Purple + "║\r\n"
        	    		+ "╚════════════════════════════════════════════════════════════════════════════════╝\r\n");
        		System.out.print(Black_BG + Purple + " │                                                                                \n"
		                  + " ╰┈┈┈ ➤ Type Here: " );
            choice = scanner.nextInt();  
            

            switch (choice) {
        // OPENS THE CALCULATOR \\
            case 1:
                calculator(scanner);
                break;
        // OPENS THE CONVERSION OF CM TO MM \\
            case 2:
            	conversion(scanner);
            	break;
       // OPENS A&C \\
            case 3:
            	aandc(scanner);
            	break;
            case 4:
            	aandp(scanner);
            	break;
            case 5:
            	credits(scanner);
            	break;
            case 6:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println(White + Blue_BG +"╔════════════════════════════════════════════════════════════════════════════════╗\r\n"
                		+ "║                                                                                ║\r\n"
                		+ "║     ██╗░░██╗                                                                   ║\r\n"
                		+ "║     ╚═╝░██╔╝                                                                   ║\r\n"
                		+ "║     ░░░██╔╝░                                                                   ║\r\n"
                		+ "║     ░░░╚██╗░                                                                   ║\r\n"
                		+ "║     ██╗░╚██╗                                                                   ║\r\n"
                		+ "║     ╚═╝░░╚═╝                                                                   ║\r\n"
                		+ "║                                                                                ║\r\n"
                		+ "║     I̴N̵V̴A̷L̸I̷D̴ ̷C̷H̶O̶I̴C̵E̶.̵ ̶P̶L̶E̸A̷S̵E̶ ̴T̵R̵Y̸ ̵A̴G̶A̶I̴N̴.̴                                          ║\r\n"
                		+ "║                                                                                ║\r\n"
                		+ "║     An error has occured. To continue:                                         ║\r\n"
                		+ "║     Press Enter to return                                                      ║\r\n"
                		+ "║                                                                                ║\r\n"
                		+ "║                                                                                ║\r\n"
                		+ "╚════════════════════════════════════════════════════════════════════════════════╝");
        		pressEnterToContinue();

        }
            
        } catch (InputMismatchException e) {
            System.out.println(White + Blue_BG +"╔════════════════════════════════════════════════════════════════════════════════╗\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║     ██╗░░██╗                                                                   ║\r\n"
            		+ "║     ╚═╝░██╔╝                                                                   ║\r\n"
            		+ "║     ░░░██╔╝░                                                                   ║\r\n"
            		+ "║     ░░░╚██╗░                                                                   ║\r\n"
            		+ "║     ██╗░╚██╗                                                                   ║\r\n"
            		+ "║     ╚═╝░░╚═╝                                                                   ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║     I̴N̵V̴A̷L̸I̷D̴ ̷C̷H̶O̶I̴C̵E̶.̵ ̶P̶L̶E̸A̷S̵E̶ ̴T̵R̵Y̸ ̵A̴G̶A̶I̴N̴.̴                                          ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║     An error has occured. To continue:                                         ║\r\n"
            		+ "║     Press Enter to return                                                      ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "╚════════════════════════════════════════════════════════════════════════════════╝");
    		pressEnterToContinue();
        	scanner.next();
        }     
    } while (choice != 6);

    scanner.close();
        
        
}			
        
	private static void credits(Scanner scanner) {
		double cm = 0, mm;
		
		// TODO Auto-generated method stub
	       //COLOR ON TEXTS\\
        final String Reset = "\u001B[0m";
        final String Green = "\u001B[32m";
        final String Black = "\u001B[30m";
        final String Red = "\u001B[31m";
        final String Yellow = "\u001B[33m";
        final String Blue = "\u001B[34m";
        final String Purple = "\u001B[35m";
        final String Cyan = "\u001B[36m"; 
        final String White = "\u001B[37m";
        
        //COLOR ON BACKGROUND\\
        final String Black_BG = "\u001B[40m";
        final String Red_BG = "\u001B[41m";
        final String Green_BG = "\u001B[42m";
        final String Yellow_BG = "\u001B[43m";
        final String Blue_BG = "\u001B[44m";
        final String Purple_BG = "\u001B[45m";
        final String Cyan_BG = "\u001B[46m";
        final String WHite_BG = "\u001B[47m";
  
        while (true) {
            System.out.println(Black_BG + Cyan +
                    "╔══════════════════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════════════════╗\r\n"
                            + "║   )       ` __.:'   )      (   (   ))  .  `-'.-(`  )   .   (`  ).        :(    ║\r\n"
                            + "║)  )  ( )       --'         `- __.'  -*-    :(      ))   (       ) )  __ `(     ║\r\n"
                            + "║.-'  (_.'    .   +       " + Green + "    _____           ___ __     " + Cyan + "   ` __.:'     `. `.` __.║\r\n"
                            + "║                   " + Green + "   ____  / ___/______ ___/ (_) /____   ____   " + Cyan + "  +   \"  |     ║\r\n"
                            + "║     +      .')  " + Green + "   /___/ / /__/ __/ -_) _  / / __(_-<  /___/       " + Cyan + "  /  .'     ║\r\n"
                            + "║    _     (_  )  " + Green + "  /___/  \\___/_/  \\__/\\_,_/_/\\__/___/ /___/      " + Cyan + "    `\"`       ║\r\n"
                            + "║  (`  ).                                                                .')     ║\r\n"
                            + "║ (     ).              _____________________________________   -*-     (_  )    ║\r\n"
                            + "║_(      '`.           @____________________________________/          ._        ║\r\n"
                            + "║(      .   )   +      │                                    │     -'.:(`  )      ║\r\n"
                            + "║ (..__.:'-'           │  " + Green + "  (\\ (\\                       " + Cyan + "    │     :(      ))     ║\r\n"
                            + "║    ) )               │   " + Green + " („• ֊ •„)                    " + Cyan + "   │     `(    )  ))    ║\r\n"
                            + "║_.:'   )      .       │   " + Green + "  ━O━O━━━━━━━━━━━━━━━━━━━━━   " + Cyan + "   │       ` __.:'      ║\r\n"
                            + "║                +     │   " + Green + "  ・:。Created by: GROUP 1 ・:   " + Cyan + "   │   *                ║\r\n"
                            + "║       .              │   " + Green + "  ━━━━━━━━━━━━━━━━━━━━━━━━━   " + Cyan + "   │                    ║\r\n"
                            + "║                      │                                    │                    ║\r\n"
                            + "║   +                  │   " + Green + "       [°'LEADERS'°]          " + Cyan + "   │         +       .  ║\r\n"
                            + "║              *       │   " + Green + "        • Castillo            " + Cyan + "   │                    ║\r\n"
                            + "║                      │   " + Green + "        • Mercado             " + Cyan + "   │ +                  ║\r\n"
                            + "║   -*-                │                                    │      .             ║\r\n"
                            + "║                      │   " + Green + "       [°'MEMBERS'°]          " + Cyan + "   │                    ║\r\n"
                            + "║                      │   " + Green + "        • Pasana              " + Cyan + "   │                    ║\r\n"
                            + "║                      │   " + Green + "        • Reyes               " + Cyan + "   │                    ║\r\n"
                            + "║                      │   " + Green + "        • Daza                " + Cyan + "   │                    ║\r\n"
                            + "║                      │   " + Green + "        • Buado               " + Cyan + "   │                    ║\r\n"
                            + "║                      │   " + Green + "        • Aldea               " + Cyan + "   │                    ║\r\n"
                            + "║                      │   " + Green + "        • Ambalan             " + Cyan + "   │                    ║\r\n"
                            + "║                      │   " + Green + "        • Aspe                " + Cyan + "   │                    ║\r\n"
                            + "║                      │                                    │                    ║\r\n"
                            + "║                     @/____________________________________/                    ║\r\n"
                            + "║                                                                                ║\r\n"
                            + "║                             " + Red + "{-1} Back to Main Menu ₊˚      " + Cyan + "                    ║\r\n"
                            + "║                                                                                ║\r\n"
                            + "║                                                                                ║\r\n"
                            + "╚════════════════════════════════════════════════════════════════════════════════╝");
            System.out.print(Black_BG + Cyan + " │                                                                                \n"
                    + " ╰┈┈┈ ➤ Type Here: ");
            
            try {
                int choice = scanner.nextInt();

                if (choice == -1) {
                    System.out.println("Returning to main menu...");
                    break;
                } else {
                    System.out.println("Invalid choice, please try again. Press Enter to Continue");
                    pressEnterToContinue();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number. Press Enter to Continue");
                scanner.nextLine();
                pressEnterToContinue();
            }
        }
    
  

		
		
	}

	private static void aandp(Scanner scanner) {
		// TODO Auto-generated method stub
		 // Create a Scanner object for user input
        //COLOR ON TEXTS\\
        final String Reset = "\u001B[0m";
        final String Green = "\u001B[32m";
        final String Black = "\u001B[30m";
        final String Red = "\u001B[31m";
        final String Yellow = "\u001B[33m";
        final String Blue = "\u001B[34m";
        final String Purple = "\u001B[35m";
        final String Cyan = "\u001B[36m"; 
        final String White = "\u001B[37m";
        
        //COLOR ON BACKGROUND\\
        final String Black_BG = "\u001B[40m";
        final String Red_BG = "\u001B[41m";
        final String Green_BG = "\u001B[42m";
        final String Yellow_BG = "\u001B[43m";
        final String Blue_BG = "\u001B[44m";
        final String Purple_BG = "\u001B[45m";
        final String Cyan_BG = "\u001B[46m";
        final String WHite_BG = "\u001B[47m";
		
        Scanner aandp = new Scanner(System.in);

        // Initialize variables
        int side = 0;
        int area = 0;
        int perimeter = 0;

        // Start the loop to repeatedly ask for user input
        do {
        System.out.println(Black_BG + Cyan + "\t          ╔══════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════╗              \r\n" 
                + "\t   ║‎" + Green + "        ˚₊‧꒰ა [Area & Perimeter of Square] ໒꒱‧₊˚     \t  " + Cyan + "‎   ║              \r\n"
                + "\t   ║   ‎" + Green + "                    ~ CALCULATOR ~         " + Cyan + "           ║              \r\n"
                + "\t   ║   ‎" + Green + "                                           " + Cyan + "           ║              \r\n"
                + "\t   ║ ‎" + Green + "  Note:                            " + Cyan + "                     ║              \r\n"
                + "\t   ║  " + Green + "   ‧˚꒰ -1꒱ Back to Menu ₊˚                      " + Cyan + "       ║              \n"
                + "\t   ║                                                         ║              \r\n"
                + "\t   ╚═════════════════════════════════════════════════════════╝              " + Reset);
        
        System.out.print(Black_BG + Cyan +"\t          ╔═════════════════════════════════════════════════════════╗              \n"
	        		+ Green + "\t              Enter the radius of the square: ");
            
            try {
                side = scanner.nextInt();

                // Exit condition when user enters -1
                if (side == -1) {
                	System.out.println(Black_BG + Cyan + "\t          ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄                  ");
                    System.out.println(Red + "\t                               Exiting program...                                                   ");
	                System.out.println(Cyan +"\t          ╚══════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════╝              \n");
                    break;
                }  
                if (side <= 0) {
                	System.out.println(Black_BG + Cyan + "\t          ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄                  ");
	                System.out.println(Blue +  "\t                   Radius cannot be negative. Try again.                                \n"                                                                                                                                                                                                                  
	                		         + Cyan +  "          ╚═════════════════════════════════════════════════════════╝              ");
	                continue;
                }

                // Calculate area and perimeter
                area = side * side;
                perimeter = 4 * side;

                System.out.println(Black_BG + Cyan + "\t          ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄                  ");
                System.out.println(Green + "\t              Area: " + area + "                                                          ");
                System.out.println(Green + "\t              Perimeter: " + perimeter + "                                                        ");
                System.out.println(Cyan + "\t          ╚══════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════╝               \n");

            } catch (InputMismatchException e) {
                
            	System.out.println(Black_BG + Cyan +"\t          ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄                  ");
                System.out.println(Blue + "\t                  Invalid input. Please enter a valid number.                          \n"
                		         + Cyan + "\t          ╚═════════════════════════════════════════════════════════╝              ");
              
                scanner.next(); 
            }
        } while (side != -1);

	}

	// Area & Circumference of a Circle \\
	private static void aandc(Scanner scanner) {
		
		
        //COLOR ON TEXTS\\
        final String Reset = "\u001B[0m";
        final String Green = "\u001B[32m";
        final String Black = "\u001B[30m";
        final String Red = "\u001B[31m";
        final String Yellow = "\u001B[33m";
        final String Blue = "\u001B[34m";
        final String Purple = "\u001B[35m";
        final String Cyan = "\u001B[36m"; 
        final String White = "\u001B[37m";
        
        //COLOR ON BACKGROUND\\
        final String Black_BG = "\u001B[40m";
        final String Red_BG = "\u001B[41m";
        final String Green_BG = "\u001B[42m";
        final String Yellow_BG = "\u001B[43m";
        final String Blue_BG = "\u001B[44m";
        final String Purple_BG = "\u001B[45m";
        final String Cyan_BG = "\u001B[46m";
        final String WHite_BG = "\u001B[47m";	
		
        double radius = 0;
        System.out.println(White + Black_BG + "  •:•.•:•.•:•:•:•:•:•:•:••:•.•:•.•:•:•:•:•:•:•:••:•.•:•.•:•:•:•:•:•:•:••:•.••:•     \r\n"
  		         + "  .............................................................................     \r\n"
  		         + "               ☆ ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂✦ ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂ ☆                   \r\n"
  	             + "  .............................................................................     \r\n"
  		         + "  •:•.•:•.•:•:•:•:•:•:•:••:••:•.•:•.•:•:•:•:•:•:•:••:•.•:•.•:•:•:•:•:•:•:••:•.•     \r\n"
  		         + "                                                                                     " + Reset);
        
        
        do {
        	  System.out.println(Black_BG + Cyan + "\t          ╔══════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════╗              \r\n" 
                      + "\t   ║‎" + Green + "        ˚₊‧꒰ა [Area & Circumference of a Circle] ໒꒱‧₊˚\t  " + Cyan + "‎   ║              \r\n"
                      + "\t   ║   ‎" + Green + "                    ~ CALCULATOR ~         " + Cyan + "           ║              \r\n"
                      + "\t   ║   ‎" + Green + "                                           " + Cyan + "           ║              \r\n"
                      + "\t   ║ ‎" + Green + "  Note:                            " + Cyan + "                     ║              \r\n"
                      + "\t   ║  " + Green + "   ‧˚꒰-1꒱ Back to Menu ₊˚         " + Cyan + "                     ║              \r\n"
                      + "\t   ║                                                         ║              \r\n"
                      + "\t   ╚═════════════════════════════════════════════════════════╝              " + Reset);
  	        System.out.print(Black_BG + Cyan +"\t          ╔═════════════════════════════════════════════════════════╗               \n"
	        		+ Green + "\t              Enter the radius of the circle: ");
            try {
                radius = scanner.nextDouble();

                if (radius == -1) {
                	System.out.println(Black_BG + Cyan + "\t          ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄                ");
                    System.out.println(Red + "\t                         Exiting Area & Circumference...                                                ");
	                System.out.println(Cyan +"\t          ╚══════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════╝             ");
	                System.out.println("                                                                                 ");

                    break;
                } else if (radius <=-2) {
                	System.out.println(Black_BG + Cyan + "\t          ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄                 ");
	                System.out.println(Blue +"\t              Radius cannot be negative. Try again.                               \r\n"                                                                                                                                                                                                                  
	                		         + Cyan +  "          ╚═════════════════════════════════════════════════════════╝             ");
					continue;
                }

                double area = calculateArea(radius);
                double circumference = calculateCircumference(radius);
               
                System.out.println(Black_BG + Cyan + "\t          ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄                  ");
                System.out.println(Yellow + "\t              Area: " + area + "                                             ");
                System.out.println(Yellow + "\t              Circumference: " + circumference + "                                   ");
                System.out.println(Cyan + "\t          ╚══════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════╝            ");
                System.out.println("                                                                                 ");
              
            } catch (InputMismatchException e) {
            	System.out.println(Black_BG + Cyan +"\t          ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄                  ");
                System.out.println(Blue + "\t                  Invalid input. Please enter a valid number.                           \n"
                		         + Cyan + "\t          ╚═════════════════════════════════════════════════════════╝               ");
                System.out.println("                                                                                 ");

                
                
                
                
                scanner.next(); 
            }
        } while (radius != -1);

	}
        
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;     
    }
        	  
        	  
 
		
	


	// CONVERSION CODE \\
	private static void conversion(Scanner scanner) {
        double cm = 0, mm;
        
        //COLOR ON TEXTS\\
        final String Reset = "\u001B[0m";
        final String Green = "\u001B[32m";
        final String Black = "\u001B[30m";
        final String Red = "\u001B[31m";
        final String Yellow = "\u001B[33m";
        final String Blue = "\u001B[34m";
        final String Purple = "\u001B[35m";
        final String Cyan = "\u001B[36m"; 
        final String White = "\u001B[37m";
        
        //COLOR ON BACKGROUND\\
        final String Black_BG = "\u001B[40m";
        final String Red_BG = "\u001B[41m";
        final String Green_BG = "\u001B[42m";
        final String Yellow_BG = "\u001B[43m";
        final String Blue_BG = "\u001B[44m";
        final String Purple_BG = "\u001B[45m";
        final String Cyan_BG = "\u001B[46m";
        final String WHite_BG = "\u001B[47m";	

        do {
            System.out.println(Black_BG + Cyan + "\t          ╔══════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════╗             \r\n" 
                    + "\t   ║‎" + Green + "                  ˚₊‧꒰ა [Conversion] ໒꒱‧₊˚\t  " + Cyan + "‎           ║             \r\n"
                    + "\t   ║   ‎" + Green + "                    ~ CM TO MM ~         " + Cyan + "             ║             \r\n"
                    + "\t   ║                                                         ║             ");
        	System.out.println(Black_BG + Cyan +"\t            ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄               ");
            System.out.println(Black_BG + Green+"\t             Enter the value in centimeters (or type -1 to exit):                 ");
            System.out.println(Black_BG + Cyan +"\t          ╚══════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════╝             ");
    		System.out.print( Black_BG + Cyan + "\t           ➤ Type Here:" );

            try {
                cm = scanner.nextDouble();

                if (cm != -1) {

                	mm = cm * 10; // Conversion: 1 cm = 10 mm
                    System.out.println(Black_BG + Cyan +"\t          ╔══════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════╗               ");
                    System.out.println(Black_BG + Yellow +"                          " + cm + " cm is equal to " + mm + " mm.                            ");
                    System.out.println(Black_BG + Cyan +"\t          ╚══════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════╝               ");
                    System.out.println(Black_BG       + "   ");
                }
            } catch (InputMismatchException e) {
            	System.out.println(Black_BG + Cyan +"\t          ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄                ");
                System.out.println(Black_BG + Blue +"\t                Invalid input. Please enter a numeric number.                    \n"
                		         +Black_BG + Cyan + "\t          ╚═════════════════════════════════════════════════════════╝            \n");
                scanner.next(); // Clear the invalid input
            }

        } while (cm != -1);
           
    	System.out.println(Black_BG + Cyan +"\t          ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠂⠄⠄⠂⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄                ");
        System.out.println(Black_BG + Red +"\t                            Exiting conversion...                                ");
        System.out.println(Black_BG + Cyan +"\t        ╚══════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════╝               \n");
    }

		
	


	// CALCULATOR CODE \\
	public static void calculator(Scanner scanner) {
    int operation = 0;
    double num1, num2, result;
    
    //COLOR ON TEXTS\\
    final String Reset = "\u001B[0m";
    final String Green = "\u001B[32m";
    final String Black = "\u001B[30m";
    final String Red = "\u001B[31m";
    final String Yellow = "\u001B[33m";
    final String Blue = "\u001B[34m";
    final String Purple = "\u001B[35m";
    final String Cyan = "\u001B[36m";
    final String White = "\u001B[37m";
    
    //COLOR ON BACKGROUND\\
    final String Black_BG = "\u001B[40m";
    final String Red_BG = "\u001B[41m";
    final String Green_BG = "\u001B[42m";
    final String Yellow_BG = "\u001B[43m";
    final String Blue_BG = "\u001B[44m";
    final String Purple_BG = "\u001B[45m";
    final String Cyan_BG = "\u001B[46m";
    final String WHite_BG = "\u001B[47m";

    do {
        try {
    		System.out.println(Black_BG + Cyan + "╔═════════════════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════════════════╗\r\n"
    				+ "║                                                                                ║\r\n"
    				+ "║ " + White + "                     ___      _         _      _                               " + Cyan + "║\r\n"
    				+ "║ " + White + "                    / __|__ _| |__ _  _| |__ _| |_ ___ _ _                     " + Cyan + "║\r\n"
    				+ "║ " + White + "                   | (__/ _` | / _| || | / _` |  _/ _ \\ '_|                    " + Cyan + "║\r\n"
    				+ "║ " + White + "                    \\___\\__,_|_\\__|\\_,_|_\\__,_|\\__\\___/_|                      " + Cyan + "║\r\n"
    				+ "║                                                                                " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                  .------------------------------------------,                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | .---------------------------------------, |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | |  " + Red + " CASIO                               " + Yellow + "| |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | | .-----------------------------------, | |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | | |                                   | | |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | | |" + Red + "  → NOTE:                          " + Yellow + "| | |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | | |" + Red + "     `˚{ 1} Addition ₊˚            " + Yellow + "| | |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | | |" + Red + "     `˚{ 2} Subtraction ₊˚         " + Yellow + "| | |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | | |" + Red + "     `˚{ 3} Multiplication ₊˚      " + Yellow + "| | |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | | |" + Red + "     `˚{ 4} Division ₊˚            " + Yellow + "| | |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | | |" + Red + "     `˚{-1} Exit ₊˚                " + Yellow + "| | |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | | |                                   | | |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | | `-----------------------------------' | |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | |                                       | |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 | `---------------------------------------' |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 |      {1}      {2}       {3}      {4}      |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 |    ┌─────┐  ┌─────┐   ┌─────┐  ┌─────┐    |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 |    │  +  │  │  -  │   │  x  │  │  ÷  │    |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 |    `-----'  `-----'   `-----'  `-----'    |                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                 |-------.________          ________,--------|                  " + Cyan + "║\r\n"
    				+ "║" + Yellow + "                                  `--------'                                    " + Cyan + "║\r\n"
    				+ "║                                                                                ║\r\n"
    				+ "╚════════════════════════════════════════════════════════════════════════════════╝" + Reset);
    		
    		System.out.print(Black_BG + Cyan + " │                                                                                \n"
    				                  + " ╰┈┈┈ ➤ Type Here: " );
        operation = scanner.nextInt();
        
        
        if (operation >= 1 && operation <= 4) {
        	System.out.println(Black_BG + Cyan + "╔════════════════════════════════════════════════════════════════════════════════╗" + Reset);
            System.out.print(Black_BG + Yellow + "    Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print(Black_BG + Yellow + "    Enter second number: " );
            num2 = scanner.nextDouble();
            System.out.println(Black_BG + Cyan + "╚════════════════════════════════════════════════════════════════════════════════╝" + Reset);

            switch (operation) {
                case 1:
                    result = num1 + num2;
                    System.out.println(Black_BG + Cyan + "╔════════════════════════════════════════════════════════════════════════════════╗\r\n"
                    		+ "║                                                                                ║\r\n"
                    		+ "║" + Yellow + "                  .------------------------------------------,                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | .---------------------------------------, |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | |  Casio                                | |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | | .-----------------------------------, | |                  " + Cyan + "║\r\n"
                    		+ "○" + Yellow + "                 | | |                                   | | |                  " + Cyan + "○\r\n"
                    		+ Red + "                        " + num1 + " + " + num2 +" \r\n" + Cyan
                    		+ "║" + Yellow + "                 | | |───────────────────────────────────| | |                  " + Cyan + "║\r\n"
                    		+ Red + "                        The sum is " + result + " \r\n" + Cyan
                    		+ "○" + Yellow + "                 | | |                                   | | |                  " + Cyan + "○\r\n"
                    		+ "║" + Yellow + "                 | | `-----------------------------------' | |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | |                                       | |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | `---------------------------------------' |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |      {1}      {2}       {3}      {4}      |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |    ┌─────┐  ┌─────┐   ┌─────┐  ┌─────┐    |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |    │  +  │  │  -  │   │  x  │  │  ÷  │    |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |    `-----'  `-----'   `-----'  `-----'    |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |-------.________          ________,--------|                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                                  `--------'                                    " + Cyan + "║\r\n"
                    		+ "║                                                                                ║\r\n"
                    		+ "╚═════════════════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════════════════╝");
            		pressEnterToContinue();
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println(Black_BG + Cyan + "╔════════════════════════════════════════════════════════════════════════════════╗\r\n"
                    		+ "║                                                                                ║\r\n"
                    		+ "║" + Yellow + "                  .------------------------------------------,                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | .---------------------------------------, |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | |  Casio                                | |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | | .-----------------------------------, | |                  " + Cyan + "║\r\n"
                    		+ "○" + Yellow + "                 | | |                                   | | |                  " + Cyan + "○\r\n"
                    		+ Red + "                        " + num1 + " + " + num2 +" \r\n" + Cyan 
                    		+ "║" + Yellow + "                 | | |───────────────────────────────────| | |                  " + Cyan + "║\r\n"
                    		+ Red + "                        The difference is " + result + " \r\n"  + Cyan 
                    		+ "○" + Yellow + "                 | | |                                   | | |                  " + Cyan + "○\r\n"
                    		+ "║" + Yellow + "                 | | `-----------------------------------' | |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | |                                       | |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | `---------------------------------------' |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |      {1}      {2}       {3}      {4}      |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |    ┌─────┐  ┌─────┐   ┌─────┐  ┌─────┐    |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |    │  +  │  │  -  │   │  x  │  │  ÷  │    |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |    `-----'  `-----'   `-----'  `-----'    |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |-------.________          ________,--------|                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                                  `--------'                                    " + Cyan + "║\r\n"
                    		+ "║                                                                                ║\r\n"
                    		+ "╚═════════════════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════════════════╝");
            		pressEnterToContinue();
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println(Black_BG + Cyan + "╔════════════════════════════════════════════════════════════════════════════════╗\r\n"
                    		+ "║                                                                                ║\r\n"
                    		+ "║" + Yellow + "                  .------------------------------------------,                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | .---------------------------------------, |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | |  Casio                                | |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | | .-----------------------------------, | |                  " + Cyan + "║\r\n"
                    		+ "○" + Yellow + "                 | | |                                   | | |                  " + Cyan + "○\r\n"
                    		+ Red + "                        " + num1 + " + " + num2 +" \r\n" + Cyan
                    		+ "║" + Yellow + "                 | | |───────────────────────────────────| | |                  " + Cyan + "║\r\n"
                    		+ Red + "                        The product is " + result + " \r\n" + Cyan
                    		+ "○" + Yellow + "                 | | |                                   | | |                  " + Cyan + "○\r\n"
                    		+ "║" + Yellow + "                 | | `-----------------------------------' | |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | |                                       | |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 | `---------------------------------------' |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |      {1}      {2}       {3}      {4}      |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |    ┌─────┐  ┌─────┐   ┌─────┐  ┌─────┐    |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |    │  +  │  │  -  │   │  x  │  │  ÷  │    |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |    `-----'  `-----'   `-----'  `-----'    |                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                 |-------.________          ________,--------|                  " + Cyan + "║\r\n"
                    		+ "║" + Yellow + "                                  `--------'                                    " + Cyan + "║\r\n"
                    		+ "║                                                                                ║\r\n"
                    		+ "╚═════════════════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════════════════╝");
            		pressEnterToContinue();
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
	                    System.out.println(Black_BG + Cyan + "╔════════════════════════════════════════════════════════════════════════════════╗\r\n"
	                    		+ "║                                                                                ║\r\n"
	                    		+ "║" + Yellow + "                  .------------------------------------------,                  " + Cyan + "║\r\n"
	                    		+ "║" + Yellow + "                 | .---------------------------------------, |                  " + Cyan + "║\r\n"
	                    		+ "║" + Yellow + "                 | |  Casio                                | |                  " + Cyan + "║\r\n"
	                    		+ "║" + Yellow + "                 | | .-----------------------------------, | |                  " + Cyan + "║\r\n"
	                    		+ "○" + Yellow + "                 | | |                                   | | |                  " + Cyan + "○\r\n"
	                    		+ Red + "                        " + num1 + " + " + num2 +" \r\n" + Cyan
	                    		+ "║" + Yellow + "                 | | |───────────────────────────────────| | |                  " + Cyan + "║\r\n"
	                    		+ Red + "                        The quotient is " + result + " \r\n" + Cyan
	                    		+ "○" + Yellow + "                 | | |                                   | | |                  " + Cyan + "○\r\n"
	                    		+ "║" + Yellow + "                 | | `-----------------------------------' | |                  " + Cyan + "║\r\n"
	                    		+ "║" + Yellow + "                 | |                                       | |                  " + Cyan + "║\r\n"
	                    		+ "║" + Yellow + "                 | `---------------------------------------' |                  " + Cyan + "║\r\n"
	                    		+ "║" + Yellow + "                 |      {1}      {2}       {3}      {4}      |                  " + Cyan + "║\r\n"
	                    		+ "║" + Yellow + "                 |    ┌─────┐  ┌─────┐   ┌─────┐  ┌─────┐    |                  " + Cyan + "║\r\n"
	                    		+ "║" + Yellow + "                 |    │  +  │  │  -  │   │  x  │  │  ÷  │    |                  " + Cyan + "║\r\n"
	                    		+ "║" + Yellow + "                 |    `-----'  `-----'   `-----'  `-----'    |                  " + Cyan + "║\r\n"
	                    		+ "║" + Yellow + "                 |-------.________          ________,--------|                  " + Cyan + "║\r\n"
	                    		+ "║" + Yellow + "                                  `--------'                                    " + Cyan + "║\r\n"
	                    		+ "║                                                                                ║\r\n"
	                    		+ "╚═════════════════════════════*.·:·.☽✧  ✦  ✧☾.·:·.*══════════════════════════════╝");
                		pressEnterToContinue();
                        
                    } else {
                        System.out.println(Blue_BG + White + "╔════════════════════════════════════════════════════════════════════════════════╗\r\n"
                        		+ "║                                                                                ║\r\n"
                        		+ "║     ██╗░░██╗                                                                   ║\r\n"
                        		+ "║     ╚═╝░██╔╝                                                                   ║\r\n"
                        		+ "║     ░░░██╔╝░                                                                   ║\r\n"
                        		+ "║     ░░░╚██╗░                                                                   ║\r\n"
                        		+ "║     ██╗░╚██╗                                                                   ║\r\n"
                        		+ "║     ╚═╝░░╚═╝                                                                   ║\r\n"
                        		+ "║                                                                                ║\r\n"
                        		+ "║     C̵A̶N̶N̴O̵T̸ ̴D̷I̵V̵I̶D̴E̶ ̶B̸Y̵ ̷Z̸E̷R̷O̸                                                      ║\r\n"
                        		+ "║                                                                                ║\r\n"
                        		+ "║     An error has occured. To continue:                                         ║\r\n"
                        		+ "║     Press Enter to return to calculator.                                       ║\r\n"
                        		+ "║                                                                                ║\r\n"
                        		+ "║                                                                                ║\r\n"
                        		+ "╚════════════════════════════════════════════════════════════════════════════════╝");
                		pressEnterToContinue();

                    }
                    break;
            }
        } else if (operation != -1) {
            System.out.println(Blue_BG + White + "╔════════════════════════════════════════════════════════════════════════════════╗\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║     ██╗░░██╗  ░░██╗██╗░█████╗░░░██╗██╗                                         ║\r\n"
            		+ "║     ╚═╝░██╔╝  ░██╔╝██║██╔══██╗░██╔╝██║                                         ║\r\n"
            		+ "║     ░░░██╔╝░  ██╔╝░██║██║░░██║██╔╝░██║                                         ║\r\n"
            		+ "║     ░░░╚██╗░  ███████║██║░░██║███████║                                         ║\r\n"
            		+ "║     ██╗░╚██╗  ╚════██║╚█████╔╝╚════██║                                         ║\r\n"
            		+ "║     ╚═╝░░╚═╝  ░░░░░╚═╝░╚════╝░░░░░░╚═╝                                         ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║     I̶N̶V̶A̸L̸I̷D̴ ̴O̵P̴E̷R̸A̶T̸I̵O̷N̴.̵ ̷P̴L̷E̶A̵S̴E̸ ̸T̷R̸Y̸ ̷A̵G̷A̴I̴N̸.̴                                       ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║     An error has occured. To continue:                                         ║\r\n"
            		+ "║     Press Enter to return to calculator.                                       ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "╚════════════════════════════════════════════════════════════════════════════════╝");
    		pressEnterToContinue();
        }
        
        } catch (InputMismatchException e) {
            System.out.println(Blue_BG + White + "╔════════════════════════════════════════════════════════════════════════════════╗\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║     ██╗░░██╗  ░░██╗██╗░█████╗░░░██╗██╗                                         ║\r\n"
            		+ "║     ╚═╝░██╔╝  ░██╔╝██║██╔══██╗░██╔╝██║                                         ║\r\n"
            		+ "║     ░░░██╔╝░  ██╔╝░██║██║░░██║██╔╝░██║                                         ║\r\n"
            		+ "║     ░░░╚██╗░  ███████║██║░░██║███████║                                         ║\r\n"
            		+ "║     ██╗░╚██╗  ╚════██║╚█████╔╝╚════██║                                         ║\r\n"
            		+ "║     ╚═╝░░╚═╝  ░░░░░╚═╝░╚════╝░░░░░░╚═╝                                         ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║     I̸N̴V̸A̸L̶I̸D̵ ̸I̵N̶P̴U̴T̷.̶ ̴P̶L̸E̴A̵S̶E̴ ̵E̷N̶T̵E̷R̴ ̸A̷ ̴N̶U̶M̴E̸R̵I̷C̵ ̵V̵A̷L̸U̵E̵.̸                               ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║      An error has occured. To continue:                                        ║\r\n"
            		+ "║      Press Enter to return to calculator.                                      ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "║                                                                                ║\r\n"
            		+ "╚════════════════════════════════════════════════════════════════════════════════╝");
    		pressEnterToContinue();
    		
            scanner.next();
        }

    } while (operation != -1);
    
    System.out.println("Exiting Calculator...");
    
}
	
    private static void pressEnterToContinue() {
        { 
               System.out.print("Press Enter key to continue...");
               try
               {
                   System.in.read();
               }  
               catch(Exception e)
               {}  
        }
    	   

}


}




	

		
