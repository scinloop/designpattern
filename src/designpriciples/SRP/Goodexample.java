package designpriciples.SRP;

/**
 * @Author scinloop
 * @Date 2023/12/26 12:28
 */
// single responsibility principle - good example
interface IEmail {
    public void setSender(String sender);
    public void setReceiver(String receiver);
    public void setContent(IContent content);
}

interface Content {
    public String getAsString(); // used for serialization
}

class Email implements IEmail {
    public void setSender(String sender) {
        // set sender;
    }

    public void setReceiver(String receiver) {
        // set receiver;
    }

    public void setContent(IContent content) {
        // set content;
    }
}

