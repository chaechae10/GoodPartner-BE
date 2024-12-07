package goodpartner.be.domain.user.service;

import goodpartner.be.domain.user.application.dto.request.UserUpdateRequest;
import goodpartner.be.domain.user.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserUpdateService {

    public void updateUser(User user, UserUpdateRequest dto) {
        user.update(dto);
    }
}
