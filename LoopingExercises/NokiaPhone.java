import java.util.Scanner;
public class NokiaPhone {
    static void request(){
        System.out.println("Enter 1 for phonebooks: ");
        System.out.println("Enter 2 for Messages: ");
        System.out.println("Enter 3 for chat: ");
        System.out.println("Enter 4 for call register: ");
        System.out.println("Enter 5 for Tones : ");
        System.out.println("Enter 6 for settings: ");
        System.out.println("Enter 7 for call divert: ");
        System.out.println("Enter 8 for games: ");
        System.out.println("Enter 9 for calculator: ");
        System.out.println("Enter 10 for reminders: ");
        System.out.println("Enter 11 for clock: ");
        System.out.println("Enter 12 for profiles: ");
        System.out.println("Enter 13 for sim services: ");
    }
    static void messageStatic(){
        System.out.println("Enter 1 for Write Messages");
        System.out.println("Enter 2 for Inbox: ");
        System.out.println("Enter 3 for outbox: ");
        System.out.println("Enter 4 for picture messages");
        System.out.println("Enter 5 for templates");
        System.out.println("Enter 6 for smileys: ");
        System.out.println("Enter 7 for message settings");
        System.out.println("Enter 8 for info servcie");
        System.out.println("Enter 9 for voice mail box number");
        System.out.println("Enter 10 for Service command editor");
    }
    static void callStatic(){
        System.out.println("Enter 1 for Missed Calls");
        System.out.println("Enter 2 for Received calls");
        System.out.println("Enter 3 for dialed numbers ");
        System.out.println("Enter 4 for Erase recent call lists");
        System.out.println("Enter 5 call validity");
        System.out.println("Enter 6 to show all calls");
        System.out.println("Enter 7 for call cost settings");
        System.out.println("Enter 8 for prepaid credit");
    }
    static void toneStatic(){
        System.out.println("Enter 1 for ringing tone");
        System.out.println("Enter 2 for ringing volume");
        System.out.println("Enter 3 for Incoming call alert");
        System.out.println("Enter 4 for composer");
        System.out.println("Enter 5 for Message alert tone");
        System.out.println("Enter 6 for keypad tones");
        System.out.println("Enter 7 for warning and gaming tones");
        System.out.println("Enter 8 for vibrating alert");
        System.out.println("Enter 9 for screen saver");
        System.out.println("Enter 0 to go back");
    }

    static void callSettingStatic(){
        System.out.println("Enter 1 for Call Settings");
        System.out.println("Enter 2 for phone settings");
        System.out.println("Enter 3 for security settings");
        System.out.println("Enter 4 for restore factory settings");
        System.out.println("Enter 0 to go back");
    }
    static void clockStatic(){
        System.out.println("Enter 1 for alarm clock");
        System.out.println("Enter 2 for clock settings");
        System.out.println("Enter 3 for date settings");
        System.out.println("Enter 4 for Stopwatch");
        System.out.println("Enter 5 for countdown timer");
        System.out.println("Enter 6 for auto update of date and time");
        System.out.println("Enter 0 to go back");
    }

    static void diallingStatic(){
        System.out.println("Enter 1 for Automatic redial");
        System.out.println("Enter 2 for speed dialing");
        System.out.println("Enter 3 for call waiting options");
        System.out.println("Enter 4 for own number sending");
        System.out.println("Enter 5 for phone line in use");
        System.out.println("Enter 6 for automatic answer");
        System.out.println("Enter 0 to go back");
    }
    static void codeSettingStatic(){
        System.out.println("Enter 1 for PIN code request");
        System.out.println("Enter 2 for call barring service");
        System.out.println("Enter 3 for fixed dialing");
        System.out.println("Enter 4 for closed user group");
        System.out.println("Enter 5 for phone security");
        System.out.println("Enter 6 to change access codes");
        System.out.println("Enter 0 to go back");
    }
    static void languageSettingStatic(){
        System.out.println("Enter 1 for language");
        System.out.println("Enter 2 for cell info display");
        System.out.println("Enter 3 for welcome note");
        System.out.println("Enter 4 for network selection");
        System.out.println("Enter 5 for lights");
        System.out.println("Enter 6 to confirm sim service actions");
        System.out.println("Enter 0 to go back");
    }
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        request();
        int code = input.nextInt();

