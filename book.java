import java.util.Scanner;

class Booking 
{
	static int lastTicketId = 124;
    int ticketId;
    String PassengerName;
    int age;
    String mo_no;
    String source;
    String destination;
	double kms;
	double price;
    Scanner sc = new Scanner(System.in);

    
    Booking() 
    {
      this.ticketId = ++lastTicketId;
    }

    Booking( String PassengerName, int age, String mo_no, String source, String destination,double kms) 
    {
        this.ticketId = ++lastTicketId;
        this.PassengerName = PassengerName;
        this.age = age;
        this.mo_no = mo_no;
        this.source = source;
        this.destination = destination;
		this.kms=kms;
    }

    void BookTicket() 
    {
         System.out.println("Your Ticket ID: " + ticketId);  
        
        System.out.println("Enter PassengerName:");
        PassengerName = sc.nextLine();
        
        System.out.println("Enter age:");
        age = sc.nextInt();
        sc.nextLine();  
        
          do 
		  {
             System.out.println("Enter Mobile Number (10 digits, starts with 9/8/7):");
             mo_no = sc.nextLine();
             if (mo_no.length() == 10 && (mo_no.charAt(0) == '9' || mo_no.charAt(0) == '8' || mo_no.charAt(0) == '7')) 
			    {
                   break;
                } 
			else 
			    {
                   System.out.println("Invalid mobile number! Try again.");
                }
          } while (true);

        System.out.println("Enter source location:");
        source = sc.nextLine();
        
        System.out.println("Enter destination location:");
        destination = sc.nextLine();
		
		System.out.println("Enter kms of your route:");
		kms=sc.nextInt();
    }

    void displayTicket() 
    {
		System.out.println("--------------------------");
        System.out.println("Your ticketId is: " + ticketId);
        System.out.println("Your name is: " + PassengerName);
        System.out.println("Your age is: " + age);
		System.out.println("Mobile Number: " + mo_no);
        System.out.println("Route: " + source + " to " + destination);
		price=kms*3;
		System.out.println("The price of ticket is "+price);
        System.out.println("--------------------------");
       }
}

class Main 
{
    static Booking[] b = new Booking[100];  
    static int ticketCount = 0;

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        while (true) 
        {
			System.out.println();
            System.out.println(" Select an option:");
            System.out.println("1. Book a Ticket");
            System.out.println("2. Display Tickets");
            System.out.println("3. Search for a Ticket by ID");
            System.out.println("4. Delete a Ticket by ID");
            System.out.println("5. Exit");
            
            int choice = sc.nextInt();
            
            switch (choice) 
            {
                case 1:
                    bookTicket(sc);
                    break;
                
                case 2:
                    displayTickets();
                    break;
                
                case 3:
                    searchTicket(sc);
                    break;
                
                case 4:
                    deleteTicket(sc);
                    break;
                
                case 5:
                    System.out.println("Exiting the system.");
                    return;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    static void bookTicket(Scanner sc) 
    {
        if (ticketCount >= b.length) 
        {
            System.out.println("Ticket booking limit reached!");
            return;
        }
        
        Booking B = new Booking();
        B.BookTicket();
        b[ticketCount] = B;
        ticketCount++;
    }

    static void displayTickets() 
    {
        if (ticketCount == 0) 
        {
            System.out.println("No tickets booked yet!");
            return;
        }

        for (int i = 0; i < ticketCount; i++) 
        {
            b[i].displayTicket();
        }
    }

    static void searchTicket(Scanner sc) 
    {
        System.out.println("Enter the ticket ID to search:");
        int Search = sc.nextInt();

        boolean found = false;
        
        for (int i = 0; i < ticketCount; i++) 
        {
            if (b[i].ticketId == Search) 
            {
                b[i].displayTicket();
                found = true;
                break;
            }
        }
        
        if (!found) 
        {
            System.out.println("Ticket with ID " + Search + " not found.");
        }
    }

    static void deleteTicket(Scanner sc) 
    {
        System.out.println("Enter the ticket ID to delete:");
        int Delete = sc.nextInt();

        boolean found = false;
        
        for (int i = 0; i < ticketCount; i++) 
        {
            if (b[i].ticketId == Delete) 
            {
                for (int j = i; j < ticketCount - 1; j++) 
                {
                    b[j] = b[j + 1];
                }
                
                b[ticketCount - 1] = null;
                ticketCount--;
                System.out.println("Ticket with ID " + Delete + " has been deleted.");
                found = true;
                break;
            }
        }
        
        if (!found) 
        {
            System.out.println("Ticket with ID " + Delete + " not found.");
        }
    }
}
