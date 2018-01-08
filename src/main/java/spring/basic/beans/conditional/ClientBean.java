package spring.basic.beans.conditional;

import org.springframework.beans.factory.annotation.Autowired;

public class ClientBean {
    @Autowired
    private MyService myService;

    public MyService getMyService () {
        return myService;
    }
}