        switch (code){
            case 1:
                System.out.println("Enter 1 for search ");
                System.out.println("Enter 2 for service nos: ");
                System.out.println("Enter 3 for add name: ");
                System.out.println("Enter 4 for erase: ");
                System.out.println("Enter 5 for edit: ");
                System.out.println("Enter 6 for assign tone: ");
                System.out.println("Enter 7 for Send b'card: ");
                System.out.println("Enter 8 for options: ");
                System.out.println("Enter 9 for speed dials: ");
                System.out.println("Enter 10 for voice tags: ");
                System.out.println("press 0 to go back");
                int phonebookInfo = input.nextInt();
                switch (phonebookInfo){
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.print("Service Nos");
                        break;
                    case 3:
                        System.out.println("Add Name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send B'Card");
                        break;
                    case 8:
                        System.out.println("Enter 1 for type of view");
                        System.out.println("Enter 2 for Status");
                        int memoryOptions = input.nextInt();
                        switch (memoryOptions){
                            case 1:
                                System.out.println("Type of View");
                                break;
                            case 2:
                                System.out.println("Memory Status");
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Speed Dials");
                            break;
                    case 10:
                        System.out.println("Voice Tags");
                            break;
                    case 0:
                        request();
                }
                break;
            case 2:
                messageStatic();
                int messageInfo = input.nextInt();
                switch (messageInfo){
                    case 1:
                        System.out.println("Write Message");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("picture messages");
                        break;
                    case 5:
                        System.out.println("templates");
                        break;
                    case 6:
                        System.out.println("smileys");
                        break;
                    case 7:
                        System.out.println("Enter 1 for sent:");
                        int sentOptions = input.nextInt();
                        switch (sentOptions){
                            case 1:
                                System.out.println("message center number");

                            case 2:
                                System.out.println("Message sent as");

                            case 3:
                                System.out.println("message validity");
                        }
                            System.out.println("Enter 2 for Common:");
                        int commonSettings = input.nextInt();
                            switch (commonSettings){
                                case 1:
                                    System.out.println("Delivery reports");
                                    break;
                                case 2:
                                    System.out.println("Reply via same center");
                                    break;
                                case 3:
                                    System.out.println("Character Support");
                                    break;
                            }
                    case 8:
                        System.out.println("Info Service");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service Command Editor");
                        break;
                    case 0:
                        request();
                        break;
                }
                break;
            case 3:
                System.out.println("Chat");
                System.out.println("press 0 to go back");
                int backRequest = input.nextInt();
                request();
                break;
            case 4:
                callStatic();
                int callsInfo = input.nextInt();
                switch (callsInfo){
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialled calls");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        break;
                    case 5:
                        System.out.println("enter 1 for last call duration");
                        System.out.println("Enter 2 for all calls duration");
                        System.out.println("Enter 3 for Received calls duration");
                        System.out.println("Enter 4 for dialled call duration");
                        System.out.println("Enter 5 for clear timers");
                        System.out.println("press 0 to go back");
                        int callDurations = input.nextInt();
                        switch (callDurations){
                            case 1:
                                System.out.println("last call duration");
                                break;
                            case 2:
                                System.out.println("All calls duration");
                                break;
                            case 3:
                                System.out.println("Received Call duration");
                                break;
                            case 4:
                                System.out.println("dialled calls duration");
                                break;
                            case 5:
                                System.out.println("clear timers");
                                break;
                            case 0:
                                callStatic();
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("Enter 1 for last call costs");
                        System.out.println("Enter 2 for all call costs");
                        System.out.println("Enter 3 for clear counters ");
                        System.out.println("press 0 to go back");
                        int callCounters = input.nextInt();
                        switch (callCounters){
                            case 1:
                                System.out.println("Last call costs");
                                break;
                            case 2:
                                System.out.println("All call costs");
                                break;
                            case 3:
                                System.out.println("Clear Counters");
                                break;
                            case 0:
                                callStatic();
                                    break;
                        }
                        break;
                    case 7:
                        System.out.println("Enter 1 for Call cost limit");
                        System.out.println("Enter 2 for Show cost limits");
                        System.out.println("Enter 0 to go back");
                        int callCosts = input.nextInt();
                        switch (callCosts){
                            case 1:
                                System.out.println("Call cost Limit");
                                break;
                            case 2:
                                System.out.println("Show cost limits");
                                break;
                            case 0:
                                callStatic();
                                    break;
                        }
                        break;
                    case 8:
                        System.out.println("Prepaid credit");
                        System.out.println("Enter 0 to go back");
                        int credit = input.nextInt();
                        callStatic();
                        break;
                }
                break;
            case 5:
                toneStatic();
                int tones= input.nextInt();
                switch (tones){
                    case 1:
                        System.out.println("ringing tone");
                            break;
                    case 2:
                        System.out.println("ringing volume");
                            break;
                    case 3:
                        System.out.println("incoming call alert");
                            break;
                    case 4:
                        System.out.println("composer");
                            break;
                    case 5:
                        System.out.println("message alert tone");
                            break;
                    case 6:
                        System.out.println("keypad tones");
                            break;
                    case 7:
                        System.out.println("warning and gaming tones");
                            break;
                    case 8:
                        System.out.println("vibrating alert");
                            break;
                    case 9:
                        System.out.println("Screen saver");
                            break;
                    case 0:
                        request();
                            break;
                }
                break;
            case 6:
                callSettingStatic();
                int generalSettings = input.nextInt();
                switch (generalSettings){
                    case 1:
                        diallingStatic();
                        int dialing = input.nextInt();
                        switch (dialing){
                            case 1:
                                System.out.println("Automatic redial");
                                    break;
                            case 2:
                                System.out.println("Speed Dialing");
                                    break;
                            case 3:
                                System.out.println("Call waiting options");
                                    break;
                            case 4:
                                System.out.println("own number sending");
                                    break;
                            case 5:
                                System.out.println("phone line in use");
                                    break;
                            case 6:
                                System.out.println("Automatic Answer");
                                    break;
                            case 0:
                                diallingStatic();
                                    break;
                        }
                        break;
                    case 2:
                        languageSettingStatic();
                        int languageSettings = input.nextInt();
                        switch (languageSettings){
                            case 1:
                                System.out.println("Language");
                                    break;
                            case 2:
                                System.out.println("Cell info display");
                                    break;
                            case 3:
                                System.out.println("Welcome note");
                                    break;
                            case 4:
                                System.out.println("Network Selection");
                                    break;
                            case 5:
                                System.out.println("Lights");
                                    break;
                            case 6:
                                System.out.println("Confirm SIM service actions");
                                break;
                            case 0:
                                callSettingStatic();
                                    break;
                        }
                        break;
                    case 3:
                        codeSettingStatic();
                        int codeSettings = input.nextInt();
                        switch (codeSettings){
                            case 1:
                                System.out.println("PIN code request");
                                    break;
                            case 2:
                                System.out.println("Call Barring Service");
                                    break;
                            case 3:
                                System.out.println("Fixed Dialing");
                                    break;
                            case 4:
                                System.out.println("Closed User Group");
                                    break;
                            case 5:
                                System.out.println("Phone Security");
                                    break;
                            case 6:
                                System.out.println("Change Access Codes");
                                    break;
                            case 0:
                                languageSettingStatic();
                                    break;
                        }
                        break;
                    case 4:
                        System.out.println("Restore Factory Settings");
                            System.out.println("Enter 0 to go back");
                            int factorySettings = input.nextInt();
                            callSettingStatic();
                            break;
                }
            case 7:
                System.out.println("Call Divert");
                System.out.println("Enter 0 to go back");
                int divertBack = input.nextInt();
                request();
                    break;
            case 8:
                System.out.println("Games");
                System.out.println("Enter 0 to go back");
                int backGame = input.nextInt();
                request();
                    break;
            case 9:
                System.out.println("Calculator");
                System.out.println("Enter 0 to go back");
                int backCalc = input.nextInt();
                    request();
                    break;
            case 10:
                System.out.println("Reminders");
                System.out.println("Enter 0 to go back");
                int backReminder = input.nextInt();
                request();
                    break;
            case 11:
                clockStatic();
                int clocking = input.nextInt();
                switch (clocking){
                    case 1:
                        System.out.println("alarm clock");
                            break;
                    case 2:
                        System.out.println("clock settings");
                            break;
                    case 3:
                        System.out.println("date settings");
                            break;
                    case 4:
                        System.out.println("stop watch");
                            break;
                    case 5:
                        System.out.println("countdown timer");
                            break;
                    case 6:
                        System.out.println("auto update of date and time");
                            break;
                    case 0:
                        System.out.println("Enter 0 to go back");
                        request();
                }
                break;
            case 12:
                System.out.println("Profiles");
                System.out.println("Enter 0 to go back");
                int profiled = input.nextInt();
                request();
                    break;
            case 13:
                System.out.println("SIM services");
                System.out.println("Enter 0 to go back");
                int simServ = input.nextInt();
                request();
                    break;
        }
    }
}
