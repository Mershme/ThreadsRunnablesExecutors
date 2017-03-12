package handlers;


import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;

public class handler implements Handler {

    @Override
    public boolean handleMessage(MessageContext info) {
        return false;
    }

    @Override
    public boolean handleFault(MessageContext info) {
        return false;
    }

    @Override
    public void close(MessageContext info) {

    }

}
