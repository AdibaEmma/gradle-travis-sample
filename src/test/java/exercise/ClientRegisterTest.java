package exercise;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.util.List;

class ClientRegisterTest {

    @Test
    void getClientList() {

        AccountManager accountManager1 = new AccountManager("Timmy");
        AccountManager accountManager2 = new AccountManager("Timmy");
        AccountManager accountManager3 = new AccountManager("Timmy");

        var newClientList = List.of(
                new PrivateClient("P012", "Israel Vanderpuije",ClientType.PRIVATE, ServiceLevel.PLATINUM),
                new PrivateClient("P012", "Israel Vanderpuije",ClientType.PRIVATE, ServiceLevel.GOLD),
                new PrivateClient("P012", "Israel Vanderpuije",ClientType.PRIVATE, ServiceLevel.PREMIUM),
                new CorperateClient("P012", "Israel Vanderpuije",ClientType.CORPORATE, ServiceLevel.PLATINUM, accountManager1),
                new CorperateClient("P012", "Israel Vanderpuije",ClientType.CORPORATE, ServiceLevel.GOLD, accountManager2),
                new CorperateClient("P012", "Israel Vanderpuije",ClientType.CORPORATE, ServiceLevel.PREMIUM, accountManager3)
        );


    }

}