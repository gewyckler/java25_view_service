package pl.j25.cloud.viewservice.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.j25.cloud.viewservice.api.BookServiceApi;

@Service
@AllArgsConstructor
public class BookApiCallsService {

    @Autowired
    private BookServiceApi bookizer;
}
