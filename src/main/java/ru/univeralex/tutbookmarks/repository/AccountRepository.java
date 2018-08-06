package ru.univeralex.tutbookmarks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.univeralex.tutbookmarks.model.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}
