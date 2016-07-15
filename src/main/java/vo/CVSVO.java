package vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("cvs")
public class CVSVO {
	private int no;
	private String prodname;
	private String store;
	private String image;
	private String price;
	private String event;
	private String giftname;
	private String giftimage;
	private Date regdate;
	
	@Override
	public String toString() {
		return "CVSVO [no=" + no + ", prodname=" + prodname + ", store=" + store + ", image=" + image + ", price="
				+ price + ", event=" + event + ", giftname=" + giftname + ", giftimage=" + giftimage + ", regdate="
				+ regdate + "]";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getGiftname() {
		return giftname;
	}
	public void setGiftname(String giftname) {
		this.giftname = giftname;
	}
	public String getGiftimage() {
		return giftimage;
	}
	public void setGiftimage(String giftimage) {
		this.giftimage = giftimage;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	} 
}
