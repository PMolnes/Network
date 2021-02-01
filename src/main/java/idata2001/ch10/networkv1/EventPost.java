package idata2001.ch10.networkv1;

public class EventPost extends Post
{
    private String eventType;

    public EventPost(String author, String eventType)
    {
        super(author);
        this.eventType = eventType;
    }

    public void display()
    {
        System.out.println(getUsername());
        System.out.println(timeString(getTimeStamp()));

        System.out.println(eventType);

    }
}
