package exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AccountManager accountManager1 = new AccountManager("Timmy");
        AccountManager accountManager2 = new AccountManager("Ben");
        AccountManager accountManager3 = new AccountManager("Carl");

        List<Client> clientList = new ArrayList<>();
        clientList.add( new PrivateClient("P012", "Israel Vanderpuije",ClientType.PRIVATE, ServiceLevel.PLATINUM));
        clientList.add( new PrivateClient("P013", "Kyle Fitch",ClientType.PRIVATE, ServiceLevel.GOLD));
        clientList.add( new PrivateClient("P014", "John Doe",ClientType.PRIVATE, ServiceLevel.PREMIUM));
        clientList.add(  new CorperateClient("P015", "Osborn Kit",ClientType.CORPORATE, ServiceLevel.PLATINUM, accountManager1));
        clientList.add( new CorperateClient("P016", "Bryte Tunner",ClientType.CORPORATE, ServiceLevel.GOLD, accountManager2));
        clientList.add( new CorperateClient("P017", "Mike K",ClientType.CORPORATE, ServiceLevel.PREMIUM, accountManager3));

        ClientRegister clientRegister = new ClientRegister(clientList);

        System.out.println(clientRegister.getClientList());
        System.out.println(clientRegister.getGoldClients());
        System.out.println(clientRegister.getClientById("P012"));
    }
}
