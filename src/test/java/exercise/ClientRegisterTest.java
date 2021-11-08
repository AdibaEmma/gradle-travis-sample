package exercise;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientRegisterTest {
    @BeforeClass public static List<Client> createClientList() {
        AccountManager accountManager1 = new AccountManager("Timmy");
        AccountManager accountManager2 = new AccountManager("Ben");
        AccountManager accountManager3 = new AccountManager("Carl");

        List<Client> clientList = new ArrayList<>();
        clientList.add( new PrivateClient("P010", "Israel Vanderpuije",ClientType.PRIVATE, ServiceLevel.PLATINUM));
        clientList.add( new PrivateClient("P012", "Kyle Fitch",ClientType.PRIVATE, ServiceLevel.GOLD));
        clientList.add( new PrivateClient("P011", "John Doe",ClientType.PRIVATE, ServiceLevel.PREMIUM));
        clientList.add(  new CorperateClient("C015", "Osborn Kit",ClientType.CORPORATE, ServiceLevel.PLATINUM, accountManager1));
        clientList.add( new CorperateClient("C022", "Bryte Tunner",ClientType.CORPORATE, ServiceLevel.GOLD, accountManager2));
        clientList.add( new CorperateClient("C042", "Mike K",ClientType.CORPORATE, ServiceLevel.PREMIUM, accountManager3));

        return clientList;
    }

    @Test
    public void getClientList() {


        ClientRegister clientRegister = new ClientRegister(createClientList());
        assertTrue(clientRegister.getClientList().contains("Ben"));
    }

    @Test
    public void getGoldClients() {
        ClientRegister clientRegister = new ClientRegister(createClientList());
        assertTrue(clientRegister.getGoldClients().contains("Ben"));
    }

    @Test
    public void getClientById() {
        ClientRegister clientRegister = new ClientRegister(createClientList());
        assertTrue(clientRegister.getClientById("C015").isPresent());
    }

    @Test
    public void getClientCountAtEachServiceLevel() {
        ClientRegister clientRegister = new ClientRegister(createClientList());
        assertEquals(2, clientRegister.getClientCountAtEachServiceLevel().get(ServiceLevel.GOLD));
    }


}