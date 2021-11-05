package exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientRegisterTest {

    @Test
    void getClientList() {
        AccountManager accountManager1 = new AccountManager("Timmy");
        AccountManager accountManager2 = new AccountManager("Ben");
        AccountManager accountManager3 = new AccountManager("Carl");

        List<Client> clientList = new ArrayList<>();
        clientList.add( new PrivateClient("P012", "Israel Vanderpuije",ClientType.PRIVATE, ServiceLevel.PLATINUM));
        clientList.add( new PrivateClient("P012", "Kyle Fitch",ClientType.PRIVATE, ServiceLevel.GOLD));
        clientList.add( new PrivateClient("P012", "John Doe",ClientType.PRIVATE, ServiceLevel.PREMIUM));
        clientList.add(  new CorperateClient("P012", "Osborn Kit",ClientType.CORPORATE, ServiceLevel.PLATINUM, accountManager1));
        clientList.add( new CorperateClient("P012", "Bryte Tunner",ClientType.CORPORATE, ServiceLevel.GOLD, accountManager2));
        clientList.add( new CorperateClient("P012", "Mike K",ClientType.CORPORATE, ServiceLevel.PREMIUM, accountManager3));

        ClientRegister clientRegister = new ClientRegister(clientList);
        assertTrue(clientRegister.getClientList().contains("Ben"));
    }

    @Test
    void getGoldClients() {

    }
}