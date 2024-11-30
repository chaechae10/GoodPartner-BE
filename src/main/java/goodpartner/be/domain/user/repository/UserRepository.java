package goodpartner.be.domain.user.repository;

import goodpartner.be.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByKakaoId(Long kakaoId);

    boolean existsByKakaoId(Long kakaoId);
}
