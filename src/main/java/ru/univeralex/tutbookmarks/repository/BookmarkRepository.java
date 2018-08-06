package ru.univeralex.tutbookmarks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.univeralex.tutbookmarks.model.Bookmark;

import java.util.Collection;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}
