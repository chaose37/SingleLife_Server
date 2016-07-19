package vo;

import org.apache.ibatis.type.Alias;

@Alias("prod")
public class ProdVO {
	private int no;
	private String link;
	private String title;
	private String price;
	private String image;
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "ProdVO [link=" + link + ", title=" + title + ", price=" + price + ", image=" + image + "]";
	}
	
	
	

}
