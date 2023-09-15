package com.mkece.graphql;

import com.mkece.graphql.model.Book;
import com.mkece.graphql.model.BookInput;
import com.mkece.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication  implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		BookInput book1 = new BookInput();
		book1.setTitle("Wonder Man");
		book1.setAuthor("Aman");
		book1.setPrice(1000);
		book1.setPublisher("Navneet Publication");
		book1.setDescription("This is Story of Wonder Man");
		book1.setPages(1000);
		bookService.createbook(book1);

		BookInput book2 = new BookInput();
		book2.setTitle("Spider Man");
		book2.setAuthor("Sibaram");
		book2.setPrice(2000);
		book2.setPublisher("Sundaram Publication");
		book2.setDescription("This is Story of Spider Man");
		book2.setPages(800);
		bookService.createbook(book2);

		BookInput book3 = new BookInput();
		book3.setTitle("Iron Man");
		book3.setAuthor("Manoj");
		book3.setPrice(1500);
		book3.setPublisher("Sundaram Publication");
		book3.setDescription("This is Story of Iron Man");
		book3.setPages(1200);
		bookService.createbook(book3);

	}
}
