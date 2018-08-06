package ru.univeralex.tutbookmarks.exception;

public class BookmarkNotFoundException extends RuntimeException {

    public BookmarkNotFoundException(Long bookmarkId) {
        super("could not find bookmark '" + bookmarkId + "'.");
    }
}