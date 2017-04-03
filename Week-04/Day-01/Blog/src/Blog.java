import java.util.ArrayList;
import java.util.List;

public class Blog {
  private List<BlogPost> blog = new ArrayList<>();

  public void addition(BlogPost post) {
    blog.add(post);
  }

  public void delete(int i) {
    blog.remove(i);
  }

  public void update(int i, BlogPost post) {
    blog.add(i, post);
  }


  public static void main(String[] args) {
    Blog newBlog = new Blog();
    newBlog.addition(new BlogPost("John Doe", "Lorem ipsum", "Lorem ipsum dolor sit amet", "2000.05.04"));
    newBlog.addition(new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.  ", "2010.10.10."));
    newBlog.addition(new BlogPost("William Turton", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "Lorem ipsum dolor sit amet", "2017.03.28."));

    System.out.println(newBlog.blog.get(1).getValue());
  }
}
