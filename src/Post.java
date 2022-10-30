import java.util.ArrayList;
import java.util.Arrays;

public class Post extends PostComment{
    private String title; // заголовок
    private String content; // содержание
    private String[] tags; // теги
    private ArrayList<PostComment> comments; //комментарии




    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String[] getTags() {
        return tags;
    }

    public ArrayList<PostComment> getComments() {
        return comments;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }
    @Override
    public  String toString(){
        String result ="Post{title='" + title +"\'";

        if (content != null){
            result += ", content.lenght=" + content.length() +"\'";
        }
        if (tags != null){
            result += ", tags=" + Arrays.toString(tags);
        }
        if (comments != null){
            int count = 0;
            result += ", \ncomments=[";

            for (PostComment comment : comments){
                if (count !=0){
                    result += ", \n";
                }

                result += comment;
                count++;
            }
            result +="]";
        }
        return result +="}";
    }


}