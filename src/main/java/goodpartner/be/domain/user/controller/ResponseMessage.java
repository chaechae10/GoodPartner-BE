package goodpartner.be.domain.user.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseMessage {

    SOCIAL_LOGIN_SUCCESS("소셜 로그인에 성공했습니다."),
    SOCIAL_REGISTER_SUCCESS("소셜 회원가입에 성공했습니다."),
    GET_MY_INFO("내 정보 조회에 성공했습니다."),
    UPDATE_MY_INFO("내 정보 수정에 성공했습니다..");


    private final String message;
}
