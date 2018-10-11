package model;

public class Review {

  private int id;
  private String title;
  private String description;
  private String author;

  public Review(int id, String title, String description, String author) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.author = author;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
