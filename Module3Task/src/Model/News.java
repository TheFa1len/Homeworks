package Model;

import java.sql.Blob;
import java.sql.Date;

public class News {
	String headtext;
	String annotation;
	String author;
	Date date;
	String maintext;
	int id_categories;
	public int getId_categories() {
		return id_categories;
	}
	public void setId_categories(int id_categories) {
		this.id_categories = id_categories;
	}
	public String getHeadtext() {
		return headtext;
	}
	public void setHeadtext(String headtext) {
		this.headtext = headtext;
	}
	public String getAnnotation() {
		return annotation;
	}
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void genDate(){
		java.util.Calendar cal = java.util.Calendar.getInstance();
		java.util.Date utilDate = cal.getTime();
		java.sql.Date sqlDate = new Date(utilDate.getTime());
		this.date = sqlDate;
	}
	public String getMaintext() {
		return maintext;
	}
	public void setMaintext(String maintext) {
		this.maintext = maintext;
	}
	@Override
	public String toString(){
		return headtext+ " " + annotation + ", author: " + author + ": " + maintext;
	}

}
