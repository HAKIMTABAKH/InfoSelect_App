package infoslect.tn.com.Activity;

public class CartegoryModel {
    public String image_Url,name;

    public CartegoryModel() {
    }

    public CartegoryModel(String image_Url, String name) {
        this.image_Url = image_Url;
        this.name = name;
    }

    public String getImage_Url() {
        return image_Url;
    }

    public void setImage_Url(String image_Url) {
        this.image_Url = image_Url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
