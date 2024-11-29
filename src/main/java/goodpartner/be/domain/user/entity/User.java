package goodpartner.be.domain.user.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id")
    private UUID id;

    private Long kakaoId;

    private String name;

    private String email;

    private String tel;

    public static User of(Long kakaoId, String email) {
        return User.builder()
                .kakaoId(kakaoId)
                .email(email)
                .build();
    }
}
