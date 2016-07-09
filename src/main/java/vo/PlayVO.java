package vo;

import org.apache.ibatis.type.Alias;

@Alias("play")
public class PlayVO {
	private String title;
	private String image;
	private String link;
	private String category;
	private String regdate;
	private String tag;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "PlayVO [title=" + title + ", image=" + image + ", link=" + link + ", category=" + category
				+ ", regdate=" + regdate + ", tag=" + tag + "]";
	}
	

	
	
}
