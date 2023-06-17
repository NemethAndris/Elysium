package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.enums.Direction;

import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Swipe {
    @Id
    private UUID id;

    @Column
    private UUID swiper;

    @Column
    private UUID swipedOn;

    @Column
    @Enumerated(EnumType.STRING)
    private Direction direction;


}
