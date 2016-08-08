package vo;

import org.apache.ibatis.type.Alias;

@Alias("chart")
public class ChartVO {
	private String day;
	private String regdate;
	private String email;
	private int webtoon;
	private int youtube;
	private int game;
	private int cvs;
	private int parcel;
	private int recipe;
	private int restaurant;
	private int prod;
	private int travel;
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getWebtoon() {
		return webtoon;
	}
	public void setWebtoon(int webtoon) {
		this.webtoon = webtoon;
	}
	public int getYoutube() {
		return youtube;
	}
	public void setYoutube(int youtube) {
		this.youtube = youtube;
	}
	public int getGame() {
		return game;
	}
	public void setGame(int game) {
		this.game = game;
	}
	public int getCvs() {
		return cvs;
	}
	public void setCvs(int cvs) {
		this.cvs = cvs;
	}
	public int getParcel() {
		return parcel;
	}
	public void setParcel(int parcel) {
		this.parcel = parcel;
	}
	public int getRecipe() {
		return recipe;
	}
	public void setRecipe(int recipe) {
		this.recipe = recipe;
	}
	public int getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(int restaurant) {
		this.restaurant = restaurant;
	}
	public int getProd() {
		return prod;
	}
	public void setProd(int prod) {
		this.prod = prod;
	}
	public int getTravel() {
		return travel;
	}
	public void setTravel(int travel) {
		this.travel = travel;
	}

	
	
}
