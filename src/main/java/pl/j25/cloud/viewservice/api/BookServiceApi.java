package pl.j25.cloud.viewservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import pl.j25.cloud.viewservice.model.dto.CreateBookRequest;
import pl.j25.cloud.viewservice.model.dto.UpdateBookRequest;

import java.awt.print.Book;
import java.util.List;

@FeignClient("book-service")
public interface BookServiceApi {

    @PutMapping
    public Book putBook(@RequestBody CreateBookRequest createBookRequest);

    @PostMapping
    public void editBook(@RequestBody UpdateBookRequest updateBookRequest);

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable(name = "id") Long id);

    @GetMapping("/getBy/")
    public List<Book> getBookByTitleOrAuthor(@RequestParam(name = "title") String title,
                                             @RequestParam(name = "author") String author);
}
