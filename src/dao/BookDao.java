package dao;

import bean.Author;
import bean.Book;
import bean.Category;
import bean.Publisher;
import repository.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    public Book getBook(int id){
        Book book = new Book();
        try {
            Connection con = Connect.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from Books where id=?");
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                book.setId(rs.getInt("id"));
                book.setCode(rs.getString("code"));
                book.setTitle(rs.getString("title"));
                book.setYear(rs.getInt("year"));
                book.setPrice(rs.getFloat("price"));
                book.setImages(rs.getString("image"));
                book.setCategory(new Category(rs.getInt("categories_id"),rs.getString("categories_name")));
                book.setAuthor(new Author(rs.getInt("author_id"),rs.getString("author_name")));
                book.setPublisher(new Publisher(rs.getInt("publisher_id"),rs.getString("publisher_name")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return book;
    }
    public List<Book> getAllBook(){
        Connection con = Connect.getConnection();
        List<Book> books = new ArrayList<>();
        try {
            PreparedStatement pst = con.prepareStatement("select books.id,code,title,year,price,image,categories.id as categories_id,categories.name as categories_name,authors.id as author_id,authors.name as author_name,publishers.id as publisher_id,publishers.name as publisher_name\n" +
                    "from books inner join categories on books.categories_id = categories.id\n" +
                    "\t\tinner join authors on books.author_id = authors.id\n" +
                    "        inner join publishers on books.publisher_id = publishers.id");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setCode(rs.getString("code"));
                book.setTitle(rs.getString("title"));
                book.setYear(rs.getInt("year"));
                book.setPrice(rs.getFloat("price"));
                book.setImages(rs.getString("image"));
                book.setCategory(new Category(rs.getInt("categories_id"),rs.getString("categories_name")));
                book.setAuthor(new Author(rs.getInt("author_id"),rs.getString("author_name")));
                book.setPublisher(new Publisher(rs.getInt("publisher_id"),rs.getString("publisher_name")));
                books.add(book);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return books;
    }
    public List<Category> getAllCategory(){
        Connection con = Connect.getConnection();
        List<Category> categories = new ArrayList<>();
        try {
            PreparedStatement pst = con.prepareStatement("select categories.id,name from categories");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                categories.add(category);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return categories;
    }
    public List<Author> getAllAuthor(){
        Connection con = Connect.getConnection();
        List<Author> authors = new ArrayList<>();
        try {
            PreparedStatement pst = con.prepareStatement("select authors.id,name from authors");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Author author = new Author();
                author.setId(rs.getInt("id"));
                author.setName(rs.getString("name"));
                authors.add(author);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return authors;
    }
    public List<Publisher> getAllPublisher(){
        Connection con = Connect.getConnection();
        List<Publisher> publishers = new ArrayList<>();
        try {
            PreparedStatement pst = con.prepareStatement("select publishers.id,name from publishers");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Publisher publisher = new Publisher();
                publisher.setId(rs.getInt("id"));
                publisher.setName(rs.getString("name"));
                publishers.add(publisher);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return publishers;
    }
}
