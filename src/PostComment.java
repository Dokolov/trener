import java.util.Arrays;

public class PostComment {
    private String text; // содержание комментария
    private String[] whoLiked; // кто поддержал



    public String getText() {
        return text;
    }

    public String[] getWhoLiked() {
        return whoLiked;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }
    @Override
    public  String toString() {
        String result = "PostComment{text='"+ text ;
        if (whoLiked != null) {
            result += "', whoLiked=" + Arrays.toString(whoLiked);
        }   return result;
    }
}

