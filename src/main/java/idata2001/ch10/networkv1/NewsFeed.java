package idata2001.ch10.networkv1;

import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a social network
 * application.
 *
 * Display of the posts is currently simulated by printing the details to the
 * terminal. (Later, this should display in a browser.)
 *
 * This version does not save the data to disk, and it does not provide any
 * search or ordering functions.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class NewsFeed
{
     private static ArrayList<Post> posts;

    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        posts = new ArrayList<>();
    }

    public void addPost(Post post)
    {
        posts.add(post);
    }

    /**
     * Show the news feed. Currently: print the news feed details to the
     * terminal. (To do: replace this later with display in web browser.)
     */
    public void show()
    {
        for (Post post : posts)
        {
            post.display();
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        NewsFeed newsFeed = new NewsFeed();
        MessagePost messagePost = new MessagePost("Petter M", "Navnavnav");
        newsFeed.addPost(messagePost);
        newsFeed.addPost(new EventPost("Aleks Nav", "Startet på nav"));
        newsFeed.addPost(new PhotoPost("Petter Molnes", "Sommer.jpg", "Helg"));
        CommentedPost post = (CommentedPost)posts.get(2);
        post.like();

        newsFeed.show();
    }
}
