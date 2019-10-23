package pl.j25.cloud.viewservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBookRequest {
    private Long id;
    private Integer numberOfAvailableCopies;
}
