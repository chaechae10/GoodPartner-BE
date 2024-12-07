package goodpartner.be.domain.user.application.dto.response;

import goodpartner.be.domain.user.entity.User;

public record UserResponse(
        String name,
        String email,
        String tel
) {
    public static UserResponse from(User user) {
        return new UserResponse(user.getName(), user.getEmail(), user.getTel());
    }
}
