package ru.univeralex.tutbookmarks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.univeralex.tutbookmarks.model.Account;
import ru.univeralex.tutbookmarks.model.Bookmark;
import ru.univeralex.tutbookmarks.repository.AccountRepository;
import ru.univeralex.tutbookmarks.repository.BookmarkRepository;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(AccountRepository accountRepository,
						   BookmarkRepository bookmarkRepository) {
		return args ->
				Arrays.asList("jhoeller","dsyer","pwebb","ogierke","rwinch","mfisher","mpollack","jlong")
						.forEach(username -> {
							Account account = accountRepository.save(new Account(username, "password"));
							bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/1/" + username, "A description"));
							bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/2/" + username, "A description"));
						});
	}
}
