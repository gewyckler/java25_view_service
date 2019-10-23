package pl.j25.cloud.viewservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import pl.j25.cloud.viewservice.api.BookServiceApi;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookServiceApi bookServiceApi;
}
